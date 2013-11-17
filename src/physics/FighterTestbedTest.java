package physics;

import org.jbox2d.collision.shapes.PolygonShape;
import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.Body;
import org.jbox2d.dynamics.BodyDef;
import org.jbox2d.dynamics.BodyType;
import org.jbox2d.dynamics.FixtureDef;
import org.jbox2d.dynamics.World;
import org.jbox2d.testbed.framework.TestbedTest;

public class FighterTestbedTest extends TestbedTest{

	@Override
	public String getTestName() {
		return "Kung Foo";
	}

	@Override
	public void initTest(boolean arg0) {
		World w = getWorld();
		Vec2 grav = new Vec2(0,-2);
		w.setGravity(grav);
		BodyDef platformdef = new BodyDef();
	    platformdef.type = BodyType.STATIC;
	    platformdef.position.set(-10.0f, 0.0f);
	    Body body = m_world.createBody(platformdef);
	    PolygonShape shape = new PolygonShape();
	    shape.setAsBox(20.0f, 0.2f);
	    body.createFixture(shape, 20.0f);
	    FixtureDef fd = new FixtureDef();
	    fd.shape = shape;
	    fd.density = 1.0f;
	    fd.friction = 0.3f;
	    body.createFixture(fd);
		Character p1 = new Character(w);		
	}

}
