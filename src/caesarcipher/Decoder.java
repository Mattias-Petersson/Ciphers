package caesarcipher;

public class Decoder extends Coder{

	public Decoder(int key) {
		super(key);
	}

	protected char specifiedOp(int c) {
		return (char)(c - key);
	}
}
