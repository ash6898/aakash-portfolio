```
Licensed to the Apache Software Foundation (ASF) under one or more
contributor license agreements. See the NOTICE file distributed with this
work for additional information regarding copyright ownership. The ASF
licenses this file to You under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance with the License.
You may obtain a copy of the License at
   http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
License for the specific language governing permissions and limitations under
the License.
```

-----

# Apache Sling Feature Model Launcher - 2007

## What is it?

  A application launcher using Apache Sling Features

## Licensing

  Please see the files called LICENSE and NOTICE

## Documentation

  The most up-to-date documentation can be found at https://sling.apache.org.

## Useful URLs

  Home Page:          https://sling.apache.org/
  Source Code:        https://github.com/apache/sling-org-apache-sling-feature-launcher.git
  Issue Tracking:     https://issues.apache.org/jira/browse/SLING

## System Requirements

### JDK

    8 or above. (see http://www.oracle.com/technetwork/java/)

### Memory

    No minimum requirement.

### Disk

    No minimum requirement.

###  Operating System

    No minimum requirement. On Windows, Windows NT and above or Cygwin is required for
    the startup scripts. Tested on Windows XP, Fedora Core and Mac OS X.

---

## Installation

### Windows 2000/XP

  1) Unzip the distribution archive, i.e. `org.apache.sling.feature.launcher-1.3.2.zip` to the directory you wish to install `Apache Sling Feature Model Launcher 1.3.2`.
These instructions assume you chose `C:\Program Files`.
The subdirectory `org.apache.sling.feature.launcher-1.3.2` will be created from the archive.

  2) Add the `SFA_HOME` environment variable by opening up the system properties (WinKey + Pause), selecting the "Advanced" tab, and the "Environment Variables" button, then adding the `SFA_HOME` variable in the user variables with the value `C:\Program Files\org.apache.sling.feature.launcher-1.3.2`.

  3) In the same dialog, add the SFA environment variable in the user variables with the value `%SFA_HOME%\bin`.

  4) In the same dialog, update/create the _Path_ environment variable in the user variables and prepend the value `%SFA%` to add `Apache Sling Feature Model Launcher` available in the command line.

  5) In the same dialog, make sure that `JAVA_HOME` exists in your user variables or in the system variables and it is set to the location of your JDK, e.g. `C:\Program Files\Java\1.8.0_152` and that `%JAVA_HOME%\bin` is in your _Path_ environment variable.

  6) Open a new command prompt (Winkey + R then type cmd) and run `sfa --version` to verify that it is correctly installed.

## Unix-based Operating Systems (Linux, Solaris and Mac OS X)

  1) Extract the distribution archive, i.e. `org.apache.sling.feature.launcher-1.3.2.tar.gz` to the directory you wish to install `Apache Sling Feature Model Launcher 1.3.2`.
These instructions assume you chose `/usr/local`.
The subdirectory `org.apache.sling.feature.launcher-1.3.2` will be created from the archive.

  2) In a command terminal, add the `SFA_HOME` environment variable, e.g.
        `export SFA_HOME=/usr/local/org.apache.sling.feature.launcher-1.3.2`.

  3) Add the `SFA` environment variable, e.g. `export SFA=$SFA_HOME/bin`.

  4) Add `SFA` environment variable to your path, e.g. `export PATH=$SFA:$PATH`.

  5) Make sure that `JAVA_HOME` is set to the location of your JDK, e.g. `export JAVA_HOME=/usr/java/1.8.0_152` and that `$JAVA_HOME/bin` is in your `PATH` environment variable.

  6) Run `sfa --version` to verify that it is correctly installed.

---

## Execution

  Open the shell and type `bin/launcher` to see the available commands

