public class AlphabeticalSearch {
  public static void main(String[] args) {
    boolean;
    //Input String and Verify
    //String word[] = new String[9]
    String[] word = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog."};
    for (int i=0; i<word.length; i++) {
      System.out.println(word[i]); //Debugging Line
    }
    //Compare two words
    System.out.println(word[0] + "\t" + word[1]);
    word[0] = word[0].toLowerCase();
    System.out.println(word[1].compareTo(word[0]));
    //Duplicate words? Use an IF to omit the comparison
    //Functions to use:
        System.out.println(word[0] + " " + word[6]);
        System.out.println(word[0] == word[6]); //correct order, returns false since comparing memory location
        System.out.println(word[6].equals(word[0])); //correct order, returns true since comparing characters
        //While Loop Begins
    while (stop == false) {
      for(int i = 0; i++) {
        wordtoLowerCase[i].length-1
        word[i+1].compareTo(word[i])

      }
      word[i+1].equals(word[i])
      stop == true
    }
  }
}
