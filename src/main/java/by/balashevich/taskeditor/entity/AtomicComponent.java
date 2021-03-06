package by.balashevich.taskeditor.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AtomicComponent extends BaseComponent {
    private static final Logger logger = LogManager.getLogger();
    private AtomicType atomicType;
    private String atomicElement;

    public AtomicComponent(String atomicElement, AtomicType atomicType) {
        this.atomicElement = atomicElement;
        this.atomicType = atomicType;
    }

    public AtomicType getAtomicType() {
        return atomicType;
    }

    @Override
    public void add(BaseComponent childComponent) {
        logger.log(Level.WARN, "You can't add component, bcos it's atomic element");
    }

    @Override
    public void addAll(List<BaseComponent> childComponent) {
        logger.log(Level.WARN, "You can't add components, bcos it's atomic element");
    }

    @Override
    public void remove(BaseComponent childComponent) {
        logger.log(Level.WARN, "You can't remove component, bcos it's atomic element");
    }

    @Override
    public List<BaseComponent> getChildComponentList() {
        logger.log(Level.WARN, "You can't get component list, bcos it's atomic element");
        return new ArrayList<>();
    }

    @Override
    public Optional<BaseComponent> getChildComponentByIndex(int index) {
        logger.log(Level.WARN, "You can't get component by Index, bcos it's atomic element");
        return Optional.empty();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        AtomicComponent component = (AtomicComponent) obj;
        return atomicType == component.atomicType
                && atomicElement.equals(component.atomicElement);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 17 * result + atomicType.ordinal();
        result = 17 * result + atomicElement.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return atomicElement;
    }
}
