package org.vandyapps.productivityapp.container;

import java.util.List;

/**
 * User: athran
 * Date: 10/28/13
 * Time: 12:16 AM
 */
public class Conversation {

    public Conversation addUser(User joiner) { return this; }

    public Conversation removeUser(User leaver) { return this; }

    public List<Msg> getAllMessages() { return null; }

    public List<Msg> getMessageInPerspectiveOf(User user) { return null; }

    public Conversation postMessage(Msg message) { return this; }


}
