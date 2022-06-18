package main;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class NachrichtenReaktion extends ListenerAdapter {

    public void onMessageReceived (MessageReceivedEvent ereignis) {

        System.out.println("Nachricht erhalten");

    }
}
