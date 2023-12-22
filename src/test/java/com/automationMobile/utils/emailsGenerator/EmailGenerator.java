package com.automationMobile.utils.emailsGenerator;
import java.util.Random;
public class EmailGenerator {
    private static final Random RANDOM = new Random();
    private static final String[] EMAIL_SUFFIXES = {"@gmail.com", "@hotmail.com"};
    public String generateEmail() {
        StringBuilder sb = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            char randomChar = (char) ('a' + RANDOM.nextInt(26));
            sb.append(randomChar);
        }
        sb.append(EMAIL_SUFFIXES[RANDOM.nextInt(EMAIL_SUFFIXES.length)]);
        return sb.toString();
    }
    public static void main(String[] args) {
        EmailGenerator emailGenerator = new EmailGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(emailGenerator.generateEmail());
        }
    }
}
