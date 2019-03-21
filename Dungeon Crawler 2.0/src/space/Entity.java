package space;

import life.AbstractClass;

public abstract class Entity extends AbstractSpace {

	protected AbstractClass klass;
	public Entity() {
		isAlive = true;
	}

	public AbstractClass getKlass() {
		return klass;
	}

}
