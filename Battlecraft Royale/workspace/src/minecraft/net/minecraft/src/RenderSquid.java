// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            RenderLiving, EntitySquid, ModelBase, EntityLiving, 
//            Entity

public class RenderSquid extends RenderLiving
{

    public RenderSquid(ModelBase modelbase, float f)
    {
        super(modelbase, f);
    }

    public void func_21008_a(EntitySquid entitysquid, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRenderLiving(entitysquid, d, d1, d2, f, f1);
    }

    protected void func_21007_a(EntitySquid entitysquid, float f, float f1, float f2)
    {
        float f3 = entitysquid.field_21088_b + (entitysquid.field_21089_a - entitysquid.field_21088_b) * f2;
        float f4 = entitysquid.field_21086_f + (entitysquid.field_21087_c - entitysquid.field_21086_f) * f2;
        GL11.glTranslatef(0.0F, 0.5F, 0.0F);
        GL11.glRotatef(180F - f1, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(f3, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(f4, 0.0F, 1.0F, 0.0F);
        GL11.glTranslatef(0.0F, -1.2F, 0.0F);
    }

    protected void func_21005_a(EntitySquid entitysquid, float f)
    {
    }

    protected float func_21006_b(EntitySquid entitysquid, float f)
    {
        float f1 = entitysquid.field_21082_j + (entitysquid.field_21083_i - entitysquid.field_21082_j) * f;
        return f1;
    }

    protected void preRenderCallback(EntityLiving entityliving, float f)
    {
        func_21005_a((EntitySquid)entityliving, f);
    }

    protected float func_170_d(EntityLiving entityliving, float f)
    {
        return func_21006_b((EntitySquid)entityliving, f);
    }

    protected void rotateCorpse(EntityLiving entityliving, float f, float f1, float f2)
    {
        func_21007_a((EntitySquid)entityliving, f, f1, f2);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
        func_21008_a((EntitySquid)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
        func_21008_a((EntitySquid)entity, d, d1, d2, f, f1);
    }
}
