package Strings;

public class StringDemo {
    public static void main(String args[]) {
        //string initialisation
        String st = new String("abcdef");
        //StringBuffer st = new StringBuffer("abcdef");
        //StringBuilder st = new StringBuilder("abcdef");


        //print string
        System.out.println(st);
        //get character
        char ch = st.charAt(1);
        System.out.println("get character : " + ch);
        //get length

        //NOTE: below functions do not update the string, they return the value

        System.out.println("length is :" + st.length());
        //formatted string
        System.out.println(String.format("sample string : %s", st));
        //sub string
        System.out.println(st.substring(1, 6));
        //contains sequence
        System.out.println(st.contains("bc"));
        //compare
        System.out.println(st.compareTo("abcdef"));
        //join strings
        System.out.println(String.join(" ", "this", "is", "join"));
        String samp = "p" + 'q' + "rst";
        System.out.println(samp);
        //equals
        System.out.println(st.equals("abcdef"));
        // check empty
        System.out.println(st.isEmpty());
        //concatination
        System.out.println(st.concat("ghi"));
        //replace all occurence
        System.out.println(st.replace("ab", "cd"));
        //case insensitive equal
        System.out.println(st.equalsIgnoreCase("ABCDEF"));
        //split string
        String testSplit[] = st.split("d");
        for (String s : testSplit) {
            System.out.print(s + " ");
        }
        System.out.println();
        //index of char or string
        System.out.println(st.indexOf("de"));
        //to lower case
        String high = "ASDFGH";
        System.out.println(high.toLowerCase());
        //to upper case
        System.out.println(st.toUpperCase());
        //remove spaces at end
        String spaces = "  string   ";
        System.out.println(spaces.trim());
        //convert values to String
        System.out.println(String.valueOf(123.45));
        //string to int
        System.out.println(Integer.parseInt("4568"));
        //to array
        char[] chr = st.toCharArray();
        System.out.println(chr);
    }
}
