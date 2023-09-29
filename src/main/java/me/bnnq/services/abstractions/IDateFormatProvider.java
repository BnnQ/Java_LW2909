package me.bnnq.services.abstractions;

import java.time.format.DateTimeFormatter;

public interface IDateFormatProvider
{
    public DateTimeFormatter getFormatter();
    public String getPattern();
}
