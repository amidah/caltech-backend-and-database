package com.java.polymorphism;

// Overloading, Compile Time Polymorphism
class Authentication{
	void login(String email, String password) {
		System.out.println("Login user with email: " + email + " and password:" + password);
	}
	void login(String phone, short otp) {
		System.out.println("Login user with phone: " + phone + " and otp:" + otp);
	}
	void login(String phone, int otp) {
		System.out.println("Login user with phone: " + phone + " and otp:" + otp);
		System.out.println("int otp");
	}
	void login(String phone, long otp) {
		System.out.println("Login user with phone: " + phone + " and otp:" + otp);
		System.out.println("long otp");
	}
	
	
}

// Overriding and Runtime Polymorphism
class Theme{
	void themeColorScheme() {
		System.out.println(1);
		System.out.println("Primary Color- Red");
		System.out.println("Secondary Color- White");
	}
	
	public void darkToLightMode(boolean enable) {
		System.out.println(1);
		System.out.println("darkToLightMode " + enable);
	}
}
class CustomTheme extends Theme{
	
	public void themeColorScheme() {
		System.out.println(2);
		System.out.println("Primary Color- Green");
		System.out.println("Secondary Color- Yellow");
	}
	public void darkToLightMode(boolean enable) {
		System.out.println(2);
		System.out.println("darkToLightMode " + enable);
	}
	void darkToLightMode(boolean enable, int brightnessLevel) {
		System.out.println("darkToLightMode " + enable);
		System.out.println("brightnessLevel " + brightnessLevel);
	}
}


public class OverloadingVsOverriding {

	public static void main(String[] args) {
		
		Authentication authentication = new Authentication();
		//short otp = 9393;
		authentication.login("abc@gmail.com", "abc@1234");
		authentication.login("iphone", (short)9393);
		authentication.login("iphone", 9393L);
		
		
		Theme th1 = new Theme();
		CustomTheme custTh = new CustomTheme();
		Theme th2 = new CustomTheme();
		
		th1.themeColorScheme();
		th1.darkToLightMode(false);
		
		custTh.themeColorScheme();
		custTh.darkToLightMode(true);
		
		th2.themeColorScheme();
		th2.darkToLightMode(false);
		
		
		
		
	}
	
}
