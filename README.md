# Dropwizard + Gradle = &hearts;

[![Build Status](https://travis-ci.org/kishaningithub/dropwizard-gradle.svg?branch=master)](https://travis-ci.org/kishaningithub/dropwizard-gradle)

Minimal example of getting Dropwizard going with Gradle.

# Dropwizard version
1.0.5

# Build

Run `./gradlew clean oneJar`. The resulting JAR will be saved as `./build/libs/dropwizard-gradle-<<version>>-standalone.jar`.

This example is using the [Gradle OneJar Plugin](https://github.com/rholder/gradle-one-jar) which will create
a JAR file of the project including all dependencies, similar to the [Maven Assembly Plugin](http://maven.apache.org/plugins/maven-assembly-plugin/)
or the [Maven Shade Plugin](http://maven.apache.org/plugins/maven-shade-plugin/).


# Run

`java -jar build/libs/dropwizard-gradle-<<version>>-standalone.jar server`