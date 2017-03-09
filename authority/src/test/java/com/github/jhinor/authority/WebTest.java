package com.github.jhinor.authority;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

/**
 * @author shiyu.long
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = MvcInfrastructureConf.class)
public abstract class WebTest extends GenericTest {
    MockMvc mockMvc;
    @Resource
    private WebApplicationContext wac;
    @Resource
    protected MockHttpSession session;
    @Resource
    protected MockHttpServletRequest request;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
        logger.info("[ test web context build finish ]");
    }
}
