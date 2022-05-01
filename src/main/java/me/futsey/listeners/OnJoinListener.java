package me.futsey.listeners;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.time.Instant;

public class OnJoinListener extends ListenerAdapter{

    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent event) {
        EmbedBuilder eb = new EmbedBuilder();
        eb.setColor(new Color(29, 128, 238));
        eb.setDescription("Дамы и господа! Пожаловал: " + event.getMember().getUser().getAsMention());
        eb.setFooter("Нас уже: " + event.getGuild().getMemberCount() + " в этом замечательном месте");
        eb.setThumbnail(event.getMember().getUser().getEffectiveAvatarUrl());
        eb.setTimestamp(Instant.now());
        event.getGuild().getTextChannelById(969568922900791357L).sendMessage((Message) eb.build()).complete();

    }
}
