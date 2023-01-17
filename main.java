	public static String lowercaseWords(String args) {
		String result = "";
		
		for (int i = 0; i < args.length(); i++) {
			if (Character.isLowerCase(args.charAt(i))) {
				result = result + args.charAt(i);
				//result = result.concat(String.valueOf(args.charAt(i)));

			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		System.out.println(lowercaseWords("Hello world!"));
	}

}
