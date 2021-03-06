package ru.newnope.planets.solarsystem.objects;

import ru.newnope.planets.physics.PhysicsProvider;
import ru.newnope.planets.physics.RotationPhysicsProvider;
import ru.newnope.planets.render.Texture;
import ru.newnope.planets.solarsystem.IHasAtmosphere;
import ru.newnope.planets.solarsystem.SpaceObject;

public class PlanetEarth extends SpaceObject implements IHasAtmosphere{

	private final Texture clouds = new Texture("clouds.png");
	
	private final PhysicsProvider physics;
	
	public PlanetEarth(Sun sun) {
		super("earth.png", 1.2f);
		this.physics = new RotationPhysicsProvider(sun, 19, .01f, -5f);
	}

	@Override
	public Texture getAtmosphereTexture() {
		return clouds;
	}

	@Override
	public float getAtmosphereSize() {
		return 1.26f;
	}

	@Override
	public PhysicsProvider getPhysics() {
		return physics;
	}
	
}
