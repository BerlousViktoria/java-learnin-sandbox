package ua.learning.practice.week01_core.hashcodes.task_01_training;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodesTraining  {
    public static void main(String[] args) {
        Map<Team, String> leaders = new HashMap<>();
        leaders.put(new Team("New York", "development"), "Anne");
        leaders.put(new Team("Boston", "development"), "Brian");
        leaders.put(new Team("Boston", "marketing"), "Charlie");

        Team myTeam = new Team("New York", "development");
        System.out.println(leaders.get(myTeam));

    }

    static class Team{
        final String city;
        final String department;

        public Team(String city, String department) {
            this.city = city;
            this.department = department;
        }

        @Override
        public final boolean equals(Object o){
            if (this == o){
                return true;
            }
            if (!(o instanceof Team other)){
                return false;
            }
            return Objects.equals(this.city, other.city)
                    && Objects.equals(this.department, other.department);
        }

        @Override
        public final int hashCode(){
            int result = 17;
            if (city != null) result = 31 * result + city.hashCode();
            if (department != null){
                result = 31 * result + department.hashCode();
            }
            return result;
        }
    }
}
