class palindrome {
    public static void main(String[] args) {

        String s = "LOL";
        int t = s.length();
        boolean p = true;
        for (int i = 0; i < s.length() / 2; i++) {

            if (s.charAt(i) != s.charAt(t - 1)) {
                p = false;
                break;
            }
            t--;
        }
        if (p) {
            System.out.println("This is a Palindrome");
        } else {
            System.out.println("This is not a Palindrome");
        }
    }
}
