public class Primes {
    public static void main(String[] args) {
        int out = 100;
        for (int i = 2; i < out; i++) {     //Для чисел от 2 до 100
            if (isPrime(i))     //Если число простое, то выводим его
                System.out.println(i);
        }
    }

    public static boolean isPrime(int i) {  //Метод для проверки чисел на простоту
        if (i<=1)   //Если число меньше или равно 1, то число не простое, выводим false
            return false;
        else if (i <= 3)    //Если число меньше или равно 3, то число простое
            return true;
        else if (i % 2 == 0 || i % 3 == 0)  //Если остаток от деления на 2 или 3 равно 0, то число не простое
            return false;
        int n = 5;
        //Использую поиск по методу 6k+i
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }
}