package com.silverpine.uu.test.core;

import java.security.SecureRandom;

public class UUTestData
{
    private static final SecureRandom rand = new SecureRandom();

    public static byte[] randomBytes(int size)
    {
        byte[] tmp = new byte[size];
        rand.nextBytes(tmp);
        return tmp;
    }

    public static int randomByte()
    {
        return rand.nextInt() & 0xFF;
    }

    public static int randomShort()
    {
        return rand.nextInt() & 0xFFFF;
    }

    public static int randomInt()
    {
        return rand.nextInt();
    }

    public static int randomNibble()
    {
        return (randomByte() & 0x0F);
    }

    public static boolean randomBoolean()
    {
        return ((randomInt() % 2) == 0);
    }

    public static char randomChar()
    {
        return (char)randomByte();
    }

    public static String randomString(final int length)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++)
        {
            sb.append(randomChar());
        }

        return sb.toString();
    }
}
