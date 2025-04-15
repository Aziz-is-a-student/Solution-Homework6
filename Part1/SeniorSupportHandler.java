package Part1;

public class SeniorSupportHandler extends SupportHandler {
    @Override
    public void handle(String problem) {
        if ("account ban".equals(problem) || "data loss".equals(problem)) {
            System.out.println("SeniorSupport Handled " + problem);
        } else if (nextHandler != null) {
            nextHandler.handle(problem);
        } else {
            System.out.println("SeniorSupport Cannot handle " + problem + " — escalate manually");
        }
    }
}
