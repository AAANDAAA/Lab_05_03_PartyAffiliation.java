// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Enter party affiliation (D)emocrat, (R)epublican, or (I)ndependent)");
        String partyAffiliation = "F"; // Placeholder answer
        if (partyAffiliation == "D")//Condition
            System.out.println("You get a Democratic Donkey.");
        else if (partyAffiliation == "R") // else if condition because there are mor than 2 choices.
            System.out.println("You get a Republican Elephant.");
        else if (partyAffiliation == "I")
            System.out.println("Congratulation You get a independent Man.");
        else
            System.out.println("You are not a any of them ");
    }
}