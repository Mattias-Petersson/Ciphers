package vigenerecipher;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class Test {
	Coder encrypt;
	Coder decrypt;
	@BeforeEach
	void setUp() throws Exception {
		encrypt = new Encoder("test");
		decrypt = new Decoder("test");
	}

	@AfterEach
	void tearDown() throws Exception {
		encrypt = null;
		decrypt = null;
	}

	@org.junit.jupiter.api.Test
	void test() {
		assertEquals("An uppercase string should decrypt to the same string.", "STRING", decrypt.cryptDecrypt(encrypt.cryptDecrypt("string")));
		assertEquals("Lower vs. uppercase should not matter", encrypt.cryptDecrypt("String"), encrypt.cryptDecrypt("STRING"));
	}

}
