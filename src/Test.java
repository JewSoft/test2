import com.gargoylesoftware.htmlunit.WebClient;
import sun.plugin.services.WIExplorerBrowserService;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException{
        WebClient web=new WebClient();
        web.getOptions().setJavaScriptEnabled(false);
        web.getOptions().setCssEnabled(false);
        web.getOptions().setUseInsecureSSL(false);
        String url="http://dzswj.sn-n-tax.gov.cn/sso/login";
        //HtmlPage page=web.getPage(url);
        WIExplorerBrowserService ie=new WIExplorerBrowserService();
        System.out.println(ie.getBrowserVersion());

        //System.out.println(page.getTitleText());
    }
}
