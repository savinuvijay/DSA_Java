package com.dsajava;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input){
        if(input != null) {
            Stack<Character> stack = new Stack<>();
            for (char ch : input.toCharArray()) {
                stack.push(ch);
            }
            StringBuffer reversed = new StringBuffer();
            while (!stack.empty()) {
                reversed.append(stack.pop());
            }
            return reversed.toString();
        }
        else {
            throw new IllegalArgumentException();
        }
    }
}
