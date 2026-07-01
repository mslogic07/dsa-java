class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> result = new Stack<>();
		for(int i = 0 ; i < s.length() ; i++) {
			char c = s.charAt(i);
			if(!result.isEmpty() && c == result.peek()) {
				result.pop();
			}else {
				result.push(c);
			}
		}
        StringBuilder sb = new StringBuilder();
        while(!result.empty()) {
        	sb = sb.append(result.pop());
        }
		return sb.reverse().toString();
    }   
}