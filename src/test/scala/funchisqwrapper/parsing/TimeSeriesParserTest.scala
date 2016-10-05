package funchisqwrapper.parsing

import java.io.File

import funchisqwrapper.TimeSeriesTypes.ContinuousProfile
import funchisqwrapper.TimeSeriesTypes.ContinuousTimeSeries
import org.scalatest.FunSuite

class TimeSeriesParserTest extends FunSuite {

  test("Time series without missing data should be correctly parsed") {
    val url = getClass.getResource("/timeseries.tsv")
    val file = new File(url.getFile())
    val ts = TimeSeriesParser.parse(file)

    val expectedTs = ContinuousTimeSeries(Seq(
      ContinuousProfile("A", Seq(0, 1, 2)),
      ContinuousProfile("B", Seq(0, -1, 2)),
      ContinuousProfile("C", Seq(3.0, 2.0, 1))
    ))

    assertResult(expectedTs)(ts)
  }

}
