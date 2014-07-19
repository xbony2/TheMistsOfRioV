package sheenrox82.RioV.src.handler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import sheenrox82.RioV.src.util.Util;

public class UpdateHandler 
{
	public static boolean isUpdateAvailable()
	{
		try
		{
			BufferedReader versionFile = new BufferedReader(new InputStreamReader(new URL("https://dl.dropboxusercontent.com/u/126631367/Current%20Version.txt").openStream()));
			String curVersion = versionFile.readLine();
			versionFile.close();

			if (!curVersion.equals(Util.VERSION))
			{
				return true;
			}

		}
		catch(Exception e)
		{
			return false;
		}
		
		return false;
	}
}