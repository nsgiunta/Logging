package co.develhope.Logging.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    Logger logger = LoggerFactory.getLogger(HomeService.class);

    public int getExp(int a, int b){
        int ab = 0;
        try{
            logger.info(String.valueOf(ab));
        }finally{
            ab = (int) Math.pow(a, b);
            logger.info(String.valueOf(ab));
            return ab;
        }
    }
}
