
public class DriverFactory {
	
	private static final Supplier<WebDriver> chromeSupplier = () -> {
		return new ChromeDriver;
	};
	
	private static final Supplier<WebDriver> firefoxSupplier = () -> {
		return new FirefoxDriver;
	};
	
	private static final Map <String, Supplier<WebDriver>> MAP = new HashMap<> ();
	
	static {
		MAP.put("chrome", chromeSupplier);
		MAP.put("firefox", firefoxSupplier);
	}

}
