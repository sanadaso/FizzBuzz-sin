package my.game.pkg

import com.badlogic.gdx.backends.lwjgl._

object Main extends App {
    val cfg = new LwjglApplicationConfiguration
    cfg.title = "SampleGame"
    cfg.height = 480
    cfg.width = 1300
    cfg.forceExit = false
    new LwjglApplication(new Samplegame, cfg)
}
