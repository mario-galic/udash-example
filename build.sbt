import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

val udashVersion = "0.8.0-RC8"
val udashJQueryVersion = "3.0.1"

lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "udash-example",
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies ++= Seq(
       scalaTest % Test,
      "io.udash" %%% "udash-core" % udashVersion,
      "io.udash" %%% "udash-bootstrap" % udashVersion,
    )
  )
