package com.audiovideo;

/*
 * To extract frames from a mp4(avc) video
 * 
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.jcodec.api.FrameGrab;
import org.jcodec.api.JCodecException;

public class FramesFromVideo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, JCodecException {

        long time = System.currentTimeMillis();
        for (int i = 50; i < 57; i++) { 
            BufferedImage frame = FrameGrab.getFrame(new File("mp4test.mp4"), i);
            ImageIO.write(frame, "bmp", new File("E:\\codes\\images"+i+".bmp"));
        }
        System.out.println("Time Used:" + (System.currentTimeMillis() - time)+" Milliseconds");
    }
}