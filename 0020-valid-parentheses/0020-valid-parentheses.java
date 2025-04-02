class Solution {
    public boolean isValid(String s) {
        
    Stack<Character> stringStack = new Stack<>(); 
    Map<Character, Character> brackets = new HashMap<>();
        
        brackets.put('(', ')');
        brackets.put('{', '}');
        brackets.put('[', ']');

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);

            if (brackets.containsKey(character)) {
                stringStack.push(character);
            } 

            else {
                if (stringStack.isEmpty() || brackets.get(stringStack.pop()) != character) {
                    return false;
                }
            }
        }

        return stringStack.isEmpty();
    }
}
