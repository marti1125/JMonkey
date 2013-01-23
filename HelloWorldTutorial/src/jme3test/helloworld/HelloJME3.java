/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jme3test.helloworld;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;


/**
 *
 * @author willy
 */
public class HelloJME3 extends SimpleApplication{
    
    public static void main(String[] args){
        HelloJME3 app = new HelloJME3();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        Box box = new Box(Vector3f.ZERO, 1, 1, 1); // create cube shape at the origin
        Geometry geom = new Geometry("Box", box); // create cube geometry from the shape
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md"); // create a simple material
        mat.setColor("Color", ColorRGBA.Blue); // set color of material to blue
        geom.setMaterial(mat); // set the cube's material
        rootNode.attachChild(geom); // make the cube appear in the scene
        System.out.println("test");
    }
    
}
