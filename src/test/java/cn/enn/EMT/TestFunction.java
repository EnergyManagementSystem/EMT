package cn.enn.EMT;

import java.util.ArrayList;

import org.junit.Test;

import cn.enn.EMT.vo.EnvironmentInformationVO;

public class TestFunction {

	@Test
	public void test() {
		
		ArrayList<EnvironmentInformationVO> arrEnvironmentInformationVO = new ArrayList<EnvironmentInformationVO>();

		EnvironmentInformationVO environmentInformationVO = new EnvironmentInformationVO();

		environmentInformationVO.setTemperature(10);
		environmentInformationVO.setHumidity(20);

		arrEnvironmentInformationVO.add(environmentInformationVO);
	}
}
