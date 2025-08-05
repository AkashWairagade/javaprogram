package com.basics.string.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CommonPrefixTest {

    @Test
    void returnsCommonPrefixForTypicalInput() {
        String[] input = {"flower", "flow", "flo"};
        String expected = "flo";
        Assertions.assertEquals(expected, CommonPrefix.longestCommonPrefix(input));
    }

    @Test
    void returnsEmptyStringWhenNoCommonPrefix() {
        String[] input = {"dog", "racecar", "car"};
        String expected = "";
        Assertions.assertEquals(expected, CommonPrefix.longestCommonPrefix(input));
    }

    @Test
    void returnsWholeStringWhenAllElementsAreSame() {
        String[] input = {"test", "test", "test"};
        String expected = "test";
        Assertions.assertEquals(expected, CommonPrefix.longestCommonPrefix(input));
    }

    @Test
    void returnsEmptyStringForEmptyArray() {
        String[] input = {};
        String expected = "";
        Assertions.assertEquals(expected, CommonPrefix.longestCommonPrefix(input));
    }

    @Test
    void returnsEmptyStringWhenOneElementIsEmpty() {
        String[] input = {"abc", ""};
        String expected = "";
        Assertions.assertEquals(expected, CommonPrefix.longestCommonPrefix(input));
    }

    @Test
    void returnsPrefixWhenSomeStringsAreShorter() {
        String[] input = {"ab", "abc", "abcd"};
        String expected = "ab";
        Assertions.assertEquals(expected, CommonPrefix.longestCommonPrefix(input));
    }

    @Test
    void returnsWholeStringWhenOnlyOneElement() {
        String[] input = {"single"};
        String expected = "single";
        Assertions.assertEquals(expected, CommonPrefix.longestCommonPrefix(input));
    }
}