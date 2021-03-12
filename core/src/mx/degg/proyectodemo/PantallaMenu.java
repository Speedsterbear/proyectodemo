package mx.degg.proyectodemo;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Align;

public class PantallaMenu extends Pantalla {
    // Referencia al juego principal
    private Juego juego;

    // Fondo de la pantalla del menú
    private Texture texturaFondo;

    // Escena
    private Stage escenaMenu;

    public PantallaMenu(Juego juego) {
        this.juego = juego;
    }

    @Override
    public void show() {

        // MENU, necesitamos una escena
        escenaMenu = new Stage(vista);

        crearMenu();
    }

    private void crearMenu() {
        // Creamos el fondo
        texturaFondo = new Texture("menu/img1.jpg");

        // MENU, necesitamos una escena
        escenaMenu = new Stage(vista);

        // Actores... Botón
        Button btnMario = crearBoton("menu/btn_jugar_mario.png", "menu/btnInverso_jugar_mario.png");
        btnMario.setPosition(ANCHO/3, 2*ALTO/3, Align.center);

        //Agregar a la escena
        escenaMenu.addActor(btnMario);
        btnMario.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
               // juego.setScreen(new PantallaMario(juego));
            }
        });

        Button btnSpace = crearBoton("menu/btn_jugar_space.png", "menu/btnInverso_jugar_space.png");
        btnSpace.setPosition(2*ANCHO/3, 2*ALTO/3, Align.center);
        escenaMenu.addActor(btnSpace);
        // Registar el evento de click para el botón
        btnSpace.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                // Cambiar de pantalla
               // juego.setScreen(new PantallaSpaceInvaders(Juego ));
            }
        });

        Button btnRunner = crearBoton("menu/btn_jugar_runner.png", "menu/btnInverso_jugar_runner.png");
        btnRunner.setPosition(ANCHO/3, ALTO/3, Align.center);
        btnRunner.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                //juego.setScreen(new PantallaRunner(juego));
            }
        });
        escenaMenu.addActor(btnRunner);

        Button btnConfiguracion = crearBoton("menu/btn_configuracion.png", "menu/btnInverso_configuracion.png");
        btnConfiguracion.setPosition(2*ANCHO/3, ALTO/3, Align.center);
        btnConfiguracion.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                //juego.setScreen(new PantallaConfiguracion(juego));
            }
        });
        escenaMenu.addActor(btnConfiguracion);

        //Escena se DE ATANDER LOS EVENTOS DE ENTRADA
        Gdx.input.setInputProcessor(escenaMenu);
    }

    private Button crearBoton(String archivo, String archivoInverso) {
        Texture texturaBoton = new Texture(archivo);
        TextureRegionDrawable trdBtnMario = new TextureRegionDrawable(texturaBoton);
        //Inverso
        Texture textuaraInverso = new Texture(archivoInverso);
        TextureRegionDrawable trdBtnInverso = new TextureRegionDrawable(textuaraInverso);

        return new Button(trdBtnMario, trdBtnInverso);
    }

    // Se ejecuta automáticamente (60 fps)
    //delta es el tiempo que ha trancurrido
    @Override
    public void render(float delta) {
        borrarPantalla(0, 1, 0);

        batch.setProjectionMatrix(camara.combined);

        batch.begin();
        batch.draw(texturaFondo, 0, 0);
        batch.end();

        // Escena (DESPUES DEL FONDO)
        escenaMenu.draw();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
