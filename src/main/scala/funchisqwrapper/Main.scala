package funchisqwrapper

import java.io.File

import funchisqwrapper.analysis.NetworkAnalysis
import funchisqwrapper.discretization.Discretization
import funchisqwrapper.parsing.TimeSeriesParser

object Main {

  def main(args: Array[String]): Unit = {
    val inputFile = new File(args(0))

    println("Parsing time series.")
    val continuousTimeSeries = TimeSeriesParser.parse(inputFile)

    println("Discretizing time series.")
    val discreteTimeSeries = Discretization.discretize(continuousTimeSeries)

    println("Computing scores.")
    val scores = NetworkAnalysis.run(discreteTimeSeries)

    ResultPrinter.printScores(scores)
  }

}
