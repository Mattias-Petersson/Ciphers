package caesarcipher;

public abstract class Coder {
	protected int key;
	public Coder(int key) {
		this.key = key;
	}
	public String cryptDecrypt(String s) {
		StringBuilder sb = new StringBuilder(s);
		StringBuilder res = new StringBuilder();
		sb.chars().forEach(c -> res.append(specifiedOp(c)));
		return res.toString();
	}
	protected abstract char specifiedOp(int c);
}
