package com.cordayuk.financialdataanalyser.api.parameters;

import com.cordayuk.financialdataanalyser.api.ApiParameter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class TickerSymbol implements ApiParameter
{
    private static final String PARAMETER_NAME = "symbol";
    private final String ticker;

    public TickerSymbol( @NotEmpty @NotNull final String ticker )
    {
        this.ticker = ticker;
    }

    @Override
    public String getParameterName()
    {
        return PARAMETER_NAME;
    }

    @Override
    public String getQuery()
    {
        return PARAMETER_NAME + "=" + ticker;
    }
}
