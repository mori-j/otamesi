package scc.main;

import java.math.BigDecimal;

public class SampleLogin {


	public static BigDecimal addTotal(BigDecimal suu,BigDecimal money) {
		BigDecimal value = new BigDecimal(0);

		value = suu.multiply(money);

		return value;

	}

}
