package me.dilley;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnit_tests {

	@Test 
	public void checkAddress() {
		  MineStat ms = new MineStat("minecraft.dilley.me", 25565);
		  String address = ms.getAddress();
		  assertEquals("minecraft.dilley.me", address);
	}

	@Test
	public void checkPort() {
		MineStat ms = new MineStat("minecraft.dilley.me", 25565);
		int port = ms.getPort();
		assertEquals(25565, port);
	}
	@Test
	public void checkVersion() {
		MineStat ms = new MineStat("minecraft.dilley.me", 25565);
		String port = ms.getVersion();
		assertEquals("B u n g e e C o r d   1 . 8 . x - 1 . 1 2 . x", port);
	}
}
