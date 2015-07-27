package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    def pascalRecurse(c: Int, r: Int): Int = {
      if (c == 0 || c == r) 1
      else pascalRecurse(c - 1, r - 1) + pascalRecurse(c, r - 1)
    }
    pascalRecurse(c, r)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balanceRecursively(count: Int, chars: List[Char]): Boolean = (count, chars) match {
      case (count, Nil) => count == 0
      case (-1, _) => false
      case (count, '(' :: tail) => balanceRecursively(count + 1, tail)
      case (count, ')' :: tail) => balanceRecursively(count - 1, tail)
      case (_, _ :: tail) => balanceRecursively(count, tail)
    }
    balanceRecursively(0, chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def countChangeRecursively(money: Int, coins: List[Int], counter: Int): Int = {
      if (money == 0) counter + 1
      else if (money < 0 || coins.isEmpty) counter
      else countChangeRecursively(money - coins.head, coins, counter) + countChangeRecursively(money, coins.tail, counter)
    }
    countChangeRecursively(money, coins, 0)
  }
}
