package fghjkl;

import com.tyss.optimize.common.util.CommonConstants;
import com.tyss.optimize.nlp.util.Nlp;
import com.tyss.optimize.nlp.util.NlpException;
import com.tyss.optimize.nlp.util.NlpRequestModel;
import com.tyss.optimize.nlp.util.NlpResponseModel;
import com.tyss.optimize.nlp.util.annotation.InputParam;
import com.tyss.optimize.nlp.util.annotation.InputParams;
import com.tyss.optimize.nlp.util.annotation.ReturnType;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;


@Component("LIC6904_PJT1013_PE_NLP2af8eb13-f572-4c60-a9f2-84da857c9146")
public class ClickonEleme implements Nlp {
    @InputParams({@InputParam(name = "Element", type = "org.openqa.selenium.WebElement")})
   // @ReturnType(name = "string3", type = "java.lang.String")

      @Override
      public List<String> getTestParameters() throws NlpException {
        List<String> params = new ArrayList<>();
        return params;
      }

      @Override
      public StringBuilder getTestCode() throws NlpException {
        StringBuilder sb = new StringBuilder();
        return sb;
      }
      @Override
      public NlpResponseModel execute(NlpRequestModel nlpRequestModel) throws NlpException {
        
          NlpResponseModel nlpResponseModel = new NlpResponseModel();
          Map<String, Object> attributes = nlpRequestModel.getAttributes();
          WebElement elemt = (WebElement) attributes.get("Element");
          String string2 = (String) attributes.get("string2");

          // Your program element business logic goes here ...
          try {
        	  elemt.click();
        	  nlpResponseModel.setStatus(CommonConstants.pass);
        	  nlpResponseModel.setMessage("Sucessfully clicked");
			
		} catch (Exception e) {
			nlpResponseModel.setStatus(CommonConstants.fail);
      	  nlpResponseModel.setMessage("Failed to click");
			
		}

        //  String string3 = "Return Value";
          //nlpResponseModel.getAttributes().put("string3", string3);
          return nlpResponseModel;
      }
  } 

