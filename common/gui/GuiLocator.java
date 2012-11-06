package vCraft.common.gui;

import org.lwjgl.opengl.GL11;

import vCraft.common.container.ContainerLocator;
import vCraft.common.lib.Reference;



import net.minecraft.src.Container;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.GuiContainer;
import net.minecraft.src.StatCollector;
import net.minecraft.src.World;

public class GuiLocator extends GuiContainer {		
	
	public GuiLocator(EntityPlayer player, World world, int x, int y, int z) {
		super(new ContainerLocator(player.inventory, world, x, y, z));
	}
	
    protected void drawGuiContainerForegroundLayer(int par1, int par2) {
        this.fontRenderer.drawString(StatCollector.translateToLocal("container.crafting"), 28, 6, 4210752);
        this.fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
        int var4 = this.mc.renderEngine.getTexture(Reference.GUI_SHEET_LOCATION + "GuiLocator.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(var4);
        int var5 = (this.width - this.xSize) / 2;
        int var6 = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
    }
	
}
