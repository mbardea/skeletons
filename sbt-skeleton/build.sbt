name := "skeleton"

version := "1.0"

scalaVersion := "2.11.6"

resolvers ++= DefaultOptions.resolvers(snapshot = true)

resolvers += Resolver.typesafeRepo("releases")

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-async" % "0.9.2"
)

mainClass in (Compile, run) := Some("Skeleton")
