// File: DecoratorPatternTest.java
public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Create a basic email notifier
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Hello, World!");

        // Decorate the email notifier with SMS functionality
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        smsNotifier.send("Hello, World!");

        // Decorate the email notifier with both SMS and Slack functionalities
        Notifier slackAndSMSNotifier = new SlackNotifierDecorator(smsNotifier);
        slackAndSMSNotifier.send("Hello, World!");
    }
}
