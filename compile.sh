#!/usr/bin/env bash
$JAVA_HOME/bin/javac -d build --module-source-path src $(find src -name "*.java")
