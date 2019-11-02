public class Classroom {

  public static void main(String[] args) {
    Wilder jean = new Wilder("Jean", true);
    System.out.println(jean.whoAmI());
    Wilder poney = new Wilder("Kartoffel", false);
    System.out.println(poney.whoAmI());
  }
}