package ragaluszka.wornings.service;

import java.util.List;

public interface VoltageService<T> extends BaseService {
    public List<T> getVoltage();
}
