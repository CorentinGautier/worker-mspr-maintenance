package com.worker.workermsprmaintenance.based.Batch;
import com.worker.workermsprmaintenance.based.DTO.ArrondissementDTO;
import org.springframework.batch.item.ItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.xml.builder.StaxEventItemReaderBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SpringBatchJobConfig {

    /* information from the XML file. */
    @Configuration
    public class SpringBatchJobConfig {

        @Bean
        public ItemReader<ArrondissementDTO> itemReader() {
            Jaxb2Marshaller studentMarshaller = new Jaxb2Marshaller();
            studentMarshaller.setClassesToBeBound(ArrondissementDTO.class);

            return new StaxEventItemReaderBuilder<ArrondissementDTO>()
                    .name("ArrondissementReader")
                    .resource(new ClassPathResource("D:\\Projet EPSI\\mspr-maintenance\\TPRE716-XML\\BASED\\07-02-2021.xml"))
                    .addFragmentRootElements("Arrdit Id")
                    .unmarshaller(studentMarshaller)
                    .build();
        }

        /**
        @Bean
        public ItemWriter<ArrondissementDTO> itemWriter() {
            return new LoggingItemWriter();
        }
         */
        /**
         * Creates a bean that represents the only step of our batch job.
         * @param reader
         * @param writer
         * @param stepBuilderFactory
         * @return
         */
        /**
        @Bean
        public Step JobStep(ItemReader<ArrondissementDTO> reader,
                                   ItemWriter<ArrondissementDTO> writer,
                                   StepBuilderFactory stepBuilderFactory) {
            return stepBuilderFactory.get("eJobStep")
                    .<ArrondissementDTO, ArrondissementDTO>chunk(1)
                    .reader(reader)
                    .writer(writer)
                    .build();
        }
          */

        /**
         * Creates a bean that represents our  batch job.
         * @param JobStep
         * @param jobBuilderFactory
         * @return
         */
/**
        @Bean
        public Job Job(Step JobStep,
                              JobBuilderFactory jobBuilderFactory) {
            return jobBuilderFactory.get("Job")
                    .incrementer(new RunIdIncrementer())
                    .flow(JobStep)
                    .end()
                    .build();
        }
    }
 */

}
