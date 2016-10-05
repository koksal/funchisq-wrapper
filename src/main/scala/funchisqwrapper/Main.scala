package funchisqwrapper

import org.ddahl.rscala.RClient

object Main {
  def main(args: Array[String]): Unit = {
    // read each profile
    // discretize each profile using ckmeans (also returns # levels)

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
