### Java 8 Optional class

The purpose of the class is to provide a type-level solution for representing optional values instead of null references. - (_www.baeldung.com/java-optional_)

There are 3 optional objects that we can use:

#### 1. _empty()_

```java
    import java.util.Optional;

    public class OptionalDemo {
        public static void main(String[] args) {

            // 1. no values
            Optional<String> hello = Optional.empty();

            // to check if there is a values inside the optional
            System.out.println(hello.isEmpty());
            System.out.println(hello.isPresent());

            // 2. with values
            Optional<String> hello2 = Optional.empty("Hello World");

        }
    }
```

the result:

1. no values (we can see that the **isEmpty()** return boolean _true_, meanwhile the **isPresent()** return boolean _false_)
   ![result](https://user-images.githubusercontent.com/60772041/83004582-07585c00-a03a-11ea-9b89-5b72a993301f.png)

2. with values (if we put a values into an **empty()** method, then the result will return error)
   ![error](https://user-images.githubusercontent.com/60772041/83004627-1939ff00-a03a-11ea-9b8a-7890016d8ad1.png)

#### 2. _of()_

```java
    import java.util.Optional;

    public class OptionalDemo {
        public static void main(String[] args) {

            // 1. no values
            Optional<String> hello = Optional.of();

            // 2. with values
            Optional<String> hello2 = Optional.empty("Hello World");

            // to check if there is a values inside the optional
            System.out.println(hello2.isEmpty());
            System.out.println(hello2.isPresent());

        }
    }
```

now the result we have is the opposite result from **empty()** method:

1. no values (if we put no values in the **of()** method, then the result will return error)
   ![null](https://user-images.githubusercontent.com/60772041/83019948-fca9c100-a051-11ea-8a9e-3d99771e94bf.png)

2. with values (the **isEmpty()** return boolean _false_, meanwhile the **isPresent()** return boolean _true_)
   ![success](https://user-images.githubusercontent.com/60772041/83020566-d89aaf80-a052-11ea-9939-637832150001.png)
