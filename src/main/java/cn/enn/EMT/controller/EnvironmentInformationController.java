package cn.enn.EMT.controller;

import java.util.ArrayList;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import cn.enn.EMT.dataCollection.DaoImplement.UserBehaviorImpl;
//import cn.enn.EMT.dataCollection.po.UserBehavior;
import cn.enn.EMT.vo.EnvironmentInformationVO;
import cn.enn.EMT.webResponse.JsonResponse;

@RestController
public class EnvironmentInformationController {
	/*
	@Autowired
	private UserBehaviorImpl userBehaviorImpl;
	
	@RequestMapping(value = "1", method = RequestMethod.POST)
	public JsonResponse<ArrayList<UserBehavior>> getuser() {
		ArrayList<UserBehavior> arr = new ArrayList<UserBehavior>();

		UserBehavior userBehavior = userBehaviorImpl.getLatestUserBehaviorInformation();
		
		arr.add(userBehavior);
		
		return new JsonResponse<ArrayList<UserBehavior>>(arr);
	}
	*/

	// http请求 返回Json
	@RequestMapping(value = "/environmentinformation", method = RequestMethod.POST)
	public JsonResponse<ArrayList<EnvironmentInformationVO>> getEnvironmentInformation() {

		ArrayList<EnvironmentInformationVO> arrEnvironmentInformationVO = new ArrayList<EnvironmentInformationVO>();

		EnvironmentInformationVO environmentInformationVO = new EnvironmentInformationVO();

		environmentInformationVO.setTemperature(10);
		environmentInformationVO.setHumidity(20);

		arrEnvironmentInformationVO.add(environmentInformationVO);

		return new JsonResponse<ArrayList<EnvironmentInformationVO>>(arrEnvironmentInformationVO);
	}
}