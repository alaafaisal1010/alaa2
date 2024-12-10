public class fibonacciProgression {


    private long current; // القيمة الحالية
    private long previous; // القيمة السابقة

    // Constructor
    public fibonacciProgression(long first, long second) {
        current = first; // القيمة الأولى
        previous = second; // القيمة الثانية
    }

    // دالة لطباعة القيم في التسلسل
    public void printProgression(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(current + " "); // طباعة القيمة الحالية
            long next = current + previous; // حساب القيمة التالية
            previous = current; // تحديث القيمة السابقة
            current = next; // تحديث القيمة الحالية
        }
        System.out.println(); // الانتقال إلى سطر جديد بعد الطباعة
    }
}
class Main {
    public static void main(String[] args) {
        fibonacciProgression fibonacci = new fibonacciProgression(2, 2); // إنشاء تسلسل فيبوناتشي يبدأ بالقيم 2 و2
        fibonacci.printProgression(8); // طباعة القيم حتى القيمة الثامنة
    }
}

