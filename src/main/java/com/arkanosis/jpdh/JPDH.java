package com.arkanosis.jpdh;

import com.arkanosis.JPDH.NarSystem;

public class JPDH {
    static {
        NarSystem.loadLibrary();
    }

    public static Query openQuery(String dataSource) throws JPDHException {
        Query query = nOpenQuery(dataSource);
        query.dataSource = dataSource;
        return query;
    }

    public static Query openQuery() throws JPDHException {
        return openQuery(null);
    }

    private static native Query nOpenQuery(String dataSource) throws JPDHException;

}
