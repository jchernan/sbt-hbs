resolvers += Resolver.sbtPluginRepo("releases")

libraryDependencies ++= Seq(
  "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
)

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.7")

