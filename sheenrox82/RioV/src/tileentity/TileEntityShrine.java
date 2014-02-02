package sheenrox82.RioV.src.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityShrine extends TileEntity 
{
	public boolean isTasaravSpawned;
	public boolean isTasaravDead;

    public void func_145839_a(NBTTagCompound nbt)
    {
        super.func_145839_a(nbt);
        isTasaravSpawned = nbt.getBoolean("Tasarav");
        isTasaravDead = nbt.getBoolean("TasaravDead");
    }

    public void func_145841_b(NBTTagCompound nbt)
    {
        super.func_145841_b(nbt);
        nbt.setBoolean("Tasarav", isTasaravSpawned);
        nbt.setBoolean("TasaravDead", isTasaravDead);
    }
}
