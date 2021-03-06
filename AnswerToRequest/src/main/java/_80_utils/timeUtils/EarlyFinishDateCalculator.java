package _80_utils.timeUtils;

import _30_producer.Producer;

import java.time.Duration;
import java.time.LocalDateTime;

public class EarlyFinishDateCalculator {


    public LocalDateTime calculateEarlyFinish(Producer producer, Duration productionDuration) {

        LocalDateTime availableStart = producer.getProducerTime().getAvailableStart();
        Duration deliveringTime = producer.getProducerTime().getDeliveringTimeH();

        return availableStart.plus(productionDuration).plus(deliveringTime);
    }


}

