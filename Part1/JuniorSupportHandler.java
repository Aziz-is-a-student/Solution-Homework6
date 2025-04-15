package Part1;

public class JuniorSupportHandler extends SupportHandler{
    @Override
    public void handle(String problem) {
        if ("refund_request".equals(problem) || "billing_problem".equals(problem)) {
            System.out.println("JuniorSupport Handled " + problem);
        } else if (nextHandler != null) {
            nextHandler.handle(problem);
        } else {
            System.out.println("JuniorSupport Cannot handle " + problem + " — escalate manually");
        }
    }
}
