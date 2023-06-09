//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "F:\rusherhack"!

//Decompiled by Procyon!

package com.memphis.revenge.gui;

import com.memphis.revenge.setting.settings.*;
import java.awt.*;

public class BooleanComponent extends AbstractComponent
{
    private final SettingBoolean setting;
    
    public BooleanComponent(final SettingBoolean setting) {
        super(new Rectangle());
        this.setting = setting;
    }
    
    public void draw() {
        IComponent.fillRect(this.rect, this.setting.getValue() ? new Color(110, 110, 191, 170) : new Color(78, 65, 119, 120));
        IComponent.drawString(this.setting.getName(), new Point(this.rect.x + 1, this.rect.y + 2), Color.WHITE);
    }
    
    public void handleButton(final int btn) {
        if (this.rect.contains(Screen.MOUSE) && btn != -1) {
            this.setting.setValue(!this.setting.getValue());
        }
    }
}
