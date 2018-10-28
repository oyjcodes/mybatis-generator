package com.oyj;

import org.mybatis.generator.api.ShellRunner;

public class App {
	public static void main(String[] args) {
		args = new String[] { "-configfile", "src\\main\\resources\\mybatis-generator.xml", "-overwrite" };
		ShellRunner.main(args);
		System.out.println("运行结束");
	}

}
