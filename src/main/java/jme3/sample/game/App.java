/*
 * Copyright (c) 2015, Simsilica, LLC
 * All rights reserved.
 * 
 * Source: https://github.com/Simsilica/Examples/blob/master/simple-jme/src/main/java/mygame/Main.java
 */
package jme3.sample.game;

import com.jme3.app.SimpleApplication;
import com.jme3.math.ColorRGBA;
import com.jme3.material.Material;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.texture.Texture;

public class App extends SimpleApplication {
    
    @Override
    public void simpleInitApp() {
        Box box = new Box(1, 1, 1);
        Geometry geometry = new Geometry("box", box);

        Material material = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        material.setColor("Color", ColorRGBA.Blue);
        
        Texture texture = assetManager.loadTexture("Textures/Monkey.png");
        material.setTexture("ColorMap", texture);
                
        geometry.setMaterial(material);
        rootNode.attachChild(geometry);
    }

    public static void main(String[] args) {
        new App().start();
    }
}
