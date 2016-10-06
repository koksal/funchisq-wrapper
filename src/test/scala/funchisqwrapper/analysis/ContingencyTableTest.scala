package funchisqwrapper.analysis

import funchisqwrapper.TimeSeriesTypes.DiscreteProfile
import org.scalatest.FunSuite

class ContingencyTableTest extends FunSuite {

  test("construct table from profiles") {
    val p1 = DiscreteProfile("A", List(1, 1, 2, 2), 2)
    val p2 = DiscreteProfile("B", List(1, 1, 1, 3), 3)
    val t = ContingencyTable.fromProfiles(p1, p2)

    val expected = Seq(
      Seq(2, 0, 0),
      Seq(1, 0, 1)
    )

    assertResult(expected)(t)
  }
}
