package funchisqwrapper

object TimeSeriesTypes {
  case class ContinuousProfile(id: String, values: Seq[Double])
  case class DiscreteProfile(id: String, values: Seq[Int], nbLevels: Int)

  case class ContinuousTimeSeries(profiles: Seq[ContinuousProfile])
  case class DiscreteTimeSeries(profiles: Seq[DiscreteProfile])
}

