package generics;

@FunctionalInterface
public interface FunctionalGenerics<T,R> {
	public R execute(T t);
}
