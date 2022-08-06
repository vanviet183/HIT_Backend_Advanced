package com.vitvn183.demouploadfile.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//@FieldDefaults(level = AccessLevel.PRIVATE)
public class DocumentProperties {

    @JsonProperty("xmlns:o")
    private String o;

    @JsonProperty("xmlns:w10")
    String w10;

    @JsonProperty("xmlns:r")
    String r;

    @JsonProperty("xmlns:odgm")
    String odgm;

    @JsonProperty("xmlns:w14")
    String w14;

    @JsonProperty("xmlns:w15")
    String w15;

    @JsonProperty("xmlns:w")
    String w;

    @JsonProperty("xmlns:v")
    String v;

    @JsonProperty("xmlns:wetp")
    String wetp;

    @JsonProperty("xmlns:we")
    String we;

    @JsonProperty("xmlns:xdr")
    String xdr;

    @JsonProperty("xmlns:a")
    String a;

    @JsonProperty("xmlns:c")
    String c;

    @JsonProperty("xmlns:sl")
    String sl;

    @JsonProperty("xmlns:wp")
    String wp;

    @JsonProperty("xmlns:b")
    String b;

    @JsonProperty("xmlns:dgm")
    String dgm;

    @JsonProperty("xmlns:pic")
    String pic;

    @JsonProperty("xmlns:mc")
    String mc;

    @JsonProperty("xmlns:cppr")
    String cppr;

    @JsonProperty("xmlns:xvml")
    String xvml;

    @JsonProperty("xmlns:dsp")
    String dsp;

    @JsonProperty("xmlns:m")
    String m;

    @JsonProperty("xmlns:odx")
    String odx;

    @JsonProperty("xmlns:pvml")
    String pvml;

    @JsonProperty("xmlns:odq")
    String odq;

    @JsonProperty("mc:Ignorable")
    String ignore;

    @JsonProperty("xmlns:cdr")
    String cdr;

    @JsonProperty("xmlns:wne")
    String wne;

    @JsonProperty("xmlns:odc")
    String odc;

    @JsonProperty("xmlns:odi")
    String odi;

    @JsonProperty("xmlns:w16se")
    String w16se;

    @JsonProperty("xmlns:comp")
    String comp;

    @JsonProperty("xmlns:oda")
    String oda;

    @JsonProperty("w:body")
    private Body body;

    @JsonProperty("xmlns:w16cid")
    String w16cid;

    @JsonProperty("xmlns:lc")
    String lc;

    @JsonProperty("xmlns:wp14")
    String wp14;
}
