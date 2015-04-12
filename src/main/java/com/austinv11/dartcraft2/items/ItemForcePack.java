package com.austinv11.dartcraft2.items;

import com.austinv11.dartcraft2.DartCraft2;
import com.austinv11.dartcraft2.reference.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemForcePack extends ItemDC{
    public ItemForcePack() {
        super();
        this.setMaxStackSize(1);
        this.setUnlocalizedName("forcePack");
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        player.openGui(DartCraft2.instance, Reference.GUIs.FORCE_PACK.ordinal(), player.getEntityWorld(), (int) player.posX, (int) player.posY, (int) player.posZ);
        return stack;
    }
}
