package mx.degg.proyectodemo;

import com.badlogic.gdx.Screen;

public class PantallaMario extends Pantalla {
    private final Juego juego;

    public PantallaMario(Juego juego) {
        this.juego = juego;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        borrarPantalla(5,8, 4);
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