package ua.learning.practice.week01_core.hashcodes.task02_training;

import java.util.Objects;

public class EqualsTraining_02 {
    public static void main(String[] args){
    }

    class UserProfile{
        private long id;
        private String email;
        private int age;

        public UserProfile(long id, String email, int age) {
            this.id = id;
            this.email = email;
            this.age = age;
        }

        @Override
        public boolean equals(Object obj){
            if (obj == this) return true;
            if(!(obj instanceof UserProfile other)) return false;
            return  this.id == other.id && Objects.equals(this.email, other.email);
        }
    }

}
