//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "F:\rusherhack"!

//Decompiled by Procyon!

package org.spongepowered.tools.obfuscation.interfaces;

import org.spongepowered.tools.obfuscation.mirror.*;
import javax.lang.model.type.*;

public interface ITypeHandleProvider
{
    TypeHandle getTypeHandle(final String p0);
    
    TypeHandle getSimulatedHandle(final String p0, final TypeMirror p1);
}
