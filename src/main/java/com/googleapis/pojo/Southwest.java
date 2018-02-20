package com.googleapis.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"lat",
"lng"
})
public class Southwest {

@JsonProperty("lat")
private Double lat;
@JsonProperty("lng")
private Double lng;

@JsonProperty("lat")
public Double getLat() {
return lat;
}

@JsonProperty("lat")
public void setLat(Double lat) {
this.lat = lat;
}

@JsonProperty("lng")
public Double getLng() {
return lng;
}

@JsonProperty("lng")
public void setLng(Double lng) {
this.lng = lng;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("lat", lat).append("lng", lng).toString();
}

}