package com.silverpine.uu.test.core;

import android.os.Parcel;
import android.os.Parcelable;

import org.junit.Assert;

abstract public class UUParcelableBaseTest<T extends Parcelable>
{
    protected void doTest(T obj)
    {
        Assert.assertNotNull(obj);

        T copy = makeParcelableCopy(obj, getParcelableCreator());
        Assert.assertNotNull(copy);
        assertEquals(obj, copy);
    }

    private <T extends Parcelable> T makeParcelableCopy(T obj, Parcelable.Creator<T> creator)
    {
        Assert.assertNotNull(obj);
        Assert.assertNotNull(creator);

        Parcel p = Parcel.obtain();
        obj.writeToParcel(p, 0);

        p.setDataPosition(0);

        T result =  creator.createFromParcel(p);
        Assert.assertNotNull(result);

        return result;
    }

    protected abstract Parcelable.Creator<T> getParcelableCreator();
    protected abstract void assertEquals(T lhs, T rhs);
}
