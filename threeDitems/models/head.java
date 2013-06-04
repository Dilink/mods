package threeDitems.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class head extends ModelBase
{

	ModelRenderer Shape1;
	ModelRenderer Shape2;

	public head()
	{

		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.setTextureSize(64,32);
		Shape1.addBox(-4F, -8F, -4F, 8, 8, 8);
		Shape1.setRotationPoint(0F, 0F, 0F);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		
		Shape2 = new ModelRenderer(this, 0, 0);
		Shape2.setTextureSize(64,64);
		Shape2.addBox(-4F, -8F, -4F, 8, 8, 8);
		Shape2.setRotationPoint(0F, 0F, 0F);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		
	}
	
	public void renderHead(float f5){
		Shape1.render(f5);
	}
	
	public void renderZombie(float f5){
		Shape2.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
