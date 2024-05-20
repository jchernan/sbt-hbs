sbtPlugin := true

organization := "com.andeno"

lazy val root = (project in file("."))
  .enablePlugins(SbtPlugin)
  .settings(
    name := "sbt-hbs",
    scriptedLaunchOpts := { scriptedLaunchOpts.value ++
      Seq("-Xmx1024M", "-Dplugin.version=" + version.value)
    },
    scriptedBufferLog := false
  )

scalaVersion := "2.12.19"

libraryDependencies ++= Seq(
  "org.webjars" % "mkdirp" % "0.5.0"
)

addSbtPlugin("com.github.sbt" %% "sbt-js-engine" % "1.3.6")

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
