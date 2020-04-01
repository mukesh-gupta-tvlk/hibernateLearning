package com.traveloka.hibernate.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeserializationService {

  @Autowired
  private CebuConverterService cebuConverterService;

  public Object deserialize(String content) {
////        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
//        Gson gson = new Gson();
//        Content con = gson.fromJson(content, Content.class);
//        try {
//            return cebuConverterService.getSpecKeyForCompare(con.getManageRetrieval());
//        }catch(Exception ex){
//            ex.printStackTrace();
//            System.out.println(ex.getMessage());
//        }
    return "Error Occure";
  }
}
