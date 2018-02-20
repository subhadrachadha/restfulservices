package com.googleapis.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"northeast",
"southwest"
})
public class Viewport {

@JsonProperty("northeast")
private Northeast northeast;
@JsonProperty("southwest")
private Southwest southwest;

@JsonProperty("northeast")
public Northeast getNortheast() {
return northeast;
}

@JsonProperty("northeast")
public void setNortheast(Northeast northeast) {
this.northeast = northeast;
}

@JsonProperty("southwest")
public Southwest getSouthwest() {
return southwest;
}

@JsonProperty("southwest")
public void setSouthwest(Southwest southwest) {
this.southwest = southwest;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("northeast", northeast).append("southwest", southwest).toString();
}

}

