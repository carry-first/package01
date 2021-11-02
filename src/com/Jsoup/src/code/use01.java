package com.Jsoup.src.code;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Tang A Biao
 * @create 2021/1/4 - 20:34
 */
public class use01 {
    @Test
    public void test01() throws IOException {
        Document doc = Jsoup.connect("http://baidu.com/").get();
        String title = doc.title();
        System.out.println(doc);
        System.out.println(title);
    }

    @Test
    public void test02() throws IOException {
        File f = new File("D:\\a\\package1\\src\\com\\Jsoup\\src\\html\\xmlTest02.xml");
        Document parse = Jsoup.parse(f, "utf-8");
        System.out.println(parse);
    }

    @Test
    public void test03() {
        String s = "_iuqxldmzr_=32; _ntes_nnid=1baa147505f4e5716ceb8f80c0bd5932,1601963574750; _ntes_nuid=1baa147505f4e5716ceb8f80c0bd5932; NMTID=00OlrKWtHjlTyrM5UdZrlWUScJkmOEAAAF0_HhJAg; WM_TID=nyhI2yiCJ7FERVFAABI%2FNLrxa8Fw6WRT; WEVNSM=1.0.0; WNMCID=czglkw.1609765436546.01.0; WM_NI=cuR3LrQdVpvhx4HfpkZtcVUpWXlKojjsqdrQFPH946PKC40ig7IBxftcpVjBH66UFP%2BTpUvnBGg7%2FVb%2FgycgbOuMYbaOzkQH3KKzgoeIUacN%2Bbsihg0f%2BwFG%2BcQ5QJ2LdjU%3D; WM_NIKE=9ca17ae2e6ffcda170e2e6ee8eae6bb387fb8aca74ab9e8bb6d15f939b8bbbb541949db6b0f47cf48d87aaef2af0fea7c3b92aa1ab9ed4cf7a93bc9a91f564bcec8887f3619aacadb7d87c9588a4acee62aaadbf85f15b869088dab73e94958dd5b363a5e987a3fb6eb8bdc0b7e94a8ceafab6c55ce98cc0b6f5668299a9d8ae5ea2f1a99ae26da291bbaedc6aa391b68cd444f195859be665a7979b82e246e9bebd8aeb6df4bae598c54de9bd9fd6d442f294ac8bd837e2a3; JSESSIONID-WYYY=BAKdJu%2B%2FzMGpyS2BEaZ45q8erBVI%5CP6IXcmYfk0AgzbY%2FAk%5CDMx%2FyBJ4Wjwh5e7UDjgf4fz%2FkUibvRUPvtNp3%2Fa%2BcuC1eC%2Bgj9B97ByuImBYquq3bJXm1rIN8Im42XMJDC%5CTQM%2BUK01TQ%2F%5CE8AYAFmYS349k7uA%5CFRNnYm95TfT3aa%5Ch%3A1609768974978";
        String replace = s.replace(" ", "");
        String[] split = replace.split(";");
        HashMap map = new HashMap();
        for (int i = 0; i < split.length; i++) {
//            System.out.println(split[i]);
            String[] split1 = split[i].split("=");
            map.put(split1[0], split1[1]);
        }
        Set set = map.keySet();
        for (Object o : set) {
            Object o1 = map.get(o);
            System.out.println("key:" + o + "  " + o1);
        }
    }
}
