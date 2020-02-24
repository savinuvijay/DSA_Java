package com.dsajava;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {

    private final List<Character> openingBrackets = Arrays.asList('(','[','<','{');
    private final List<Character> closingBrackets = Arrays.asList(')',']','>','}');

    public boolean isBalanced(String input){
        if(input != null) {
            Stack<Character> stack = new Stack<>();
            for (char ch : input.toCharArray()) {
                if(isOpeningBracket(ch)) {
                    stack.push(ch);
                }
                if(isClosingBracket(ch)) {
                    if(stack.empty()) return false;

                    char top = stack.pop();
                    if(!bracketsMatch(top, ch)){
                        return false;
                    }
                }
            }
            return stack.empty();
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    private boolean isOpeningBracket(char ch){
        return openingBrackets.contains(ch);
    }

    private boolean isClosingBracket(char ch){
        return closingBrackets.contains(ch);
    }

    private boolean bracketsMatch(char left, char right){
        return openingBrackets.indexOf(left) == closingBrackets.indexOf(right);
    }
}
