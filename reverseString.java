class reverseString {
    public static void main(String[] args){
        String s = "Lara Dutta";
        StringBuilder t = new StringBuilder();

         for(int i=s.length() - 1; i >= 0 ; i--){
            char ch = s.charAt(i);
            t.append(ch);
        }
            System.out.println(t);
    }
}
