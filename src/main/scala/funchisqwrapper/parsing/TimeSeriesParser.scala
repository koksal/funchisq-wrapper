package funchisqwrapper.parsing

import java.io.File

import com.github.tototoshi.csv.{CSVReader, TSVFormat}
import funchisqwrapper.TimeSeriesTypes.{ContinuousProfile, ContinuousTimeSeries}

object TimeSeriesParser {
  private val ID_LABEL = "id"

  def parse(f: File): ContinuousTimeSeries = {
    val format = new TSVFormat {}
    val reader = CSVReader.open(f)(format)
    val (headers, rows) = reader.allWithOrderedHeaders()

    assert(headers.size > 1)
    assert(headers.head == ID_LABEL)

    val labels = headers.tail

    val profiles = rows map { row =>
      val id = row(ID_LABEL)
      val values = labels map { l => row(l).toDouble }
      ContinuousProfile(id, values)
    }

    ContinuousTimeSeries(profiles)
  }
}
