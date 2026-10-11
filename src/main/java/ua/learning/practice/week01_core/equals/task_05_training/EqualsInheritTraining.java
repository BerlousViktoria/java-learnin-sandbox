package ua.learning.practice.week01_core.equals.task_05_training;

import java.util.Objects;

public class EqualsInheritTraining {
    class Item {
        private final String name;
        private final double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Item other)) return false;
            return Double.compare(this.price, other.price) == 0
                    && Objects.equals(this.name, other.name);
        }
    }

    class DiscountedItem{
        private final double discount;
        private Item item;

        public DiscountedItem(double discount, Item item) {
            this.discount = discount;
            this.item = item;
        }

        public double getDiscount() {
            return discount;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof DiscountedItem other)) return false;

            return Objects.equals(this.item, other.item)
                    && Double.compare(this.discount, other.discount) == 0;

        }
    }
}
