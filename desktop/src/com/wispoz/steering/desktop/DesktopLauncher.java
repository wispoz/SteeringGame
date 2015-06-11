package com.wispoz.steering.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.wispoz.steering.SteeringGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Title";
        config.height = 480;
        config.width = 640;
		new LwjglApplication(new SteeringGame(), config);
	}
}
