package my.game.pkg

import java.lang.Math.{sin, _}

import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.g2d.{BitmapFont, SpriteBatch}
import com.badlogic.gdx.{Game, Gdx}

class Samplegame extends Game {
  lazy val font = new BitmapFont
  lazy val batch = new SpriteBatch

  var moji: String = "kara"
  var height = 0.0

  override def create() {}

  override def render() {
    Gdx.gl.glClearColor(0f, 0f, 0f, 1f)
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

    batch.begin()

    font.setColor(1f, 1f, 1f, 1f)
    for (x <- 1 to 30) {

      if (x % 15 == 0) {
        moji = "FizzBuzz"
      } else if (x % 3 == 0) {
        moji = "fizz"
      } else if (x % 5 == 0) {
        moji = "buzz"
      } else {
        moji = x.toString
      }

      height = 240 + sin(x) * 50

      font.draw(batch, moji, x * 40, height.toInt)
    }
    batch.end()
  }
}