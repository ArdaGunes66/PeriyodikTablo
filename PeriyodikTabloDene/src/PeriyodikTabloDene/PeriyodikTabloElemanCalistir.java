package PeriyodikTabloDene;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class PeriyodikTabloElemanCalistir {
	
	protected JFrame ekran2;
    protected JPanel panel2;

	public PeriyodikTabloElemanCalistir() {
		
        PeriyodikTabloPanel getir = new PeriyodikTabloPanel();
        Bilgiler bilgi = new Bilgiler();
                
                getir.A1.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        ekran2Ac(getir);
                        ekran2.setTitle("1A Grubu Bilgileri");
                        bilgi.A1BilgiOkuVeYazdir(panel2);
                    }
                });
                
                getir.A2.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    	ekran2Ac(getir);
                        ekran2.setTitle("2A Grubu Bilgileri");
                        bilgi.A2BilgiOkuVeYazdir(panel2);
                    }
                });
                
                getir.B3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    	ekran2Ac(getir);
                        ekran2.setTitle("3B Grubu Bilgileri");
                        bilgi.B3BilgiOkuVeYazdir(panel2);
                    }
                });
                
                getir.B4.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    	ekran2Ac(getir);
                        ekran2.setTitle("4B Grubu Bilgileri");
                        bilgi.B4BilgiOkuVeYazdir(panel2);
                    }
                });
                
                getir.B5.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    	ekran2Ac(getir);
                        ekran2.setTitle("5B Grubu Bilgileri");
                        bilgi.B5BilgiOkuVeYazdir(panel2);
                    }
                });
                
                getir.B6.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    	ekran2Ac(getir);
                        ekran2.setTitle("6B Grubu Bilgileri");
                        bilgi.B6BilgiOkuVeYazdir(panel2);
                    }
                });
                
                getir.B7.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    	ekran2Ac(getir);
                        ekran2.setTitle("7B Grubu Bilgileri");
                        bilgi.B7BilgiOkuVeYazdir(panel2);
                    }
                });
                
                getir.B8.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    	ekran2Ac(getir);
                        ekran2.setTitle("8B Grubu Bilgileri");
                        bilgi.B8BilgiOkuVeYazdir(panel2);
                    }
                });
                
                getir.B81.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    	ekran2Ac(getir);
                        ekran2.setTitle("8B Grubu Bilgileri");
                        bilgi.B8BilgiOkuVeYazdir(panel2);
                    }
                });
                
                getir.B82.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    	ekran2Ac(getir);
                        ekran2.setTitle("8B Grubu Bilgileri");
                        bilgi.B8BilgiOkuVeYazdir(panel2);
                    }
                });
                
                getir.B1.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    	ekran2Ac(getir);
                        ekran2.setTitle("1B Grubu Bilgileri");
                        bilgi.B1BilgiOkuVeYazdir(panel2);
                    }
                });
                
                getir.B2.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    	ekran2Ac(getir);
                        ekran2.setTitle("2B Grubu Bilgileri");
                        bilgi.B2BilgiOkuVeYazdir(panel2);
                    }
                });
                
                getir.A3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    	ekran2Ac(getir);
                        ekran2.setTitle("3A Grubu Bilgileri");
                        bilgi.A3BilgiOkuVeYazdir(panel2);
                    }
                });
                
                getir.A4.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    	ekran2Ac(getir);
                        ekran2.setTitle("4A Grubu Bilgileri");
                        bilgi.A4BilgiOkuVeYazdir(panel2);
                    }
                });
                
                getir.A5.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    	ekran2Ac(getir);
                        ekran2.setTitle("5A Grubu Bilgileri");
                        bilgi.A5BilgiOkuVeYazdir(panel2);
                    }
                });
                
                getir.A6.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    	ekran2Ac(getir);
                        ekran2.setTitle("6A Grubu Bilgileri");
                        bilgi.A6BilgiOkuVeYazdir(panel2);
                    }
                });
                
                getir.A7.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    	ekran2Ac(getir);
                        ekran2.setTitle("7A Grubu Bilgileri");
                        bilgi.A7BilgiOkuVeYazdir(panel2);
                    }
                });
                
                getir.A8.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    	ekran2Ac(getir);
                        ekran2.setTitle("8A Grubu Bilgileri");
                        bilgi.A8BilgiOkuVeYazdir(panel2);
                    }
                }); 
                
                getir.hidrojen.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    	ekran2Ac(getir);
                        ekran2.setTitle("Hidrojen Bilgileri");
                        panel2.setPreferredSize(new Dimension(450, 2430)); 
                        bilgi.HidrojenOkuVeYazdir(panel2);
                    }
                });   
                getir.helyum.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    	ekran2Ac(getir);
                        ekran2.setTitle("Helyum Bilgileri");
                        panel2.setPreferredSize(new Dimension(450, 2530)); 
                        bilgi.HelyumOkuVeYazdir(panel2);
                    }
                });   
                getir.lityum.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    	ekran2Ac(getir);
                        ekran2.setTitle("Lityum Bilgileri");
                        panel2.setPreferredSize(new Dimension(450, 2930)); 
                        bilgi.LityumOkuVeYazdir(panel2);
                    }
                });
                getir.berilyum.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    	ekran2Ac(getir);
                        ekran2.setTitle("Berilyum Bilgileri");
                        panel2.setPreferredSize(new Dimension(450, 2470)); 
                        bilgi.BerilyumOkuVeYazdir(panel2);
                    }
                });
                getir.bor.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    	ekran2Ac(getir);
                        ekran2.setTitle("Bor Bilgileri");
                        panel2.setPreferredSize(new Dimension(450, 2980)); 
                        bilgi.BorOkuVeYazdir(panel2);
                    }
                });
    }
	public void ekran2Ac(PeriyodikTabloPanel getir) {
		
	    ekran2 = new JFrame();
	    ekran2.setSize(450, 800);
	    ekran2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ekran2.setResizable(false);
	    ekran2.setLayout(null); 

	    getir.ekran.setVisible(false);
	    
	    panel2 = new JPanel();
	    panel2.setLayout(null); 
	    panel2.setPreferredSize(new Dimension(450, 800));
	   
	    JScrollPane scrollPane = new JScrollPane(panel2, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	    scrollPane.setBounds(0, 0 , 450, 810);
	    ekran2.add(scrollPane); 
	    
	    JLabel geriok = new JLabel();
	    ImageIcon geriokresim = new ImageIcon(getClass().getClassLoader().getResource("arrow (1).png")); 
	    geriok.setIcon(geriokresim);
	    geriok.setBounds(400, 10, 30, 30); 
	    panel2.add(geriok); 

	    ImageIcon image2 = new ImageIcon(getClass().getClassLoader().getResource("tablo.png"));
	    ekran2.setIconImage(image2.getImage());
	    
	    geriok.addMouseListener(new MouseAdapter() {
	        public void mouseClicked(MouseEvent e) {
	            ekran2.setVisible(false);
	            getir.ekran.setVisible(true);
	        }
	    }); 
	    
	    ekran2.setVisible(true);
	    
	}
} 