package game.board

/**
  * Created by salim on 3/8/2017.
  */
case class IncomeTax() extends Tax {
  override val name: String = "Income Tax"
  override val tax: Int = 200
}
