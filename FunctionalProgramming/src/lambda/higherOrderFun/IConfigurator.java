package lambda.higherOrderFun;

public interface IConfigurator<T,R> {
	public R configure(T t);
}
