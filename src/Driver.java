import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println(repeatNTimes("I must study recursion until it makes sense\n",100));

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first string.");
        String string1 = sc.nextLine();
        System.out.println("Please enter the second string.");
        String string2 = sc.nextLine();

        if(isReverse(string1,string2)) System.out.println(string1+" is the reverse of "+string2);
        else System.out.println(string1+" is not the reverse of "+string2);
    }
    public static String repeatNTimes(String s,int count){
        if(count <= 0) return "";
        return s+=repeatNTimes(s,count-1);
    }

    private static String stringReverser (String s2){
        if(s2.isEmpty()) return s2;
        //remove the first letter, and then recurse the method. Once the string is empty, add all the first letters back.
        return stringReverser(s2.substring(1))+s2.charAt(0);
    }
    //Overloaded method to call the helper method
    public static boolean isReverse(String s1,String s2){
        if(s1.length() != s2.length()) return false;
        return s1.equals((stringReverser(s2)));
    }

}
