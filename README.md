# ldutils

This project is a repository for small utility pieces that I keep re-using. Initially cloned across from the "sandbox" project, but will grow as more common pieces show up.

## Usage

This is a simple JAR based library, just include the dependency and read the javadoc:

```xml
<dependency>
  <groupId>net.parttimepolymath</groupId>
  <artifactId>ldutils</artifactId>
  <version>1.1-20250831.161459</version>
</dependency>
```

## Prerequisites
This was built with Java 21 and Maven 3.9.

It is assumed that Maven is in your execution path.

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
[INFO] Total time:  9.456 s
[INFO] Finished at: 2021-03-07T14:15:41Z
[INFO] ------------------------------------------------------------------------
```

## License
Copyright 2025 Little Dog Digital

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.

You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.