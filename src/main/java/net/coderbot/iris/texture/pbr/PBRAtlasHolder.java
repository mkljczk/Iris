package net.coderbot.iris.texture.pbr;

import org.jetbrains.annotations.Nullable;

public class PBRAtlasHolder {
	protected PBRAtlasTexture normalAtlas;
	protected PBRAtlasTexture specularAtlas;
	protected PBRAtlasTexture metalnessAtlas;

	@Nullable
	public PBRAtlasTexture getNormalAtlas() {
		return normalAtlas;
	}

	@Nullable
	public PBRAtlasTexture getSpecularAtlas() {
		return specularAtlas;
	}

	public void setNormalAtlas(PBRAtlasTexture atlas) {
		normalAtlas = atlas;
	}

	public void setSpecularAtlas(PBRAtlasTexture atlas) {
		specularAtlas = atlas;
	}

	public void setMetalnessAtlas(PBRAtlasTexture atlas) {
		metalnessAtlas = atlas;
	}

	public void cycleAnimationFrames() {
		if (normalAtlas != null) {
			normalAtlas.cycleAnimationFrames();
		}
		if (specularAtlas != null) {
			specularAtlas.cycleAnimationFrames();
		}
		if (metalnessAtlas != null) {
			metalnessAtlas.cycleAnimationFrames();
		}
	}
}
