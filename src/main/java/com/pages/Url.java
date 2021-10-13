package com.pages;


	import com.base.Base;

	public class Url extends Base{
		
		Base bs;
		
		public void Browserurl() {
			
			bs = new Base();
			bs.Initialization();
			
		}
		public String BrowserTitle() throws InterruptedException {
			
			pause();
			return driver.getTitle();
			
			
		}
		
}
