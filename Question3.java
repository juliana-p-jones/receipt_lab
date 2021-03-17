package homework;
/*String firstName = "Christopher";
        Use the substring method on firstName
        - To extract and print out "Chris"
        Use a method to compare 2 strings
        Use a StringBuilder to append two strings*/
public class Question3 {
    public static void main(String[] args) {
        String name = "Christopher";
        System.out.println(name.substring(0, 5)); // prints "Chris"
        String newName = name.substring(0, 5);
        System.out.println(name.equals(newName)); // method compares strings
        StringBuilder sb = new StringBuilder(name);
        sb.insert(0, newName);
        System.out.println(sb); // prints stringbuilder "ChrisChristopher

    }
}
