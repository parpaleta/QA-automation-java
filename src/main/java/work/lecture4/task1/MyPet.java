package work.lecture4.task1;

import java.util.Scanner;

public class MyPet {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the kind of the pet: ");
        String kind = input.nextLine();
        System.out.println("Please enter the name of the pet: ");
        String name = input.nextLine();
        System.out.println("Please enter its favourite behavior: ");
        String behav = input.nextLine();

        System.out.println("Your pet is a " + kind + ". It's name is " + name + ". It likes to " + behav + ".");

        printSomeData(kind);
    }

    private static void printSomeData(String kind){
        if(kind.equals("cat")){
            System.out.println("You have a cat");
        } else {
            System.out.println("You have not a cat. Buy one!");
        }
    }
}
