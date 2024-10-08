package com.xworkz.funinterfaace;

import java.util.Random;
import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {
        Predicate<String> isEmpty = s -> s.isEmpty();

        BiPredicate<Integer, Integer> isSumGreaterThan = (a, b) -> (a + b) > 10;
        Function<Integer, String> intToString = i -> "Number: " + i;
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        Consumer<String> printString = s -> System.out.println(s);
        BiConsumer<String, Integer> printStringAndInt = (s, i) -> System.out.println(s + " " + i);
        Supplier<Double> randomSupplier = () -> Math.random();
        UnaryOperator<Integer> square = x -> x * x;
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        IntPredicate isPositive = x -> x > 0;
        LongPredicate isEven = x -> x % 2 == 0;
        DoublePredicate isNegative = x -> x < 0.0;
        IntConsumer printInt = x -> System.out.println(x);
        LongConsumer printLong = x -> System.out.println(x);
        DoubleConsumer printDouble = x -> System.out.println(x);
        LongFunction<String> longToString = x -> "Long: " + x;
        DoubleFunction<String> doubleToString = x -> "Double: " + x;
        ToIntBiFunction<String, String> sumLengths = (a, b) -> a.length() + b.length();
        ToLongBiFunction<String, String> computeHash = (a, b) -> (long)(a + b).hashCode();
        ToDoubleBiFunction<Integer, Integer> average = (a, b) -> (a + b) / 2.0;
        IntSupplier randomInt = () -> new Random().nextInt();
        LongSupplier currentTime = () -> System.currentTimeMillis();
        DoubleSupplier randomDouble = () -> Math.random();
        IntUnaryOperator increment = x -> x + 1;
        LongUnaryOperator negate = x -> -x;
        DoubleUnaryOperator sqrt = x -> Math.sqrt(x);
        IntBinaryOperator max = (a, b) -> Math.max(a, b);
        DoubleBinaryOperator power = (a, b) -> Math.pow(a, b);
        ToIntFunction<String> stringLength = s -> s.length();


    }
}
