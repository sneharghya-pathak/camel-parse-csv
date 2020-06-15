package com.pathaks.camel.camelparsecsv.Routes;

import org.apache.camel.builder.RouteBuilder;

public class MainRoute extends RouteBuilder{

    @Override
    public void configure() throws Exception {

        from("file:inbox?include=*.csv&doneFileName=${file:name.noext}.go")
        .to("direct:RouteToGetMessageType")
        .to("log:loggerName?showBody=true&showHeaders=true&showProperties=true");

    }
    
}