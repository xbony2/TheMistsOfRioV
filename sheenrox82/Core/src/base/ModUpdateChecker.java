package sheenrox82.Core.src.base;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import net.minecraft.util.EnumChatFormatting;
import sheenrox82.RioV.src.api.util.RioVAPIUtil;

public class ModUpdateChecker 
{
	public static String urlString;
	public static String versionString;
	public static String newVersionStr;
	public static int newUpdate = 2;
	public static int noUpdate = 1;
	public static int offline = 0;

	public static void init(String url, String version)
	{
		urlString = url;
		versionString = version;
	}

	public static int isUpdateAvailable()
	{
		try
		{
			BufferedReader versionFile = new BufferedReader(new InputStreamReader(new URL(urlString).openStream()));
			String curVersion = versionFile.readLine();
			newVersionStr = curVersion;
			versionFile.close();

			if (!curVersion.equals(versionString))
			{
				return newUpdate;
			}
			else
			{
				return noUpdate;
			}
		}
		catch(Exception e)
		{
			return offline;
		}
	}

	public static void printChangelog(String url)
	{
		try
		{
			BufferedReader changelogFile = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
			String changelog;
			
			while ((changelog = changelogFile.readLine()) != null)
			{
				RioVAPIUtil.sendMessageToAll(EnumChatFormatting.GOLD, changelog);
			}
			
			changelogFile.close();
		}
		catch(Exception e)
		{
			
		}
	}
}