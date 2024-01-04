public class ReverseString {
    static String reverseString(String string) {
        if (string == null)  {
        return null;
    }
    StringBuilder sb = new StringBuilder();
    for (int i=string.length()-1; i>=0;i--){
        sb.append(string.charAt(i));
    }
    return sb.toString();
}
public static void main(String[] args) {
    String originalString = "Hello, World!";
    System.out.println("Original String: " + originalString);

    String reversedString = reverseString(originalString);
    System.out.println("Reversed String: " + reversedString);
}
}

