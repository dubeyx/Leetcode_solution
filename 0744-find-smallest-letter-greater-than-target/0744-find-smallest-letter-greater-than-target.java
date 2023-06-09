class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char f : letters)
        {
            if(target<f) return f;
        }
        return letters[0];
        
    }
}