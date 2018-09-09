package config;

import com.cn.jblog.controller.EntranceController;
import com.jfinal.config.Routes;

public class DevRoute extends Routes {

	@Override
	public void config() {
		add("/", EntranceController.class);
	}

}
