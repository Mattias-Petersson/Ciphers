package caesarcipher;

public class Encoder extends Coder{

	public Encoder(int key) {
		super(key);
	}
	@Override
	protected char specifiedOp(int c) {
		return (char)(c + key);
	}
}
