import sbt.CrossVersion
import sbt.stringToOrganization

object Dependencies extends Dependencies

trait Dependencies {

  object v {
    val scalaVersion     = "3.3.1"
    val akkaVersion      = "2.8.5"
    val scalatestVersion = "3.2.17"
    val chocoVersion     = "4.10.13"
    val guavaVersion     = "32.1.2-jre"
    val emfcommonVersion = "2.29.0"
    val emfecoreVersion  = "2.35.0"
    val umlVersion       = "3.1.0.v201006071150"
    val jvm              = "1.8"
  }

  val coreDependencies = Seq(
    "com.typesafe.akka" %% "akka-actor"             % v.akkaVersion,
    "com.google.guava"   % "guava"                  % v.guavaVersion,
    "org.choco-solver"   % "choco-solver"           % v.chocoVersion,
    "org.eclipse.emf"    % "org.eclipse.emf.common" % v.emfcommonVersion,
    "org.eclipse.emf"    % "org.eclipse.emf.ecore"  % v.emfecoreVersion,
    "org.eclipse.uml2"   % "org.eclipse.uml2.uml"   % v.umlVersion
  )

  val coreDependenciesOverrides = Seq(
    "org.eclipse.emf" % "org.eclipse.emf.common" % v.emfcommonVersion,
    "org.eclipse.emf" % "org.eclipse.emf.ecore"  % v.emfecoreVersion
  )

  val testDependencies = Seq(
    "org.scalatest" %% "scalatest"                % v.scalatestVersion % "test",
    "org.scalatest" %% "scalatest-core"           % v.scalatestVersion % "test",
    "org.scalatest" %% "scalatest-shouldmatchers" % v.scalatestVersion % "test"
  )

}
