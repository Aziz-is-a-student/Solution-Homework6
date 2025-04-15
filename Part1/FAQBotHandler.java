package Part1;

public class FAQBotHandler extends SupportHandler{


    @Override
    public void handle(String question) {
        if (question.equals("password reset")){
            System.out.println("FAQBot сan't process the " +question + " — submit for manual processing.");
        }
    }
}
