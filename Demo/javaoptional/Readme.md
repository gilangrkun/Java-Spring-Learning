### Java 8 Optional class

The purpose of the class is to provide a type-level solution for representing optional values instead of null references. - (_www.baeldung.com/java-optional_)

There are 3 optional objects that we can use:

1. empty()

```java
    import java.util.Optional;

    public class OptionalDemo {
        public static void main(String[] args) {

            // 1.
            Optional<String> hello = Optional.empty();

            // to check if there is a values inside the optional
            System.out.println(hello.isEmpty());
            System.out.println(hello.isPresent());

            // 2. If we put a values into an empty method, then the result will get error
            Optional<String> hello2 = Optional.empty("Hello World");

        }
    }
```

the result:

1.
![result](https://user-images.githubusercontent.com/60772041/83004582-07585c00-a03a-11ea-9b89-5b72a993301f.png)

2.
![error](https://user-images.githubusercontent.com/60772041/83004627-1939ff00-a03a-11ea-9b8a-7890016d8ad1.png)
