package com.spring.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
public class XmlParser {
    public static String getbasePackage(String xml){
        try{
            SAXReader saxReader = new SAXReader();
            InputStream resourceAsStream = XmlParser.class.getClassLoader().getResourceAsStream(xml);
            Document document = saxReader.read(resourceAsStream);
            Element rootElement = document.getRootElement();
            Element componentScan = rootElement.element("component-scan");
            Attribute attribute = componentScan.attribute("base-package");
            String basePackage = attribute.getText();
            return basePackage;
        } catch (DocumentException e) {
            e.printStackTrace();
        }finally {

        }
        return "";
    }
}
