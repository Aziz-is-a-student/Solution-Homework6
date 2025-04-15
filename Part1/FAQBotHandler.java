package Part1;

public class FAQBotHandler extends SupportHandler{


    @Override
    public void handle(String problem) {
        if ("password_reset".equalsIgnoreCase(problem) || "reset_password".equalsIgnoreCase(problem )){
            System.out.println("FAQBot сan't process the " +problem + " — submit for manual processing.");
        } else if (nextHandler != null) {
            nextHandler.handle(problem);
        } else {
            System.out.println("[FAQBot] Cannot handle " + problem + " — escalate manually");
        }

    }
}
