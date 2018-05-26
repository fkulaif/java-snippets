package br.com.cvid;

public class ExampleStrings {
    /**
     * JVM first checks the content of the string literal which is going to be created. If an object exists in the pool
     * with the same content, then it RETURNS THE REFERENCE of that object. * It does not create new object. If the content
     * is different from the existing objects only then a new object is going to be created.
     */
    public static void main(String[] args) {
        /*string objects which adre literals are stored in the Heap memory,
        particularly in the String Constant Pool where an object allocation depends upon it’s content.
        There will be no two objects in the pool having the same content.
        */
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);//Output : true;

        //Creating string objects using new operator stored in the heap memory. A new object is created
        // whether the content is same or not.
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s3 == s4);    //Output : false
    }
}// special thanks to http://javaconceptoftheday.com/how-the-strings-are-stored-in-the-memory/