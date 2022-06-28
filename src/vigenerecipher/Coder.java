package vigenerecipher;

public abstract class Coder {
	private String keyword;

	public Coder(String keyword) {
		this.keyword = keyword.toUpperCase();
	}

	/*
	 * Encrypts/Decrypts by using a Vigenère-cipher. Outputs capital letters (A-Z).
	 * 
	 * @param stringToEncrypt the String that is to be encrypted.
	 * 
	 * @return the encrypted String.
	 */

	public String cryptDecrypt(String stringToEncrypt) {
		stringToEncrypt = stringToEncrypt.toUpperCase();
		if (keyword.isEmpty())
			return stringToEncrypt;
		String key = generateKey(stringToEncrypt);
		return encryptRecursively(stringToEncrypt, key);
	}

	private String encryptRecursively(String text, String key) {
		if (text.length() > 0) {
			return specifiedOp(text.charAt(0), key.charAt(0)) + encryptRecursively(text.substring(1), key.substring(1));
		} else {
			return text;
		}

	}

	protected abstract char specifiedOp(char letter, char key);

	/*
	 * The key is based on the length of the keyword & the length of the string to
	 * encrypt by the following logic: if keyword < stringToEncrypt -- Repeat the
	 * keyword modulo the keyword length until they are the same. if keyword ==
	 * stringToEncrypt -- Do nothing, the keyword is the key. if keyword >
	 * stringToEncrypt -- Cut off the keyword at length stringToEncrypt.
	 * 
	 * @param stringToEncrypt the String that is to be encrypted. Required to know
	 * the length of the generated key.
	 * 
	 * @return the key used for encrypting the input String.
	 */
	private String generateKey(String stringToEncrypt) {
		StringBuilder key = new StringBuilder();
		int lengthOfKey = stringToEncrypt.length();
		int lengthOfKeyword = keyword.length();
		for (int i = 0; i < lengthOfKey; i++) {
			char tmp = keyword.charAt(i % lengthOfKeyword);
			key.append(tmp);
		}
		return key.toString();
	}
}
