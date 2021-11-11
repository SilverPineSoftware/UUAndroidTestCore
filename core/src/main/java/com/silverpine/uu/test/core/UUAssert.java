package com.silverpine.uu.test.core;

import org.junit.Assert;

public class UUAssert
{
    public static void assertSameNullness(Object lhs, Object rhs)
    {
        Assert.assertTrue(areSameNullness(lhs, rhs));
    }

    public static boolean areSameNullness(Object lhs, Object rhs)
    {
        return ((lhs == null && rhs == null) || (lhs != null && rhs != null));
    }
}
