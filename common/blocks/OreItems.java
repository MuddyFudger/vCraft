package vCraft.common.blocks;

import net.minecraft.src.Block;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;

public class OreItems extends ItemBlock {
	
	public static String[] blockNames = {
		"Sodium",
		"Calcium",
		"Magnesium",
		"Aluminium",
		"Zinc",
		"Lead",
		"Magnetite",
		"Titanium",
		"Chromium",
		"Cobalt",
		"Nickel",
		"Platinum",
		"Mercury",
		"Lithium",
		"Plutonium",
		"Arsenic",
	};

	public OreItems(int i) {
		super(i);
		setMaxDamage(0);
		setHasSubtypes(true);
	}
	
	public int getMetadata(int damage) {
		return damage;
	}
	
	public String getItemNameIS(ItemStack itemstack) {
		return (new StringBuilder())
								.append(super.getItemName())
								.append(".")
								.append(blockNames[itemstack.getItemDamage()])
								.toString();
	}
	
}
