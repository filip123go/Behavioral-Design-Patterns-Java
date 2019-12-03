package visitor;

public interface AtvTartVisitor {
	void visit(Oil oil);

	void visit(Fender fender);

	void visit(Wheel wheel);

	void visit(PartsOrder pastOrder);
}
