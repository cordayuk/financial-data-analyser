package com.cordayuk.financialdataanalyser.api;

public enum ApiSource
{
    ALPHAVANTAGE( "https://www.alphavantage.co/query?" );

    private final String baseUrl;

    ApiSource( final String baseUrl )
    {
        this.baseUrl = baseUrl;
    }
}
