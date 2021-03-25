package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        Stack<Double> st = new Stack<>();
        st.push(80.0);
        String s = in.nextLine();
        s = in.nextLine();
        double glo = .0;
        int top = 0;
        while (!s.equals("")){
            int a = Integer.parseInt(s.substring(0, s.indexOf(" ")));
            int b = Integer.parseInt(s.substring(s.indexOf(" ") + 1));
            if(b == -1) {
                glo += ((a - top) / st.pop());
            }
            else{
                glo += ((a - top) / st.peek());
                st.push((double) b);
            }
            top = a;
            s = in.nextLine();
        }
        glo += (l-top)/st.peek();
        System.out.printf("%.2f", glo);
    }
}
