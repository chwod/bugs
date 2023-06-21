import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	private static <T> List<T> get(Object o) {
		var list = new ArrayList<T>();
		list.add((T) o);
		return list;
	}

	public static void main(String... strings) {
		var a = Arrays.asList("v");
		List<String> b = Test.<String>get(a);
		System.out.println(b);
		var c = b.parallelStream().map(d -> d).collect(Collectors.toList());
		System.out.println(c);
	}

}
