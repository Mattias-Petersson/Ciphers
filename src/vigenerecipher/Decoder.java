package vigenerecipher;

public class Decoder extends Coder {

	public Decoder(String keyword) {
		super(keyword);
	}

	@Override
	protected char specifiedOp(char letter, char key) {
		return (char) ((letter - key + 26) % 26 + 65);
	}

}
