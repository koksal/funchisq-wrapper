package funchisqwrapper.analysis

import funchisqwrapper.TimeSeriesTypes.DiscreteProfile

object ContingencyTable {
  type ContingencyTable = Seq[Seq[Int]]

  def fromProfiles(
    p1: DiscreteProfile, p2: DiscreteProfile
  ): ContingencyTable = {
    val pairs = p1.values zip p2.values

    for (i <- 1 to p1.nbLevels) yield {
      for (j <- 1 to p2.nbLevels) yield {
        pairs.count(p => p._1 == i && p._2 == j)
      }
    }
  }
}
