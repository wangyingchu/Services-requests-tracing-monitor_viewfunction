package com.viewfunction.servicesRequestsTracingMonitor_viewfunction;

import com.viewfunction.servicesRequestsTracingMonitor_viewfunction.util.ApplicationLauncherUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class ServicesRequestsTracingMonitorViewfunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesRequestsTracingMonitorViewfunctionApplication.class, args);
        ApplicationLauncherUtil.printApplicationConsoleBanner();
	}
}
