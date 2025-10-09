package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void checkEquals(){
        Team t1 = new Team("test-team-1");
        Team t2 = new Team("test-team-2");
        Team t3 = new Team("test-team-1");
        Team t4 = new Team("test-team-4");
        Team t5 = new Team("test-team-1");

        Object o = new Object();
        t1.addMember("Bob");
        t1.addMember("Alice");
        
        t3.addMember("Bob");
        t3.addMember("Alice");

        t4.addMember("Bob");
        t4.addMember("Alice");

        t2.addMember("Alice");


        assertEquals(t1.equals(t5), false);
        assertEquals(t1.equals(t4), false);

        assertEquals(t1.equals(t2), false);
        assertEquals(t1.equals(t1), true);
        assertEquals(t1.equals(o), false);
        assertEquals(t1.equals(t3), true);

    }

    @Test
    public void checkToString(){
        assertEquals("Team(name=test-team" + ", members=[])", team.toString());
    }

    @Test 
    public void checkHashCode(){
        // assert that checkHashCode() is true
        assertEquals(team.hashCode(), team.name.hashCode() | team.members.hashCode());
    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
