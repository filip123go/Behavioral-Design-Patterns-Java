package visitor;

public class Fender implements AtvPart {
	@Override
	public void accept(AtvTartVisitor visitor) {
		visitor.visit(this);
	}
}
