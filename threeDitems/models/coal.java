package threeDitems.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class coal extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
  
  public coal()
  {
    textureWidth = 26;
    textureHeight = 8;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(-2F, -7F, -2F, 3, 1, 2);
      Shape1.setRotationPoint(0F, 0F, 0F);
      Shape1.setTextureSize(26, 8);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(-2.5F, -6.5F, -2.5F, 4, 1, 3);
      Shape2.setRotationPoint(0F, 0F, 0F);
      Shape2.setTextureSize(26, 8);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(-3F, -6F, -3F, 5, 1, 4);
      Shape3.setRotationPoint(0F, 0F, 0F);
      Shape3.setTextureSize(26, 8);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 0);
      Shape4.addBox(-3.5F, -5F, -3.5F, 6, 1, 5);
      Shape4.setRotationPoint(0F, 0F, 0F);
      Shape4.setTextureSize(26, 8);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 0);
      Shape5.addBox(-4F, -4.5F, -4F, 7, 2, 6);
      Shape5.setRotationPoint(0F, 0F, 0F);
      Shape5.setTextureSize(26, 8);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 0, 0);
      Shape6.addBox(-3.5F, -2.5F, -3.5F, 6, 1, 5);
      Shape6.setRotationPoint(0F, 0F, 0F);
      Shape6.setTextureSize(26, 8);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 0, 0);
      Shape7.addBox(-3F, -2F, -3F, 5, 1, 4);
      Shape7.setRotationPoint(0F, 0F, 0F);
      Shape7.setTextureSize(26, 8);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 0, 0);
      Shape8.addBox(-2.5F, -1.5F, -2.5F, 4, 1, 3);
      Shape8.setRotationPoint(0F, 0F, 0F);
      Shape8.setTextureSize(26, 8);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);

  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);

  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}
