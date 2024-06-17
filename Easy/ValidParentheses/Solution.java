package Easy.ValidParentheses;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();

        String closing = "({[";

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            if (closing.contains("" + letter)) {
                brackets.push(letter);
            } else {
                if (!brackets.isEmpty()) {
                    char value = brackets.pop();
                    if (bracketCheck(letter, value)) return false;
                } else {
                    return false;
                }
            }

            
        }

        return brackets.isEmpty();
    }

    public boolean bracketCheck(char l, char value) {
        return (
            (l == ')' && value != '(') || 
            (l == '}' && value != '{') || 
            (l == ']' && value != '[')
        ) ;
    }
}