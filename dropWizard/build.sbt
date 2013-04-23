import AssemblyKeys._ // put this at the top of the file

name:="sbt-dropwizard-template"

resolvers ++= Seq(
   "Coda Hale repo" at "http://repo.codahale.com/",
   "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
 )

libraryDependencies ++= Seq(
  "javax.servlet" % "javax.servlet-api" % "3.0.1",
  "org.codehaus.jackson" % "jackson-mapper-asl" % "1.9.12",
  "com.yammer.dropwizard" % "dropwizard-core" % "0.6.2",
  "com.github.nhuray" % "dropwizard-spring" % "0.2",
  "org.springframework" % "spring-beans" % "3.1.2.RELEASE",
  "org.springframework" % "spring-context" % "3.2.1.RELEASE",
  "commons-lang" % "commons-lang" % "2.6"
)

ivyXML :=
  <dependency org="org.eclipse.jetty.orbit" name="javax.servlet" rev="3.0.0.v201112011016">
    <artifact name="javax.servlet" type="orbit" ext="jar"/>
  </dependency>

organization := "your.group.id"

version := "1.0-SNAPSHOT"

autoScalaLibrary := false

assemblySettings

assembleArtifact in packageScala := false

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)


