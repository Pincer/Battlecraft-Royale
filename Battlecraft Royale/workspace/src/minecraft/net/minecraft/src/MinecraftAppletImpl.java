// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src;

import java.awt.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MinecraftApplet;

// Referenced classes of package net.minecraft.src:
//            PanelCrashReport, UnexpectedThrowable

public class MinecraftAppletImpl extends Minecraft
{

    public MinecraftAppletImpl(MinecraftApplet minecraftapplet, Component component, Canvas canvas, MinecraftApplet minecraftapplet1, int i, int j, boolean flag)
    {
        super(component, canvas, minecraftapplet1, i, j, flag);
        mainFrame = minecraftapplet;
    }

    public void displayUnexpectedThrowable(UnexpectedThrowable unexpectedthrowable)
    {
        mainFrame.removeAll();
        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(new PanelCrashReport(unexpectedthrowable), "Center");
        mainFrame.validate();
    }

    final MinecraftApplet mainFrame; /* synthetic field */
}
