package Iamshortman.GridMod.Common.Container;

import Iamshortman.GridMod.Common.Item.IItemMuitiColored;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotColorChanging extends Slot
{

	public SlotColorChanging(IInventory par1iInventory, int par2, int par3, int par4)
	{
		super(par1iInventory, par2, par3, par4);
	}
	
	@Override
	public boolean isItemValid(ItemStack Item)
	{
		if(Item.getItem() instanceof IItemMuitiColored)
		{
			return true;
		}
		
		return false;
	}

}
