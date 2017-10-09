import sbt._
import Keys._

object MultipleModuleProjectBuild extends Build {
    lazy val root = Project(id = "Darwin", base = file(".")) aggregate(LaScala)
    lazy val LaScala = Project(id = "LaScala", base = file("LaScala"))
}
