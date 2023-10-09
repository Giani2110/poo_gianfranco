package estadisticas;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> jugadores;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team() {
        this.jugadores = new ArrayList<>();
    }

    public ArrayList<Player> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Player> jugadores) {
        this.jugadores = jugadores;
    }

    public void addPlayer(Player jugador) {
        jugadores.add(jugador);
    }

}

