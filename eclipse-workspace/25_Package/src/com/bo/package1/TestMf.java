package com.bo.package1;

import com.mz.accessmf.Human;

public class TestMf extends Human{
	
	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		name = "mz";
		age = 20; //상속 받은 클래스(하위 클래스)
//		addr = "asdf"; // 다른 패키지라 접근 불가
//		birth = "asdf";// 다른 클래스라 접근 불가
	}
}
