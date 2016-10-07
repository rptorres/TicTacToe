package dai.com.tictactoe;

import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SingelGameActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btF1C1, btF1C2, btF1C3, btF2C1, btF2C2, btF2C3, btF3C1, btF3C2, btF3C3;
    private singelPlayerGame spGame = new singelPlayerGame();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singel_game);

        btF1C1 = (Button) findViewById(R.id.btF1C1);
        btF1C2 = (Button) findViewById(R.id.btF1C2);
        btF1C3 = (Button) findViewById(R.id.btF1C3);

        btF2C1 = (Button) findViewById(R.id.btF2C1);
        btF2C2 = (Button) findViewById(R.id.btF2C2);
        btF2C3 = (Button) findViewById(R.id.btF2C3);

        btF3C1 = (Button) findViewById(R.id.btF3C1);
        btF3C2 = (Button) findViewById(R.id.btF3C2);
        btF3C3 = (Button) findViewById(R.id.btF3C3);


        btF1C1.setOnClickListener(this);
        btF1C2.setOnClickListener(this);
        btF1C3.setOnClickListener(this);

        btF2C1.setOnClickListener(this);
        btF2C2.setOnClickListener(this);
        btF2C3.setOnClickListener(this);

        btF3C1.setOnClickListener(this);
        btF3C2.setOnClickListener(this);
        btF3C3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

                case R.id.btF1C1:
                    if(spGame.posicion(0,0)== 1 || spGame.posicion(0,0)== -1){
                        Toast.makeText(this, "Posicion ocupada", Toast.LENGTH_SHORT).show();
                    }else {
                        spGame.playGame(0, 0);

                        if (spGame.posicion(0, 0) == 1) {
                            if (spGame.sumaFila1() == 3 || spGame.sumaColumna1() == 3 || spGame.sumaDiagonalIzquierda() == 3) {
                                btF1C1.setBackgroundColor(Color.BLACK);
                                spGame.finJuego();
                                Toast.makeText(this, "Juego terminado", Toast.LENGTH_SHORT).show();
                            } else
                                btF1C1.setBackgroundColor(Color.BLACK);

                        } else {
                            if (spGame.posicion(0, 0) == -1) {
                                if (spGame.sumaFila1() == -3 || spGame.sumaColumna1() == -3 || spGame.sumaDiagonalIzquierda() == -3) {
                                    btF1C1.setBackgroundColor(Color.BLUE);
                                    spGame.finJuego();
                                    Toast.makeText(this, "Juego terminado", Toast.LENGTH_SHORT).show();
                                } else {
                                    btF1C1.setBackgroundColor(Color.BLUE);

                                }
                            }
                        }
                    }
                    break;

                case R.id.btF1C2:

                    if (spGame.posicion(0,1) == 1 || spGame.posicion(0,1) == -1 ){
                        Toast.makeText(this, "Posicion ocupada", Toast.LENGTH_SHORT).show();
                    }else{
                        spGame.playGame(0,1);
                        if (spGame.posicion(0,1) == 1){
                            if (spGame.sumaFila1() == 3 || spGame.sumaColumna2() == 3){
                                btF1C2.setBackgroundColor(Color.BLACK);
                                spGame.finJuego();
                                Toast.makeText(this, "Juego terminado", Toast.LENGTH_SHORT).show();
                            }else{
                                btF1C2.setBackgroundColor(Color.BLACK);

                            }
                        }else {
                            if (spGame.posicion(0,1) == -1) {

                                if (spGame.sumaFila1() == -3 || spGame.sumaColumna2() == -3) {
                                    btF1C2.setBackgroundColor(Color.BLUE);
                                    spGame.finJuego();
                                    Toast.makeText(this, "Juego terminado", Toast.LENGTH_SHORT).show();
                                } else {
                                    btF1C2.setBackgroundColor(Color.BLUE);

                                }
                            }
                        }
                    }
                    break;

                case R.id.btF1C3:

                    if (spGame.posicion(0,2) == 1 || spGame.posicion(0,2) == -1){
                        Toast.makeText(this, "Posision ocupada", Toast.LENGTH_SHORT).show();
                    }else {
                        spGame.playGame(0,2);
                        if (spGame.posicion(0,2)==1){
                            if (spGame.sumaFila1() == 3 || spGame.sumaColumna3() == 3 || spGame.sumaDiagonalDerecha() == 3){
                                btF1C3.setBackgroundColor(Color.BLACK);
                                spGame.finJuego();
                                Toast.makeText(this, "Juego terminado", Toast.LENGTH_SHORT).show();
                            }else {
                                btF1C3.setBackgroundColor(Color.BLACK);

                            }
                        }else {
                            if (spGame.posicion(0, 2) == -1) {
                                if (spGame.sumaFila1() == -3 || spGame.sumaColumna3() == -3 || spGame.sumaDiagonalDerecha() == -3) {
                                    btF1C3.setBackgroundColor(Color.BLUE);
                                    spGame.finJuego();
                                    Toast.makeText(this, "Juego terminado", Toast.LENGTH_SHORT).show();
                                } else {
                                    btF1C3.setBackgroundColor(Color.BLUE);

                                }
                            }
                        }
                    }
                    break;

                case R.id.btF2C1:
                    if (spGame.posicion(1,0) == 1 || spGame.posicion(1,0) == -1){
                        Toast.makeText(this, "Posision ocupada", Toast.LENGTH_SHORT).show();
                    }else {
                        spGame.playGame(1,0);
                        if (spGame.posicion(1,0)==1){
                            if (spGame.sumaFila2() == 3 || spGame.sumaColumna1() == 3){
                                btF2C1.setBackgroundColor(Color.BLACK);
                                spGame.finJuego();
                                Toast.makeText(this, "Juego terminado", Toast.LENGTH_SHORT).show();
                            }else {
                                btF2C1.setBackgroundColor(Color.BLACK);
                                btF2C1.setEnabled(false);
                            }
                        }else {
                            if (spGame.posicion(1, 0) == -1) {
                                if (spGame.sumaFila2() == -3 || spGame.sumaColumna1() == -3) {
                                    btF2C1.setBackgroundColor(Color.BLUE);
                                    spGame.finJuego();
                                    Toast.makeText(this, "Juego terminado", Toast.LENGTH_SHORT).show();
                                } else {
                                    btF2C1.setBackgroundColor(Color.BLUE);

                                }
                            }
                        }
                    }
                    break;

                case R.id.btF2C2:
                    if (spGame.posicion(1,1) == 1 || spGame.posicion(1,1) == -1){
                        Toast.makeText(this, "Posision ocupada", Toast.LENGTH_SHORT).show();
                    }else {
                        spGame.playGame(1,1);
                        if (spGame.posicion(1,1)== 1){
                            if (spGame.sumaFila2() == 3 || spGame.sumaColumna2() == 3 || spGame.sumaDiagonalIzquierda()== 3 || spGame.sumaDiagonalDerecha() == 3){
                                btF2C2.setBackgroundColor(Color.BLACK);
                                spGame.finJuego();
                                Toast.makeText(this, "Juego terminado", Toast.LENGTH_SHORT).show();
                            }else {
                                btF2C2.setBackgroundColor(Color.BLACK);
                            }
                        }else {
                            if (spGame.posicion(1, 1) == -1) {
                                if (spGame.sumaFila2() == -3 || spGame.sumaColumna2() == -3 || spGame.sumaDiagonalIzquierda() == -3 || spGame.sumaDiagonalDerecha() == -3) {
                                    btF2C2.setBackgroundColor(Color.BLUE);
                                    spGame.finJuego();
                                    Toast.makeText(this, "Juego terminado", Toast.LENGTH_SHORT).show();
                                } else {
                                    btF2C2.setBackgroundColor(Color.BLUE);
                                }
                            }
                        }
                    }
                    break;

                case R.id.btF2C3:
                    if (spGame.posicion(1,2) == 1 || spGame.posicion(1,2) == -1){
                        Toast.makeText(this, "Posision ocupada", Toast.LENGTH_SHORT).show();
                    }else {
                        spGame.playGame(1,2);
                        if (spGame.posicion(1,2)==1){
                            if (spGame.sumaFila2() == 3 || spGame.sumaColumna3() == 3){
                                btF2C3.setBackgroundColor(Color.BLACK);
                                spGame.finJuego();
                                Toast.makeText(this, "Juego terminado", Toast.LENGTH_SHORT).show();
                            }else {
                                btF2C3.setBackgroundColor(Color.BLACK);
                            }
                        }else {
                            if (spGame.posicion(1, 2) == -1) {
                                if (spGame.sumaFila2() == -3 || spGame.sumaColumna3() == -3) {
                                    btF2C3.setBackgroundColor(Color.BLUE);
                                    spGame.finJuego();
                                    Toast.makeText(this, "Juego terminado", Toast.LENGTH_SHORT).show();
                                } else {
                                    btF2C3.setBackgroundColor(Color.BLUE);
                                }
                            }
                        }
                    }
                    break;

                case R.id.btF3C1:
                    if (spGame.posicion(2,0) == 1 || spGame.posicion(2,0) == -1){
                        Toast.makeText(this, "Posision ocupada", Toast.LENGTH_SHORT).show();
                    }else {
                        spGame.playGame(2,0);
                        if (spGame.posicion(2,0)==1){
                            if (spGame.sumaFila3() == 3 || spGame.sumaColumna1() == 3 || spGame.sumaDiagonalDerecha() == 3){
                                btF3C1.setBackgroundColor(Color.BLACK);
                                spGame.finJuego();
                                Toast.makeText(this, "Juego terminado", Toast.LENGTH_SHORT).show();
                            }else {
                                btF3C1.setBackgroundColor(Color.BLACK);
                            }
                        }else {
                            if (spGame.posicion(2, 0) == -1) {
                                if (spGame.sumaFila3() == -3 || spGame.sumaColumna1() == -3 || spGame.sumaDiagonalDerecha() == -3) {
                                    btF3C1.setBackgroundColor(Color.BLUE);
                                    spGame.finJuego();
                                    Toast.makeText(this, "Juego terminado", Toast.LENGTH_SHORT).show();
                                } else {
                                    btF3C1.setBackgroundColor(Color.BLUE);
                                }
                            }
                        }
                    }
                    break;
                case R.id.btF3C2:
                    if (spGame.posicion(2,1) == 1 || spGame.posicion(2,1) == -1){
                        Toast.makeText(this, "Posision ocupada", Toast.LENGTH_SHORT).show();
                    }else {
                        spGame.playGame(2,1);
                        if (spGame.posicion(2,1)==1){
                            if (spGame.sumaFila3() == 3 || spGame.sumaColumna2() == 3){
                                btF3C2.setBackgroundColor(Color.BLACK);
                                spGame.finJuego();
                                Toast.makeText(this, "Juego terminado", Toast.LENGTH_SHORT).show();
                            }else {
                                btF3C2.setBackgroundColor(Color.BLACK);
                            }
                        }else {
                            if (spGame.posicion(2, 1) == -1) {
                                if (spGame.sumaFila3() == -3 || spGame.sumaColumna2() == -3) {
                                    btF3C2.setBackgroundColor(Color.BLUE);
                                    spGame.finJuego();
                                    Toast.makeText(this, "Juego terminado", Toast.LENGTH_SHORT).show();
                                } else {
                                    btF3C2.setBackgroundColor(Color.BLUE);
                                }
                            }
                        }
                    }
                    break;

                case R.id.btF3C3:
                    if (spGame.posicion(2,2) == 1 || spGame.posicion(2,2) == -1){
                        Toast.makeText(this, "Posision ocupada", Toast.LENGTH_SHORT).show();
                    }else {
                        spGame.playGame(2,2);
                        if (spGame.posicion(2,2)==1){
                            if (spGame.sumaFila3() == 3 || spGame.sumaColumna3() == 3 || spGame.sumaDiagonalIzquierda() == 3){
                                btF3C3.setBackgroundColor(Color.BLACK);
                                spGame.finJuego();
                                Toast.makeText(this, "Juego terminado", Toast.LENGTH_SHORT).show();
                            }else {
                                btF3C3.setBackgroundColor(Color.BLACK);
                            }
                        }else {
                            if (spGame.posicion(2, 2) == -1) {
                                if (spGame.sumaFila3() == -3 || spGame.sumaColumna3() == -3 || spGame.sumaDiagonalIzquierda() == -3) {
                                    btF3C3.setBackgroundColor(Color.BLUE);
                                    spGame.finJuego();
                                    Toast.makeText(this, "Juego terminado", Toast.LENGTH_SHORT).show();
                                } else {
                                    btF3C3.setBackgroundColor(Color.BLUE);
                                }
                            }
                        }
                    }
                    break;

        }

    }
}
