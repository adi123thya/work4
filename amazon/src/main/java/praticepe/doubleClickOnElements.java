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


@Component("LIC6904_PJT1013_PE_NLPc3e45751-e219-4777-9758-70327940d094")
public class doubleClickOnElements<Action> implements Nlp {
    @InputParams({@InputParam(name = "element", type = "org.openqa.selenium.WebElement")})
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
          WebElement element1 = (WebElement) attributes.get("element");
          
          try {
        	  Actions a = new Actions((WebDriver) element1);
        	  a.doubleClick();
        	  nlpResponseModel.setStatus(CommonConstants.pass);
    		  nlpResponseModel.setMessage("Double clicked on element");

		} catch (Exception e) {
			nlpResponseModel.setStatus(CommonConstants.fail);
  			nlpResponseModel.setMessage("Failed to double click");
			
		
		}

         

        //  String string3 = "Return Value";
         // nlpResponseModel.getAttributes().put("string3", string3);
          return nlpResponseModel;
      }
  } 

