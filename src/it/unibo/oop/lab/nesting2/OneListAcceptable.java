package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {
    private final List<T> list;

    public OneListAcceptable(List<T> list) {
	// super();
	this.list = list;
    }

    @Override
    public Acceptor<T> acceptor() {
	// TODO Auto-generated method stub
	final Iterator<T> it = list.iterator();
	return new Acceptor<T>() {

	    @Override
	    public void accept(T newElement) throws Acceptor.ElementNotAcceptedException {
		// TODO Auto-generated method stub
		try {
		    if (newElement.equals(it.next())) {
			return;
		    }
		} catch (Exception e) {
		    System.out.println("Element not accepted ");
		}
		throw new Acceptor.ElementNotAcceptedException(newElement);
	    }

	    @Override
	    public void end() throws Acceptor.EndNotAcceptedException {
		// TODO Auto-generated method stub

		if (!it.hasNext()) {
		    return;
		} else {
		    throw new Acceptor.EndNotAcceptedException();
		}
	    }

	};
    }

}
