package by.balashevich.taskeditor.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public abstract class BaseComponent {
    ComponentType componentType;
    List<BaseComponent> childComponentList;

    public BaseComponent() {
        childComponentList = new ArrayList<>();
    }

    public ComponentType getComponentType() {
        return componentType;
    }

    public List<BaseComponent> getChildComponentList() {
        return Collections.unmodifiableList(childComponentList);
    }

    public Optional<BaseComponent> getChildComponentByIndex(int index) {
        Optional<BaseComponent> childComponent = Optional.empty();
        if (index >= 0 && index < childComponentList.size()) {
            childComponent = Optional.of(childComponentList.get(index));
        }
        return childComponent;
    }

    public abstract void add(BaseComponent childComponent);

    public abstract void addAll(List<BaseComponent> childComponent);

    public abstract void remove(BaseComponent childComponent);
}
