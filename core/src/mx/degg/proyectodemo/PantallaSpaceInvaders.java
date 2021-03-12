package mx.degg.proyectodemo;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Array;

public class PantallaSpaceInvaders extends Pantalla {
    private Juego juego;

    private Alien alien;

    private Array<Alien> arrAliens;

    public PantallaSpaceInvaders(Juego juego) {
        this.juego = juego;
    }

    @Override
    public void show() {
crearEnemigos();
    }

    public void crearEnemigos (){
        Texture texturaAlien = new Texture("space/enemigoArriba.png");
        //alien = new Alien (texturaAlien, ANCHO/2,ALTO/2);
        arrAliens = new Array<>(11+5);
        for (int i=0; i<5; i++){
            for (int j = 0; j<11; j++){
                Alien alien = new Alien(texturaAlien, 310+j*60,ALTO /2 +i*60);
                arrAliens.add(alien);
            }

        }
    }

    @Override
    public void render(float delta) {
        borrarPantalla(0, 0, 1);
        batch.setProjectionMatrix(camara.combined);

        batch.begin();
        //alien.render(batch);
        for (Alien alien:arrAliens){
            alien.render(batch);
        }
        batch.end();
    }

    @Override
    public void pause() {

    }


    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
