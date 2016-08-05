package com.thoughtworks.www.samples.services.impl;

import com.thoughtworks.www.samples.services.TimeProviderService;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by kxi on 8/5/16.
 */
@Component(
        metatype = true,
        label = "TW samples",
        description = "Simple Service",
        immediate = true)

@Service
public class TimeProviderServiceImpl implements TimeProviderService {
    @Override
    public String getCurrentDateTime() {
        //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //Date date = new Date();
        //return  dateFormat.format(date);
        return  "This is just for test.";
    }
}
