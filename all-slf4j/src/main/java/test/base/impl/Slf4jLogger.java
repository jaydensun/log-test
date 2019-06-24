package test.base.impl;

import test.base.BaseLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ������
 * <pre>
 * HISTORY
 * ****************************************************************************
 *  ID   DATE            PERSON          REASON
 *  1    2015-10-27       089245          Create
 * ****************************************************************************
 * </pre>
 *
 * @author 089245
 * @since 1.0
 */
public class Slf4jLogger extends BaseLogger {
    private Logger logger = LoggerFactory.getLogger(Slf4jLogger.class);


    @Override
    public void log() {
        logger.info(getContent());
    }
}
