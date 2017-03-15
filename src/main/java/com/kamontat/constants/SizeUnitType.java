package com.kamontat.constants;

/**
 * @author kamontat
 * @version 1.0
 * @since Thu 16/Mar/2017 - 12:06 AM
 */
public enum SizeUnitType {
	/**
	 * Kibibyte, Mebibyte, Gibibyte, Tebibyte, Pebibyte, Exbibyte, Zebibyte, Yobibyte <br>
	 * each step will multiply by <b>1024</b>
	 */
	NON_SI,
	/**
	 * Kilobyte, Megabyte, Gigabyte, Terabyte, Petabyte, Exabyte, Zettabyte, Yottabyte <br>
	 * each step will multiply by <b>1000</b>
	 */
	SI;
}
