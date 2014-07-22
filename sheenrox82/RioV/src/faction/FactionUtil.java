package sheenrox82.RioV.src.faction;

import sheenrox82.RioV.src.api.util.PlayerNBT;

public class FactionUtil 
{
	public static String noFactionName = "No Faction";
	public static String raetiinName = "Raetiin";
	public static String jaerinName = "Jaerin";
	public static int noFactionID = 0;
	public static int raetiinID = 1;
	public static int jaerinID = 2;
	public static int factionID;
	public static boolean hasSeenFactionGui;
	public static boolean receivedScroll;

	public static void setFaction(int factionID)
	{
		PlayerNBT.setFaction(factionID);
	}
}
