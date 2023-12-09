import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What is your pet's name? ");
        String name = scanner.nextLine();

        VirtualPet pet1 = new VirtualPet(name);

        System.out.println("That is really cool having a pet is a lot of responsibility, but honestly if you just spend time with them and care for them it is easy. Here is how " + name + " is doing right now:");
        pet1.petCheck();

        int userChoice;
    do{
        System.out.println("What would you like to do today?");
        System.out.println("Enter 1 to check on your pet");
        System.out.println("Enter 2 to give " + name + " some food and water");
        System.out.println("Enter 3 to play fetch");
        System.out.println("Enter 4 to go for a walk");
        System.out.println("Enter 5 to snuggle");
        System.out.println("Enter 6 to exit the game");

        userChoice = scanner.nextInt();
        

        switch (userChoice) {
            case 1:
                pet1.petCheck();
                break;
            case 2:
                pet1.giveFoodAndWater();;
                break;
            case 3:
                pet1.playFetch();
                break;
            case 4:
                pet1.goForWalk();
                break;
            case 5:
                pet1.snuggle();
                break;
            case 6:
                System.out.println("Thanks for playing, you and " + name + " have a great day!");
                break;
            default:
                System.out.println("Invalid choice. Please enter 1-6!");
                break;


    }   if (pet1.getHungerLevel() > 100) {
            System.out.println("RIP");
            System.exit(0);
    }
    
    } while (userChoice != 6);
        scanner.close();
}
}
