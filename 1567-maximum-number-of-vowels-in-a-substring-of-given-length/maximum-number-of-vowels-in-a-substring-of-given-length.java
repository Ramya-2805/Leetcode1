class Solution {
    
        private boolean isVowel(char c){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                return true;
            }
            else{
                return false;
            }
        }
        public int maxVowels(String s, int k) {
            int n=s.length();
            int vowel=0;
            for(int i=0;i<k;i++){
                if(isVowel(s.charAt(i))){
                    vowel++;
                }

            }
            int maxVowel=vowel;
            for(int i=k;i<n;i++){
                if(isVowel(s.charAt(i)))
                vowel++;
                if(isVowel(s.charAt(i-k)))
                vowel--;
                if(vowel>maxVowel){
                    maxVowel=vowel;
                }
            }
            return maxVowel;
    }
}