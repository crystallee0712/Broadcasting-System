package edu.bu.met.cs665.Observable;

import edu.bu.met.cs665.Observer.Drivers;

/**
 * This interface specifies a simple Observable or Subject in Observer Pattern.
 */

public interface Request {
    /**
     * Add an observer to our list of observers.
     *
     * @param driver the observer object
     */
    void addObserver(Drivers driver);

    /**
     * remove an observer from our observer list.
     *
     * @param driver the observer object
     */
    void removeObserver(Drivers driver);

    /**
     * Notify all observers.
     */
    void notifyObservers();
}
