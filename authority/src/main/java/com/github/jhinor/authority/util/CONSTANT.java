package com.github.jhinor.authority.util;

/**
 * @author shiyu.long
 */
public interface CONSTANT {
    /**
     * data base constant
     */
    interface DB {
        String DB_PATH = "repo/";
        String DB_NAME = "db";
        int DB_PORT = 3306;
    }

    /**
     * spring mvc constant
     */
    interface MVC {
        String RESOLVER_SUFFIX = ".jsp";
        String RESOLVER_PREFIX = "/WEB-INF/jsp";
        long MAX_UPLOAD_SIZE = 1024 * 1024 * 20L;
    }

    /**
     * const view name and view path
     */
    interface PATH {
        String UNAUTHORIZED = "/unauthorized";
        String SIGN_IN = "/sign-in";
    }

    interface STATIC_PATH {
        String ALL = "/**";
        String STATIC = "/static/**";
        String WEBJAR = "/webjars/**";
    }

    interface FILTER {
        String AUTHC = "authc";
        String ANON = "anon";
    }
}
