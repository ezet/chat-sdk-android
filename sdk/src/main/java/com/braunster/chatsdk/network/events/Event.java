package com.braunster.chatsdk.network.events;

import com.braunster.chatsdk.dao.BMessage;
import com.braunster.chatsdk.dao.BUser;
import com.braunster.chatsdk.interfaces.AppEvents;

public class Event implements AppEvents{

    public enum Type{
        AppEvent, ThreadEvent, ThreadAddedEvent, MessageEvent, UserEvent;
    }

    protected String tag = "";
    protected String entityId = "";
    protected  Type type;

    public Event(String tag, String entityId) {
        this.tag = tag;
        this.entityId = entityId;
    }

    public Event(String tag, String entityId, Type type) {
        this.tag = tag;
        this.type = type;
        this.entityId = entityId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override
    public boolean onUserDetailsChange(BUser user) {
        return false;
    }

    @Override
    public boolean onMessageReceived(BMessage message) {
        return false;
    }

    @Override
    public boolean onThreadDetailsChanged(String threadId) {
        return false;
    }

    @Override
    public boolean onUserAddedToThread(String threadId, String userId) {
        return false;
    }

    @Override
    public boolean onThreadIsAdded(String threadId) {
        return false;
    }
}