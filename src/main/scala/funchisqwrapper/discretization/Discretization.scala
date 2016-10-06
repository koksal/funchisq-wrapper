package funchisqwrapper.discretization

import funchisqwrapper.TimeSeriesTypes.{ContinuousTimeSeries, DiscreteProfile, DiscreteTimeSeries}

object Discretization {
  def discretize(timeSeries: ContinuousTimeSeries): DiscreteTimeSeries = {
    println(s"Profiles to discretize: ${timeSeries.profiles.size}")
    val discreteProfiles = timeSeries.profiles map { p =>
      print(".")
      val discreteValues = CkmeansInterface.ckmeans(p.values)
      val nbLevels = discreteValues.max - discreteValues.min + 1
      DiscreteProfile(p.id, discreteValues, nbLevels)
    }

    DiscreteTimeSeries(discreteProfiles)
  }
}
