organization := "ee.technion"

version := "1.0"

name := "templateAccelertorProj"

scalaVersion := "2.12.4"

lazy val chipyard = (project in file(".")).settings(commonSettings).dependsOn(testchipip, templateAcceleratorProj)
