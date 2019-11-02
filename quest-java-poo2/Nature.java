import java.util.ArrayList;

public class Nature {

    public static void main(String[] args) {

        // la référence riri reçoit une nouvelle instance de la classe Duck
        Duck donald = new Duck("Donald"); 
        // utilisation d'un setter    
        donald.setAge(84);
        // utilisation de getters      
        System.out.println("1. Duck name is : " + donald.getName());
        System.out.println("2. He is " + String.valueOf(donald.getAge()));
        System.out.println("3. He sings " + donald.sing());

        Eagle thorondor = new Eagle("Thorondor");
        System.out.println("4. Eagle name is : " + thorondor.getName());
        System.out.println("5. He is " + String.valueOf(thorondor.getAge()));
        System.out.println("6. He sings " + thorondor.sing());
        
        // comme riri et thorondor sont des enfants de Bird
        // il est possible de les stocker dans une même ArrayList
        ArrayList<Bird> birds = new ArrayList<>();
        birds.add(donald);
        birds.add(thorondor);
        
        System.out.println("7. Oiseaux de la liste : ");
        // parcours de la liste
        for (Bird bird : birds) {
            System.out.println("- " + bird.getName());
        }
    }
}
