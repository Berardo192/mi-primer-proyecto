import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class personaje{
    String nombre;
    int vida;
    int habilidad;
    int ataque;

    public personaje (String nombre, int vida, int habilidad, int ataque){
        this.nombre = nombre;
        this.vida = vida;
        this.habilidad = habilidad;
        this.ataque = ataque;
    }

    public void atacar (personaje oponente){
        System.out.println(nombre + " ataca a " + oponente.nombre + " con un ataque de " + ataque + " puntos.");
        oponente.recibirAtaque(ataque);
    }
    public void recibirDaño (int daño){
        vida -= daño;
        if (vida < 0) vida = 0;
        System.out.println(nombre + " ahora tiene " + vida + " puntos de vida ");
    }
    public void recibirAtaque (int daño){
        recibirDaño(daño);
    }
    public void recibirEspecial (int daño){
        recibirDaño(daño);
    }
    public void estadísticas (){
        System.out.println("/--- estadisticas de: " + nombre);
        System.out.println("vida: " + vida + " puntoz");
        System.out.println("ataque: " + ataque + " puntos de fuerza");
        System.out.println("habilidad: " + habilidad + "%");
    }
}

class personajes extends personaje {
    
    public personajes( String nombre, int vida, int habilidad, int ataque){
        super (nombre,vida,habilidad,ataque);
    }
    public void movimientoEspecial (personaje oponente){
        System.out.println("este personaje no tiene movimiento especial");
    }
    public boolean transformacion (){
        System.out.println("este personaje ya se transformo");
        return false;
    }
}   
    class goku extends personajes {
        private boolean transformado = false;
        private boolean especial = false;
        private Random random = new Random();

        public goku(){
            super("Goku", 100, 0, 10);
        }
        public void atacar (personaje oponente){
            if (!transformado){
                super.atacar(oponente);
            }
            if (transformado){
            super.atacar(oponente);
            habilidad += 10;
            if (habilidad > 100 ) habilidad = 100;
            System.out.println(nombre + " ha aumentado su habilidad al atacar " + habilidad + "%");
            } 
        }
        public void recibirAtaque (int daño){
            if (transformado){
                if (habilidad > 25){

                    int chance = random.nextInt(2);
                    if (chance == 0){
                        habilidad -= 25;
                        System.out.println("goku logra esquivar tu ataque gracias al ultra intinto :V");
                        System.out.println("pero pierde un 25% ! OH RAYOS¡ ");
                        System.out.println(nombre + " ahora su habilidad esta " + habilidad );
                        System.out.println("");
                    } else {
                        System.out.println("intento esquivar pero no pudo :v");
                        super.recibirDaño(daño);
                    }
                } else {
                    super.recibirDaño(daño);
                    System.out.println("ya no tienes habilidad para esquivar bro :(");
                }
            } else {
                super.recibirDaño(daño);
            }
        }
        public void recibirEspecial (int daño){
            if (transformado){
                if (habilidad > 50){
                    int chance = random.nextInt(2);
                    if (chance == 0){
                        habilidad -= 50;
                        System.out.println("Goku logra esquivar tu ataque especial gracias al ultra instinto :V");
                        System.out.println("Pero pierde un 50% de su habilidad !OH RAYOS¡");
                        System.out.println(nombre + " ahora su habilidad esta " + habilidad);
                    } else {
                        System.out.println("intento esquivar pero no pudo :(");
                        super.recibirEspecial(daño);
                    }
                } else {
                    System.out.println("no tienes habilidad para esquivar");
                    super.recibirEspecial(daño);
                }
            } else {
                super.recibirEspecial(daño);
            }
        }
        public boolean transformacion (){
            
            if (!transformado) {
             vida += 25;
             if (vida > 100) {
                vida = 100;
             }
             ataque += 5;
             habilidad += 100;
             System.out.println(nombre + " goku se a tranformado en el ultra instinto :O" );
             System.out.println("vida: " + vida + " puntos");
             System.out.println("ataque: " + ataque + " puntos de fuerza");
             System.out.println("habilidad: " + habilidad + "%");
             System.out.println("su nueva habilidad consiste que te esquiva todo pero se gasta la habilidad :P");
             transformado = true;
             return true;
            
            } else {
                return false;
            }
        }
        public void movimientoEspecial (personaje oponente) {

            if (!especial){
            System.out.println("Activaste la validad especial");
            System.out.println("Goku dice: !No pienso ceder ni un paso¡");
            int daño = ataque + 15;
            System.out.println(nombre +" lanza un poderoso ataque a " + oponente.nombre + " causando   " + daño + " puntos de daño ");
            oponente.vida -= daño;
            especial = true;
            
            if (oponente.vida < 0) oponente.vida = 0;
            System.out.println(oponente.nombre + " ahora tiene " + oponente.vida + " puntos de vida");
            } else {
            System.out.println("");
            }
        }
    }
    class giren extends personajes {
        private boolean transformado = false;
        private boolean especial = false;

        public giren () {
            super("giren", 100, 0, 15);
        }
        public void recibirAtaque (int daño){
            super.recibirDaño(daño);
            if (transformado){
                habilidad += 25;
                System.out.println(nombre + " ahora tiene su habilidad en " + habilidad);
                if (habilidad >= 100){
                vida += 25;
                if (vida > 100) vida = 100;
                 habilidad = 0;
                 System.out.println("Giren a llenado su habilidad por lo tanto recupera 20 puntos de vida");
                 System.out.println(nombre + " ahora tiene " + vida + " puntos de vida");
                } 
                
            }
        }
        public void recibirEspecial (int daño){
            super.recibirEspecial(daño);
            if (transformado){
                habilidad += 50;
                if (habilidad > 100) habilidad = 100;
                vida += 20;
                System.out.println(nombre + " a llenado su habilida por lo tanto recupera 20 puntos de vida");
                System.out.println(nombre + " ahora tiene " + vida + " puntos de vida");
            }
        }
        public boolean transformacion (){

          if (!transformado){
           vida += 30;
           if (vida > 100) {
             vida = 100;
           }
           ataque += 1;
           habilidad += 50;
           System.out.println(nombre + " se tranformo a full power :O" );
           System.out.println("vida: " + vida + " puntos");
           System.out.println("ataque: " + ataque + " puntos de fuerza");
           System.out.println("habilidad: " + habilidad + "%");
           System.out.println("su nueva habilidad cuando llega a 100% se cura un 25 puntos de vida :P");
           System.out.println("ahora tanqueara como un tanque JAJAJA");
           transformado = true;
           return true;

          } else {
            return false;
            }
    
        }
         public void movimientoEspecial (personaje oponente) {
          if (!especial){

          System.out.println("Activaste la validad especial");
          System.out.println("Giren dice: !Yo no pierdo yo no puedo perder¡");
          int daño = ataque + 25;
          System.out.println(nombre +" lanza un poderoso ataque a  " + oponente.nombre + " causa " + daño + " puntos de daño");
          oponente.recibirEspecial(daño);
          especial = true;

          if (oponente.vida < 0) oponente.vida = 0;
          System.out.println(oponente.nombre + " ahora tiene " + oponente.vida + " puntos de vida");
          } else {
            System.out.println("");
          }
        } 
    }

  
public class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random maquina = new Random();

        personaje [] personajesdisponibles ={
            new goku(),
            new giren(),
            
        };
        boolean juegoactivo = true;
        boolean turnoDemaquina = false;
        boolean turnoDeJugador = false ;
        

        System.out.println("/--- Selecciona tu personaje ---/");
        for (int i = 0; i < personajesdisponibles.length; i++){
            System.out.println((i + 1 ) + ". " + personajesdisponibles[i].nombre);
        }
        int seleccionJugador = -1;
        System.out.println("Nuevos personajes proximamente");
        while (seleccionJugador < 1 || seleccionJugador > personajesdisponibles.length) {
            System.out.println("");
            System.out.println("numero: ");
            try {
                seleccionJugador = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("no te pases de listo JAJAJA ");
                scanner.nextLine();
            }
        }

        personaje jugador = personajesdisponibles[seleccionJugador -1];
        personaje enemigo;

        do {
            enemigo = personajesdisponibles[maquina.nextInt(personajesdisponibles.length)];
        } while (enemigo.nombre.equals(jugador.nombre));
        
        System.out.println("Tu escogiste: " + jugador.nombre);
        System.out.println("Tu enemigo escojio " + enemigo.nombre);
        System.out.println("Nota: LAS HABILIDADES SE ACTIVAN CUANDO EL PERSONAJE SE TRANSFORMA  ");
        System.out.println("LA HABILIDAD ESPECIAL SOLO LO PUEDES HACER UNA SOLO VEZ :v");
        System.out.println("");

        int ataquejugador = -1;

        while (juegoactivo){

        turnoDeJugador = false;
        turnoDemaquina = false;
          
          while (!turnoDeJugador){
           System.out.println("turno de jugador");
           System.out.println("");

           System.out.println("---| Menu de acciones ");
           System.out.println("1. atacar");
           System.out.println("2. habilidad definitiva ");
           System.out.println("3. transformacion");
           System.out.println("4. Ver estadisticas ");
           System.out.println("5. huir de la batalla ");
           System.out.print("Escoje una opcion: ");
        
          try {
             ataquejugador = scanner.nextInt();
          } catch (InputMismatchException e) {
            System.out.println("por que lo intentas >:v");
            System.out.println("");
            scanner.nextLine();
            ataquejugador = -1;
            continue;
          }
          System.out.println("");

          switch (ataquejugador) {
            case 1:
                jugador.atacar(enemigo);
                turnoDeJugador = true;
                break;
            case 2:
                if (jugador instanceof personajes){
                    int vidaDeEnemigoAntes = enemigo.vida;
                    ((personajes) jugador).movimientoEspecial(enemigo);
                    if (enemigo.vida < vidaDeEnemigoAntes) {
                        turnoDeJugador = true;
                    } else {
                        System.out.println("ya usaste la habilidad pero no se cobrara tu turno");
                        System.out.println("");
                    }
                }
                break;
            case 3:
                if (jugador instanceof personajes){
                    boolean transformadoConExito = ((personajes) jugador).transformacion();
                    if (transformadoConExito){
                        turnoDeJugador = true;
                    } else {
                        System.out.println("ya usaste esta habilidad");
                    }
                } 
                break;
            case 4:
                System.out.println(jugador.nombre + " ||vida: " + jugador.vida + " puntos de vida ||ataque: " +jugador.ataque+ " puntos de fuerza|| habilidad: " + jugador.habilidad );
                System.out.println(enemigo.nombre + " ||vida: " + enemigo.vida + " puntos de vida ||ataque: " +enemigo.ataque+ " puntos de fuerza|| habilidad: " + enemigo.habilidad );
                break;
            case 5:
                System.out.println("como vas huir de una pelea que cobarde");
                System.out.println("pero pierdes por que te cae un meteorito XD");
                System.out.println("y te preguntaras por que yo hago las reglas JAJA XD");
                turnoDeJugador = true;
                juegoactivo = false;
                break;
            default:
                System.out.println("opcion no validad");
                break;
          }
          }
          if (enemigo.vida == 0) {
            System.out.println(jugador.nombre + " has sido derrotado " + enemigo.nombre + " !GANA¡");
            System.out.println("yo creo que fue suerte XD");
            System.out.println("");
            juegoactivo = false;
            return;
          }
          System.out.println("");
          System.out.println("turno de la PC");

          while(!turnoDemaquina) {
            int ataquemaquina = maquina.nextInt(3) + 1;

             switch (ataquemaquina) {
                case 1:
                 enemigo.atacar(jugador);
                 turnoDemaquina = true;
                 break;
                case 2:
                  if (enemigo instanceof personajes){
                    int vidaDeJugadorAntes = jugador.vida;
                    ((personajes) enemigo).movimientoEspecial(jugador);
                    if (jugador.vida < vidaDeJugadorAntes) {
                        turnoDemaquina = true;
                    }
                 }
                break;
            case 3:
                if (enemigo instanceof personajes){
                    boolean transformadoConExito  = ((personajes) enemigo).transformacion();
                    
                    if (transformadoConExito){
                        transformadoConExito = false;
                        turnoDemaquina = true;                        
                    }
                }
                break;
          }
          }
          System.out.println("");
          if (jugador.vida == 0) {
            System.out.println(jugador.nombre + " has sido derrotado " + enemigo.nombre + " !GANA¡");
            System.out.println("te gano una maquina JAJA");
            juegoactivo = false;
            return;
          }
        }
        scanner.close();

    }
}
