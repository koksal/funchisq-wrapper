val rscala = "org.ddahl" % "rscala_2.11" % "1.0.13"
val scalaCsv = "com.github.tototoshi" %% "scala-csv" % "1.3.3"

lazy val commonSettings = Seq(
  version := "0.1.0",
  scalaVersion := "2.11.8"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "funchisq-wrapper",
    libraryDependencies ++= Seq(rscala, scalaCsv)
  )
