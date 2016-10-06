package funchisqwrapper

import java.io.File

import funchisqwrapper.analysis.NetworkAnalysis
import funchisqwrapper.discretization.Discretization
import funchisqwrapper.parsing.TimeSeriesParser

object Main {

  def main(args: Array[String]): Unit = {
    val inputFile = new File(args(0))

    val continuousTimeSeries = TimeSeriesParser.parse(inputFile)
    val discreteTimeSeries = Discretization.discretize(continuousTimeSeries)
    val scores = NetworkAnalysis.run(discreteTimeSeries)
    
    ResultPrinter.printScores(scores)
  }

}
