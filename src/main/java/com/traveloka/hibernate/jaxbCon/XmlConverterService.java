package com.traveloka.hibernate.jaxbCon;

import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlConverterService<REQ> {
  Class<REQ> reqClass;

  public XmlConverterService(Class<REQ> reqClass) {
    this.reqClass = reqClass;
  }

  public REQ convertToPojo(String s) {
    REQ res = null;
    try {
      JAXBContext jaxbContext = JAXBContext.newInstance(reqClass);

      Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

      res = (REQ) jaxbUnmarshaller.unmarshal(new StringReader(s));
      return res;
    } catch (JAXBException e) {
      e.printStackTrace();
    }
    return res;
  }

  private void convertToString(Object requestPayload) {
    String payload = "";
    try {
      JAXBContext jaxbContext = JAXBContext.newInstance(requestPayload.getClass());
      Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      jaxbMarshaller.marshal(requestPayload, bos);
      payload = bos.toString();
    } catch (JAXBException e) {
      System.out.println(String.format("Error in marshalling requestPayload [%s]", e));
    }
    System.out.println(String.format("value of payload %s", payload));
  }
}
