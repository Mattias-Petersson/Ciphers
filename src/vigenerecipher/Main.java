package vigenerecipher;

public class Main {

	public static void main(String[] args) {
		Coder c = new Encoder("test");
		Coder b = new Decoder("test");
		System.out.println(c.cryptDecrypt("string"));
		System.out.println(c.cryptDecrypt("STRING"));
		System.out.println("Encrypt a string in lowercase: " + c.cryptDecrypt("String") + 
				'\n' + "Decrypted the same string: " + b.cryptDecrypt(c.cryptDecrypt("String")));
	}

}
