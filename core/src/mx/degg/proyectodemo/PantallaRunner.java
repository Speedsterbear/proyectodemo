package mx.degg.proyectodemo;

import com.badlogic.gdx.Screen;

public class PantallaRunner extends Pantalla {
    private Juego juego;

    public PantallaRunner(Juego juego) {
        this.juego = juego;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        borrarPantalla(1,0, 0);

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
