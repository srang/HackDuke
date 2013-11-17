package physics;

import org.jbox2d.collision.shapes.PolygonShape;
import org.jbox2d.dynamics.Body;
import org.jbox2d.dynamics.BodyDef;
import org.jbox2d.dynamics.BodyType;
import org.jbox2d.dynamics.World;

public class Character {
	public Character(World m_world) {
	      BodyDef bd = new BodyDef();
	      bd.type = BodyType.DYNAMIC;
	      bd.position.set(-5.0f, 7.0f);
	      Body torso = m_world.createBody(bd);
	      PolygonShape shape = new PolygonShape();
	      shape.setAsBox(1.0f, 2.0f);
	      torso.createFixture(shape, 20.0f);
	      
	      bd = new BodyDef();
	      bd.type = BodyType.DYNAMIC;
	      bd.position.set(-5.0f, 6.7f);
	      Body arm1 = m_world.createBody(bd);
	      shape = new PolygonShape();
	      shape.setAsBox(0.3f,1.5f);
	      arm1.createFixture(shape, 20.0f);
	}
}
