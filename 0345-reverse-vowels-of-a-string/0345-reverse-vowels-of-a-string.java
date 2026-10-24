class Solution {
    public String reverseVowels(String s) {
        char[] c  = s.toCharArray();
        int i = 0;
        int j = c.length-1;
        String vowels = "aeiouAEIOU";
        while(i<j){
            while(i<j && vowels.indexOf(s.charAt(i)) == -1){
                i++;
            }
            while(i<j && vowels.indexOf(s.charAt(j)) == -1){
                j--;
            }
            if(i<j){
                char temp = c[i];
                c[i++] = c[j];
                c[j--] = temp; 
            }
        }
        return new String(c);
    }
}