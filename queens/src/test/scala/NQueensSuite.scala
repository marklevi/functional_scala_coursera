import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class NQueensSuite extends FunSuite {

  test("acceptance test") {
    assert(NQueens.queens(4) == Set(List(1, 3, 0, 2), List(2, 0, 3, 1)))
  }
}
