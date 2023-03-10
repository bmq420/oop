package ThiGiuaKy_D2.decorator;

public abstract class ToppingDecorator extends Bread {
	Bread bread;

	public ToppingDecorator() {

	}

	public abstract String getDescription();
}
