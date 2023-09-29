package me.bnnq.services;

import me.bnnq.services.abstractions.IDateFormatProvider;

import java.time.format.DateTimeFormatter;

public class EuropeanDateFormatProvider implements IDateFormatProvider
{
    private final String pattern = "dd.MM.yyyy";

    @Override
    public DateTimeFormatter getFormatter()
    {
        return DateTimeFormatter.ofPattern(pattern);
    }

    @Override
    public String getPattern()
    {
        return pattern;
    }
}
