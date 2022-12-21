``` bash
./gradlew build
```
``` bash
docker run -v $(pwd):/fuzzing cifuzz/jazzer --cp=build/libs/jazzer-docker-example-1.0-SNAPSHOT.jar --target_class=com.example.FuzzTestCase
```
``` bash
./gradlew clean build -x test 
```

``` bash
./gradlew build testClasses -x test
```

``` bash
cifuzz init
```

``` bash
cifuzz create java -o <filepath.ClassName.java>
```

``` bash
cifuzz run com.example.FuzzTestCase
```

``` bash
cifuzz coverage com.example.FuzzTestCase
```

``` bash 
cifuzz run com.example.FuzzTestCoverageDemo
```

``` bash
cifuzz findings <name>
```

``` bash
cifuzz run com.example.FastJsonFuzzer
```