package by.balashevich.taskeditor.entity;

import java.util.List;

public class TextComponent extends BaseComponent {
    private static final String EMPTY_DELIMITER = "";
    private static final String TABULATION_DELIMITER = "\n\t";
    private static final String ELEMENT_DELIMITER = " ";

    public TextComponent(ComponentType componentType) {
        this.componentType = componentType;
    }

    @Override
    public void add(BaseComponent childComponent) {
        childComponentList.add(childComponent);
    }

    @Override
    public void addAll(List<BaseComponent> childComponents) {
        childComponentList.addAll(childComponents);
    }

    @Override
    public void remove(BaseComponent childComponent) {
        childComponentList.remove(childComponent);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        TextComponent component = (TextComponent) obj;

        return this.componentType == component.componentType
                && this.childComponentList.equals(component.childComponentList);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 17 * result + componentType.ordinal();
        result = 17 * result + componentType.hashCode();
        return result;
    }

    @Override
    public String toString() {
        String delimiter;
        if (componentType == ComponentType.WHOLE_TEXT) {
            delimiter = TABULATION_DELIMITER;
        } else if (componentType == ComponentType.LEXEME) {
            delimiter = EMPTY_DELIMITER;
        } else {
            delimiter = ELEMENT_DELIMITER;
        }

        StringBuilder stringBuilder = new StringBuilder(delimiter);
        for (BaseComponent component : childComponentList) {
            stringBuilder.append(delimiter);
            stringBuilder.append(component.toString().trim());
        }

        return stringBuilder.toString();
    }
}
