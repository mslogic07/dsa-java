class Solution {

private:

		bool valid(char ch){
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')){
				return 1;
			}
			return 0;
		}

		
char tolowercase(char ch){
	
	if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))
		return ch;
	else{
		int temp = ch - 'A' + 'a';
		return temp;
	}

}

bool pallindrom(string st)
{
	int s = 0;
	int e = st.length()-1;
	while(s<e)
	{
		if(st[s] != st[e])
		{
			return 0;
		}
		s++;
		e--;
	}
	return 1;
}


public:
    bool isPalindrome(string s) 
    {
			string temp = "";

			for(int j = 0 ; j < s.length() ; j++)
			{
					if(valid(s[j])){
							temp.push_back(s[j]);
					}
			}
    
			for(int j = 0 ; j < temp.length() ; j++){
				temp[j]=tolowercase(temp[j]);
			}

			return pallindrom(temp);

		}
};