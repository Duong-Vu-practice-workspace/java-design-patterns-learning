package vn.edu.ptit.duongvct.abstractfactory2.gcp;


import vn.edu.ptit.duongvct.abstractfactory2.Instance;
import vn.edu.ptit.duongvct.abstractfactory2.ResourceFactory;
import vn.edu.ptit.duongvct.abstractfactory2.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }
}
