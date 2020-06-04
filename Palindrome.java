import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String exitword = "";   //Переменная для цикла выхода
        Scanner in = new Scanner(System.in);    //Scanner для записи слов из консоли
        do {
            System.out.print("Input word: ");
            String word = in.nextLine();    //Записываем в новую переменную слово из консоли введенное пользователем
                if (isPalindrome(word)) {   //Если метод isPalindrome = true
                    System.out.println(word + " is a palindrome");  
                    System.out.println("New word? yes/exit");
                    exitword = in.nextLine();   //Вводим yes или exit, для зацикливания программы, если нужно ввести новое слово
                } else {    //Если метод = false
                    System.out.println(word + " isn't a palindrome");
                    System.out.println("New word? yes/exit");
                    exitword = in.nextLine();   //Так же вводим для зацикливания
                }
        } while (exitword.equals("yes"));   //Пока пользователь вводи yes, цикл повторяется
        in.close(); //Закрываем Scanner
    }

    public static String reverse(String reverseString) {    //Метод для реверса слова
        String rev = "";    //Создаю пустую переменную rev, чтобы в неё записать изменённое слово

        for (int i = reverseString.length() - 1; i >= 0; i--) { //Выбераю в массиве последнюю букву
            rev = rev + reverseString.charAt(i);    //Записываю последнюю букву в начало
        }

        return rev; //Возвращаю изменённое слово
    }
    public static boolean isPalindrome(String s) {  //Метод для сравнивания перевернутого слова и нормального
        String rev = reverse(s);    //Записываю в новую переменную rev перевёрнутое слово из метода reverse
        if (rev.equals(s)) {    //Если перевёрнутое слово схоже с нормальным
            return true;    //Возращаю true
        } else {
            return false;   //Возвращаю false
        }
    }
} 