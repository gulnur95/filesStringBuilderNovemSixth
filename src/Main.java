import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



//                    task 1    LMS
        String reverseWord = "Zakaz";
        System.out.println(getReverse(reverseWord));


//                  task 2      LMS
//        String[] appendWords = {"Tom", "and", "Jerry"};
//        System.out.println(joinWords(appendWords));


//                   task 3     LMS
//        System.out.println(countVowels("Malaysia"));


//                   task 4     LMS
 //       System.out.println("Palindrome is " + isPalindrome("Zakaz"));


//                          task 5  LMS
//        System.out.println(capitalizeWords("The best is only progress"));


//                          task 6   LMS
//           System.out.println(countWords("How many words in this sentence"));


//                           task 7   LMS
//        7. StringBuilder аркылуу ар бир тамганын өзүнүн ASCII коду менен алмаштырган метод туз.
//        System.out.println("Replace With ASCII: " + replaceWithASCII("Java"));


//                        task 8   LMS
//        System.out.println("Remove Spaces: " + removeSpaces("This is example"));



    }



 //             task 1    LMS
     public static String getReverse(String word){
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();
        return stringBuilder.toString();
     }



//             task 2     LMS
//    public static String joinWords(String[] words) {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (String word : words) {
//            stringBuilder.append(word).append(" ");
//        }
//        return stringBuilder.toString();
//    }
//



//                   task 3     LMS
//    private static char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
//    public static int countVowels(String input) {
//        int count = 0;
//        input = input.toLowerCase();
//
//        for (int i = 0; i < input.length(); i++) {
//            char letter = input.charAt(i);
//            for (char vowel : vowels) {
//                if (vowel == letter) {
//                    count++;
//                    break;
//                }
//            }
//        }
//        return count;
//    }




//                       task 4     LMS
//    public static boolean isPalindrome(String word){
//        StringBuilder stringBuilder = new StringBuilder(word);
//        return stringBuilder.toString().equalsIgnoreCase(stringBuilder.reverse().toString());
//    }




//                       task  5   LMS
//    public static String capitalizeWords(String sentence){
//        String[] words = sentence.split(" ");
//        StringBuilder stringBuilder = new StringBuilder();
//
//        for(String word : words){
//            stringBuilder.append(Character.toUpperCase(word.charAt(0))).
//                    append(word.substring(1).toLowerCase()).append(" ");
//        }
//        return stringBuilder.toString();
//    }
//



//                 task  6   LMS
//    public static int countWords(String sentence){
//        StringBuilder builder = new StringBuilder(sentence);
//
//        int wordCount = 1;
//        for (int i = 0; i < builder.length(); i++) {
//           if(Character.isWhitespace(builder.charAt(i))){
//               wordCount++;
//           }
//        } return wordCount;
//    }



//                     task  7   LMS
//    public static String replaceWithASCII(String input) {
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < input.length(); i++) {
//            builder.append((int) input.charAt(i)).append(" ");
//        }
//        return builder.toString().trim();
//    }



//                       task     8 LMS
//    public static String removeSpaces(String sentence) {
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < sentence.length(); i++) {
//            if (sentence.charAt(i) != ' ') {
//                builder.append(sentence.charAt(i));
//            }
//        }
//        return builder.toString();
//    }

















    //StringBuilder stringBuilder = new StringBuilder("Thomas Watson");
    //System.out.println(stringBuilder);
    //System.out.println(stringBuilder.charAt(2));
    //stringBuilder.setCharAt(2,'s');
    //System.out.println(stringBuilder);
    //stringBuilder.append(16);
    // System.out.println(stringBuilder);
    //stringBuilder.append(" is best");
    //System.out.println(stringBuilder);
    //System.out.println(stringBuilder.insert(4, " is the best"));
    //System.out.println(stringBuilder.reverse());
    //System.out.println(stringBuilder.delete(2,4));
    //System.out.println(stringBuilder.deleteCharAt(1));
    //System.out.println(stringBuilder.replace(6, 13, " Shelby "));
    //System.out.println(stringBuilder.replace(6, 13, " is my friend."));


//               task 1     Files
//        Song song = new Song();
//        song.setAuthor("Author:  Mirbek Atabekov\n");
//        song.setTitle("Title:  Kechki Bishkek\n");
//        song.setText("Text:  Жан дүйнөм чалкыган - жаным!\n" +
//                "Жалындаган, жараланган жүрөгүмдү\n" +
//                "Сен аны билбейсиң\n" +
//                "Сен аны сезбейсиң\n" +
//                "Сен мендей сүйбөйсүң - жаным!\n" +
//                "Суктанып караганың\n" +
//                "Көңүлдү баалап аяганың\n" +
//                "Оорубас дүйнөм жараладың\n" +
//                "А балким, жолугуп мен\n" +
//                "Айткым келет сага баарын ");
//        try(FileWriter fileWriter = new FileWriter("song.txt")){
//            fileWriter.write(song.getAuthor());
//            fileWriter.write(song.getTitle());
//            fileWriter.write(song.getText());
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//
//        try(FileReader read = new FileReader("song.txt")) {
//            Scanner scanner = new Scanner(read);
//             while (scanner.hasNextLine())
//            System.out.println(scanner.nextLine());
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//


//                variant 1    close  method
//          try {
//              FileWriter fileWriter = new FileWriter("test.txt");
//              fileWriter.write("Кээ бир маалыматтарды файлдарга сактаса болот. " +
//                      "Мисалга: жонокой эле жазууларды.\n" +
//                      "Файлды тузуу учун FileWriter классын колдонобуз.\n" +
//                      "Файлга жазуу учун write(); методун колдонобуз.\n" +
//                      "FileWriterди колдонгондон кийин созсуз close(); методун чакырыш керек.");
//              fileWriter.close();
//
//          } catch (Exception e) {
//              System.out.println(e.getMessage());
//          }


//          try {
//              FileReader fileReader = new FileReader("test.txt");
//              Scanner scanner = new Scanner(fileReader);
//              while (scanner.hasNext()) {
//                  System.out.println(scanner.nextLine());
//              }
//              fileReader.close();
//          }catch (Exception e){
//              System.out.println(e.getMessage());
//          }


    //variant 2        Try with  resourses
//        try (FileWriter fileWriter = new FileWriter("test.txt4")) {
//            fileWriter.write("Кээ бир маалыматтарды файлдарга сактаса болот. " +
//                    "Мисалга: жонокой эле жазууларды.\n" +
//                    "Файлды тузуу учун FileWriter классын колдонобуз.\n" +
//                    "Файлга жазуу учун write(); методун колдонобуз.\n" +
//                    "FileWriterди колдонгондон кийин созсуз close(); методун чакырыш керек.");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//
//
//
//        try (FileReader fileReader = new FileReader("test.txt")){
//              Scanner scanner = new Scanner(fileReader);
//              while (scanner.hasNext()) {
//                  System.out.println(scanner.nextLine());
//              }
//          }catch (Exception e){
//              System.out.println(e.getMessage());
//          }
//


}


