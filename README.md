# junit5sample

In order to run group specific group with and operation, just invoke below command.

``` 
mvn clean test -Dgroups="E2E & Regression" 
mvn clean test -Dgroups="E2E | Regression"
mvn clean test -Dgroups="Android & ~Regression"
```
