package com.traveloka.hibernate.jaxbCon;

import com.traveloka.hibernate.model.pg.employeeModel.Employee;
import com.traveloka.hibernate.model.pg.rqrs.SearchFlightEnvelopeRS;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


@RestController()
public class JaxBController {

  @GetMapping("/employee")
  public ResponseEntity<Employee> doConvert() {
    String xmlString = "<employee><department> <id>101</id><name>IT</name></department><firstName>Lokesh</firstName><id>1</id><lastName>Gupta</lastName></employee>";
    XmlConverterService<Employee> xmlConverterService = new XmlConverterService<>(Employee.class);
    Employee emp = xmlConverterService.convertToPojo(xmlString);
    return ResponseEntity.ok().body(emp);
  }

  @PostMapping("/convert")
  public ResponseEntity<Object> doSusiPaymentConvert() throws IOException {
    XmlConverterService<SearchFlightEnvelopeRS> xmlConverterService = new XmlConverterService<>(
        SearchFlightEnvelopeRS.class);
    Resource resource = new ClassPathResource("test.txt");
    InputStream inputStream = resource.getInputStream();
    byte[] bdata = FileCopyUtils.copyToByteArray(inputStream);
    String xmlString = new String(bdata, StandardCharsets.UTF_8);
    //String xmlString = new String(Files.readAllBytes(Paths.get("test.xml")));
        SearchFlightEnvelopeRS envelope = xmlConverterService.convertToPojo(xmlString);
    //String internalStringXMl = envelope.getAddPaymentBodyRS().getAddPaymentResponseRS().getPaymentResult();
    return ResponseEntity.ok().body(envelope);
  }
}
