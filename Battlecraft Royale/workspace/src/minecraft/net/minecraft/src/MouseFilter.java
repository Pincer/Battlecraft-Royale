// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src;


public class MouseFilter
{

    public MouseFilter()
    {
    }

    public float func_22386_a(float f, float f1)
    {
        field_22388_a += f;
        f = (field_22388_a - field_22387_b) * f1;
        field_22389_c = field_22389_c + (f - field_22389_c) * 0.5F;
        if(f > 0.0F && f > field_22389_c || f < 0.0F && f < field_22389_c)
        {
            f = field_22389_c;
        }
        field_22387_b += f;
        return f;
    }

    private float field_22388_a;
    private float field_22387_b;
    private float field_22389_c;
}
