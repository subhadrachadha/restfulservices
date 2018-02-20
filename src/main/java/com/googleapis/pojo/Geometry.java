package com.googleapis.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"location",
"viewport"
})
public class Geometry {

@JsonProperty("location")
private Location location;
@JsonProperty("viewport")
private Viewport viewport;

@JsonProperty("location")
public Location getLocation() {
return location;
}

@JsonProperty("location")
public void setLocation(Location location) {
this.location = location;
}

@JsonProperty("viewport")
public Viewport getViewport() {
return viewport;
}

@JsonProperty("viewport")
public void setViewport(Viewport viewport) {
this.viewport = viewport;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("location", location).append("viewport", viewport).toString();
}
}
