package com.pathaks.camel.camelparsecsv.Routes;

import org.apache.camel.builder.RouteBuilder;

public class RouteToGetMessageType extends RouteBuilder{

    @Override
    public void configure() throws Exception {
        from("direct:RouteToGetMessageType")
        .marshal().csv()
        .to("log:loggerName?showBody=true&showHeaders=true&showProperties=true");
    }
    
}