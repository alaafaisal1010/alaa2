public class ArithmeticProgression {
        public static void main(String[] args) {
            long maxLong = Long.MAX_VALUE; // أكبر قيمة لـ long
            long increment = 128;

            long maxCalls = maxLong / increment;

            System.out.println("أقصى عدد من المكالمات: " + maxCalls);
        }
    }

