import java.util.Scanner;

public class Encyclopedia
{


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Plants plant = new Plants("Plantea", "the kingdom of plants");
        Mushrooms mushroom = new Mushrooms("Fungi", "the kingdom of mushrooms");
        Animals animal = new Animals("Animalia", "the kingdom of animals");

        System.out.println("There are different kinds of life on planet earth. \n What type do you wish to learn about?");
        System.out.println("Press 1 for Plants \nPress 2 for Mushrooms \nPress 3 for Animals");
        int answer = sc.nextInt();

        switch (answer) {
            case 1:
                System.out.println(plant + "\n" + plant.plantInformation());
                break;
            case 2:
                System.out.println(mushroom + "\n" + mushroom.MushroomtInformation());
                break;
            case 3:
                System.out.println(animal + "\n" + animal.animalInformation());
                break;
            default:
        }




    }
}
