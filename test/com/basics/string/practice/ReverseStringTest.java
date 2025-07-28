package com.basics.string.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reversesCharArrayWithMultipleElements() {
        ReverseString rs = new ReverseString();
        char[] input = {'a', 'b', 'c', 'd'};
        char[] expected = {'d', 'c', 'b', 'a'};
        assertArrayEquals(expected, rs.reverTest(input));
    }

    @Test
    void returnsEmptyArrayWhenInputIsEmpty() {
        ReverseString rs = new ReverseString();
        char[] input = {};
        char[] expected = {};
        assertArrayEquals(expected, rs.reverTest(input));
    }

    @Test
    void returnsSameArrayWhenSingleElement() {
        ReverseString rs = new ReverseString();
        char[] input = {'x'};
        char[] expected = {'x'};
        assertArrayEquals(expected, rs.reverTest(input));
    }

    @Test
    void reversesCharArrayWithEvenNumberOfElements() {
        ReverseString rs = new ReverseString();
        char[] input = {'w', 'x', 'y', 'z'};
        char[] expected = {'z', 'y', 'x', 'w'};
        assertArrayEquals(expected, rs.reverTest(input));
    }

    @Test
    void reversesCharArrayWithSpecialCharacters() {
        ReverseString rs = new ReverseString();
        char[] input = {'!', '@', '#', '$'};
        char[] expected = {'$', '#', '@', '!'};
        assertArrayEquals(expected, rs.reverTest(input));
    }

}