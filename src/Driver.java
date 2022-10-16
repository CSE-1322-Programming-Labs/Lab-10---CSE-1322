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

    //Recursive method to see if 2 strings are the reverse of each other.
    public static boolean isReverse(String s1,String s2){
        //Guard Clause
        if(s1.length()!=s2.length()){
            return false;
        }
        //Base case
        //If it made it to this point, it is equal since nothing equals nothing.
        if(s1.isEmpty()){
            return true;
        //If the first character and the last character of the first and second strings don't match, instantly we know it's false.
        } else if(s1.charAt(0)!=s2.charAt(s2.length()-1)){
            return false;
        //Otherwise, we do not know if the String is reversed, so we must keep going until we have a decisive answer.
        } else{
            return isReverse(s1.substring(1),s2.substring(0,s2.length()-1));
        }
    }

    //Alternative way of doing it more efficiently
    
    //Overloaded method to call reverse.
    public static boolean reverse(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }else{
            return reverse(s1,s2,0);
        }
    }
    
    //recursive method that uses a double pointer to see if 2 strings are equal.
    public static boolean reverse(String s1,String s2,int count){
        //Base case
        //If it made it to this point, then we know we are done since we have made the pointer go all the way through the word.
        if(count==s1.length()){
            return true;
            //If the first character and the last character of the first and second strings don't match, instantly we know it's false.
        } else if(s1.charAt(count)!=s2.charAt(s2.length()-count-1)){
            return false;
            //Otherwise, we do not know if the String is reversed, so we must keep going until we have a decisive answer.
        } else{
            return reverse(s1,s2,count+1);
        }
    }

}
