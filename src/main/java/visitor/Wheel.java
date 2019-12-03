package visitor;

public class Wheel implements AtvPart {

	@Override
	public void accept(AtvTartVisitor visitor) {
		visitor.visit(this);
	}
}
