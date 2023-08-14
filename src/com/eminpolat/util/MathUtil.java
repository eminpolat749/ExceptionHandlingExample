package com.eminpolat.util;

import com.eminpolat.exception.IndeterminedException;
import com.eminpolat.exception.UndefinedException;

public class MathUtil {
	public static double log10(double val)
	{
		if (val < 0)
			throw new IndeterminedException();

		if (val == 0)
			throw new UndefinedException();


		return Math.log10(val);
	}
}