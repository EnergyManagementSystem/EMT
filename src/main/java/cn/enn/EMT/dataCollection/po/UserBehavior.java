package cn.enn.EMT.dataCollection.po;

public class UserBehavior extends BaseInformation {

	// 温度
	private Integer temperature;

	// 风速
	private String speed;

	// 模式
	private String mode;

	public Integer getTemperature() {
		return temperature;
	}

	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
}