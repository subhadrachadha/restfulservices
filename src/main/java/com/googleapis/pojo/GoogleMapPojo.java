package com.googleapis.pojo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"html_attributions",
"results",
"status"
})
public class GoogleMapPojo {

@JsonProperty("html_attributions")
private List<Object> htmlAttributions = null;
@JsonProperty("results")
private List<Result> results = null;
@JsonProperty("status")
private String status;

@JsonProperty("html_attributions")
public List<Object> getHtmlAttributions() {
return htmlAttributions;
}

@JsonProperty("html_attributions")
public void setHtmlAttributions(List<Object> htmlAttributions) {
this.htmlAttributions = htmlAttributions;
}

@JsonProperty("results")
public List<Result> getResults() {
return results;
}

@JsonProperty("results")
public void setResults(List<Result> results) {
this.results = results;
}

@JsonProperty("status")
public String getStatus() {
return status;
}

@JsonProperty("status")
public void setStatus(String status) {
this.status = status;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("htmlAttributions", htmlAttributions).append("results", results).append("status", status).toString();
}

}