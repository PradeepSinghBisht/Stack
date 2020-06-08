package com.company;

import java.util.Scanner;

public class ParenthesisChecker {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scanner.nextInt();
        for (int z = 0; z < t; z++) {
            String str = scanner.next();
            int flag = 1;
            char[] stack = new char[str.length()];
            int top = -1;
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '['){
                    stack[++top] = str.charAt(i);
                }
                if (str.charAt(i) == '}' || str.charAt(i) == ')' || str.charAt(i) == ']') {
                    if (top == -1) {
                        flag = 0;
                    }
                    else {
                        char temp = stack[top--];
                        if (str.charAt(i) == '}' && (temp == '(' || temp == '[')) {
                            flag = 0;
                        }
                        if (str.charAt(i) == ']' && (temp == '{' || temp == '(')) {
                            flag = 0;
                        }
                        if (str.charAt(i) == ')' && (temp == '{' || temp == '[')) {
                            flag = 0;
                        }
                    }
                }
            }
            if (flag == 0 || top >= 0){
                System.out.print("not balanced \n");
            }
            else {
                System.out.print("balanced \n");
            }
        }
    }
}

