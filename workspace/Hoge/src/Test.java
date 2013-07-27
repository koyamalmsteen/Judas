import java.net.URI;
import java.net.URISyntaxException;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arg = "spase://IUGONET/Granule/WDC_Kyoto/WDC/Dst/index/PT1H/dst198410_wdc";
		try {
			URI uri = new URI(arg);
			String resolver = "";
			System.out.println(uri);
			System.out.println("1:"+"http://search.iugonet.org/iugonet/browse?type=GranuleParendID&value=spase%3A%2F%2FIUGONET%2FNumericalData%2FWDC_Kyoto%2FWDC%2FNCK%2FMagnetometer%2FPT1H&m=1");
			System.out.println("2:"+resolver);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
}
