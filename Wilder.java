public class Wilder {
  // attributs
  private String firstName;
  private boolean aware;

  public Wilder(String firstName, boolean aware) {
    this.firstName = firstName;
    this.aware = aware;
  }

  public String whoAmI() {
    String answer = "My name is " + this.firstName;
    if (aware == true) {
      answer = answer + " and i'm aware !";
      return answer;
    } else {
      answer = answer + " and i'm not aware !";
      return answer;
    }
  }

  public String getFirstName() {
    return this.firstName;
  }

  public boolean isAware() {
    return this.aware;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setAware(boolean aware) {
    this.aware = aware;
  }
}