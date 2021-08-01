public class ReplaceCharacter {

    public static void main(String[] args) {
        System.out.println(characterReplace("akondschar",'a'));
    }

    public static String characterReplace(String inputWord, Character replace){

        if (inputWord.indexOf(replace)==-1)
            System.out.println("Given character is not found in the word!");

        int occurenceCount = 1;

        for ( int i = 0; i<inputWord.length(); i++){
            inputWord = inputWord.replaceFirst(String.valueOf(replace), String.valueOf(occurenceCount));

            occurenceCount++;
        }
        return inputWord;
    }
}
