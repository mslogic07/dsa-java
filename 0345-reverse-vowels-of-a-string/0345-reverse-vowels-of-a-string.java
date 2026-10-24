class Solution {
    public String reverseVowels(String s) {
        char[] ans = new char[s.length()];
        ans = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            char c = s.charAt(i);
            if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || 
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                char d = s.charAt(j);
                if(d == 'A' || d == 'E' || d == 'I' || d == 'O' || d == 'U' || 
                d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u'){
                    char temp = s.charAt(j);
                    ans[j]=c;
                    ans[i]=d;
                    i++;
                    j--;
                }
                else{
                    j--;
                }

            }else{

                i++;
            }
        }
        return new String(ans);
    }
}