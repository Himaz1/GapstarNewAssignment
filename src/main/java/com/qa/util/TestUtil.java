package com.qa.util;

import java.io.IOException;
import java.time.Duration;

import com.qa.base.TestBase;

public class TestUtil extends TestBase{
	public TestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Duration PAGE_LOAD_TIMEOUT = Duration.ofSeconds(120);
    public static Duration IMPLICIT_WAIT = Duration.ofSeconds(10);

}
