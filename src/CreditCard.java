public class CreditCard {
    private double balance; // متغير خاص لتخزين الرصيد

    public CreditCard(double initialBalance) {
        this.balance = initialBalance;
    }

    public boolean charge(double price) {
        if (price > balance) {
            return false; // لا يوجد رصيد كافٍ
        }
        balance -= price; // خصم السعر من الرصيد
        return true; // العملية ناجحة
    }

    public double getBalance() {
        return balance; // دالة للحصول على الرصيد
    }
}
class predatorycreditcard extends CreditCard {

    public predatorycreditcard(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public boolean charge(double price) {
        boolean isSuccess = super.charge(price);
        if (!isSuccess) {
            charge(5); // العقوبة (هذا الجزء معيب)
        }
        return isSuccess;
    }
}



