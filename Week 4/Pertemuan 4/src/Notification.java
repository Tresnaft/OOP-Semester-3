public class Notification {
    private EmailService emailService;

    // Dependency Injection melalui constructor
    public Notification(EmailService emailService) {
        this.emailService = emailService;
    }

    public void notify(String message, String receiver) {
        emailService.sendEmail(message, receiver);
    }
}