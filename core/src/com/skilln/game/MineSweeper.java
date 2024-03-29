package com.skilln.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.skilln.game.io.loader.AtlasLoader;
import com.skilln.game.screen.ScreenManager;

public class MineSweeper extends Game {

	SpriteBatch batch;
	Texture img;

	private AtlasLoader atlasLoader;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");

		atlasLoader = new AtlasLoader();

		ScreenManager.init(this);

		ScreenManager.setCurrentScreen(ScreenManager.GAME);
	}

	@Override
	public void render () {
		super.render();

	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
