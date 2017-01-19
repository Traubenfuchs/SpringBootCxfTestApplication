package at.loup.cxftest.services.soapservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import at.loup.cxftest.xml.types.HelloHeaderXml;
import at.loup.cxftest.xml.types.HelloRequestXml;

@WebService
@Service
public class HelloService {
	@WebMethod
	public String sayHello(
			@WebParam(header = true, name = "helloHeaderWebParamName") HelloHeaderXml helloHeaderArgument,
			@WebParam(header = false, name = "helloBodyWebParamName") HelloRequestXml helloBodyArgument) {
		return ""
				+ "Hello, "
				+ helloBodyArgument.getName()
				+ "HeaderValue1<"
				+ helloHeaderArgument.getHeaderVal1()
				+ ">, headerValue2<"
				+ helloHeaderArgument.getHeaderVal2() + ">";
	}
}