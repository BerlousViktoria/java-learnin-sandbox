package ua.learning.practice.week01_core.hashcodes.task_01_training;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

public class TeamTest {


    @Test
    void testEqualsAndHashCodeContract(){
        EqualsVerifier.forClass(HashCodesTraining.Team.class).verify();
    }
}
