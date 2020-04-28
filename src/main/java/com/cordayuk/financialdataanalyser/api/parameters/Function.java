package com.cordayuk.financialdataanalyser.api.parameters;

import com.cordayuk.financialdataanalyser.api.ApiParameter;

public enum Function implements ApiParameter
{
    TIME_SERIES_DAILY;

    @Override
    public String getParameterName()
    {
        return "function";
    }

    @Override
    public String getQuery()
    {
        return getParameterName() + "=" + this.name();
    }
}
