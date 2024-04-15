public class Main {

    public static void test(int num) {
        System.out.println(num);
        // System.out.println(a);
        int a = 9;
        System.out.println(a);
        if (8 > 0) {
            System.out.println(num);
            System.out.println(a);
            int b = 11;
            System.out.println(b);
        }
        // System.out.println(b);
        System.out.println(myNumber);
    }

    public static void main(String[] args) {
        // System.out.println(num);
        System.out.println(myNumber);
        boolean isRainy = false;

        if (isRainy) {
            System.out.println("Take an umbrella");
        }

        if (!isRainy) { // Логический оператор отрицания НЕ (NOT)
            System.out.println("Go swimming");
        }
    }

    public static int myNumber = 921;
}