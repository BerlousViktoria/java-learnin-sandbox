package ua.learning.practice.week01_core.hashcodes.task01_training;

import com.sun.jdi.VMOutOfMemoryException;

public class EqualsTraining {
    public static void main(String[] args) {
        Money cash = new Money(55, "USD");
        Voucher voucher = new Voucher(55, "USD", "Amazon");

        System.out.println("WrongTest1: ");
        System.out.println(voucher.equals(cash));
        System.out.println(cash.equals(voucher));



    }

    static class Money {
        int amount;
        String currencyCode;

        public Money(int amount, String currencyCode){
            this.amount = amount;
            this.currencyCode = currencyCode;
        }

        @Override
        public boolean equals(Object o){
            if (o == this){
                return true;
            }
            if (!(o instanceof Money)){
                return false;
            }
            Money other = (Money) o;
            boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null) ||
                    (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
            return this.amount == other.amount && currencyCodeEquals;
        }
    }

    static class Voucher{
        private Money value;
        private String store;

        public Voucher(int amount, String currencyCode, String store){
            this.value = new Money(amount, currencyCode);
            this.store = store;

        }

        @Override
        public boolean equals(Object o){
            if (o == this)
                return true;
            if (!(o instanceof Voucher))
                return false;
            Voucher other = (Voucher) o;
            boolean valueEquals = (this.value == null && other.value == null)
                    || (this.value != null && this.value.equals(other.value));
            boolean storeEquals = (this.store == null && other.store == null)
                    || (this.store != null && this.store.equals(other.store));
            return valueEquals && storeEquals;

        }
    }

}
