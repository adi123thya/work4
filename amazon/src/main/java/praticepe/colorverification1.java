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

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.Color;
	import org.springframework.stereotype.Component;



	@Component("LIC6904_PJT1013_PE_NLP06dc617a-2649-449b-ad86-d84a01fed0da")
public class colorverification1 implements Nlp {
	    @InputParams({@InputParam(name = "element", type = "org.openqa.selenium.WebElement")})
	    @ReturnType(name = "hex", type = "java.lang.String")

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
	          WebElement xpath = (WebElement) attributes.get("element");
	         // String string2 = (String) attributes.get("string2");
	          String rbg;
	          String hex=""; 
	try {
		 rbg = xpath.getCssValue("background-color");
		  hex = Color.fromString(rbg).asHex();
		  nlpResponseModel.setStatus(CommonConstants.pass);
		nlpResponseModel.setMessage("Sucessfully entered");
	} catch (Exception e) {
		nlpResponseModel.setStatus(CommonConstants.fail);
		nlpResponseModel.setMessage("failed to enter");
	}
	         

				nlpResponseModel.getAttributes().put("hex", hex);
	          return nlpResponseModel;
	      }
	  } 



