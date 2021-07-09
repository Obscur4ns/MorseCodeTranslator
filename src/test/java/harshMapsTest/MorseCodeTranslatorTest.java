package harshMapsTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hashMaps.MorseCodeTranslator;

public class MorseCodeTranslatorTest {
	public MorseCodeTranslator translator = new MorseCodeTranslator();

	@Test
	public void testTranslate() {
		assertEquals("JAVA IS COOL OK", translator.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
	}
}
