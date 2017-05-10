public boolean isValid(String s) {
    if(s.length() % 2 == 1) {
        return false;
    }

    Stack<Character> stack = new Stack<Character>();
    for(int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if(c == '(') {
            stack.push(')');
        } else if(c == '{') {
            stack.push('}');
        } else if(c == '[') {
            stack.push(']');
        } else if(stack.isEmpty() || stack.pop() != c) {
                return false;
        }
    }
    
    return stack.isEmpty();
}