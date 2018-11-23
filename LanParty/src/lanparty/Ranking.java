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
public class Ranking {
  private String juego;
  private Jugador[] vJugadores;
    private String Juego;

    public Ranking(String Juego, Jugador vjugadores) {
        this.Juego = Juego;
        this.vJugadores = vJugadores;
    }

    public Ranking() {
        juego="";
        vJugadores=new Jugador[10];
    }
  /*añade un jugador en el vector de vjugadores que se utilizara para el ranking*/
  public void añadirJugador(Jugador jugador){
      boolean existe=false;
      for (int i = 0; i < vJugadores.length; i++) {
          if (vJugadores[i].getNombre().equals(jugador.getNombre())) {
              existe=true;
          }
      }
      if (!existe) {
          for (int i = 0; i < vJugadores.length; i++) {
              if (vJugadores[i]==null) {
                  vJugadores[i]=jugador;
                  System.out.println("Se añadio correctamente");
              }else{
                  System.out.println("Esta completo");
              }
          }
      }
  }
  /*muestra todos los jugadores inscritos en el ranking*/
  public void mostrarJugadores (){
  for (Jugador aux:vJugadores){
      if (aux!=null) {
          System.out.println(aux);
      }
  }
  }
  public void eliminirJugador (Jugador jugador){
      for (int i = 0; i < vJugadores.length; i++) {
          if (vJugadores==null && vJugadores[i]==jugador) {
              vJugadores=null;
              System.out.println("ha sido eliminado");
          }
      }
  }
  public void añadirPuntos(Jugador jugador,int cuantospuntos){
      for (int i = 0; i < vJugadores.length; i++) {
          
     
      if (vJugadores[i]!=null && vJugadores[i]==jugador) {
              vJugadores[i].añadirPuntos(cuantospuntos);
              System.out.println("Se añadio " +cuantospuntos +" puntos");
          }
       }
  }
  public void quitarPuntoPuntos(Jugador jugador,int cuantospuntos){
      for (int i = 0; i < vJugadores.length; i++) {
          
      
      if (vJugadores==null && vJugadores[i]==jugador) {
             vJugadores[i].quitarPuntos(cuantospuntos);
             System.out.println("Se quito "+ cuantospuntos +" puntos");
             
          }
      }
      }
  public void crearRanking(){
   Jugador  aux;
        for (i = 0; i < vJugadores.length - 1; i++) {
            for (j = 0; j < vJugadores.length - i - 1; j++) {
                if (vJugadores[j + 1] < A[j]) {
                    aux = vJugadores[j + 1];
                    vJugadores[j + 1] = vJugadores[j];
                    vJugadores[j] = aux;
                }
            }
        }
  }
 
}
