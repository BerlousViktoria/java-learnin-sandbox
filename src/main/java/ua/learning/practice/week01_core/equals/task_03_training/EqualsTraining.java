package ua.learning.practice.week01_core.equals.task_03_training;

import java.util.Arrays;
import java.util.Objects;

public class EqualsTraining {
    public static void main(String[] args) {
        String[] tags = {"1", "2"};
        Order order1 = new Order("1", 2, new String[]{"1", "2"});
        Order order2 = new Order("1", 2, new String[]{"1", "2"});
        Order order3 = new Order("1", 2, tags);

        System.out.println(order1.equals(order2)); // повинно бути тру
        System.out.println(order1.equals(order3)); // повинно бути тру

    }

    static class Order{
        String orderNumber;
        double totalAmount;
        String[] tags;

        public Order(String orderNumber, double totalAmount, String[] tags){
            this.orderNumber = orderNumber;
            this.totalAmount = totalAmount;
            this.tags = tags;
        }


        @Override
        public boolean equals(Object obj){
            if(this == obj) return true;
            if(!(obj instanceof Order other)) return false;

            return Double.compare(this.totalAmount, other.totalAmount) == 0
                    && Objects.equals(this.orderNumber, other.orderNumber)
                    && Arrays.equals(this.tags, other.tags);
        }
    }
}
