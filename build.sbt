sbtPlugin := true

organization := "com.bicou.sbt"

name := "sbt-hbs"

scalaVersion := "2.12.4"

resolvers += Resolver.typesafeRepo("releases")

libraryDependencies ++= Seq(
  "org.webjars" % "mkdirp" % "0.5.0"
)

addSbtPlugin("com.typesafe.sbt" %% "sbt-js-engine" % "1.2.2")

publishMavenStyle := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

scriptedBufferLog := false

scriptedLaunchOpts += ("-Dproject.version=" + version.value )

