package salut.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class SalutHandler implements RequestHandler<SalutIn, SalutOut> {

	public SalutHandler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public SalutOut handleRequest(SalutIn input, Context context) {

		SalutOut out = new SalutOut();
		out.setMessage("Hello " + input.getName());
		out.setFunctionName(context.getFunctionName());
		out.setMemoryLimit(context.getMemoryLimitInMB());
		context.getLogger().log(input.getName() + " a dit bonjour");
		return out;
	}

}
