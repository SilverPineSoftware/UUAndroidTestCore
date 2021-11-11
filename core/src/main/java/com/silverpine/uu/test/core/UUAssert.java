package com.silverpine.uu.test.core;

import org.junit.Assert;

public class UUAssert
{
    static void assertSameNullness(Object lhs, Object rhs)
    {
        Assert.assertTrue(areSameNullness(lhs, rhs));
    }

    static boolean areSameNullness(Object lhs, Object rhs)
    {
        return ((lhs == null && rhs == null) || (lhs != null && rhs != null));
    }
}
