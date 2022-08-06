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
public class PgSz {

    @JsonProperty("w:h")
    private String h;

    @JsonProperty("w:w")
    private String w;
}
