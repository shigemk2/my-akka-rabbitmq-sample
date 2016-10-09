name := """my-akka-rabbitmq-sample"""

version := "1.0"

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.10",
  "com.github.sstone" %% "amqp-client" % "1.5",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

// libraryDependencies += "com.github.sstone" % "amqp-client_2.10" % "1.5"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

