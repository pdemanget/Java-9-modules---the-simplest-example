#!/usr/bin/env bash
printf 'Using JAVA_HOME=%s\n' $JAVA_HOME
$JAVA_HOME/bin/jlink --module-path mods/:$JAVA_HOME/jmods --add-modules pl.tfij.java9modules.app,pl.tfij.java9modules.greetings --output pl.tfij.java9modules.app-image
