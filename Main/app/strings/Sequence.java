package strings;

/*
* Strings: store a sequence of characters (text)
* non-primitive data type, because it refers to an objec
* A String in Java is actually an object, which contain methods that can
* perform certain operations on strings.
* toUpperCase(), toLowerCase() and indexOf()
* The indexOf() method returns the index (the position) of the first occurrence
* of a specified text in a string (including whitespace):
* public String toUpperCase()
* public String toLowerCase()
*/
public class Sequence {
    public static void myStringSequence() {
        String greeting = "Hello World!";
        String txte = "Please locate where 'locate' occurs!";
        System.out.println(greeting);
        System.out.println(greeting.toUpperCase()); // Outputs "HELLO WORLD"
        System.out.println(greeting.toLowerCase()); // Outputs "hello world"
        System.out.println("The position: " + txte.indexOf("locate")); // Outputs 7

        // Return the first character (0) of a string: ´H´ char
        // public char charAt(int index)
        String myStr = "Hello";
        char results = myStr.charAt(0);
        System.out.println("Results: " + results);

        // Return the Unicode of the first character in a string (the Unicode
        // value of "H" is 72): 'int'
        // public int codePointAt(int index)
        int resultInt = myStr.codePointAt(0);
        System.out.println("ResultInt: " + resultInt);

        // Return the Unicode of the first character in a string (the Unicode value of
        // "H" is 72):
        // public int codePointBefore(int index)

        int resultInt2 = myStr.codePointBefore(1);
        System.out.println("ResultInt2: " + resultInt2);

        // Return the number of Unicode values found in a string: 'Int'
        // public int codePointCount(int startIndex, int endIndex)
        int resultInt3 = myStr.codePointCount(0, 5);
        System.out.println("ResultInt3: " + resultInt3);

        // Returns 0 because they are equal
        // public int compareTo(String string2)
        // public int compareTo(Object object)
        String myStr2 = "Hello";
        System.out.println("myStr2: " + myStr.compareTo(myStr2));

        // Compare two strings, ignoring lower case and upper case differences:
        // public int compareToIgnoreCase(String string2)
        String myStr3 = "HELLO";
        String myStr4 = "hello";
        System.out.println("myStr3: " + myStr3.compareToIgnoreCase(myStr4));
        System.out.println("------------------------------");

        // Concatenate two strings:
        // public String concat(String string2)
        String first = "John ";
        String last = "Doe";
        System.out.println("Fullname: " + first.concat(last));

        // Print string
        String name = "Amerson";
        System.out.println("Hello " + name);

        // String Concatenation
        String firstName = "John ";
        String lastName = "Smith";
        String fullName = firstName + lastName;
        System.out.println("Fullname: " + fullName);
        System.out.println("------------------------------");

        // Find out if a string contains a sequence of characters
        // public boolean contains(CharSequence chars)

        String myStr5 = "Hello";
        System.out.println(myStr5.contains("Hello"));
        System.out.println(myStr5.contains("e"));
        System.out.println(myStr5.contains("Hi"));
        System.out.println("------------------------------");

        // Find out if a string contains a sequence of characters
        // public boolean contentEquals(StringBuffer chars)
        // public boolean contentEquals(CharSequence chars)
        System.out.println(myStr5.contentEquals("Hello"));
        System.out.println(myStr5.contentEquals("e"));
        System.out.println(myStr5.contentEquals("Hi"));
        System.out.println("------------------------------");

        // Return a String that represents certain characters of a char array:
        // public static String copyValueOf(char[] data, int offset, int count)
        char[] myStrs1 = { 'H', 'e', 'l', 'l', 'o' };
        String myStrs2 = String.copyValueOf(myStrs1, 0, 5);
        System.out.println("Returned String: " + myStrs2);
        System.out.println("------------------------------");

        // Compare strings to find out if they are equal:
        // public boolean equals(Object anotherObject)
        String myStri = "Hello";
        String myStrii = "Hello";
        String myStriii = "Another String";
        System.out.println(myStri.equals(myStrii)); // Returns true because they are equal
        System.out.println(myStri.equals(myStriii)); // Returns false
        System.out.println("------------------------------");

        // Compare strings to find out if they are equal, ignoring case differences:
        // public boolean equalsIgnoreCase(String anotherString)
        String myStr_1 = "Hello";
        String myStr_2 = "HELLO";
        String myStr_3 = "Another String";
        System.out.println(myStr_1.equalsIgnoreCase(myStr_2));
        System.out.println(myStr_1.equalsIgnoreCase(myStr_3));
        System.out.println("------------------------------");

        // Return the hash code of a string:
        // public int hashCode()
        // s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
        // where s[i] is the ith character of the string,
        // n is the length of the string, and ^ indicates exponentiation.

        System.out.println(myStr_1.hashCode());
        System.out.println("------------------------------");

        /*
         * There are 4 indexOf() methods:
         * Search a string for the first occurrence of "planet":
         * public int indexOf(String str)
         * public int indexOf(String str, int fromIndex)
         * public int indexOf(int char)
         * public int indexOf(int char, int fromIndex)
         */
        String myStrse = "Hello planet earth, you are a great planet.";
        System.out.println("myStrse-plane: " + myStrse.indexOf("plane"));
        // Find the first occurrence of the letter "e" in a string, starting the search
        // at position 5
        System.out.println("myStrse-e: " + myStrse.indexOf("e", 5));

        /*
         * public int lastIndexOf(String str)
         * public int lastIndexOf(String str, int fromIndex)
         * public int lastIndexOf(int char)
         * public int lastIndexOf(int char, int fromIndex)
         */
        // Search a string for the last occurrence of "planet":
        System.out.println("myStrse-plane: " + myStrse.lastIndexOf("planet"));
        System.out.println("myStrse-e: " + myStrse.lastIndexOf("e", 5));
        System.out.println("------------------------------");

        // Find out if a string is empty or not
        // public boolean isEmpty()
        String myStr0 = "Hello";
        String myStr01 = "";
        System.out.println("myStr0: " + myStr0.isEmpty());
        System.out.println("myStr01: " + myStr01.isEmpty());
        System.out.println("------------------------------");

        // Return the number of characters in a string:
        // public int length() The length of an empty string is 0.
        String txten = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Length: " + txten.length());
        System.out.println("------------------------------");

        // Return a new string where all "l" characters are replaced with "p"
        // characters:
        // public String replace(char searchChar, char newChar)
        String mySt = "Hello";
        System.out.println("Replace: " + mySt.replace('l', 'p'));
        System.out.println("------------------------------");

        // Find out if the string starts with the specified characters:
        // public boolean startsWith(String chars)

        System.out.println("StartWith: " + mySt.startsWith("Hel")); // true
        System.out.println("StartWith: " + mySt.startsWith("llo")); // false
        System.out.println("StartWith: " + mySt.startsWith("o")); // false
        System.out.println("------------------------------");

        // Find out if the string ends with the specified characters:
        // public boolean endsWith(String chars)
        System.out.println("EndWith: " + myStr.endsWith("Hel"));
        System.out.println("EndWith: " + myStr.endsWith("llo"));
        System.out.println("EndWith: " + myStr.endsWith("o"));
        System.out.println("------------------------------");

        // Remove whitespace from both sides of a string:
        // public String trim()
        String myS = "       Hello World!       ";
        System.out.println(myS);
        System.out.println(myS.trim());
        System.out.println("------------------------------");

    }

}
