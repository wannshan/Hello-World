package wannshan.springb.HSqlDb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * 文件功能：xxxx
 *
 */
@Component
public class HyperSqlDbServer implements SmartLifecycle {
    private final Logger logger = LoggerFactory.getLogger(HyperSqlDbServer.class);
    private boolean running = false;
    @Override
    public boolean isAutoStartup() {
        return true;

    }

    @Override
    public void stop(Runnable callback) {
        /**
         * 功能：xxxx
         *
         */

    }

    @Override
    public void start() {
        logger.info("Starting HSQL server...");
    }

    @Override
    public void stop() {
        /**
         * 功能：xxxx
         *
         */
        running = true;
    }

    @Override
    public boolean isRunning() {
        return running;

    }

    @Override
    public int getPhase() {
        return 0;

    }
}
