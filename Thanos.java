import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        Hero blackWidow = new Hero ("Black Widow", 34);
        heroes.add(blackWidow);

        Hero cptAmerica = new Hero ("Captain America", 100);
        heroes.add(cptAmerica);

        Hero vision = new Hero("Vision", 3);
        heroes.add(vision);
        
        Hero ironMan = new Hero ("Iron Man", 48);
        heroes.add(ironMan);

        Hero scarletWitch = new Hero ("Scarlet Witch", 29);
        heroes.add(scarletWitch);

        Hero thor = new Hero("Thor", 1500);
        heroes.add(thor);

        Hero spiderMan = new Hero("Spider Man", 18);
        heroes.add(spiderMan);

        Hero hulk = new Hero("Hulk", 49);
        heroes.add(hulk);

        Hero docStrange = new Hero("Dotor Strange", 42);
        heroes.add(docStrange);


        // TODO 3 : It's Thor birthday, now he's 1501
        thor.setAge(1501);
        heroes.set(5, thor); 
         //System.out.println("\n" + thor.getName() + "\n");

        //Shuffle the heroes list
        Collections.shuffle(heroes); // This method works by randomly permuting the list elements

        //Keep only the half of the list
        List<Hero> survivors = heroes.subList(0, heroes.size() / 2); 

        //Loop throught the list and display the name of the remaining heroes
        for (int i = 0; i < survivors.size(); i++) {
            Hero  survivor = survivors.get(i);
            System.out.println(survivor.getName());
        }
    }
}