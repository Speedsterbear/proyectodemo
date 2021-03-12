package mx.degg.proyectodemo;

import com.badlogic.gdx.graphics.Texture;

public class Alien  extends Objeto{

        public Alien(Texture textura, float x , float y){

            super(textura,x,y);
        }
        public void moverHorizontal (float dx){
            sprite.setX(sprite.getX()+dx);
        }
    }

