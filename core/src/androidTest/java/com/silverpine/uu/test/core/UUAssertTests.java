package com.silverpine.uu.test.core;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UUAssertTests
{
    // Let's test the test methods!
    @Test
    public void test_areSameNullness()
    {
        // noinspection ConstantConditions
        Assert.assertTrue(UUAssert.areSameNullness(null, null));

        // noinspection ConstantConditions
        Assert.assertTrue(UUAssert.areSameNullness("foo", "bar"));

        // noinspection ConstantConditions
        Assert.assertFalse(UUAssert.areSameNullness(null, 1L));

        // noinspection ConstantConditions
        Assert.assertFalse(UUAssert.areSameNullness(2L, null));
    }
}
