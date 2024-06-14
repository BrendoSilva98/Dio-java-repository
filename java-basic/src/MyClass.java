public class MyClass {

    public static void main(String[] args) {

        String firstName = "Brendo";
        String secondName = "Silva da Costa";

        String fullName = fullName (firstName, secondName);

        System.out.println(fullName);

    }
    public static String fullName (String firstName, String secondName) {
        return "Result of the method " + firstName.concat(" ").concat(secondName);
        
    }
    
}

        /*System.out.print("My first Class");
        String myName = "Brendo";
        int anoFabricacao = 2022;
        boolean isItTrue = true;*/