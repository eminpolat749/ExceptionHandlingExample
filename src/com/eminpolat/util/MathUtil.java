package com.eminpolat.util;

import com.eminpolat.exception.MathException;
import com.eminpolat.exception.MathExceptionStatus;

public class MathUtil {
	public static double log10(double val)
	{
		if (val < 0)
			throw new MathException("Indeterminate", MathExceptionStatus.NAN);

		if (val == 0)
			throw new MathException("Undefined", MathExceptionStatus.NEGATIVE_INFINITY);

		return Math.log10(val);
	}
}