#Hexagonal Project Structure

```
.
├── api-rest
│   ├── src
│   │   └── main
│   │       ├── java
│   │       │   └── org
│   │       │       └── example
│   │       └── resources
│   └── target
│       ├── classes
│       │   └── org
│       │       └── example
│       ├── generated-sources
│       │   └── annotations
│       ├── maven-archiver
│       └── maven-status
│           └── maven-compiler-plugin
│               └── compile
│                   └── default-compile
├── application
│   ├── src
│   │   └── site
│   │       └── apt
│   └── target
│       └── maven-archiver
├── boot
│   ├── src
│   │   └── main
│   │       ├── java
│   │       │   └── org
│   │       │       └── example
│   │       └── resources
│   └── target
│       ├── classes
│       │   └── org
│       │       └── example
│       ├── generated-sources
│       │   └── annotations
│       ├── maven-archiver
│       └── maven-status
│           └── maven-compiler-plugin
│               └── compile
│                   └── default-compile
├── domain
│   ├── src
│   │   └── site
│   │       └── apt
│   └── target
│       └── maven-archiver
├── event
│   ├── src
│   │   └── site
│   │       └── apt
│   └── target
│       └── maven-archiver
├── infraestructure
│   ├── src
│   │   └── site
│   │       └── apt
│   └── target
│       └── maven-archiver
└── src
    ├── main
    │   └── java
    │       └── org
    │           └── example
    └── test
        └── java
            └── org
                └── example

69 directories
```