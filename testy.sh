#!/usr/bin/env bash

mvn package

java -jar target/scannerdemo-0.1.jar loginAsMentorAndExit > output1
java -jar target/scannerdemo-0.1.jar loginAsMentorAndExit > output2
java -jar target/scannerdemo-0.1.jar loginAsMentorAndExit > output3