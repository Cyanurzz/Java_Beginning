class Hangar {

  public static void main(String[] args) {
    Car tesla = new Car("Tesla Model 3 sans auto Pilot ( Useless Car)");
    tesla.setKilometers(100);
    System.out.println(tesla.doStuff());
    System.out.println("nb Kilomètres au compteur " + tesla.getKilometers() + "  | Il va falloir penser a changer la batterie ... \n\n");
    

    Boat radeau = new Boat("Radeau Construit avec des meuble  Ikea ...");
    radeau.setKilometers(999999);
    System.out.println("nb Kilomètre au compteur : " + radeau.getKilometers() + " | Sous L'océans ... 𝄞");
    System.out.println(radeau.doStuff());
  }
}