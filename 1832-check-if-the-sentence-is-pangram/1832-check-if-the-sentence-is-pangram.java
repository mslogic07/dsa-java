class Solution {
    public boolean checkIfPangram(String sentence) {
        int arr[] = new int[26];
        char[] ch = sentence.toCharArray();
        for(int i = 0; i < sentence.length(); i++){
            int x = ch[i] - 97;
            arr[x]++;
        }
        for(int i = 0; i < 26; i++){
            if(arr[i] == 0){
                return false;
            }
        }
        return true;
    }
}