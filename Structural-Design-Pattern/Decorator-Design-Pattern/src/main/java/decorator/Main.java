package decorator;

//

import decorator.decorators.SMSDecorator;
import decorator.decorators.WhatsAppDecorator;
import decorator.impl.EmailNotifier;
import decorator.service.Notifier;

///The Scenario: The Multi-Channel Notifier
//You are building a System Alert Tool. When a server goes down, the system needs to send an alert.
//
//The Problem: Some users only want an Email. Some want Email + SMS. Some want Email + SMS + WhatsApp.
// If you use inheritance, you'd end up with a EmailSmsWhatsAppNotifier class, which is a mess.
//
//The Goal: Use the Decorator Pattern so the user can "stack" as many notification channels as they want at runtime.

public class Main {
    public static void main(String[] args) {


        Notifier alert = new WhatsAppDecorator(new SMSDecorator(new EmailNotifier()));
        alert.send("Server is DOWN...!");
    }
}