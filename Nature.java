public class Nature {

    public static void main(String[] args) {

        Penguin pingou = new Penguin("Pingou");
        pingou.dive();
        pingou.swimDown(3);
        pingou.swimUp(1);
        pingou.swimDown(4);
        pingou.swimUp(5);
        pingou.swimUp(1);
        pingou.getOut();

        Eagle eyeCherry = new Eagle("Eye Cherry");
        // TODO : décommente le code suivant afin de le tester

        System.out.print("\n I'm an Eagle  --> ");
        System.out.println(eyeCherry.sing() + "\n");

        eyeCherry.takeOff();
        eyeCherry.ascend(120);
        eyeCherry.ascend(30);
        eyeCherry.getAltitude();
        eyeCherry.glide();
        eyeCherry.descend(140);
        eyeCherry.land();
        eyeCherry.descend(9);
        eyeCherry.land();

    }
}
