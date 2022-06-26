package vigenerecipher;

public class Encoder extends Coder {

	public Encoder(String keyword) {
		super(keyword);
	}
	protected char specifiedOp(char letter, char key) {
		return (char) ((letter + key) % 26 + 65);
	}

}
