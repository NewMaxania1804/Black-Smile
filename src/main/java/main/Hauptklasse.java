package main;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Hauptklasse {

    public static void main(String[] args) throws LoginException {

        // Joa idk was ich hier mache x3

        String prefix = "!";

        String status;
        status = "zu wie Maxania1804 [DCT] [SNW]#3757 an mir Versuche durchführt";

        int zahl = 12;
        double kommazahl = 1.45;

        String token = System.getev("TOKEN");

        JDABuilder bauplan = JDABuilder.createDefault(token);

        bauplan.setStatus(OnlineStatus.DO_NOT_DISTURB);
        bauplan.setActivity(Activity.watching(status));

        bauplan.addEventListeners(new NachrichtenReaktion());
        JDA bot = bauplan.build();
        System.out.println("Shini.exe wurde erfolgreich gestartet!");
        System.out.println("Der Prefix von SHini.exe ist: "+ prefix);
    }
}
