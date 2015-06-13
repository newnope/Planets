# Planets

## Editing

1. Clone this repo
2. Run 'gradlew eclipse'
3. Run eclipse and import repository folder as an existing project
3.1 To run project in eclipse you should add -Djava.library.path=build/natives/windows
    (or .../linux for linux) to JVM arguments in run configuration

## Building

1. Clone this repo
2. Run 'gradlew buildDistr'
3. You will find application in build\distributions folder

## Running

1. Build or download latest build from [build service](http://build.andrey96.ru/job/Planets/)
2. Unpack correct natives folder from Planets-build..-natives.zip (windows folder is for windows, etc)
3. Run 'java -Djava.library.path=windows -jar Planets-build...jar' (or use linux/osx instead of windows)