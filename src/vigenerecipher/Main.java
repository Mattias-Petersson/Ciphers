package vigenerecipher;

public class Main {

	public static void main(String[] args) {
		Coder c = new Encoder("B");
		Coder b = new Decoder("B");
		System.out.println("Encrypt a string in lowercase: " + c.cryptDecrypt("abc") + 
				'\n' + "Decrypted the same string: " + b.cryptDecrypt(c.cryptDecrypt("abc")));
	}

}
