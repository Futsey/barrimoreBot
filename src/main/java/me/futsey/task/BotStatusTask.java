package me.futsey.task;

import me.futsey.BarrimoreBot;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;

import java.util.concurrent.TimeUnit;

public class BotStatusTask implements Runnable {

    private final BarrimoreBot bot;
    private int currentIndex = 0;

    public BotStatusTask(BarrimoreBot bot) {
        this.bot = bot;
        this.bot.getExecutorService().scheduleAtFixedRate(this, 1L, 15L, TimeUnit.SECONDS);
    }

    @Override
    public void run() {
        String[] status = {
                "наблюдение за Kord"
                , "c воображемыми друзъями"
                , "геополитику"
                , "шутки вместе с Raydzin"
                , "управление Артасом"
        };
        BarrimoreBot.getJda().getPresence().setActivity(Activity.playing(status[currentIndex]));
        currentIndex = (currentIndex + 1) % status.length;
    }
}
