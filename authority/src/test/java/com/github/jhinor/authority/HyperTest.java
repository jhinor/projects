package com.github.jhinor.authority;

import com.github.jhinor.authority.util.CONSTANT;
import org.hsqldb.server.Server;
import org.junit.Test;

/**
 * @author shiyu.long
 */
public class HyperTest extends GenericTest {
    @Test
    public void initHyperSqlDatabase() throws Exception {
        Server server = new Server();
        server.setDatabasePath(0, CONSTANT.DB.DB_PATH + CONSTANT.DB.DB_NAME);
        server.setDatabaseName(0, CONSTANT.DB.DB_NAME);
        server.setSilent(true);
        server.setPort(CONSTANT.DB.DB_PORT);
        server.start();
        logger.info("[ db start success]");
        while (true) ;
    }
}
