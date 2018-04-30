package en.lottoland.rockpaperscissors.services;

import junit.framework.TestCase;

/**
 * Created by andyx on 30/4/18.
 */
public class ClientGameManagerBeanTest extends TestCase {
    ClientGameManagerBean clientTestBean = new ClientGameManagerBean();

    public void testInitClientGameManagerBean() throws Exception {
        clientTestBean.initClientGameManagerBean();
        assertNotNull(clientTestBean.getList());
    }

    public void testSetNewMatch() throws Exception, Throwable {
        ServerGameManagerBean serverForTest = new ServerGameManagerBean();
        serverForTest.initServerGameManagerBean();
        clientTestBean.initClientGameManagerBean();
        clientTestBean.setBeanServer(serverForTest);
        int previousSize;
        for(int i=0; i<1000; i++) {
            previousSize = clientTestBean.getList().size();
            clientTestBean.setNewMatch();
            assertNotNull(clientTestBean.getList());
            assertNotSame(previousSize, clientTestBean.getList().size());
        }
    }

    public void testGetRounds() throws Exception {
        clientTestBean.initClientGameManagerBean();
        assertEquals(String.valueOf(0), clientTestBean.getRounds());
    }

    public void testReset() throws Exception, Throwable {
        ServerGameManagerBean serverForTest = new ServerGameManagerBean();
        serverForTest.initServerGameManagerBean();
        clientTestBean.initClientGameManagerBean();
        clientTestBean.setBeanServer(serverForTest);
        for(int i=0; i<1000; i++)
            clientTestBean.setNewMatch();
        assertTrue(Integer.valueOf(clientTestBean.getRounds())>0);
        clientTestBean.reset();
        assertTrue(Integer.valueOf(clientTestBean.getRounds())==0);
    }

    public void testGetList() throws Exception {
        clientTestBean.initClientGameManagerBean();
        assertNotNull(clientTestBean.getList());
    }

}