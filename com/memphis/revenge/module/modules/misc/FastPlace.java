//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "F:\rusherhack"!

//Decompiled by Procyon!

package com.memphis.revenge.module.modules.misc;

import com.memphis.revenge.module.*;
import com.memphis.revenge.setting.settings.*;
import net.minecraft.item.*;

public class FastPlace extends Module
{
    SettingBoolean everything;
    SettingBoolean blocks;
    SettingBoolean crystals;
    SettingBoolean exp;
    
    public FastPlace() {
        super("FastPlace", "", 0, Module.Category.MISC);
        this.everything = this.register("Everything", false);
        this.blocks = this.register("Blocks", false);
        this.crystals = this.register("Crystals", false);
        this.exp = this.register("Exp", false);
    }
    
    public void update() {
        if (this.everything.getValue()) {
            FastPlace.mc.rightClickDelayTimer = 0;
        }
        if ((this.exp.getValue() && FastPlace.mc.player.getHeldItemMainhand().getItem() instanceof ItemExpBottle) || FastPlace.mc.player.getHeldItemOffhand().getItem() instanceof ItemExpBottle) {
            FastPlace.mc.rightClickDelayTimer = 0;
        }
        if ((this.blocks.getValue() && FastPlace.mc.player.getHeldItemMainhand().getItem() instanceof ItemBlock) || FastPlace.mc.player.getHeldItemOffhand().getItem() instanceof ItemBlock) {
            FastPlace.mc.rightClickDelayTimer = 0;
        }
        if ((this.crystals.getValue() && FastPlace.mc.player.getHeldItemMainhand().getItem() instanceof ItemEndCrystal) || FastPlace.mc.player.getHeldItemOffhand().getItem() instanceof ItemEndCrystal) {
            FastPlace.mc.rightClickDelayTimer = 0;
        }
    }
}
