package com.Jsoup.src.code;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Tang A Biao
 * @create 2021/1/4 - 21:53
 */
public class getcomment {
    public static void main(String[] args) throws IOException {
        /*
        *  Document doc = Jsoup.connect("http://example.com";)
          .data("query", "Java")
          .userAgent("Mozilla")
          .cookie("auth", "token")
          .timeout(3000)
          .post();
        * */
        Map map = new HashMap();
        map.put("params", "eKQ%2FPCPpZCrH8k9YEOG33nhvZLt45BYtdIdSdgj%2BR45y%2FQRjGMtlSqLumBQVWVrB6Q2w0QJayKMnEKsQ6cQdR8BrgyztwxZOOh8u192lrXJ90v1%2BJF42jTvKD5IG8pa9K%2FBK%2BnK6Gq4rFSbT8H7S0qp9DOc63VFtqEMMlZWQnAbUejBtLoV4K6IejAfkGC43y1t8qU2QN0cHpVV2gVdmpvjnlIyk8Jx8hH2wH2%2BEyrwSUbsV3FkWzV08Uod8EEQYFYXOJwBeCOhOfA%2FSsqRIq37n0%2BG1sKWARAFsG2EJRlw%3D");
        map.put("encSecKey", "d590d74723d4927ebe1501e183bc7900bb4447b75cbd94fb57cf7ea92c97086f7c599f58166187a94bc7a9a9192d17aa54f001c98650318204a44449ac64bbaaaa5f7c667abc27a2995d74e27e1a07d7be7535c79a72f7e32d54cd1f85a78728cff21b3eba9fd545087a146185e745b641ebefe1c0e716b46048bd6f7af85a12");
//          cookie
        String s = "_iuqxldmzr_=32; _ntes_nnid=1baa147505f4e5716ceb8f80c0bd5932,1601963574750; _ntes_nuid=1baa147505f4e5716ceb8f80c0bd5932; NMTID=00OlrKWtHjlTyrM5UdZrlWUScJkmOEAAAF0_HhJAg; WM_TID=nyhI2yiCJ7FERVFAABI%2FNLrxa8Fw6WRT; WEVNSM=1.0.0; WNMCID=czglkw.1609765436546.01.0; WM_NI=cuR3LrQdVpvhx4HfpkZtcVUpWXlKojjsqdrQFPH946PKC40ig7IBxftcpVjBH66UFP%2BTpUvnBGg7%2FVb%2FgycgbOuMYbaOzkQH3KKzgoeIUacN%2Bbsihg0f%2BwFG%2BcQ5QJ2LdjU%3D; WM_NIKE=9ca17ae2e6ffcda170e2e6ee8eae6bb387fb8aca74ab9e8bb6d15f939b8bbbb541949db6b0f47cf48d87aaef2af0fea7c3b92aa1ab9ed4cf7a93bc9a91f564bcec8887f3619aacadb7d87c9588a4acee62aaadbf85f15b869088dab73e94958dd5b363a5e987a3fb6eb8bdc0b7e94a8ceafab6c55ce98cc0b6f5668299a9d8ae5ea2f1a99ae26da291bbaedc6aa391b68cd444f195859be665a7979b82e246e9bebd8aeb6df4bae598c54de9bd9fd6d442f294ac8bd837e2a3; JSESSIONID-WYYY=BAKdJu%2B%2FzMGpyS2BEaZ45q8erBVI%5CP6IXcmYfk0AgzbY%2FAk%5CDMx%2FyBJ4Wjwh5e7UDjgf4fz%2FkUibvRUPvtNp3%2Fa%2BcuC1eC%2Bgj9B97ByuImBYquq3bJXm1rIN8Im42XMJDC%5CTQM%2BUK01TQ%2F%5CE8AYAFmYS349k7uA%5CFRNnYm95TfT3aa%5Ch%3A1609768974978";
        String replace = s.replace(" ", "");
        String[] split = replace.split(";");
        HashMap map1 = new HashMap();
        for (int i = 0; i < split.length; i++) {
//            System.out.println(split[i]);
            String[] split1 = split[i].split("=");
            map1.put(split1[0], split1[1]);
        }
        Document post = Jsoup.connect("https://music.163.com/weapi/comment/resource/comments/get?csrf_token=")
                .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.25 Safari/537.36 Core/1.70.3742.400 QQBrowser/10.5.3870.400")
                .data(map)
                .cookies(map1)
                .timeout(3000)
                .post();
        System.out.println(post);
    }
}
