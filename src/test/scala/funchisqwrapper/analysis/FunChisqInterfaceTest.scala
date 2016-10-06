package funchisqwrapper.analysis

import funchisqwrapper.analysis.FunChisqInterface.FunChisqScore
import org.scalatest.FunSuite

class FunChisqInterfaceTest extends FunSuite {

  test("test FunChisq invocation") {
    val ct1 = Seq(
      Seq(5, 1, 1),
      Seq(1, 5, 0),
      Seq(5, 1, 1)
    )

    val ct2 = ct1.transpose

    val score1 = FunChisqInterface.funChisq(ct1)
    val score2 = FunChisqInterface.funChisq(ct2)

    // ct1 should have a higher statistic
    assert(score1.statistic > score2.statistic)
  }

}
