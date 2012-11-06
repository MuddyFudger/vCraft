package vCraft.common.container;

import net.minecraft.src.ContainerWorkbench;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.World;

public class ContainerLocator extends ContainerWorkbench {

	public ContainerLocator(InventoryPlayer inv, World world, int x, int y, int z) {
		super(inv, world, x, y, z);
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer var1) {
		return true;
	}
	
	@Override
    public void onCraftGuiClosed(EntityPlayer player) {
    	super.onCraftGuiClosed(player);
    }

}
