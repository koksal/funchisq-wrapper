package funchisqwrapper.analysis

import funchisqwrapper.TimeSeriesTypes.DiscreteTimeSeries

object NetworkAnalysis {

  def run(ts: DiscreteTimeSeries) = {
    // We only use profiles that were discretized into multiple levels.
    val profiles = ts.profiles filter { p => p.nbLevels > 1 }

    for {
      p1 <- profiles
      p2 <- profiles
      if p1.id != p2.id
    } {
      // TODO make contingency table from profiles, call funchisq

    }

  }

}
