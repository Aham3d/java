public class builtin 
{   
    public static void main(String[] args) 
    {
        
        String s = "TapAcademy";  
        System.out.println(s.length());// to check the length of 
        System.out.println(s.toUpperCase());// to change case
        System.out.println(s.toLowerCase());//to change case
        System.out.println(s.charAt(6));// character at index 6 - a
        System.out.println(s.indexOf('d'));// to get the index of the character
        System.out.println(s.indexOf('a'));// this gets the first letter of the same type
        System.out.println(s.lastIndexOf('a'));// this gets the last letter of the same type
        System.out.println(s.contains("Acad"));// to check if this contains in the string 
        System.out.println(s.contains("Acaad"));
        System.out.println(s.startsWith("Tap"));// to check if the string starts with this
        System.out.println(s.endsWith("Academy"));// to check if the string ends with this
        System.out.println(s.substring(3)); // to get the sub string
        System.out.println(s.substring(3, 7)); // to get the string from a particular index 
    }
    
    

}
