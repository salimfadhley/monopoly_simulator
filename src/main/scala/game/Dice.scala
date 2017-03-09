package game

import scala.util.Random

/**
  * Created by salim on 3/9/2017.
  */
case class Dice(number: Int = 2, sides: Int = 6) {
  val r = new Random()
  val throws: Iterator[DiceResult] = Iterator.continually(diceThrow)

  def diceThrow: DiceResult = {
    val throws = (0 until number).map((_) => Random.nextInt(sides) + 1).toList
    DiceResult(throws.sum, throws.toSet.size == 1)
  }

  def throw3: Iterator[(DiceResult, Int)] = throws.take(3).zipWithIndex

}
