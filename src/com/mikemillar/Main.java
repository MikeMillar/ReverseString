package com.mikemillar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String test = "monster";
        String reverse = reverse(test);
        System.out.println(reverse);
    }
    
    private static String reverse(String s) {
        char tempString[] = s.toCharArray();
        String reverse;
        if (!s.isEmpty()) {
            int end = tempString.length - 1;
            for (int i = 0; i < end; i++) {
                char temp = tempString[i];
                tempString[i] = tempString[end];
                tempString[end] = temp;
                end--;
            }
            reverse = new String(tempString);
            return reverse;
        }
        return null;
    }
}
