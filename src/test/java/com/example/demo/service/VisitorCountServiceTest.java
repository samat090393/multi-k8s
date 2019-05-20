package com.example.demo.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class VisitorCountServiceTest {

    @InjectMocks
    private VisitorCountService underTest;

    @Test
    public void test_addShouldReturnValidNumber() {
        // GIVEN
        int a = 4;
        int b = 5;

        // EXPECTED
        int expected = 10;

        // RESULT
        Assert.assertEquals(expected, underTest.add(a, b));
    }
}