package visitor;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvTartVisitor {

	double shippingAmount = 0;

	@Override
	public void visit(Oil oil) {
		shippingAmount += 9.0;
		System.out.println("oil are expensive");
	}

	@Override
	public void visit(Fender fender) {
		shippingAmount += 3.0;
		System.out.println("fender are expensive");
	}

	@Override
	public void visit(Wheel wheel) {
		shippingAmount += 15.0;
		System.out.println("Wheels are expensive");
	}

	@Override
	public void visit(PartsOrder order) {
		System.out.println("more than 3 things discount shipping");
		List<AtvPart> parts = order.getParts();
		if (parts.size() > 3) {
			shippingAmount -= 5;
		}
		System.out.println("Shipping is " + shippingAmount);
	}
}
