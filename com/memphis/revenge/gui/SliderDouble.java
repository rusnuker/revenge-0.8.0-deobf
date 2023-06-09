//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "F:\rusherhack"!

//Decompiled by Procyon!

package com.memphis.revenge.gui;

import com.memphis.revenge.setting.settings.*;
import java.awt.*;
import net.minecraft.util.math.*;

public class SliderDouble extends AbstractComponent
{
    private final SettingDouble setting;
    private boolean sliding;
    
    public SliderDouble(final SettingDouble setting) {
        super(new Rectangle());
        this.sliding = false;
        this.setting = setting;
    }
    
    public void draw() {
        final double Multiplier = (this.setting.getValue() - this.setting.getMin()) / (this.setting.getMax() - this.setting.getMin());
        IComponent.fillRect(this.rect, new Color(70, 70, 70, 140));
        IComponent.fillRect(new Rectangle(this.rect.x, this.rect.y, (int)(this.rect.width * Multiplier), this.rect.height), new Color(42, 28, 50, 200));
        IComponent.drawString(this.setting.getName() + ": " + this.setting.getValue(), new Point(this.rect.x + 1, this.rect.y + 2), Color.WHITE);
        if (this.sliding) {
            final double diff = MathHelper.clamp((Screen.MOUSE.getX() - this.rect.getX()) / (this.rect.getWidth() - 1.0), 0.0, 1.0);
            this.setting.setValue((int)((this.setting.getMax() - this.setting.getMin()) * diff + this.setting.getMin()));
        }
    }
    
    public void handleButton(final int btn) {
        if (btn != -1 && this.rect.contains(Screen.MOUSE)) {
            this.sliding = true;
        }
        else if (this.sliding) {
            this.sliding = false;
        }
    }
}
