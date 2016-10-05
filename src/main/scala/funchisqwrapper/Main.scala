package funchisqwrapper

import java.io.File

import funchisqwrapper.discretization.Discretization
import funchisqwrapper.parsing.TimeSeriesParser

object Main {

  def main(args: Array[String]): Unit = {
    val inputFile = new File(args(0))
    val continuousTimeSeries = TimeSeriesParser.parse(inputFile)

    val discreteTimeSeries = Discretization.discretize(continuousTimeSeries)

    // If a profile has only 1 level, discard it

    // for every pair of profiles
    //   create contingency table from pairs
    //   call funchisq with the contingency table

  }

}
