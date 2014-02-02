package sheenrox82.RioV.src.handler;


public class ConnectionHandler
{
	/**@Override
	public void playerLoggedIn(Player player, NetHandler netHandler, INetworkManager manager) 
	{

	}

	@Override
	public String connectionReceived(NetLoginHandler netHandler, INetworkManager manager)
	{
		return null;
	}

	@Override
	public void connectionOpened(NetHandler netClientHandler, String server, int port, INetworkManager manager)
	{

	}

	@Override
	public void connectionOpened(NetHandler netClientHandler, MinecraftServer server, INetworkManager manager)
	{

	}

	@Override
	public void connectionClosed(INetworkManager inm)
	{

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void clientLoggedIn(NetHandler clientHandler, INetworkManager manager, Packet1Login login) 
	{
		try 
		{
			if (UpdateHandler.isUpdateAvailable()) 
			{
				clientHandler.getPlayer().sendChatToPlayer(ChatMessageComponent.createFromText("[" + Color.GRAY + Util.MOD_NAME + Color.WHITE + "]" + Color.RED + " Hey, " + clientHandler.getPlayer().username + "! An update is available for " + Util.MOD_NAME + ". Check http://goo.gl/Wf3zCW for more info. - sheenrox82"));
			}

			if (!UpdateHandler.isUpdateAvailable()) 
			{
				clientHandler.getPlayer().sendChatToPlayer(ChatMessageComponent.createFromText("[" + Color.GRAY + Util.MOD_NAME + Color.WHITE + "]" + Color.DARK_GREEN + " Hey, " + clientHandler.getPlayer().username + "! Thank you for downloading " + Util.MOD_NAME + "! You are up-to-date! - sheenrox82"));
			}	
		} 
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}**/
}