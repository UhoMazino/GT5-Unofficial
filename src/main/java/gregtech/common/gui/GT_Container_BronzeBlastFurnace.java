package gregtech.common.gui;

import gregtech.api.gui.ContainerMetaTileEntity;
import gregtech.api.gui.slot.SlotOutput;
import gregtech.api.capability.internal.IGregTechTileEntity;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;

public class GT_Container_BronzeBlastFurnace
        extends ContainerMetaTileEntity {
    public GT_Container_BronzeBlastFurnace(InventoryPlayer aInventoryPlayer, IGregTechTileEntity aTileEntity) {
        super(aInventoryPlayer, aTileEntity);
    }

    @Override
    public void addSlots(InventoryPlayer aInventoryPlayer) {
        addSlotToContainer(new Slot(this.mTileEntity, 0, 34, 16));
        addSlotToContainer(new Slot(this.mTileEntity, 1, 34, 34));
        addSlotToContainer(new SlotOutput(this.mTileEntity, 2, 86, 25));
        addSlotToContainer(new SlotOutput(this.mTileEntity, 3, 104, 25));
    }

    @Override
    public int getSlotCount() {
        return 4;
    }

    @Override
    public int getShiftClickSlotCount() {
        return 2;
    }
}
