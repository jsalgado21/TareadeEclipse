package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;




public class MyGdxGame extends ApplicationAdapter {


	SpriteBatch batch;
	Texture Background,Cloud,Koopa, Mario,Pipe;
	int widthGame, heightGame;

	@Override
	public void create () {
		batch = new SpriteBatch();
		Background = new Texture("Background.png");
		Cloud = new Texture("Cloud.gif");
		Pipe = new Texture("Pipe.gif");
		Mario = new Texture("Mario.gif");
		Koopa = new Texture("Koopa.gif");
		widthGame = Gdx.graphics.getWidth();
		heightGame = Gdx.graphics.getHeight();

		Music music = Gdx.audio.newMusic(Gdx.files.internal("mario.mp3"));
		music.play();
	}

	@Override
	public void render () {
		batch.begin();
		batch.draw(Background, 0, 0, widthGame, heightGame);
		batch.draw(Cloud, 10, 380);
		batch.draw(Pipe, 270, 75);
		batch.draw(Mario, 0, 60);
		batch.draw(Koopa, 450, 75);
		batch.end();
	}
}