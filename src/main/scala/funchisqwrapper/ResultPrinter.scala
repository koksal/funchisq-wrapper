package funchisqwrapper

import funchisqwrapper.analysis.FunChisqInterface.FunChisqScore

object ResultPrinter {

  def printScores(scores: Map[(String, String), FunChisqScore]): Unit = {
    for (((id1, id2), score) <- scores) {
      println(s"$id1\t$id2\t${score.statistic}\t${score.pValue}")
    }
  }

}
