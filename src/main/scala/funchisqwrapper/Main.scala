package funchisqwrapper

import java.io.File

import funchisqwrapper.discretization.Discretization
import funchisqwrapper.parsing.TimeSeriesParser
import org.ddahl.rscala.RClient

object Main {
  def main(args: Array[String]): Unit = {
    // read each profile
    val inputFile = new File(args(0))
    val continuousTimeSeries = TimeSeriesParser.parse(inputFile)

    // discretize each profile using ckmeans (also returns # levels)
    val discreteTimeSeries = Discretization.discretize(continuousTimeSeries)

    // for every pair of profiles
    //   create contingency table from pairs
    //   call funchisq with the contingency table

  }

  def test(): Unit = {
    val R = RClient()
    val side = R.evalS0("sample(c('heads', 'tails'), 1)")
    println(s"Your coin landed $side.")

    println("Import: " + R.eval("library(Ckmeans.1d.dp)", evalOnly = false))
    R.eval("a = 42")
    println("Value of a: " + R.eval("a", false))
  }
}
