package com.cordayuk.financialdataanalyser.api.parameters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TickerSymbolTest
{
    private TickerSymbol tickerSymbol;

    @BeforeEach
    void setUp()
    {
        tickerSymbol = new TickerSymbol( "TEST" );
    }

    /**
     * Tests that the parameter name is return correctly.
     */
    @Test
    void getParameterNameReturnsSymbol()
    {
        assertEquals( "symbol", tickerSymbol.getParameterName(), "parameter name was not correct" );
    }

    /**
     * Tests that the query string returned is valid.
     */
    @Test
    void getQueryReturnsAValidQueryString()
    {
        assertEquals( "symbol=Test", tickerSymbol.getQuery(), "The query string is not valid." );
    }
}