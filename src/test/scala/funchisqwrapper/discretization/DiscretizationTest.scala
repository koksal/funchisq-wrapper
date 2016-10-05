package funchisqwrapper.discretization

import funchisqwrapper.TimeSeriesTypes.{ContinuousProfile, ContinuousTimeSeries, DiscreteProfile, DiscreteTimeSeries}
import org.scalatest.FunSuite

class DiscretizationTest extends FunSuite {

  test("Discretize single value") {
    val ts = ContinuousTimeSeries(Seq(
      ContinuousProfile("A", List(1.0))
    ))

    val expected = DiscreteTimeSeries(Seq(
      DiscreteProfile("A", List(1), 1)
    ))

    assertResult(expected)(Discretization.discretize(ts))
  }

  test("Single profile with two values should be discretized") {
    val ts = ContinuousTimeSeries(Seq(
      ContinuousProfile("A", List(1.0, 2.0))
    ))

    val expected = DiscreteTimeSeries(Seq(
      DiscreteProfile("A", List(1, 2), 2)
    ))

    assertResult(expected)(Discretization.discretize(ts))
  }

}
