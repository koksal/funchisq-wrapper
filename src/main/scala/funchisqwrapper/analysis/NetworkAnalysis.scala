package funchisqwrapper.analysis

import funchisqwrapper.TimeSeriesTypes.DiscreteTimeSeries
import funchisqwrapper.analysis.FunChisqInterface.FunChisqScore

object NetworkAnalysis {

  def run(ts: DiscreteTimeSeries): Map[(String, String), FunChisqScore] = {
    // We only use profiles that were discretized into multiple levels.
    val profiles = ts.profiles filter { p => p.nbLevels > 1 }

    val scores = for {
      p1 <- profiles
      p2 <- profiles
      if p1.id != p2.id
    } yield {
      println(s"${p1.id} -> ${p2.id}")

      val contingencyTable = ContingencyTable.fromProfiles(p1, p2)
      val score = FunChisqInterface.funChisq(contingencyTable)

      (p1.id, p2.id) -> score
    }

    scores.toMap
  }

}
