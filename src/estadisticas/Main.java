package estadisticas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Player Messi = new Player();
        Player Ronaldo = new Player();

        Team Miami = new Team();

        Miami.setName("Inter de Miami");

        Messi.setEdad(36);
        Messi.setTeam(Miami);

        Ronaldo.setTeam(Miami);
        Ronaldo.setEdad(38);

        Miami.addPlayer(Messi);
        Miami.addPlayer(Ronaldo);

        System.out.println(Messi.getEdad()+" "+Messi.getTeam().getName());
        System.out.println(Ronaldo.getTeam().getName());



    }
}