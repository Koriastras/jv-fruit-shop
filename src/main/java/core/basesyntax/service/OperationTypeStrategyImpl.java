package core.basesyntax.service;

import core.basesyntax.model.OperationType;
import core.basesyntax.service.operation.ShopOperationHandler;
import java.util.HashMap;
import java.util.Map;

public class OperationTypeStrategyImpl implements OperationTypeStrategy {
    private Map<OperationType, ShopOperationHandler> shopOperationMap = new HashMap<>();

    public OperationTypeStrategyImpl(Map<OperationType, ShopOperationHandler> shopOperationMap) {
        this.shopOperationMap = shopOperationMap;
    }

    @Override
    public ShopOperationHandler get(OperationType type) {
        return shopOperationMap.get(type);
    }
}
