//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "F:\rusherhack"!

//Decompiled by Procyon!

package com.memphis.revenge.module.modules.player;

import com.memphis.revenge.module.*;
import com.memphis.revenge.event.events.*;
import me.zero.alpine.listener.*;
import java.util.function.*;
import net.minecraft.network.play.client.*;

public class AntiHunger extends Module
{
    @EventHandler
    private final Listener<PacketEvent.Receive> receiveListener;
    
    public AntiHunger() {
        super("AntiHunger", "Causes you to not lose hunger even while jumping.", 0, Module.Category.PLAYER);
        this.receiveListener = (Listener<PacketEvent.Receive>)new Listener(event -> {
            if (event.getPacket() instanceof CPacketPlayer) {
                final CPacketPlayer player = (CPacketPlayer)event.getPacket();
                final double differenceY = AntiHunger.mc.player.posY - AntiHunger.mc.player.lastTickPosY;
                final boolean groundCheck = differenceY == 0.0;
                if (groundCheck && !AntiHunger.mc.playerController.isHittingBlock) {
                    AntiHunger.mc.player.onGround = true;
                }
            }
        }, new Predicate[0]);
    }
}
