//Bethlehem Teshome
//String Buffer and String Builder
//CSC 200
//09/22/2017

public class StringbufferandStringbuilder {
    public static void main(String[]args) {

        String x = "Hello";
        x += "Beth"; //Hello Beth

        StringBuilder b =new StringBuilder("Adios you all");
        b=b.replace(2,4,"nan");
        System.out.println(b.replace(2,4,"nan"));

        StringBuffer a = new StringBuffer("Hello");
        System.out.println(a.hashCode());

        a.append("Hanna");
        System.out.println(a.hashCode());
        System.out.println(a);

        a.insert(3,"Hewi");
        System.out.println(a);
        System.out.println(a.capacity());
        System.out.println(a.length());

        a.append("Good Evening");
        System.out.println(a.capacity());

    }
}
