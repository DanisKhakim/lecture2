import java.util.Scanner;



public class loops {
    public static void main(String[] args) {
     /*1. Четные числа
    Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
    Через пробел либо с новой строки.*/
         for(int i = 1; i < 100; i ++){
            if (i %2 == 0) {
               System.out.println(i);
           }
         }
     /*2. Рисуем прямоугольник
    Ввести с клавиатуры два числа m и n.
    Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
    Пример: m=2, n=4
            8888
            8888*/
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int x = 1; x <= n; x++) {
                System.out.print("8");
            }
            System.out.println();
        }

     /*3. Рисуем треугольник
    Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
    Пример:
            8
            88
            888
            ...*/
        for (int i = 0; i <=10; i++) {
            for(int x = 0; x <= i; x++)
            System.out.print("8");
            System.out.println();
        }

     /*4. Рисуем линии
    Используя цикл for вывести на экран:
            - горизонтальную линию из 10 восьмёрок
            - вертикальную линию из 10 восьмёрок.*/
        for (int i = 0; i <= 10; i++) {
            System.out.print("8");
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println("8");
        }

     /*5. Все любят Мамбу
    Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
    Пример текста:
    Света любит меня.
    Света любит меня.*/
        Scanner name = new Scanner(System.in);
        String l = name.nextLine();
        for (int i = 0; i <= 10; i++) {
            System.out.println(l + " любит меня.");
        }
    }
}
