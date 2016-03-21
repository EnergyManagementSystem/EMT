package cn.enn.EMT.dataCollection;

import cn.enn.EMT.dataCollection.po.UserBehavior;

public interface UserBehaviorDao {
	
	UserBehavior getLatestUserBehaviorInformation();
	
}