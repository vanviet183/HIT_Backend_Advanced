package com.vitvn183.demouploadfile.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TRun {

    @JsonProperty("xml:space")
    private String space;

    @JsonProperty("content")
    private String content;
}
