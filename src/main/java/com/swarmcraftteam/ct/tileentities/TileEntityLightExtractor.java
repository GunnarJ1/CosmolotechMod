package com.swarmcraftteam.ct.tileentities;

import com.sun.jna.CallbackParameterContext;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class TileEntityLightExtractor extends TileEntity implements ITickable, ICapabilityProvider
{

    private int power;
    private int cooldown;

    private ItemStackHandler handler;

    public TileEntityLightExtractor()
    {
        this.cooldown = 0;
        this.power = 0;
        handler = new ItemStackHandler(3);
    }

    public NBTTagCompound writeToNBT(NBTTagCompound compound)
    {
        compound.setInteger("power", this.power);
        compound.setInteger("cooldown", this.cooldown);
        compound.setTag("itemstackhandler", this.handler.serializeNBT());
        return super.writeToNBT(compound);
    }

    public void readFromNBT(NBTTagCompound compound)
    {
        this.power = compound.getInteger("power");
        this.cooldown = compound.getInteger("cooldown");
        this.handler.deserializeNBT(compound.getCompoundTag("itemstackhandler"));
        super.readFromNBT(compound);
    }

    @Override
    public void update()
    {
        this.cooldown++;
        this.cooldown %= 100;
        System.out.println(cooldown);
    }

    @Override
    public SPacketUpdateTileEntity getUpdatePacket()
    {
        NBTTagCompound nbt = new NBTTagCompound();
        this.writeToNBT(nbt);
        int metadata = getBlockMetadata();
        return new SPacketUpdateTileEntity(this.pos, metadata, nbt);
    }

    @Override
    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt)
    {
        this.readFromNBT(pkt.getNbtCompound());
    }

    @Override
    public NBTTagCompound getUpdateTag()
    {
        NBTTagCompound nbt = new NBTTagCompound();
        this.writeToNBT(nbt);
        return nbt;
    }

    @Override
    public void handleUpdateTag(NBTTagCompound tag)
    {
        this.readFromNBT(tag);
    }

    @Override
    public NBTTagCompound getTileData()
    {
        NBTTagCompound nbt = new NBTTagCompound();
        this.writeToNBT(nbt);
        return nbt;
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing)
    {
        if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
            return (T) this.handler;
        return super.getCapability(capability, facing);
    }

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing)
    {
        if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
            return true;
        return super.hasCapability(capability, facing);
    }


}
