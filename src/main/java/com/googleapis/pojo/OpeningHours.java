package com.googleapis.pojo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"open_now",
"weekday_text"
})
public class OpeningHours {

@JsonProperty("open_now")
private Boolean openNow;
@JsonProperty("weekday_text")
private List<Object> weekdayText = null;

@JsonProperty("open_now")
public Boolean getOpenNow() {
return openNow;
}

@JsonProperty("open_now")
public void setOpenNow(Boolean openNow) {
this.openNow = openNow;
}

@JsonProperty("weekday_text")
public List<Object> getWeekdayText() {
return weekdayText;
}

@JsonProperty("weekday_text")
public void setWeekdayText(List<Object> weekdayText) {
this.weekdayText = weekdayText;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("openNow", openNow).append("weekdayText", weekdayText).toString();
}

}