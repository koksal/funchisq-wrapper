val rscala = "org.ddahl" % "rscala_2.11" % "1.0.13"

lazy val commonSettings = Seq(
  version := "0.1.0",
  scalaVersion := "2.11.8"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "funchisq-wrapper",
    libraryDependencies += rscala
  )
