package org.smikestreet;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
@Service
public class ResourceTask {
    private static final Logger LOG = Logger.getLogger(ResourceTask.class.getName());

    public ResourceTask() {
        LOG.log(Level.INFO, "ResourceTask Constructed..." );
    }

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        LOG.log(Level.INFO, "The time is now " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}