package visitor;

public class Oil implements AtvPart {
	@Override
	public void accept(AtvTartVisitor visitor) {
		visitor.visit(this);
	}
}
