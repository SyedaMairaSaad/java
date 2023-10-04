package practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class InnerImplementationForeach {
	public static void main(String[] arg) {
		List<Integer> nums = Arrays.asList(41, 2, 3, 4, 5, 6);

		// Foreach is Iterable and uses Consumer interface
		Consumer<Integer> con = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);

			}

		};

		nums.forEach(con);
	}
}