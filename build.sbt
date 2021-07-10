import sbt._
import Keys._

name := """eth-propeller-scala"""

organization := "org.adridadou"

licenses += ("Apache-2.0", url("http://opensource.org/licenses/Apache-2.0"))

scalaVersion := "2.12.8"

githubOwner := "openlawteam"

githubRepository := "eth-propeller-scala"

githubTokenSource := TokenSource.GitConfig("github.token")

// credentials +=
//   Credentials(
//     "GitHub Package Registry",
//     "maven.pkg.github.com",
//     TokenSource.GitConfig("github.username"),
//     TokenSource.GitConfig("github.token"))

resolvers ++= Seq(
  "Github Packages" at "https://maven.pkg.github.com/openlawteam/eth-propeller-core",
  // "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository",
  "java-ipfs-api-mvn-repo" at "https://raw.github.com/pascr/java-ipfs-api/mvn-repo/",
  )

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "org.adridadou" % "eth-propeller-core" % "0.59-SNAPSHOT",
  "io.reactivex" %% "rxscala" % "0.26.5",
  "org.scala-lang.modules" %% "scala-java8-compat" % "0.8.0",
  //Test libs
  "org.scalatest" %% "scalatest" % "3.2.0-SNAP5" % "test",
  "org.scalacheck" %% "scalacheck" % "1.13.5" % "test"
)

fork in run := true
releaseCrossBuild := true
releaseIgnoreUntrackedFiles := true
crossScalaVersions := Seq("2.11.8", "2.12.7")