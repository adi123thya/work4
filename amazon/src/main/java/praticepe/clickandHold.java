package praticepe;

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

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.springframework.stereotype.Component;

@Component("LIC6904_PJT1013_PE_NLP698e5680-0f79-4df4-bd76-4ca25d80b83d")
public class clickandHold implements Nlp {
    @InputParams({@InputParam(name = "Elment", type = "org.openqa.selenium.WebElement")})//, @InputParam(name = "string2", type = "java.lang.String")})
  //  @ReturnType(name = "string3", type = "java.lang.String")

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
          WebElement element = (WebElement) attributes.get("Elment");
       
          // Your program element business logic goes here ...
          
          try {
        	  Actions ac= new Actions((WebDriver) element);
			ac.clickAndHold();
			 nlpResponseModel.setStatus(CommonConstants.pass);
   		  nlpResponseModel.setMessage("Click and hold on element");
		} catch (Exception e) {
			 nlpResponseModel.setStatus(CommonConstants.fail);
	   		  nlpResponseModel.setMessage("failed to Click and hold on element");
		}

        //  String string3 = "Return Value";
         // nlpResponseModel.getAttributes().put("string3", string3);
          return nlpResponseModel;
      }
  


		

	}


