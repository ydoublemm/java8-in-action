package com.ymm.page40;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by yemingming on 2019-11-19.
 */
@FunctionalInterface
public interface ProcessFile {

	String process(BufferedReader bufferedReader) throws IOException;
}
