// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ModelBase, ModelRenderer, MathHelper

public class ModelQuadruped extends ModelBase
{

    public ModelQuadruped(int i, float f)
    {
        head = new ModelRenderer(0, 0);
        head.addBox(-4F, -4F, -8F, 8, 8, 8, f);
        head.setRotationPoint(0.0F, 18 - i, -6F);
        body = new ModelRenderer(28, 8);
        body.addBox(-5F, -10F, -7F, 10, 16, 8, f);
        body.setRotationPoint(0.0F, 17 - i, 2.0F);
        leg1 = new ModelRenderer(0, 16);
        leg1.addBox(-2F, 0.0F, -2F, 4, i, 4, f);
        leg1.setRotationPoint(-3F, 24 - i, 7F);
        leg2 = new ModelRenderer(0, 16);
        leg2.addBox(-2F, 0.0F, -2F, 4, i, 4, f);
        leg2.setRotationPoint(3F, 24 - i, 7F);
        leg3 = new ModelRenderer(0, 16);
        leg3.addBox(-2F, 0.0F, -2F, 4, i, 4, f);
        leg3.setRotationPoint(-3F, 24 - i, -5F);
        leg4 = new ModelRenderer(0, 16);
        leg4.addBox(-2F, 0.0F, -2F, 4, i, 4, f);
        leg4.setRotationPoint(3F, 24 - i, -5F);
    }

    public void render(float f, float f1, float f2, float f3, float f4, float f5)
    {
        setRotationAngles(f, f1, f2, f3, f4, f5);
        head.render(f5);
        body.render(f5);
        leg1.render(f5);
        leg2.render(f5);
        leg3.render(f5);
        leg4.render(f5);
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
        head.rotateAngleX = f4 / 57.29578F;
        head.rotateAngleY = f3 / 57.29578F;
        body.rotateAngleX = 1.570796F;
        leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + 3.141593F) * 1.4F * f1;
        leg3.rotateAngleX = MathHelper.cos(f * 0.6662F + 3.141593F) * 1.4F * f1;
        leg4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    }

    public ModelRenderer head;
    public ModelRenderer body;
    public ModelRenderer leg1;
    public ModelRenderer leg2;
    public ModelRenderer leg3;
    public ModelRenderer leg4;
}
