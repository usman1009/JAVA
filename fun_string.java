public class fun_string{
    public static void main(String args[]){
        String str1="Rock";
        String str2="Star";

        String str3=str1.concat(str2);
        System.out.println("String concantenation:"+str3);
        String str4=str1+str2;
        System.out.println("String concantenation:"+str4);

        System.out.println("Length of string:"+str1.length());

        System.out.println("Character at position 2:"+str1.charAt(3));

        System.out.println("Compare to Rock:"+str1.compareTo("Rom"));


        System.out.println("Compare to Rock - Case ignored:"+str1.compareToIgnoreCase("rock"));

        System.out.println("end with character k:"+str1.endsWith("k"));

        System.out.println("convert to uppercase:"+str1.toUpperCase());

        System.out.println("convert to lowercase:"+str1.toLowerCase());
        System.out.println("equals to Rock:"+str1.equals("rock"));

        System.out.println("equal to ignore case Rock:"+str1.equalsIgnoreCase("rock"));

    }
}