class D1_2027 {
    public static void main(String[] args) {
        String str = "+++++";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = '#';
            for(int j = 0; j < charArray.length; j++) {
                System.out.print(charArray[j]);
            }
            System.out.println();
            charArray[i] = '+';
        }
    }
}