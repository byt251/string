//Bethlehem Teshome
//CSC 200
//String
//09/22/2017

public class displayoutput {
    public static void main(String args[]){
        String name= "College Education";
        System.out.println(name.charAt(3));

        String string=name.concat(" is fun");
        System.out.println(string);

        boolean b= name.equals("College Education");
        System.out.println(b);

        boolean c= name.equalsIgnoreCase("college education");
        System.out.println(c);

        int i=name.indexOf("Education");
        System.out.println(i);

        int l = name.lastIndexOf("n");
        System.out.println(l);

        String lowercaseString = name.toLowerCase();
        System.out.println(lowercaseString);

        String uppercaseString = name.toUpperCase();
        System.out.println(uppercaseString);

        String replaceString=name.replace('c','z');
        System.out.println(replaceString);

        String subString=name.substring(3);
        System.out.println(subString);

        String subString2=name.substring(8, 16);
        System.out.print(subString2);

        String trimString="College Education";
        String trimString2= name.trim();
        System.out.println(trimString2);

        String x = "Hello";
        x += "Beth"; //Hello Beth



    }
}
