package com.vitvn183.demouploadfile;

import com.vitvn183.demouploadfile.test.Test;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@SpringBootApplication
public class DemoUploadFileApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoUploadFileApplication.class, args);
    }

}
