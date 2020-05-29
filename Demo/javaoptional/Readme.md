### Java 8 Optional class

The purpose of the class is to provide a type-level solution for representing optional values instead of null references. - (_www.baeldung.com/java-optional_)

There are 3 optional objects that we can use:

#### 1. _empty()_

```java
    import java.util.Optional;

    public class OptionalDemo {
        public static void main(String[] args) {

            // 1. no values
            Optional<String> hello = Optional.empty(null);

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

            // 1. putting null inside bcs the method must include a values
            Optional<String> hello = Optional.of(null);

            // 2. with values
            Optional<String> hello2 = Optional.of("Hello World");

            // to check if there is a values inside the optional
            System.out.println(hello2.isEmpty());
            System.out.println(hello2.isPresent());

        }
    }
```

now the result we have is the opposite result from **empty()** method:

1. if we put null in the **of()** method, then the result will return error
   ![null](https://user-images.githubusercontent.com/60772041/83243959-e114f680-a1c8-11ea-8fea-f3ec0f384654.png)

2. with values (the **isEmpty()** return boolean _false_, meanwhile the **isPresent()** return boolean _true_)
   ![success](https://user-images.githubusercontent.com/60772041/83020566-d89aaf80-a052-11ea-9939-637832150001.png)

#### 3. _ofNullable()_

```java
    import java.util.Optional;

    public class OptionalDemo {
        public static void main(String[] args) {

            // 1. putting null inside bcs the method must include a values
            Optional<String> hello = Optional.ofNullable(null);

            // to check if there is a values inside the optional
            System.out.println("\n" + hello.isEmpty());
            System.out.println(hello.isPresent());

            // 2. with values
            Optional<String> hello2 = Optional.ofNullable("Hello World");

            // to check if there is a values inside the optional
            System.out.println("\n" + hello2.isEmpty());
            System.out.println(hello2.isPresent());

        }
    }
```

The result, both with null or a values, will not getting error message.
![successnull](https://user-images.githubusercontent.com/60772041/83244009-f5f18a00-a1c8-11ea-8425-3cb4f1d7a026.png)

Now we knew that **ofNullable()** works greatly with or without values (null). Also we can use **isPresentOrElse()** method to handle program that we're not sure about the presence of a values from input user. For instance:

```java
    import java.util.Optional;

    public class OptionalDemo {
        public static void main(String[] args) {

            // 1. with values input
            Optional<String> hello = Optional.ofNullable("hello world");

            // use isPresentOrElse() to handle null input and vice versa.
            System.out.print("\n1. ");
            hello.isPresentOrElse(present ->{
                System.out.println(present)
            }, () ->{
                System.out.println("hello UK")
            });

            // 2. null input
            Optional<String> hello2 = Optional.ofNullable(null);

            // use isPresentOrElse() to handle null input and vice versa.
            System.out.print("\n2. ");
            hello2.isPresentOrElse(present ->{
                System.out.println(present)
            }, () ->{
                System.out.println("hello UK")
            });
        }
    }
```

And the result is something like this...
![halak](https://user-images.githubusercontent.com/60772041/83246089-d314a500-a1cb-11ea-9267-24e5355f36c1.png)

Keep learning and stay hacking! :wink:
