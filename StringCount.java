import java.util.StringTokenizer;

public class StringCount {

  // String regex = "\\b" + search + "\\b";
  // int count = sentence.replaceAll(regex, "").length() / search.length();

  public static void main(String[] args) {
    //************************ Count 1*********************************************

    String sentence =
      "Mario is my best friend. Mario is clever. Mario works as a programmer.";
    String search = "Mario";
    int count =
      (sentence.length() - sentence.replaceAll(search, "").length()) /
      search.length();
    System.out.println(
      "The word 'Mario' appears " + count + " times in the sentence below "
    );
    System.out.println(sentence);
    //*************************** Count 2******************************************
    // String sentence = "Mario is my best friend. Mario is clever. Mario works as a programmer.";
    // String search = "Mario";

    // int count = 0;
    // int index = sentence.indexOf(search);

    // while (index != -1) {
    //     count++;
    //     index = sentence.indexOf(search, index + search.length());
    // }

    // System.out.println("Number of occurrences of the word '" + search + "' in the sentence: " + count);

    //********************* split by regex ************************************************
    String ipAddress = "192.168.0.1";

    String[] splitips = ipAddress.split("\\.");

    for (String splitip : splitips) {
      System.out.println(splitip);
    }

    //*********************************************************************

    String NewSentence =
      "salama is an English Teacher. salama is currently studying at iti.";
    String NewSearch = "salama";

    StringTokenizer tokenizer = new StringTokenizer(
      "salama is an English Teacher. salama is currently studying at iti.",
      "salama"
    );
    while (tokenizer.hasMoreTokens()) {
      String token = (String) tokenizer.nextElement();
      System.out.println(token);
    }
    /// Working by Replacing the search word ///
    /* 
    StringTokenizer tokenizer = new StringTokenizer(NewSentence);
    while (tokenizer.hasMoreTokens()) {
      String token = tokenizer.nextToken();
      if (token.equalsIgnoreCase(NewSearch)) {
        System.out.println(token.replaceAll(NewSearch, ""));
      } else {
        System.out.println(token);
      }
    }
    */
  }
}
