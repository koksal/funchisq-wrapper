package funchisqwrapper.discretization

import org.scalatest.FunSuite

class CkmeansInterfaceTest extends FunSuite {

  test("Ckmeans should discretize an array of two values") {
    val xs = List(1.0, 2.0)
    assertResult(List(1, 2))(CkmeansInterface.ckmeans(xs))
  }

}
