// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ModelBase, ModelRenderer, MathHelper

public class ModelChicken extends ModelBase
{

    public ModelChicken()
    {
        byte byte0 = 16;
        head = new ModelRenderer(0, 0);
        head.addBox(-2F, -6F, -2F, 4, 6, 3, 0.0F);
        head.setRotationPoint(0.0F, -1 + byte0, -4F);
        bill = new ModelRenderer(14, 0);
        bill.addBox(-2F, -4F, -4F, 4, 2, 2, 0.0F);
        bill.setRotationPoint(0.0F, -1 + byte0, -4F);
        chin = new ModelRenderer(14, 4);
        chin.addBox(-1F, -2F, -3F, 2, 2, 2, 0.0F);
        chin.setRotationPoint(0.0F, -1 + byte0, -4F);
        body = new ModelRenderer(0, 9);
        body.addBox(-3F, -4F, -3F, 6, 8, 6, 0.0F);
        body.setRotationPoint(0.0F, 0 + byte0, 0.0F);
        rightLeg = new ModelRenderer(26, 0);
        rightLeg.addBox(-1F, 0.0F, -3F, 3, 5, 3);
        rightLeg.setRotationPoint(-2F, 3 + byte0, 1.0F);
        leftLeg = new ModelRenderer(26, 0);
        leftLeg.addBox(-1F, 0.0F, -3F, 3, 5, 3);
        leftLeg.setRotationPoint(1.0F, 3 + byte0, 1.0F);
        rightWing = new ModelRenderer(24, 13);
        rightWing.addBox(0.0F, 0.0F, -3F, 1, 4, 6);
        rightWing.setRotationPoint(-4F, -3 + byte0, 0.0F);
        leftWing = new ModelRenderer(24, 13);
        leftWing.addBox(-1F, 0.0F, -3F, 1, 4, 6);
        leftWing.setRotationPoint(4F, -3 + byte0, 0.0F);
    }

    public void render(float f, float f1, float f2, float f3, float f4, float f5)
    {
        setRotationAngles(f, f1, f2, f3, f4, f5);
        head.render(f5);
        bill.render(f5);
        chin.render(f5);
        body.render(f5);
        rightLeg.render(f5);
        leftLeg.render(f5);
        rightWing.render(f5);
        leftWing.render(f5);
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
        head.rotateAngleX = -(f4 / 57.29578F);
        head.rotateAngleY = f3 / 57.29578F;
        bill.rotateAngleX = head.rotateAngleX;
        bill.rotateAngleY = head.rotateAngleY;
        chin.rotateAngleX = head.rotateAngleX;
        chin.rotateAngleY = head.rotateAngleY;
        body.rotateAngleX = 1.570796F;
        rightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        leftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + 3.141593F) * 1.4F * f1;
        rightWing.rotateAngleZ = f2;
        leftWing.rotateAngleZ = -f2;
    }

    public ModelRenderer head;
    public ModelRenderer body;
    public ModelRenderer rightLeg;
    public ModelRenderer leftLeg;
    public ModelRenderer rightWing;
    public ModelRenderer leftWing;
    public ModelRenderer bill;
    public ModelRenderer chin;
}
