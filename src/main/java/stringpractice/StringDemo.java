package stringpractice;

import com.sun.security.jgss.GSSUtil;

public class StringDemo {

    public static void main(String[] args) {
       String s="joHnDwayne";
        String s1=new String("shiv");
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(4,8));
        System.out.println(s.substring(4));
        System.out.println(s.concat(s1));
        System.out.println(s.charAt(4));
        System.out.println(s.indexOf('D'));
        System.out.println(s.contains("joHn"));
        System.out.println(s.replace('n','Q'));


        if(s.equals(s1)){
            System.out.println("equal");
        }else{
            System.out.println("Not equal");
        }




    }




}
