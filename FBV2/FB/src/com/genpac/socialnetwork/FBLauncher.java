package com.genpac.socialnetwork;

import com.genpac.socialnetwork.users.views.LoginView;

public class FBLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginView loginView = new LoginView();
		loginView.doLogin();
		loginView = null;

	}

}
