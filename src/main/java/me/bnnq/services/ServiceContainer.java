package me.bnnq.services;

import me.bnnq.services.abstractions.IDateFormatProvider;

public class ServiceContainer
{
    public static IDateFormatProvider getDateFormatProvider()
    {
        return new EuropeanDateFormatProvider();
    }
}
