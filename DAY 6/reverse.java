import java.util.*;

class reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Method 1: Using String concatenation
        String s = sc.nextLine();
        String str = "";
        for(int i = s.length() - 1; i >= 0; i--)
        {
            str += s.charAt(i);
        }
        System.out.println(str);

        // Method 2: Using StringBuilder
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse().toString());

        // Method 3: Using char array (two pointers)
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;
        while(l < r)
        {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        System.out.println(String.valueOf(arr));
    }
}