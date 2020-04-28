package com.cordayuk.financialdataanalyser.api;

import java.util.Arrays;
import java.util.List;

public class ApiQuery
{
    private final ApiSource apiSource;
    private final List<ApiParameter> apiParameters;

    public ApiQuery( final ApiSource apiSource, final ApiParameter... apiParameters )
    {
        this.apiSource = apiSource;
        this.apiParameters = Arrays.asList( apiParameters );
    }

    public String getApiQueryUrl()
    {
        return null;
    }
}
