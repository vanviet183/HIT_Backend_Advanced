package com.vitvn183.demouploadfile.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vitvn183.demouploadfile.model.DocumentObj;
import com.vitvn183.demouploadfile.model.Paragraph;
import com.vitvn183.demouploadfile.model.run.Run;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;
import org.json.JSONException;
import org.json.*;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void test() throws Exception {

        String sourceFile = "E:\\HIT_CLUB\\HIT_BackEnd_Advanced\\ReadFileDocx\\test - root.docx";

        File file = new File(sourceFile);
        WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(file);

        MainDocumentPart documentPart = wordMLPackage.getMainDocumentPart();

        System.out.println(wordMLPackage.getDocPropsExtendedPart().getContents().getPages());

//        ======= In ra json
        try {
            JSONObject json = XML.toJSONObject(documentPart.getXML());
            String jsonString = json.toString(4);

            System.out.println(jsonString);

            ObjectMapper mapper = new ObjectMapper();

            DocumentObj documentObj = mapper.readValue(jsonString, DocumentObj.class);
            List<Paragraph> paragraphs = documentObj.getDocumentProperties().getBody().getParagraphs();
            paragraphs.forEach(item -> {
                try {
                    System.out.println(item);


                } catch (Exception e) {
                    System.out.println("Loi");
                }
            });

        }catch (JSONException e) {
            // TODO: handle exception
            System.out.println(e.toString());
        }


//        for (Object obj : objects) {
//            System.out.println(obj);
//        }



//        ======== Get by card in XML

//
//        String xpathR = "//w:r";
//        List<Object> jaxbRNodes = documentPart.getJAXBNodesViaXPath(xpathR, false);

//        for (Object jaxbNode : jaxbPNodes){
//            final StringWriter stringWriter = new StringWriter();
//            TextUtils.extractText(jaxbNode, stringWriter);
//            final String paragraphString = stringWriter.toString();
//            System.out.println(paragraphString);

//            System.out.println(jaxbNode);
//            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
//            String json = ow.writeValueAsString(jaxbNode);
//            try {
//                System.out.println(json);
//            } catch (Exception e) {
//                System.out.println("Loi");
//            }


//            final String paragraphString = jaxbNode.toString();
//            System.out.println("[Start]:" + paragraphString);
//
//            PPr pPr = ((P) XmlUtils.unwrap(jaxbNode)).getPPr();
//            P p = (P) XmlUtils.unwrap(jaxbNode);
//
//            if(pPr.getRPr() != null) {
//                RPr rPr = ((R) XmlUtils.unwrap(jaxbNode)).getRPr();
//
//                System.out.println("co style");
//            }


        }

//        for (Object jaxbNode : jaxbRNodes){
////            final StringWriter stringWriter = new StringWriter();
////            TextUtils.extractText(jaxbNode, stringWriter);
////            final String paragraphString = stringWriter.toString();
////            System.out.println(paragraphString);
//
//            final String paragraphString = jaxbNode.toString();
//            System.out.println("[Start]:" + paragraphString);
//
//            RPr rPr = ((R) XmlUtils.unwrap(jaxbNode)).getRPr();
//            if(rPr.getStrike() != null) {
//                BooleanDefaultTrue rStyle = rPr.getStrike();
//                System.out.println("In dam");
//
//            }
//
//
//        }



//        System.out.println("Day la R");
//
//        String xpathR = "//w:r";
//        List<Object> jaxbNodes = documentPart.getJAXBNodesViaXPath(xpathR, false);
//
//        for (Object jaxbNode : jaxbNodes){
//            final StringWriter stringWriter = new StringWriter();
//            TextUtils.extractText(jaxbNode, stringWriter);
//            final String paragraphString = stringWriter.toString();
//            System.out.println(paragraphString);
//        }

//        Text ne
//        String textNodesXPath = "//w:t";
//        List<Object> textNodes = mainDocumentPart.getJAXBNodesViaXPath(textNodesXPath, true);
//
//        for (Object obj : textNodes) {
//            Text t = (Text) ((JAXBElement) obj).getValue();
//            String textValue = t.getValue();
//            System.out.println(textValue);
//        }

//        Request paragraphs
//        final String XPATH_TO_SELECT_TEXT_NODES = "//w:p";
//        final List<Object> jaxbNodes = wordMLPackage.getMainDocumentPart().getJAXBNodesViaXPath(XPATH_TO_SELECT_TEXT_NODES, true);

//        for (Object jaxbNode : jaxbNodes){
//            final String paragraphString = jaxbNode.toString();
//            System.out.println(paragraphString);
//
//        }


//        Get run
//        final String XPATH_R = "//w:r";
//        final List<Object> jaxbRunNodes = wordMLPackage.getMainDocumentPart().getJAXBNodesViaXPath(XPATH_R, true);
//
//        for (Object jaxbNode : jaxbRunNodes){
//            final String paragraphString = jaxbNode.toString();
//            System.out.println(paragraphString);
//        }

//        System.out.println("Body node ne");
//        MainDocumentPart documentPart = wordMLPackage.getMainDocumentPart();
//        org.docx4j.wml.Document wmlDocumentEl
//                = (org.docx4j.wml.Document) documentPart.getJaxbElement();
//        Body body = wmlDocumentEl.getBody();
//        System.out.println(body.getSectPr().);
//        System.out.println(body.getParent());
//
//        List<Object> contentNodes = body.getContent();
//        for (Object obj : contentNodes) {
//
//            System.out.println(obj.toString());
//        }

//    }

}
