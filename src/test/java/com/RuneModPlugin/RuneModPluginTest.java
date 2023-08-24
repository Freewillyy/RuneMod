package com.RuneModPlugin;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;
import org.junit.jupiter.api.BeforeEach;

public class RuneModPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(RuneModPlugin.class);
		RuneLite.main(args);
	}

	@BeforeEach
	void setUp() {
	}
}