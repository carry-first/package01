package demo1;

import java.util.Arrays;

public class ss {
    public static void main(String[] args) {
        int arr01[] = {12, 42, 12, 65};
        Arrays.fill(arr01, 10);
        for (int i = 0; i < arr01.length; i++) {
            System.out.print(arr01[i] + "\t");
        }
    }
}
