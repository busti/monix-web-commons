import sbtcrossproject.CrossPlugin.autoImport.{crossProject, CrossType}

version := "0.1.0"

scalaVersion := "2.12.9"

val root = crossProject(JVMPlatform, JSPlatform)
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    libraryDependencies ++= Seq(
      "io.monix" %%% "monix" % "3.0.0-RC3"
    )
  )
