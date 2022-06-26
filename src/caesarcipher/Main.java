package caesarcipher;

public class Main {

	public static void main(String[] args) {
		Coder enc = new Encoder(1);
		Coder dec = new Decoder(1);
		String text = enc.cryptDecrypt("abc");
		System.out.println(dec.cryptDecrypt(text));
	}
}
