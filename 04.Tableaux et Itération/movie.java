class Movie {

  // Déclaration de mes tableaux
  public static void main(String[] args) {
    String[] title = new String[] { "Indiana Jones et les Aventuriers de l'arche perdue",
        "Indiana Jones et le temple maudit", "Indiana Jones et la dernière croisade" };
    String[][] actors;
    actors = new String[][] { { "Harrison Ford", "Denholm Elliott", "John Rhys-Davies" },
        { "Harrison Ford", "Kate Capshaw", "Jonathan Ke Quan" },
        { "Harrison Ford", "River Phoenix", "Denholm Elliott" } };
    // Impression de la phrase ...
    for (int numMovie = 0; numMovie <= 2; numMovie++) {
      System.out.print("Dans le film " + title[numMovie] + ", les principaux acteurs sont : ");
      for (int act = 0; act <= actors[numMovie - 1].length; act++) {
        System.out.print(actors[numMovie][act]);
        if (act <= actors[numMovie - 2].length) {
          System.out.print(", ");
        }
      }
      System.out.println(".");
    }

  }
}