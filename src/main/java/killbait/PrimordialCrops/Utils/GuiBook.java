package killbait.PrimordialCrops.Utils;

//Have not tested if this will work or not, Writting the code directly into github until i clone the source, Imports are needed
public class GuiBook extends GuiScreen {
    
    	public static final ResourceLocation texture = new ResourceLocation("maingui.png");
    
    int xSize, ySize, left, top;
    
    
	@Override
	public void initGui() {
		xSize = 256;
		ySize = 184;
		left = (width - xSize) / 2;
		top = (height - ySize) / 2;

	}
	
@Override
public void drawScreen(int mouseX, int mouseY, float partialTicks) {
    drawDefaultBackground();

		GlStateManager.color(1F, 1F, 1F);
		mc.getTextureManager().bindTexture(texture);
		drawTexturedModalRect(left, top, 0, 0, xSize, ySize);

		super.drawScreen(mouseX, mouseY, partialTicks);

			String finalWorking = I18n.translateToLocal("Primordial Crops");
			mc.fontRendererObj.drawStringWithShadow(finalWorking, left + xSize / 2 - mc.fontRendererObj.getStringWidth(finalWorking) / 2, top - 12, 0xFFFFFF);
	
			String loadGuiText = I18n.translateToLocal("PrimordialCrops.loadGuiText");
			mc.fontRendererObj.drawStringWithShadow(loadGuiText, left + xSize / 2 - mc.fontRendererObj.getStringWidth(loadGuiText) / 2, top + 133, 0xFFFFFF);
}

@Override
public boolean doesGuiPauseGame() {
    return false;
}

}
