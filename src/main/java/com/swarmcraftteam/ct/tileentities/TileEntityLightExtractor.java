package com.swarmcraftteam.ct.tileentities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TileEntityLightExtractor extends TileEntity implements ITickable {

	private int power;
	private int cooldown;
	
	public TileEntityLightExtractor() {
		
	}
	
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		compound.setInteger("power", this.power);
		compound.setInteger("cooldown", cooldown);
		return super.writeToNBT(compound);
	}
	
	public void readFromNBT(NBTTagCompound compound) {
		this.power = compound.getInteger("power");
		this.cooldown = compound.getInteger("cooldown");
		super.readFromNBT(compound);
	}
	
	@Override
	public void update() {
		this.cooldown++;
		this.cooldown %= 100;
		System.out.println(cooldown);
	}
	
	
	//PACKET DATA -> JIBBERISH
	//SAVES TILE ENTITY DATA
	@Override
	public SPacketUpdateTileEntity getUpdatePacket() {
		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);
		int metadata = getBlockMetadata();
		return new SPacketUpdateTileEntity(this.pos, metadata, nbt);
	}

	@Override
	public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
		this.readFromNBT(pkt.getNbtCompound());
	}

	@Override
	public NBTTagCompound getUpdateTag() {
		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);
		return nbt;
	}

	@Override
	public void handleUpdateTag(NBTTagCompound tag) {
		this.readFromNBT(tag);
	}

	@Override
	public NBTTagCompound getTileData() {
		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);
		return nbt;
	}
	
}
