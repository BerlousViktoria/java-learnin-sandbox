package ua.learning.practice.week01_core.hashcodes.task_04_training;

import java.util.Objects;

public class EqualsTraining {
    public static void main(String[] args) {

    }

    static class GeoPoint{
        double latitude;
        double longitude;
        String locationName;

        public GeoPoint(double latitude, double longitude, String locationName){
            this.latitude = latitude;
            this.longitude = longitude;
            this.locationName = locationName;
        }

        @Override
        public boolean equals(Object obj){
            if (this == obj) return true;
            if (!(obj instanceof GeoPoint other)) return false;

            return Double.compare(this.latitude, other.latitude) == 0
                    && Double.compare(this.longitude, other.longitude) == 0
                    && Objects.equals(this.locationName, other.locationName);
        }
    }
}
