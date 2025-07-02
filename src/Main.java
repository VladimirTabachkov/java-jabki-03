public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.printf("Сумма чисел между %d и %d включительно равна %d%n", a, b, sumRange(a, b));
        System.out.printf("Сумма чисел %d и %d равна %d%n", a, b, add(a, b));
        System.out.printf("Сумма строк '%s' и '%s' равна '%s'%n", "Привет.", "Удачи.", add("Привет.", "Удачи."));

        int[] nums = {-100, -39, 1, 2, 3, 4, 5, 500, 6, 7, 8, 9, 10};
        System.out.println("Максимальное значение массива = " + findMax(nums));
        System.out.println("Факториал числа 15 = " + factorial(15));
        System.out.println("Площадь круга c радиусом 5.67 = " + String.format("%.2f", calculateArea(5.67)));
        System.out.println("Площадь прямоугольника со сторонами 3.46 и 5.67 = " + String.format("%.2f", calculateArea(3.46, 5.67)));
        double[] dnums = {1.3, 2.5, 5.3};
        System.out.println("Cреднее арифметическое массива {1.3, 2.5, 5.3} = " + String.format("%.3f", AverageNums(dnums)));
        System.out.println("При катетах = 1.5 и 2.5, гипотенуза = " + String.format("%.3f", Pifogor(1.5, 2.5)));
    }

    /**
     * 1. Создайте метод sumRange, который принимает два числа (начало и конец диапазона) и
     * возвращает сумму всех чисел между ними (включительно).
     */
    public static int sumRange(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    // 2. Создайте два перегруженных метода add: Первый складывает два целых числа; Второй складывает две строки.
    public static int add(int a, int b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a.concat(b);
    }

    // 3. Напишите метод findMax, который принимает массив целых чисел и возвращает его максимальный элемент.
    public static int findMax(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    // 4. Напишите метод, вычисляющий факториал числа с помощью цикла for
    public static int factorial(int n) {
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a = a * i;
        }
        return a;
    }

    // 5. Создайте перегруженные методы calculateArea: Для круга (принимает радиус); Для прямоугольника (принимает длину и ширину).
    public static double calculateArea(double a) {
        return Math.PI * a * a;
    }

    public static double calculateArea(double a, double b) {
        return a * b;
    }

    // 6. Реализуйте метод, который принимает три числа и возвращает их среднее арифметическое.

    public static double AverageNums(double[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        double a = nums[0];
        for (int i = 1; i < nums.length; i++) {
            a += nums[i];
        }
        return a / nums.length;
    }

    // 7. Напишите метод, который принимает два числа, представляющие длины катетов, и возвращает длину гипотенузы (используйте теорему Пифагора).

    public static double Pifogor(double a, double b) {
        if ((a <= 0) || (b <= 0)) return 0;
        return Math.sqrt((a * a) + (b * b));
    }
}