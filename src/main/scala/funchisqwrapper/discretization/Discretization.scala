package funchisqwrapper.discretization

import funchisqwrapper.TimeSeriesTypes.{ContinuousTimeSeries, DiscreteProfile, DiscreteTimeSeries}

object Discretization {
  def discretize(timeSeries: ContinuousTimeSeries): DiscreteTimeSeries = {
    val discreteProfiles = timeSeries.profiles map { p =>
      val discreteValues = CkmeansInterface.ckmeans(p.values)
      DiscreteProfile(p.id, discreteValues, 1)
    }

    DiscreteTimeSeries(discreteProfiles)
  }
}
