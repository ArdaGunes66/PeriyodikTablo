package PeriyodikTabloDene;

import javax.swing.SwingUtilities;

public class PeriyodikTablo {

    public static void main(String[] args) {
    	 SwingUtilities.invokeLater(new Runnable() {
    		    public void run() {
    		      new PeriyodikTabloElemanCalistir();
    		    }
    		  });
}

    }