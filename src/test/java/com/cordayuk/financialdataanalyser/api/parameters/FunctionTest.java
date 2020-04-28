package com.cordayuk.financialdataanalyser.api.parameters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FunctionTest
{

    /**
     * Tests that the correct parameter name is returned.
     */
    @Test
    void getParameterName()
    {
        assertEquals( "function", Function.TIME_SERIES_DAILY.getParameterName(), "Function should return \"function\" as parameter " + "name" );
    }

    /**
     * Tests that the correct query string is generated for {@link Function#TIME_SERIES_DAILY}
     */
    @Test
    void getQueryShouldReturnTheCorrectStringForTimesSeriesDaily()
    {
        assertEquals( "function=TIME_SERIES_DAILY", Function.TIME_SERIES_DAILY.getQuery(), "A valid query String was " + "not generated" );
    }
}