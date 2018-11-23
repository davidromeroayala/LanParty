/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanparty;

/**
 *
 * @author alumno
 */
public class Jugador {
    private String nombre;
    private int puntos;
    private String nick;

    public Jugador(String nombre, int puntos, String nick) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.nick = nick;
    }

    public Jugador() {
     nombre = ""; 
     puntos = 0;
     nick = "guest000";
    }

    
    public String toString() {
        return "Jugador{" + "nombre=" + getNombre() + ", puntos=" + getPuntos() + ", nick=" + getNick() + '}';
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the puntos
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * @param puntos the puntos to set
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    /**
     * @return the nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * @param nick the nick to set
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    public void añadirPuntos(int puntos){
        this.puntos+=puntos;
    }
    public void quitarPuntos(int puntos){
        this.puntos=-puntos;
    }
    public Jugador compararpuntos(Jugador[] vRanking){
       Jugador mayor= new Jugador();
       
        
         for (int i = 0; i < vRanking.length; i++) {
            if (vRanking[i].getPuntos()>mayor.getPuntos()) {
                mayor=vRanking[i];
                vRanking[i]=null;
            }
            
        }
         return mayor;
}
}
