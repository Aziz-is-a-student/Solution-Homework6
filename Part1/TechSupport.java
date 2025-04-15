package Part1;

public class TechSupport {
    public static void main(String[] args) {


        SupportHandler faq = new FAQBotHandler();
        SupportHandler junior = new JuniorSupportHandler();
        SupportHandler senior = new SeniorSupportHandler();


        faq.setNext(junior).setNext(senior);


        String[]  problems = {"password_reset", "refund_request", "account_ban", "unknown_bug"};


        for (String problem: problems) {
            faq.handle(problem);
        }
    }
}

