package renderEngine;

import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFW;

public class DisplayManager{
    
    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;

    public static void createDisplay(){
        GLFWErrorCallback.createPrint(System.err).set();
        if(!glfwInit())
            throw new IlegalStateException("Unable to Initialize GLFW");
        GLFW.glfwDefaultWindowHints();
        GLFW.glfwWindowHinit(GLFW.GLFW_VISIBLE, GLFW.GLFW_FALSE);
        GLFW.glfwWindowHinit(GLFW.GLFW_RESIZABLE, GLFW.GLFW_TRUE);
        
    }
    public static void updateDisplay(){}
    public static void closeDisplay(){}

}
