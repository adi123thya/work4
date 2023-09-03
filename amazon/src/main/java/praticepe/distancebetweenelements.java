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

	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.WebElement;
	import org.springframework.stereotype.Component;

	@Component("LIC6904_PJT1013_PE_NLP49332e87-4e2b-46d6-bccf-af653ebbbdf7")
public class distancebetweenelements implements Nlp {
		@InputParams({ @InputParam(name = "element1", type = "org.openqa.selenium.WebElement"),
				@InputParam(name = "element2", type = "org.openqa.selenium.WebElement") })
		@ReturnType(name = "x3", type = "java.lang.Integer")

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
			WebElement e1 = (WebElement) attributes.get("element1");
			WebElement e2 = (WebElement) attributes.get("element2");

			int x3 = 0;
			try {
				Point d1 = e1.getLocation();
				Point d2 = e2.getLocation();
				int x1 = d1.x;
				int x2 = d2.x;
				x3 = x2 - x1;
				nlpResponseModel.setStatus(CommonConstants.pass);
				nlpResponseModel.setMessage("sucessfuly got coordinates");
			} catch (Exception e) {
				nlpResponseModel.setStatus(CommonConstants.fail);
				nlpResponseModel.setMessage("Did not got coordinates");
			}

			nlpResponseModel.getAttributes().put("x3", x3);
			return nlpResponseModel;
		}
	}


