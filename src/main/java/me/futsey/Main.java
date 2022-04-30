package me.futsey;

import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import org.jetbrains.annotations.NotNull;

public class Main implements EventListener {

    public static void main(String[] args) throws InterruptedException{
        new BarrimoreBot();
    }

    @Override
    public void onEvent(@NotNull GenericEvent genericEvent) {
        if (genericEvent instanceof ReadyEvent) {
            System.out.println("\n\n\n\nБэрримор на связи, сэр!");
        }
    }
}
