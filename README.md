# ldutils

This project is a repository for small utility pieces that I keep re-using. Initially cloned across from the "sandbox" project, but will grow as more common pieces show up.

## Usage

This is a simple JAR based library, just include the dependency and read the javadoc:

```xml
<dependency>
    <groupId>net.parttimepolymath</groupId>
    <artifactId>ldutils</artifactId>
    <version>1.3.2</version>
</dependency>
```

## Prerequisites
This was built with Java 21 and Maven 3.9.

It is assumed that Maven is in your execution path.

### settings.xml
The package is hosted in the GitHub maven repository, so you need to set up your settings.xml to be able to pull
the dependency from there. 

You can find out more at [Working with the Apache Maven registry](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry#authenticating-to-github-packages)

In essence though, you need to create a personal GitHub token as described at ....

Then you need to setup your `~.m2/settings.xml` something like this so that Maven can find and access the
repository that contains the dependency.

```xml
<?xml version="1.0" encoding="utf-8"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.1.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.1.0 http://maven.apache.org/xsd/settings-1.1.0.xsd">
  <!-- https://maven.apache.org/settings.html -->
  <activeProfiles>
    <activeProfile>github</activeProfile>
  </activeProfiles>

  <profiles>
    <profile>
      <id>github</id>
      <repositories>
        <repository>
          <id>central</id>
          <url>https://repo.maven.apache.org/maven2</url>
        </repository>
        <repository>
          <id>github</id>
          <url>https://maven.pkg.github.com/TheBellman/ldutils</url>
          <snapshots>
            <enabled>true</enabled>
          </snapshots>
        </repository>
      </repositories>
    </profile>
  </profiles>

  <servers>
    <server>
      <id>github</id>
      <username>YOUR_HANDLE</username>
      <password>YOUR_TOKEN</password>
    </server>
  </servers>

</settings>
```

## Test and Build

To locally build and test:

```shell
$ mvn clean package
.
.
.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.888 s
[INFO] Finished at: 2025-10-19T16:56:13+01:00
[INFO] ------------------------------------------------------------------------
```

## License
Copyright 2025 Little Dog Digital

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License.

You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.