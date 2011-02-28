package a.b.c.evaluators;

public class IntEvaluator implements Evaluator {
	private int value;
	@Override public int evaluate() {
		return value;
	}
	public IntEvaluator(int value) {
		this.value = value;
	}
	public String toTreeString(String indent) {
		return '\n' + indent + "Int:" + value;
	}
}
