// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            IInventory, ItemStack, IInvBasic, EntityPlayer

public class InventoryBasic
    implements IInventory
{

    public InventoryBasic(String s, int i)
    {
        inventoryTitle = s;
        slotsCount = i;
        inventoryContents = new ItemStack[i];
    }

    public ItemStack getStackInSlot(int i)
    {
        return inventoryContents[i];
    }

    public ItemStack decrStackSize(int i, int j)
    {
        if(inventoryContents[i] != null)
        {
            if(inventoryContents[i].stackSize <= j)
            {
                ItemStack itemstack = inventoryContents[i];
                inventoryContents[i] = null;
                onInventoryChanged();
                return itemstack;
            }
            ItemStack itemstack1 = inventoryContents[i].splitStack(j);
            if(inventoryContents[i].stackSize == 0)
            {
                inventoryContents[i] = null;
            }
            onInventoryChanged();
            return itemstack1;
        } else
        {
            return null;
        }
    }

    public void setInventorySlotContents(int i, ItemStack itemstack)
    {
        inventoryContents[i] = itemstack;
        if(itemstack != null && itemstack.stackSize > getInventoryStackLimit())
        {
            itemstack.stackSize = getInventoryStackLimit();
        }
        onInventoryChanged();
    }

    public int getSizeInventory()
    {
        return slotsCount;
    }

    public String getInvName()
    {
        return inventoryTitle;
    }

    public int getInventoryStackLimit()
    {
        return 64;
    }

    public void onInventoryChanged()
    {
        if(field_20073_d != null)
        {
            for(int i = 0; i < field_20073_d.size(); i++)
            {
                ((IInvBasic)field_20073_d.get(i)).func_20134_a(this);
            }

        }
    }

    public boolean canInteractWith(EntityPlayer entityplayer)
    {
        return true;
    }

    private String inventoryTitle;
    private int slotsCount;
    private ItemStack inventoryContents[];
    private List field_20073_d;
}
