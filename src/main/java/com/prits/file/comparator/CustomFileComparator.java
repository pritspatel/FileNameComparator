package com.prits.file.comparator;

import org.apache.commons.io.comparator.NameFileComparator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.File;
import java.util.Comparator;

/**
 * Created by priteshpatel on 7/9/17.
 */
@Component
public class CustomFileComparator implements Comparator<File> {

    private static final Logger logger = LoggerFactory.getLogger(CustomFileComparator.class);

    public int compare(File file1, File file2) {

        logger.info("File 1 name : {}", file1.getName());
        logger.info("File 2 name : {}", file2.getName());
        //return file1.compareTo(file2);
        return NameFileComparator.NAME_INSENSITIVE_REVERSE.compare(file1,file2);
    }
}
