package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Onur";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        // TODO: Change this to your github id
        return "oyararbas";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f25-09");
        team.addMember("ONUR");
        team.addMember("DENNIS");
        team.addMember("VIKTOR STANISLAVOV");
        team.addMember("LAUREN GRACE");
        team.addMember("SAMPRITA");
        team.addMember("DAVID MARIO");
        return team;
    }
}
