import java.util.*;
public class Main {

    public static void main(String[] args)
    {
	// write your code here
        String str = "  abcABC     ";
        System.out.println(str.indexOf('A'));
        System.out.println(str.lastIndexOf("A"));
        System.out.println(str.charAt(2));
        System.out.println(str.substring(0,4));
        System.out.println(str.substring(5));
        System.out.println(str.replace("ABC","DDD"));
        System.out.println(str.trim());
        System.out.println(str.concat("DDD"));
        str=str.trim();
        System.out.println(str.concat("DDD"));
        System.out.println(str.contains("cA"));
        String[] strArray = str.split("c");
        System.out.println(strArray[0]);
        System.out.println(strArray[1]);

    }
}
