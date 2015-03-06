package com.alumnot.ZombieBird;

import com.alumnot.Screens.SplashScreen;
import com.alumnot.ZBHelpers.AssetLoader;
import com.badlogic.gdx.Game;


public class ZBGame extends Game {

	@Override
	public void create() {
		AssetLoader.load();
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}

}