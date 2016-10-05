package funchisqwrapper.discretization

import funchisqwrapper.TimeSeriesTypes.{ContinuousTimeSeries, DiscreteProfile, DiscreteTimeSeries}

object Discretization {
  def discretize(timeSeries: ContinuousTimeSeries): DiscreteTimeSeries = {
    val discreteProfiles = timeSeries.profiles map { p =>
      val discreteValues = CkmeansInterface.ckmeans(p.values)
      val nbLevels = discreteValues.max - discreteValues.min + 1
      DiscreteProfile(p.id, discreteValues, nbLevels)
    }

    DiscreteTimeSeries(discreteProfiles)
  }
}
