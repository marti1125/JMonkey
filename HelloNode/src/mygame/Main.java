package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Box;

/**
 * test
 * @author normenhansen
 */
public class Main extends SimpleApplication {

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        Box box1 = new Box(Vector3f.ZERO, 1, 1, 1);
        Geometry blue = new Geometry("Box", box1);

        Material mat1 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat1.setColor("Color", ColorRGBA.Blue);
        blue.setMaterial(mat1);
        blue.move(1, -1, 1);
        
        Box box2 = new Box(Vector3f.ZERO, 1, 1, 1);
        Geometry red = new Geometry("Box", box2);

        Material mat2 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat2.setColor("Color", ColorRGBA.Red);
        red.setMaterial(mat2);
        red.move(1, 2, 1);
        
        Box box3 = new Box(Vector3f.ZERO, 1, 1, 1);
        Geometry green = new Geometry("Box", box3);

        Material mat3 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat3.setColor("Color", ColorRGBA.Green);
        green.setMaterial(mat3);
        green.move(1, 5, 1);
        
        Node pivot = new Node("pivot");
        rootNode.attachChild(pivot);
        
        pivot.attachChild(blue);
        pivot.attachChild(red);
        pivot.attachChild(green);
        
        pivot.rotate(.4f, .4f, 0f);
        
    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
