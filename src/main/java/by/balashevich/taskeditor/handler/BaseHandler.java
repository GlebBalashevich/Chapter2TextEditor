package by.balashevich.taskeditor.handler;

import by.balashevich.taskeditor.entity.BaseComponent;

public abstract class BaseHandler {
    protected BaseHandler nextHandler;

    public BaseHandler(BaseHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public abstract BaseComponent parseComponent(String componentData);
}
