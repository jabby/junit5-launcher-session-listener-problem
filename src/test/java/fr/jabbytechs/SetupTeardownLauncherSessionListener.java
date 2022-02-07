package fr.jabbytechs;

import org.junit.platform.launcher.LauncherSession;
import org.junit.platform.launcher.LauncherSessionListener;

public class SetupTeardownLauncherSessionListener implements LauncherSessionListener {

	@Override
	public void launcherSessionOpened(LauncherSession session) {
		System.out.println("launcherSessionOpened");
	}

	@Override
	public void launcherSessionClosed(LauncherSession session) {
		System.out.println("launcherSessionClosed");
	}
}