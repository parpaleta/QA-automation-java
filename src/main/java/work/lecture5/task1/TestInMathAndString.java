package work.lecture5.task1;

public class TestInMathAndString {
    String myString = "My name is Test.";
    String mySecondString = "My name is Test2222.";
    String space = " ";

    public static void main(String[] agrs){
        TestInMathAndString homework = new TestInMathAndString();

        // 1
        homework.replaceSubstring();

        // 2
        homework.equalStrings(homework.myString, homework.mySecondString);

        // 3
        homework.wordCount(homework.myString);

        //4
        homework.concatStrings(homework.myString, homework.space, homework.mySecondString);
    }

    private void replaceSubstring(){
//    1
//    Заместете даден под-string в даден string с друг текст:
//    Пример: “My name is Test” – заместете Test с нещо, което чете от конзолата
        System.out.println("The initial string is:   " + myString);
        String replacedString = myString.replace("Test", "Tsvetelina");
        System.out.println("The string after replacement is:  " + replacedString);
    }

    private void equalStrings(String string01, String string02){
//        2
//        Сравнете 2 стринга дали са еднакви
        Boolean areTheStringsEqual = string01.equals(string02);
        String result = (areTheStringsEqual ? "The strings are equal!" : "The strings are not equal!");

        System.out.println(result);
    }

    private void wordCount(String string01){
//        3
//        Пребройте колко думи има в един стринг
        String[] splitedString = string01.split(" ");
        int result = splitedString.length;
        System.out.println("The number of the words in the string is:    " + result);
    }

    private void concatStrings(String string01, String string02, String string03){
//      4
//      Обединете 2 и повече стринга в един и го изпишете в конзолата
        String newString = string01.concat(string02).concat(string03);
        System.out.println(newString);
    }

}
