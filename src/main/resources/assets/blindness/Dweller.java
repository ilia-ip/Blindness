// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class Dweller extends EntityModel<Entity> {
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bb_main;
	public Dweller(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
		this.bone3 = root.getChild("bone3");
		this.bone4 = root.getChild("bone4");
		this.bb_main = root.getChild("bb_main");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.of(6.25F, 24.0F, 4.5F, 0.0F, 0.2182F, 0.0F));

		ModelPartData cube_r1 = bone.addChild("cube_r1", ModelPartBuilder.create().uv(10, 17).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2921F, -0.7401F, -0.4194F));

		ModelPartData cube_r2 = bone.addChild("cube_r2", ModelPartBuilder.create().uv(23, 6).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -9.5F, 0.0F, 0.6707F, 0.445F, -2.0679F));

		ModelPartData bone2 = modelPartData.addChild("bone2", ModelPartBuilder.create(), ModelTransform.of(-6.5F, 24.0F, 4.0F, 0.0F, -1.7017F, 0.0F));

		ModelPartData cube_r3 = bone2.addChild("cube_r3", ModelPartBuilder.create().uv(5, 17).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2921F, -0.7401F, -0.4194F));

		ModelPartData cube_r4 = bone2.addChild("cube_r4", ModelPartBuilder.create().uv(20, 21).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -9.5F, 0.0F, 0.6707F, 0.445F, -2.0679F));

		ModelPartData bone3 = modelPartData.addChild("bone3", ModelPartBuilder.create(), ModelTransform.of(-6.0F, 24.0F, -5.0F, 0.0F, -2.8798F, 0.0F));

		ModelPartData cube_r5 = bone3.addChild("cube_r5", ModelPartBuilder.create().uv(0, 17).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2921F, -0.7401F, -0.4194F));

		ModelPartData cube_r6 = bone3.addChild("cube_r6", ModelPartBuilder.create().uv(20, 14).cuboid(-1.0F, -9.0F, -1.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -9.5F, 0.0F, 0.6707F, 0.445F, -2.0679F));

		ModelPartData bone4 = modelPartData.addChild("bone4", ModelPartBuilder.create(), ModelTransform.of(6.0F, 24.0F, -5.0F, 0.0F, 1.4835F, 0.0F));

		ModelPartData cube_r7 = bone4.addChild("cube_r7", ModelPartBuilder.create().uv(15, 14).cuboid(-1.0F, -8.0F, -1.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2921F, -0.7401F, -0.4194F));

		ModelPartData cube_r8 = bone4.addChild("cube_r8", ModelPartBuilder.create().uv(19, 0).cuboid(-1.0F, -9.0F, -1.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -9.5F, 0.0F, 0.6707F, 0.445F, -2.0679F));

		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(0, 9).cuboid(-1.0F, -5.0F, -3.0F, 2.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-2.0F, -6.0F, 0.0F, 4.0F, 3.0F, 5.0F, new Dilation(0.0F))
		.uv(10, 9).cuboid(-2.0F, -5.5F, -5.0F, 4.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 32, 32);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bone.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		bone2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		bone3.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		bone4.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		bb_main.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}