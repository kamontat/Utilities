package com.kamontat.example;

import com.kamontat.utilities.FilesUtil;
import com.kamontat.utilities.ZipsUtil;

import java.io.IOException;

/**
 * @author kamontat
 * @version 1.0
 * @since Mon 20/Mar/2017 - 1:04 AM
 */
public class ZipUsage {
	public static void main(String[] args) throws IOException {
		String s = ZipsUtil.unZip(FilesUtil.getFile("out.zip").getAbsolutePath(), FilesUtil.getFile().getAbsolutePath());
	}
}
