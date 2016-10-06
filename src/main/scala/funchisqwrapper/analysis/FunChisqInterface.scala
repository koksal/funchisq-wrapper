package funchisqwrapper.analysis

import funchisqwrapper.analysis.ContingencyTable.ContingencyTable
import org.ddahl.rscala.RClient

object FunChisqInterface {

  case class FunChisqScore(statistic: Double, pValue: Double, estimate: Double)

  def funChisq(ct: ContingencyTable): FunChisqScore = {
    val R = RClient()
    R.eval("library(FunChisq)")

    R.set("ct", ct.map(_.toArray).toArray)
    R.eval("result <- fun.chisq.test(ct, method = \"normalized\")")

    FunChisqScore(
      R.evalD0("result$statistic"),
      R.evalD0("result$p.value"),
      R.evalD0("result$estimate")
    )
  }

}
