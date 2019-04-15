package com.fred.springcloud;

import org.springframework.stereotype.Service;

/**
 *
 * <b>Description:.</b><br> 
 * @author <b>sil.zhou</b>
 * <br><b>ClassName:</b> 
 * <br><b>Date:</b> 2019/4/12 15:08
 */
@Service
public class FeignHystrixService implements FeignService {

    @Override
    public String hi(String name) {
        return "sorry, " + name;
    }
}
