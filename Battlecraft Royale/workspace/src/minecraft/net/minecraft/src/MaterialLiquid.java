// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Material, MapColor

public class MaterialLiquid extends Material
{

    public MaterialLiquid(MapColor mapcolor)
    {
        super(mapcolor);
        setIsGroundCover();
        setNoPushMobility();
    }

    public boolean getIsLiquid()
    {
        return true;
    }

    public boolean getIsSolid()
    {
        return false;
    }

    public boolean isSolid()
    {
        return false;
    }
}
