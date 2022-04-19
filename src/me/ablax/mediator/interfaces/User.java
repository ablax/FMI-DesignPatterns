package me.ablax.mediator.interfaces;

/**
 * @author Murad Hamza on 4/19/22
 */
public abstract class User {

    final protected MessageMediator mediator;
    final protected String name;

    public User(final MessageMediator mediator, final String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void send(final String message);

    public abstract void receive(final String message);

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        final User user = (User) o;

        return getName().equals(user.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
