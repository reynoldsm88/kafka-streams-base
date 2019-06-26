import sbt._

object Dependencies {

    val slf4jVersion = "1.7.20"
    val logbackVersion = "1.2.3"
    val scalaTestVersion = "3.0.5"
    val betterFilesVersion = "3.8.0"
    val scoptVersion = "4.0.0-RC2"
    val kafkaVersion = "2.2.1"
    val embeddedKafkaVersion = "2.2.0"
    val jacksonVersion = "2.9.9"


    val slf4j = Seq( "org.slf4j" % "slf4j-api" % slf4jVersion )

    val logback = Seq( "ch.qos.logback" % "logback-classic" % logbackVersion )

    val scalaTest = Seq( "org.scalatest" %% "scalatest" % scalaTestVersion % "test" )

    val scopt = Seq( "com.github.scopt" %% "scopt" % scoptVersion )

    val betterFiles = Seq( "com.github.pathikrit" %% "better-files" % betterFilesVersion )

    val kafka = Seq( "org.apache.kafka" %% "kafka" % kafkaVersion,
                     "org.apache.kafka" % "kafka-clients" % kafkaVersion,
                     "org.apache.kafka" % "kafka-streams" % kafkaVersion,
                     "org.apache.kafka" %% "kafka-streams-scala" % kafkaVersion )

    val embeddedKafka = Seq( "io.github.embeddedkafka" %% "embedded-kafka" % embeddedKafkaVersion % "test",
                             "io.github.embeddedkafka" %% "embedded-kafka-streams" % embeddedKafkaVersion % "test",
                             "jakarta.ws.rs" % "jakarta.ws.rs-api" % "2.1.2" % "test" ) //https://github.com/sbt/sbt/issues/3618

}
