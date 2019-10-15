package chainofresponsibility;

public class VP extends Handler {

	@Override
	public void handleRequest(Request request) {
		if (request.getRequestType() == RequestType.PURCHASE) {
			if (request.getAmount() < 1501) {
				System.out.println("VP can purchase below 1501");
			} else {
				successor.handleRequest(request);
			}
		}
	}
}
