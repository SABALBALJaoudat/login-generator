package geco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class PasswordGeneration {
    public static String getRandomStr()
    {
        //choisissez un caractére au hasard à partir de cette chaîne
        int n = 8;
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvxyz";

        StringBuilder s = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index = (int)(str.length() * Math.random());
            s.append(str.charAt(index));
        }
        return s.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(getRandomStr());
    }
}
