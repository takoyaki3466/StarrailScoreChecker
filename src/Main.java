import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your UID : "); //825133654
        String UID = scanner.next();
        JsonManagement management = new JsonManagement(Language.jp, UID);

        management.GetAllCharacters();

        System.out.print("What character do you choose? : ");
        int CharacterNumber = scanner.nextInt();


        management.CharacterRelics(CharacterNumber);
    }
}