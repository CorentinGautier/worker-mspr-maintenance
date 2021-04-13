package com.worker.workermsprmaintenance.based.Batch;

import com.worker.workermsprmaintenance.based.DTO.ArrondissementDTO;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import java.util.List;
import java.util.logging.Logger;

public class LoggingItemWriter implements ItemWriter<ArrondissementDTO> {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(LoggingItemWriter.class);

    @Override
    public void write(List<? extends ArrondissementDTO> list) throws Exception {
     //   LOGGER.info("Writing Arrondissement: {}", list);
        LOGGER.info("Writing Arrondissement: {}");

    }
}
