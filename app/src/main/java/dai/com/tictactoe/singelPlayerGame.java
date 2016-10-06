package dai.com.tictactoe;

/**
 * Created by ReY on 23/09/2016.
 */

public class singelPlayerGame {

    private int[][] myGame;
    private boolean enTurno;
    private int numeroJugada;


    public singelPlayerGame() {

        myGame = new int[3][3];
        matrizLLena();
        enTurno = true;
        numeroJugada = 0;

    }

    public void setEnTurno(boolean enTurno) {
        this.enTurno = enTurno;
    }

    public void setMyGame(int[][] myGame) {
        this.myGame = myGame;
    }

    public void setNumeroJugada(int numeroJugada) {
        this.numeroJugada = numeroJugada;
    }

    public int getNumeroJugada() {
        return numeroJugada;
    }

    public int[][] getMyGame() {
        return myGame;
    }

    public boolean getEnturno() {
        return this.enTurno;
    }


    //Metodo para llenar la Matriz
    public void matrizLLena() {
        for (int i = 0; i < myGame.length; i++) {
            for (int j = 0; j < myGame[i].length; j++) {
                myGame[i][j] = 0;

            }
        }
    }



    public void playGame(int f, int c) {

        if (myGame[f][c] == 0) {
            if (numeroJugada <= 4) {


                if (enTurno) {
                    myGame[f][c] = 1;

                } else {
                    myGame[f][c] = -1;
                }

            } else {

                if (numeroJugada > 4 || numeroJugada <= 9) {

                    if (enTurno) {
                        myGame[f][c] = 1;
                    }else{
                       myGame[f][c] = -1;
                    }

                }
            }
        }
        enTurno = !enTurno;
        numeroJugada++;

    }

    public int sumaFila1(){
        return myGame[0][0]+myGame[0][1]+myGame[0][2];
    }

    public int sumaFila2(){
        return myGame[1][0]+myGame[1][1]+myGame[1][2];
    }

    public int sumaFila3(){
        return myGame[2][0]+myGame[2][1]+myGame[2][2];
    }

    public int sumaColumna1(){
        return myGame[0][0]+myGame[1][0]+myGame[2][0];
    }

    public int sumaColumna2(){
        return myGame[0][1]+myGame[1][1]+myGame[2][1];
    }

    public int sumaColumna3(){
        return myGame[0][2]+myGame[1][2]+myGame[2][2];
    }

    public int sumaDiagonalDerecha(){
        return myGame[0][2]+myGame[1][1]+myGame[2][0];
    }

    public int sumaDiagonalIzquierda(){
        return myGame[0][0]+myGame[1][1]+myGame[2][2];
    }

    public int posicion(int f, int c) {

        return  myGame[f][c];
    }

    public void finJuego(){
        for (int i=0; i< myGame.length; i++){
            for (int j=0; j< myGame[i].length; j++){
                if (myGame[i][j] == 0){
                    myGame[i][j]=2;
                }
            }
        }
    }

}
