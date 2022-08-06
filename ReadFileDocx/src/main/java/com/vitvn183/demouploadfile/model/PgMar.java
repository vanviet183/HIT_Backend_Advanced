package com.vitvn183.demouploadfile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PgMar {

    @JsonProperty("w:gutter")
    private String gutter;

    @JsonProperty("w:header")
    private String header;

    @JsonProperty("w:top")
    private String top;

    @JsonProperty("w:bottom")
    private String bottom;

    @JsonProperty("w:footer")
    private String footer;

    @JsonProperty("w:left")
    private String left;

    @JsonProperty("w:right")
    private String right;

}
