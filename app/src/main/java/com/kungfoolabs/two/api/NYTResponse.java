package com.kungfoolabs.two.api;

import java.util.List;

/**
 * Created by ckung on 2/21/17.
 */

public class NYTResponse {
    public class Doc {
        public String snippet;
    }

    public class NYTData {
        public List<Doc> docs;
    }

    public NYTData response;
}
