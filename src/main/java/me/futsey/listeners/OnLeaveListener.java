package me.futsey.listeners;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.time.Instant;

public class OnLeaveListener extends ListenerAdapter{
    @Override
    public void onGuildMemberRemove(GuildMemberRemoveEvent event) {
        EmbedBuilder eb = new EmbedBuilder();
        eb.setColor(new Color(140, 12, 77));
        eb.setDescription("Всего Вам доброго: " + event.getMember().getUser().getAsMention());
        eb.setThumbnail(event.getMember().getUser().getEffectiveAvatarUrl());
        eb.setTimestamp(Instant.now());
        event.getGuild().getTextChannelById(969568922900791357L).sendMessage((Message) eb.build()).complete();

    }
}
