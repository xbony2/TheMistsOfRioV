package sheenrox82.RioV.src.faction;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiFaction extends GuiContainer
{
	protected String field_146442_a = "Select a Faction";

	public GuiFaction(InventoryPlayer inventoryPlayer)
	{
		super(new ContainerFactionScroll(inventoryPlayer));
	}

	protected void actionPerformed(GuiButton p_146284_1_)
	{
		if (p_146284_1_.id == 1000)
		{
			FactionUtil.setFaction(FactionUtil.raetiinID);
		}

		if (p_146284_1_.id == 1001)
		{
			FactionUtil.setFaction(FactionUtil.jaerinID);
		}
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) 
	{
		this.drawDefaultBackground();
		this.drawCenteredString(this.fontRendererObj, this.field_146442_a, this.width / 2, 15, 16777215);
		this.buttonList.add(new GuiButton(1000, this.width / 2 - 155, this.height / 6 + 72 - 6, 150, 20, I18n.format("Raetiin", new Object[0])));
		this.buttonList.add(new GuiButton(1001, this.width / 2 + 5, this.height / 6 + 72 - 6, 150, 20, I18n.format("Jaerin", new Object[0])));
	}

	@Override
	public void onGuiClosed() 
	{
		super.onGuiClosed();
	}
}