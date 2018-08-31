package _10_model.data;

import _30_producer.Producer;

import java.util.ArrayList;
import java.util.List;

public class ProducersStaticDASData implements DASData<Producer> {


    private  List<Producer>  producersList = new ArrayList<>();

    /**
     * Use ProducersDBFactory
     */
    ProducersStaticDASData() {
       }


    @Override
    public List<Producer> getData() {
        return producersList;
    }
}
