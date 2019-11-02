class Decipherer {
  // Méthode pour déchiffrer le message
  public static String decryptage(String message) {
    String decode = "";
    int length = message.length() / 2;
    String subMsg = message.substring(5, (length) + 5);
    StringBuffer replaceChain = (new StringBuffer(subMsg.replace("@#?", " "))).reverse();
    decode = replaceChain + " ";

    return decode;
  }

  public static void main(String[] args) {

    // Appel Des Messages a décripter sou différentes formes
    String[] message = new String[] { "0@sn9sirppa@#?ia'jgtvryko1", "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj",
        "aopi?sedohtém@#?sedhtmg+p9l!" };

    // Chaque message de la liste est décrypter
    for (int numMess = 0; numMess < message.length; numMess++) {
      System.out.println("message n°" + (numMess + 1) + ": " + decryptage(message[numMess]));
    }
  }

}