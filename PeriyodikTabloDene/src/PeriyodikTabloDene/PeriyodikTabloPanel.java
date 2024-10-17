package PeriyodikTabloDene;

import java.awt.*;
import javax.swing.*;

public class PeriyodikTabloPanel{
	
	protected JLabel A1;
	protected JLabel A2;
	protected JLabel B3;
	protected JLabel B4;
	protected JLabel B5;
	protected JLabel B6;
	protected JLabel B7;
	protected JLabel B8;
	protected JLabel B81;
	protected JLabel B82;
	protected JLabel B1;
	protected JLabel B2;
	protected JLabel A3;
	protected JLabel A4;
	protected JLabel A5;
	protected JLabel A6;
	protected JLabel A7;
	protected JLabel A8;
	
	protected JFrame ekran;
	
	protected JLabel hidrojen;
	protected JLabel helyum;
	protected JLabel lityum;
	protected JLabel berilyum;
	protected JLabel bor;
	
	public PeriyodikTabloPanel(){
		
		 ekran = new JFrame("Periyodik Tablo");
		
		 ImageIcon image = new ImageIcon(getClass().getClassLoader().getResource("tablo.png"));
	     ekran.setIconImage(image.getImage());
		
	        ekran.setSize(800, 500);
	        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        ekran.setLayout(new BorderLayout());
	        ekran.setResizable(false);
	            
			JPanel panel = new JPanel(null) {	   
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                
	                int kareBoyutu = 35;
	                int baslangicX = 70; 
	                int baslangicY = 50;
	                int ilerlemeX = 0;
	                int ilerlemeXnumaralar = 0;
	                int kareleriboya = 0;
	                int kareleriboyaY = 0;
	                String numaralar;       
	                
	                Color ametaller = new Color(202,225,255);
	                Color alkalimetaller = new Color(193,225,193);
	                Color toprakalkalimetaller = new Color(255,240,245);
	                Color gecismetalleri = new Color(230,230,250);
	                Color yarimetaller = new Color(238,238,209);
	                Color aragecismetalleri = new Color(174,238,238);
	                Color soygazlar = new Color(238,180,180);
	                Color ozellikleribilinmeyen = new Color(207,207,207);
	                Color lantanitler = new Color(255,165,79);
	                Color aktinitler = new Color(224,238,224);
	                
	                g.setColor(ametaller);
		            g.fillRect(70, 50, kareBoyutu, kareBoyutu);
		            for(int i = 0; i < 4; i++) {
		              g.fillRect(535 + kareleriboya, 85 , kareBoyutu, kareBoyutu);
		              kareleriboya += 35;
		            }
		            kareleriboya = 0;
		            for(int i = 0; i < 3; i++) {
		              g.fillRect(570 + kareleriboya, 120 , kareBoyutu, kareBoyutu);
		              kareleriboya += 35;
		            }
		            kareleriboya = 0;
		            for(int i = 0; i < 2; i++) {
			          g.fillRect(605 + kareleriboya, 155 , kareBoyutu, kareBoyutu);
			          kareleriboya += 35;
			        }
		            g.fillRect(640, 190 , kareBoyutu, kareBoyutu);
		            kareleriboya = 0;
		            g.setColor(alkalimetaller);
		            for(int i = 0; i < 6; i++) {
		              g.fillRect(70, 85 + kareleriboya ,kareBoyutu , kareBoyutu);
		              kareleriboya += 35;
		            }
		            kareleriboya = 0;
		            g.setColor(toprakalkalimetaller);
		            for(int i = 0; i < 6; i++) {
		              g.fillRect(105, 85 + kareleriboya ,kareBoyutu , kareBoyutu);
		              kareleriboya += 35;
		            }
		              kareleriboya = 0;
		              g.setColor(gecismetalleri);
		            for(int i = 0; i < 2; i++) {
		              g.fillRect(140, 155 + kareleriboya, kareBoyutu, kareBoyutu);
		              kareleriboya += 35;
		            }
		              kareleriboya = 0;
		            for(int i = 0; i < 4; i++) {
		              for(int k = 0; k < 5; k++) {
		            	  g.fillRect(185 + kareleriboya, 155 + kareleriboyaY, kareBoyutu, kareBoyutu);
		            	  kareleriboya += 35;
		              }
		              kareleriboya = 0;
		              kareleriboyaY += 35;
		            }
		            kareleriboyaY = 0;
		            kareleriboya = 0;
		            for(int i = 0; i < 3; i++) {
			              for(int k = 0; k < 4; k++) {
			           	  g.fillRect(360 + kareleriboya, 155 + kareleriboyaY, kareBoyutu, kareBoyutu);
			              kareleriboya += 35;
			              }
			              kareleriboya = 0;
			              kareleriboyaY += 35;
			            }
			            kareleriboyaY = 0;
			            kareleriboya = 0;
			            g.setColor(yarimetaller);
			            g.fillRect(500, 85, kareBoyutu, kareBoyutu);
			        for(int i = 0; i < 2; i++) {
			        	g.fillRect(535, 120 + kareleriboya, kareBoyutu, kareBoyutu);
			        	kareleriboya += 35;
			        }
			        kareleriboya = 0;
			        for(int i = 0; i < 2; i++) {
			        	g.fillRect(570, 155 + kareleriboya, kareBoyutu, kareBoyutu);
			        	kareleriboya += 35;
			        }
			        kareleriboya = 0;
			        g.fillRect(605, 190, kareBoyutu, kareBoyutu);
			        g.setColor(aragecismetalleri);
			        for(int i = 0; i < 4; i++) {
			        	g.fillRect(500 , 120 + kareleriboya , kareBoyutu, kareBoyutu);
			        	kareleriboya += 35;
			        }
			        kareleriboya = 0;
			        g.fillRect(535, 190, kareBoyutu, kareBoyutu);
			        for(int i = 0; i < 4; i++) {
			        	g.fillRect(535 + kareleriboya, 225, kareBoyutu, kareBoyutu);
			        	kareleriboya += 35;
			        }
			        kareleriboya = 0;
			        g.setColor(soygazlar);
			        for(int i = 0; i < 6; i++) {
			        	g.fillRect(675 , 50 + kareleriboya, kareBoyutu, kareBoyutu);
			        	kareleriboya += 35;
			        }
			        kareleriboya = 0;
			        g.setColor(ozellikleribilinmeyen);
			        for(int i = 0; i < 10; i++) {
			        	g.fillRect(360 + kareleriboya, 260, kareBoyutu, kareBoyutu);
			        	kareleriboya += 35;
			        }
			        kareleriboya = 0;
			        g.setColor(lantanitler);
			        g.fillRect(140, 225, kareBoyutu, kareBoyutu);
			        for(int i = 0; i < 14; i++) {
			        	g.fillRect(185 + kareleriboya, 305, kareBoyutu, kareBoyutu);
			        	kareleriboya += 35;
			        }
			        kareleriboya = 0;
			        g.setColor(aktinitler);
			        g.fillRect(140, 260, kareBoyutu, kareBoyutu);
			        for(int i = 0; i < 14; i++) {
			        	g.fillRect(185 + kareleriboya, 340, kareBoyutu, kareBoyutu);
			        	kareleriboya += 35; 
			        }
			        kareleriboya = 0;
			        g.setColor(Color.black);
			            		         		   
	             for (int k = 0; k < 7; k++) {
	              g.drawRect(baslangicX, baslangicY + k * (kareBoyutu), kareBoyutu, kareBoyutu);
	             }
	             for(int k = 0; k < 6; k++) {
	              g.drawRect(baslangicX + 35, baslangicY + 35 + k * (kareBoyutu), kareBoyutu, kareBoyutu);
	             }
	             for(int k = 0; k < 4; k++) {
	              g.drawRect(baslangicX + 70, baslangicY + 105 + k * (kareBoyutu), kareBoyutu, kareBoyutu);
	             }
	             for(int i = 0; i < 9; i++) {
	               for(int k = 0; k < 4; k++) {
	                g.drawRect(baslangicX + 115 + ilerlemeX, baslangicY + 105 + k * (kareBoyutu), kareBoyutu, kareBoyutu);
	               }
	               ilerlemeX += 35;             
	             }
	             ilerlemeX = 0;
	             for(int i = 0; i < 5; i++) {
	               for(int k = 0; k < 6; k++) {
	                g.drawRect(baslangicX + 430 + ilerlemeX, baslangicY + 35 + k * (kareBoyutu), kareBoyutu, kareBoyutu);
	               }
	               ilerlemeX += 35;
	             }
	             ilerlemeX = 0;
	             for(int k = 0; k < 7; k++) {
	                g.drawRect(baslangicX + 605 , baslangicY + k * (kareBoyutu), kareBoyutu, kareBoyutu);
	               }
	             for(int i = 0; i < 14; i++) {
	               for(int k = 0; k < 2; k++) {
	                g.drawRect(baslangicX + 115 + ilerlemeX, baslangicY + 255 + k * (kareBoyutu), kareBoyutu, kareBoyutu);
	               }
	             ilerlemeX += 35;
	            }
	             for(int i = 1; i < 3 ; i++) {
	                 numaralar = Integer.toString(i);
	               g.drawString(numaralar, baslangicX + ilerlemeXnumaralar, baslangicY + 10);
	               ilerlemeXnumaralar += 606;
	             }
	             ilerlemeXnumaralar = 0;
	             for(int i = 3; i < 5; i++) {
	            	 numaralar = Integer.toString(i);
	               g.drawString(numaralar, baslangicX + ilerlemeXnumaralar + 1, baslangicY + 45);
	               ilerlemeXnumaralar += 35;
	             }
	             ilerlemeXnumaralar = 0;
	             for(int i = 5; i < 11; i++) {
	            	 numaralar = Integer.toString(i);
	               g.drawString(numaralar, baslangicX + ilerlemeXnumaralar + 431, baslangicY + 45);
	               ilerlemeXnumaralar += 35;
	             }
	             ilerlemeXnumaralar = 0;
	             for(int i = 11; i < 13; i++) {
	            	 numaralar = Integer.toString(i);
	               g.drawString(numaralar, baslangicX + ilerlemeXnumaralar + 1, baslangicY + 80);
	               ilerlemeXnumaralar += 35;
	             }
	             ilerlemeXnumaralar = 0;
	             for(int i = 13; i < 19; i++) {
	            	 numaralar = Integer.toString(i);
	               g.drawString(numaralar, baslangicX + ilerlemeXnumaralar + 431, baslangicY + 80);
	               ilerlemeXnumaralar += 35;
	             }
	             ilerlemeXnumaralar = 0;
	             for(int i = 19; i < 22; i++) {
	            	 numaralar = Integer.toString(i);
	               g.drawString(numaralar, baslangicX + ilerlemeXnumaralar + 1, baslangicY + 115);
	               ilerlemeXnumaralar += 35;
	             }
	             ilerlemeXnumaralar = 0;
	             for(int i = 22; i < 37; i++) {
	            	 numaralar = Integer.toString(i);
	               g.drawString(numaralar, baslangicX + ilerlemeXnumaralar + 116, baslangicY + 115);
	               ilerlemeXnumaralar += 35;
	             }
	             ilerlemeXnumaralar = 0;
	             for(int i = 37; i < 40; i++) {
	            	 numaralar = Integer.toString(i);
	               g.drawString(numaralar, baslangicX + ilerlemeXnumaralar + 1, baslangicY + 150);
	               ilerlemeXnumaralar += 35;
	             }
	             ilerlemeXnumaralar = 0;
	             for(int i = 40; i < 55; i++) {
	            	 numaralar = Integer.toString(i);
	               g.drawString(numaralar, baslangicX + ilerlemeXnumaralar + 116, baslangicY + 150);
	               ilerlemeXnumaralar += 35;
	             }
	             ilerlemeXnumaralar = 0;
	             for(int i = 55; i < 58; i++) {
	            	 numaralar = Integer.toString(i);
	               g.drawString(numaralar, baslangicX + ilerlemeXnumaralar + 1, baslangicY + 185);
	               ilerlemeXnumaralar += 35;
	             }
	             ilerlemeXnumaralar = 0;
	             for(int i = 72; i < 87; i++) {
	            	 numaralar = Integer.toString(i);
	               g.drawString(numaralar, baslangicX + ilerlemeXnumaralar + 116, baslangicY + 185);
	               ilerlemeXnumaralar += 35;
	             }
	             ilerlemeXnumaralar = 0;
	             for(int i = 87; i < 90; i++) {
	            	 numaralar = Integer.toString(i);
	               g.drawString(numaralar, baslangicX + ilerlemeXnumaralar + 1, baslangicY + 220);
	               ilerlemeXnumaralar += 35;
	             }
	             ilerlemeXnumaralar = 0;
	             for(int i = 104; i < 119; i++) {
	            	 numaralar = Integer.toString(i);
	               g.drawString(numaralar, baslangicX + ilerlemeXnumaralar + 116, baslangicY + 220);
	               ilerlemeXnumaralar += 35;
	             }
	             ilerlemeXnumaralar = 0;
	             for(int i = 58; i < 72; i++) {
	            	 numaralar = Integer.toString(i);
	               g.drawString(numaralar, baslangicX + ilerlemeXnumaralar + 116, baslangicY + 265);
	               ilerlemeXnumaralar += 35;
	             }
	             ilerlemeXnumaralar = 0;
	             for(int i = 90; i < 104; i++) {
	            	 numaralar = Integer.toString(i);
	               g.drawString(numaralar, baslangicX + ilerlemeXnumaralar + 116, baslangicY + 300);
	               ilerlemeXnumaralar += 35;
	             }  
	               g.setColor(Color.black);
	               g.drawOval(100, 400, 8, 8);
	               g.setColor(ametaller);
	               g.fillOval(100, 400, 8, 8);
	               
	               g.setColor(Color.black);
	               g.drawOval(190, 400, 8, 8);
	               g.setColor(alkalimetaller);
	               g.fillOval(190, 400, 8, 8);
	               
	               g.setColor(Color.black);
	               g.drawOval(310, 400, 8, 8);
	               g.setColor(toprakalkalimetaller);
	               g.fillOval(310, 400, 8, 8);
	               
	               g.setColor(Color.black);
	               g.drawOval(470, 400, 8, 8);
	               g.setColor(gecismetalleri);
	               g.fillOval(470, 400, 8, 8);
	               
	               g.setColor(Color.black);
	               g.drawOval(600, 400, 8, 8);
	               g.setColor(yarimetaller);
	               g.fillOval(600, 400, 8, 8);
	               
	               g.setColor(Color.black);
	               g.drawOval(100, 430, 8, 8);
	               g.setColor(aragecismetalleri);
	               g.fillOval(100, 430, 8, 8);
	               
	               g.setColor(Color.black);
	               g.drawOval(240, 430, 8, 8);
	               g.setColor(soygazlar);
	               g.fillOval(240, 430, 8, 8);
	               
	               g.setColor(Color.black);
	               g.drawOval(330, 430, 8, 8);
	               g.setColor(ozellikleribilinmeyen);
	               g.fillOval(330, 430, 8, 8);
	               
	               g.setColor(Color.black);
	               g.drawOval(490, 430, 8, 8);
	               g.setColor(lantanitler);
	               g.fillOval(490, 430, 8, 8);
	               
	               g.setColor(Color.black);
	               g.drawOval(600, 430, 8, 8);
	               g.setColor(aktinitler);
	               g.fillOval(600, 430, 8, 8);
	               
	            }	        
	        };
	        
	        A1 = new JLabel("1A");
	        A1.setBounds(74, 25, 25, 25);
	        A1.setFont(new Font("Times New Roman",Font.PLAIN,20));
	        panel.add(A1);
	        
	        A2 = new JLabel("2A");
	        A2.setBounds(111, 60, 25, 25);
	        A2.setFont(new Font("Times New Roman",Font.PLAIN,20));
	        panel.add(A2);
	        
	        B3 = new JLabel("3B");
	        B3.setBounds(146, 130, 25, 25);
	        B3.setFont(new Font("Times New Roman",Font.PLAIN,20));
	        panel.add(B3);
	        
	        B4 = new JLabel("4B");
	        B4.setBounds(189, 130, 25, 25);
	        B4.setFont(new Font("Times New Roman",Font.PLAIN,20));
	        panel.add(B4);
	        
	        B5 = new JLabel("5B");
	        B5.setBounds(225, 130, 25, 25);
	        B5.setFont(new Font("Times New Roman",Font.PLAIN,20));
	        panel.add(B5);
	        
	        B6 = new JLabel("6B");
	        B6.setBounds(260, 130, 25, 25);
	        B6.setFont(new Font("Times New Roman",Font.PLAIN,20));
	        panel.add(B6);
	        
	        B7 = new JLabel("7B");
	        B7.setBounds(296, 130, 25, 25);
	        B7.setFont(new Font("Times New Roman",Font.PLAIN,20));
	        panel.add(B7);
	        
	        B8 = new JLabel("8B");
	        B8.setBounds(330, 130, 25, 25);
	        B8.setFont(new Font("Times New Roman",Font.PLAIN,20));
	        panel.add(B8);
	        
	        B81 = new JLabel("8B");
	        B81.setBounds(365, 130, 25, 25);
	        B81.setFont(new Font("Times New Roman",Font.PLAIN,20));
	        panel.add(B81);
	        
	        B82 = new JLabel("8B");
	        B82.setBounds(400, 130, 25, 25);
	        B82.setFont(new Font("Times New Roman",Font.PLAIN,20));
	        panel.add(B82);
	        
	        B1 = new JLabel("1B");
	        B1.setBounds(434, 130, 25, 25);
	        B1.setFont(new Font("Times New Roman",Font.PLAIN,20));
	        panel.add(B1);
	        
	        B2 = new JLabel("2B");
	        B2.setBounds(470, 130, 25, 25);
	        B2.setFont(new Font("Times New Roman",Font.PLAIN,20));
	        panel.add(B2);
	        
	        A3 = new JLabel("3A");
	        A3.setBounds(504, 60, 25, 25);
	        A3.setFont(new Font("Times New Roman",Font.PLAIN,20));
	        panel.add(A3);
	        
	        A4 = new JLabel("4A");
	        A4.setBounds(539, 60, 25, 25);
	        A4.setFont(new Font("Times New Roman",Font.PLAIN,20));
	        panel.add(A4);
	        
	        A5 = new JLabel("5A");
	        A5.setBounds(574, 60, 25, 25);
	        A5.setFont(new Font("Times New Roman",Font.PLAIN,20));
	        panel.add(A5);
	        
	        A6 = new JLabel("6A");
	        A6.setBounds(610, 60, 25, 25);
	        A6.setFont(new Font("Times New Roman",Font.PLAIN,20));
	        panel.add(A6);
	        
	        A7 = new JLabel("7A");
	        A7.setBounds(645, 60, 25, 25);
	        A7.setFont(new Font("Times New Roman",Font.PLAIN,20));
	        panel.add(A7);
	        
	        A8 = new JLabel("8A");
	        A8.setBounds(680, 25, 25, 25);
	        A8.setFont(new Font("Times New Roman",Font.PLAIN,20));
	        panel.add(A8);
	        
	        //-----------------------------------------------------------------	
	        
	        JLabel ametaller2 = new JLabel("Ametaller");
            ametaller2.setBounds(110, 399, 70, 10);
	        panel.add(ametaller2);
	        
	        JLabel alkalimetaller2 = new JLabel("Alkali Metaller");
            alkalimetaller2.setBounds(200, 399, 90, 10);
	        panel.add(alkalimetaller2);
	        
	        JLabel toprakalkalimetaller2 = new JLabel("Toprak Alkali Metaller");
            toprakalkalimetaller2.setBounds(320, 396, 130, 15);
	        panel.add(toprakalkalimetaller2);
	        
	        JLabel gecismetalleri2 = new JLabel("Geçiş Metalleri");
            gecismetalleri2.setBounds(481, 396, 130, 15);
	        panel.add(gecismetalleri2);
	        
	        JLabel yarimetaller2 = new JLabel("Yarı Metaller");
            yarimetaller2.setBounds(610, 396, 130, 15);
	        panel.add(yarimetaller2);
	        
	        JLabel aragecismetalleri2 = new JLabel("Ara Geçiş Metalleri");
            aragecismetalleri2.setBounds(110, 427, 130, 15);
	        panel.add(aragecismetalleri2);
	        
	        JLabel soygazlar2 = new JLabel("Soygazlar");
            soygazlar2.setBounds(250, 427, 130, 15);
	        panel.add(soygazlar2);
	        
	        JLabel ozelligibilinmeyenler2 = new JLabel("Özelliği Bilinmeyenler");
	        ozelligibilinmeyenler2.setBounds(341, 427, 130, 15);
	        panel.add(ozelligibilinmeyenler2);
	        
	        JLabel lantanit2 = new JLabel("Lantanitler");
	        lantanit2.setBounds(500, 426, 130, 15);
	        panel.add(lantanit2);
	        
	        JLabel aktinitler2 = new JLabel("Aktinitler");
	        aktinitler2.setBounds(610, 426, 130, 15);
	        panel.add(aktinitler2);
	        
	        //-----------------------------------------------------------------	
	        
	        hidrojen = new JLabel("H");
	        hidrojen.setBounds(79,55,30,30);
	        hidrojen.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(hidrojen);
	    
	        helyum = new JLabel("He");
	        helyum.setBounds(679,55,30,30);
	        helyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(helyum);
	        
	        lityum = new JLabel("Li");
	        lityum.setBounds(79,89,30,30);
	        lityum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(lityum);
	        
	        berilyum = new JLabel("Be");
	        berilyum.setBounds(110,89,30,30);
	        berilyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(berilyum);
	        
	        bor = new JLabel("B");
	        bor.setBounds(509,85,40,40);
	        bor.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(bor);
	        
	        JLabel karbon = new JLabel("C");
	        karbon.setBounds(544,85,40,40);
	        karbon.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(karbon);
	        
	        JLabel azot = new JLabel("N");
	        azot.setBounds(579,85,40,40);
	        azot.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(azot);
	        
	        JLabel oksijen = new JLabel("O");
	        oksijen.setBounds(614,85,40,40);
	        oksijen.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(oksijen);
	        
	        JLabel flor = new JLabel("F");
	        flor.setBounds(649,85,40,40);
	        flor.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(flor);
	       
	        JLabel neon = new JLabel("Ne");
	        neon.setBounds(679,85,40,40);
	        neon.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(neon);
	        
	        JLabel sodyum = new JLabel("Na");
	        sodyum.setBounds(74,120,40,40);
	        sodyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(sodyum);
	        
	        JLabel magnezyum = new JLabel("Mg");
	        magnezyum.setBounds(107,120,40,40);
	        magnezyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(magnezyum);
	        
	        JLabel alüminyum = new JLabel("Al");
	        alüminyum.setBounds(506,120,40,40);
	        alüminyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(alüminyum);
	        
	        JLabel silisyum = new JLabel("Si");
	        silisyum.setBounds(541,120,40,40);
	        silisyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(silisyum);
	        
	        JLabel fosfor = new JLabel("P");
	        fosfor.setBounds(579,120,40,40);
	        fosfor.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(fosfor);
	        
	        JLabel kukurt = new JLabel("S");
	        kukurt.setBounds(614,120,40,40);
	        kukurt.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(kukurt);
	        
	        JLabel klor = new JLabel("Cl");
	        klor.setBounds(645,120,40,40);
	        klor.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(klor);
	        
	        JLabel argon = new JLabel("Ar");
	        argon.setBounds(681,120,40,40);
	        argon.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(argon);
	        
	        JLabel potasyum = new JLabel("K");
	        potasyum.setBounds(79,155,40,40);
	        potasyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(potasyum);
	        
	        JLabel kalsiyum = new JLabel("Ca");
	        kalsiyum.setBounds(109,155,40,40);
	        kalsiyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(kalsiyum);
	        
	        JLabel skandinyum = new JLabel("Sc");
	        skandinyum.setBounds(144,155,40,40);
	        skandinyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(skandinyum);
	        
	        JLabel titanyum = new JLabel("Ti");
	        titanyum.setBounds(191,155,40,40);
	        titanyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(titanyum);
	        
	        JLabel vanadyum = new JLabel("V");
	        vanadyum.setBounds(229,155,40,40);
	        vanadyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(vanadyum);
	        
	        JLabel krom = new JLabel("Cr");
	        krom.setBounds(259,155,40,40);
	        krom.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(krom);
	        
	        JLabel manganez = new JLabel("Mn");
	        manganez.setBounds(292,155,40,40);
	        manganez.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(manganez);
	        
	        JLabel demir = new JLabel("Fe");
	        demir.setBounds(330,155,40,40);
	        demir.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(demir);
	        
	        JLabel kobalt = new JLabel("Co");
	        kobalt.setBounds(362,155,40,40);
	        kobalt.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(kobalt);
	        
	        JLabel nikel = new JLabel("Ni");
	        nikel.setBounds(400,155,40,40);
	        nikel.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(nikel);
	        
	        JLabel bakir = new JLabel("Cu");
	        bakir.setBounds(433,155,40,40);
	        bakir.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(bakir);
	        
	        JLabel cinko = new JLabel("Zn");
	        cinko.setBounds(469,155,40,40);
	        cinko.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(cinko);
	        
	        JLabel galyum = new JLabel("Ga");
	        galyum.setBounds(502,155,40,40);
	        galyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(galyum);
	        
	        JLabel germenyum = new JLabel("Ge");
	        germenyum.setBounds(537,155,40,40);
	        germenyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(germenyum);
	        
	        JLabel arsenik = new JLabel("As");
	        arsenik.setBounds(574,155,40,40);
	        arsenik.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(arsenik);
	        
	        JLabel selenyum = new JLabel("Se");
	        selenyum.setBounds(608,155,40,40);
	        selenyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(selenyum);
	        
	        JLabel brom = new JLabel("Br");
	        brom.setBounds(645,155,40,40);
	        brom.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(brom);
	        
	        JLabel kripton = new JLabel("Kr");
	        kripton.setBounds(681,155,40,40);
	        kripton.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(kripton);
	        
	        JLabel rubidyum = new JLabel("Rb");
	        rubidyum.setBounds(73,190,40,40);
	        rubidyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(rubidyum);
	        
	        JLabel stronsiyum = new JLabel("Sr");
	        stronsiyum.setBounds(111,190,40,40);
	        stronsiyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(stronsiyum);
	        
	        JLabel itriyum = new JLabel("Y");
	        itriyum.setBounds(150,190,40,40);
	        itriyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(itriyum);
	        
	        JLabel zirkonyum = new JLabel("Zr");
	        zirkonyum.setBounds(191,190,40,40);
	        zirkonyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(zirkonyum);
	        
	        JLabel niyobyum = new JLabel("Nb");
	        niyobyum.setBounds(223,190,40,40);
	        niyobyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(niyobyum);
	        
	        JLabel molibden = new JLabel("Mo");
	        molibden.setBounds(257,190,40,40);
	        molibden.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(molibden);
	        
	        JLabel teknesyum = new JLabel("Tc");
	        teknesyum.setBounds(295,190,40,40);
	        teknesyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(teknesyum);
	        
	        JLabel rutenyum = new JLabel("Ru");
	        rutenyum.setBounds(328,190,40,40);
	        rutenyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(rutenyum);
	        
	        JLabel rodyum = new JLabel("Rh");
	        rodyum.setBounds(363,190,40,40);
	        rodyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(rodyum);
	        
	        JLabel paladyum = new JLabel("Pd");
	        paladyum.setBounds(399,190,40,40);
	        paladyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(paladyum);
	        
	        JLabel gumus = new JLabel("Ag");
	        gumus.setBounds(434,190,40,40);
	        gumus.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(gumus);
	        
	        JLabel kadmiyum = new JLabel("Cd");
	        kadmiyum.setBounds(468,190,40,40);
	        kadmiyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(kadmiyum);
	        
	        JLabel indiyum = new JLabel("In");
	        indiyum.setBounds(508,190,40,40);
	        indiyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(indiyum);
	        
	        JLabel kalay = new JLabel("Sn");
	        kalay.setBounds(538,190,40,40);
	        kalay.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(kalay);
	        
	        JLabel antimon = new JLabel("Sb");
	        antimon.setBounds(574,190,40,40);
	        antimon.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(antimon);
	        
	        JLabel tellur = new JLabel("Te");
	        tellur.setBounds(610,190,40,40);
	        tellur.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(tellur);
	        
	        JLabel iyot = new JLabel("I");
	        iyot.setBounds(654,190,40,40);
	        iyot.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(iyot);
	        
	        JLabel ksenon = new JLabel("Xe");
	        ksenon.setBounds(680,190,40,40);
	        ksenon.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(ksenon);
	        
	        JLabel sezyum = new JLabel("Cs");
	        sezyum.setBounds(73,225,40,40);
	        sezyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(sezyum);
	        
	        JLabel baryum = new JLabel("Ba");
	        baryum.setBounds(109,225,40,40);
	        baryum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(baryum);
	        
	        JLabel lantan = new JLabel("La");
	        lantan.setBounds(145,225,40,40);
	        lantan.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(lantan);
	        
	        JLabel hafniyum = new JLabel("Hf");
	        hafniyum.setBounds(190,225,40,40);
	        hafniyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(hafniyum);
	        
	        JLabel tantal = new JLabel("Ta");
	        tantal.setBounds(225,225,40,40);
	        tantal.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(tantal);
	        
	        JLabel tungsten = new JLabel("W");
	        tungsten.setBounds(261,225,40,40);
	        tungsten.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(tungsten);
	        
	        JLabel renyum = new JLabel("Re");
	        renyum.setBounds(293,225,40,40);
	        renyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(renyum);
	        
	        JLabel osmiyum = new JLabel("Os");
	        osmiyum.setBounds(328,225,40,40);
	        osmiyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(osmiyum);
	        
	        JLabel iridyum = new JLabel("Ir");
	        iridyum.setBounds(369,225,40,40);
	        iridyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(iridyum);
	        
	        JLabel platin = new JLabel("Pt");
	        platin.setBounds(401,225,40,40);
	        platin.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(platin);
	        
	        JLabel altin = new JLabel("Au");
	        altin.setBounds(434,225,40,40);
	        altin.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(altin);
	        
	        JLabel civa = new JLabel("Hg");
	        civa.setBounds(469,225,40,40);
	        civa.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(civa);
	        
	        JLabel talyum = new JLabel("Tl");
	        talyum.setBounds(507,225,40,40);
	        talyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(talyum);
	        
	        JLabel kursun = new JLabel("Pb");
	        kursun.setBounds(539,225,40,40);
	        kursun.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(kursun);
	        
	        JLabel bizmut = new JLabel("Bi");
	        bizmut.setBounds(576,225,40,40);
	        bizmut.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(bizmut);
	        
	        JLabel polonyum = new JLabel("Po");
	        polonyum.setBounds(609,225,40,40);
	        polonyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(polonyum);
	        
	        JLabel astatin = new JLabel("At");
	        astatin.setBounds(646,225,40,40);
	        astatin.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(astatin);
	        
	        JLabel radon = new JLabel("Rn");
	        radon.setBounds(679,225,40,40);
	        radon.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(radon);
	        
	        JLabel fransiyum = new JLabel("Fr");
	        fransiyum.setBounds(76,260,40,40);
	        fransiyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(fransiyum);
	        
	        JLabel radyum = new JLabel("Ra");
	        radyum.setBounds(109,260,40,40);
	        radyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(radyum);
	        
	        JLabel aktinyum = new JLabel("Ac");
	        aktinyum.setBounds(145,260,40,40);
	        aktinyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(aktinyum);
	        
	        JLabel rutherfordiyum = new JLabel("Rf");
	        rutherfordiyum.setBounds(190,260,40,40);
	        rutherfordiyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(rutherfordiyum);
	        
	        JLabel dubniyum = new JLabel("Db");
	        dubniyum.setBounds(223,260,40,40);
	        dubniyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(dubniyum);
	        
	        JLabel seaborgiyum = new JLabel("Sg");
	        seaborgiyum.setBounds(259,260,40,40);
	        seaborgiyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(seaborgiyum);
	        
	        JLabel bohriyum = new JLabel("Bh");
	        bohriyum.setBounds(294,260,40,40);
	        bohriyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(bohriyum);
	        
	        JLabel hassiyum = new JLabel("Hs");
	        hassiyum.setBounds(329,260,40,40);
	        hassiyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(hassiyum);
	        
	        JLabel meitneriyum = new JLabel("Mt");
	        meitneriyum.setBounds(364,260,40,40);
	        meitneriyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(meitneriyum);
	        
	        JLabel darmstadtiyum = new JLabel("Ds");
	        darmstadtiyum.setBounds(399,260,40,40);
	        darmstadtiyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(darmstadtiyum);
	        
	        JLabel rontgenyum = new JLabel("Rg");
	        rontgenyum.setBounds(433,260,40,40);
	        rontgenyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(rontgenyum);
	        
	        JLabel kopernikyum = new JLabel("Cn");
	        kopernikyum.setBounds(468,260,40,40);
	        kopernikyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(kopernikyum);
	        
	        JLabel nihoniyum = new JLabel("Cn");
	        nihoniyum.setBounds(503,260,40,40);
	        nihoniyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(nihoniyum);
	        
	        JLabel flerovyum = new JLabel("Fl");
	        flerovyum.setBounds(542,260,40,40);
	        flerovyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(flerovyum);
	        
	        JLabel moskoviyum = new JLabel("Mc");
	        moskoviyum.setBounds(572,260,40,40);
	        moskoviyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(moskoviyum);
	        
	        JLabel livermoryum = new JLabel("Lv");
	        livermoryum.setBounds(610,260,40,40);
	        livermoryum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(livermoryum);
	        
	        JLabel tennesin = new JLabel("Ts");
	        tennesin.setBounds(645,260,40,40);
	        tennesin.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(tennesin);
	        
	        JLabel oganesson = new JLabel("Og");
	        oganesson.setBounds(678,260,40,40);
	        oganesson.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(oganesson);
	        
	        JLabel seryum = new JLabel("Ce");
	        seryum.setBounds(188,305,40,40);
	        seryum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(seryum);
	        
	        JLabel praseodim = new JLabel("Pr");
	        praseodim.setBounds(226,305,40,40);
	        praseodim.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(praseodim);
	        
	        JLabel neodimyum = new JLabel("Nd");
	        neodimyum.setBounds(258,305,40,40);
	        neodimyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(neodimyum);
	        
	        JLabel prometyum = new JLabel("Pm");
	        prometyum.setBounds(290,305,40,40);
	        prometyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(prometyum);
	        
	        JLabel samaryum = new JLabel("Sm");
	        samaryum.setBounds(326,305,40,40);
	        samaryum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(samaryum);
	        
	        JLabel evropiyum = new JLabel("Eu");
	        evropiyum.setBounds(364,305,40,40);
	        evropiyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(evropiyum);
	        
	        JLabel gadolinyum = new JLabel("Gd");
	        gadolinyum.setBounds(397,305,40,40);
	        gadolinyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(gadolinyum);
	        
	        JLabel terbiyum = new JLabel("Tb");
	        terbiyum.setBounds(435,305,40,40);
	        terbiyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(terbiyum);
	        
	        JLabel disprozyum = new JLabel("Dy");
	        disprozyum.setBounds(468,305,40,40);
	        disprozyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(disprozyum);
	        
	        JLabel holmiyum = new JLabel("Ho");
	        holmiyum.setBounds(504,305,40,40);
	        holmiyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(holmiyum);
	        
	        JLabel erbiyum = new JLabel("Er");
	        erbiyum.setBounds(541,305,40,40);
	        erbiyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(erbiyum);
	        
	        JLabel tulyum = new JLabel("Tm");
	        tulyum.setBounds(572,305,40,40);
	        tulyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(tulyum);
	        
	        JLabel iterbiyum = new JLabel("Yb");
	        iterbiyum.setBounds(610,305,40,40);
	        iterbiyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(iterbiyum);
	        
	        JLabel lutesyum = new JLabel("Lu");
	        lutesyum.setBounds(645,305,40,40);
	        lutesyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(lutesyum);
	        
	        JLabel toryum = new JLabel("Th");
	        toryum.setBounds(190,340,40,40);
	        toryum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(toryum);
	        
	        JLabel protaktinyum = new JLabel("Pa");
	        protaktinyum.setBounds(225,340,40,40);
	        protaktinyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(protaktinyum);
	        
	        JLabel uranyum = new JLabel("U");
	        uranyum.setBounds(264,340,40,40);
	        uranyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(uranyum);
	        
	        JLabel neptunyum = new JLabel("Np");
	        neptunyum.setBounds(293,340,40,40);
	        neptunyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(neptunyum);
	        
	        JLabel plutonyum = new JLabel("Pu");
	        plutonyum.setBounds(328,340,40,40);
	        plutonyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(plutonyum);
	        
	        JLabel amerikyum = new JLabel("Am");
	        amerikyum.setBounds(361,340,40,40);
	        amerikyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(amerikyum);
	        
	        JLabel kuriyum = new JLabel("Cm");
	        kuriyum.setBounds(395,340,40,40);
	        kuriyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(kuriyum);
	        
	        JLabel berkelyum = new JLabel("Bk");
	        berkelyum.setBounds(435,340,40,40);
	        berkelyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(berkelyum);
	        
	        JLabel kaliforniyum = new JLabel("Cf");
	        kaliforniyum.setBounds(470,340,40,40);
	        kaliforniyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(kaliforniyum);
	        
	        JLabel aynştaynyum = new JLabel("Es");
	        aynştaynyum.setBounds(505,340,40,40);
	        aynştaynyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(aynştaynyum);
	        
	        JLabel fermiyum = new JLabel("Fm");
	        fermiyum.setBounds(536,340,40,40);
	        fermiyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(fermiyum);
	        
	        JLabel mendelevyum = new JLabel("Md");
	        mendelevyum.setBounds(571,340,40,40);
	        mendelevyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(mendelevyum);
	        
	        JLabel nobelyum = new JLabel("No");
	        nobelyum.setBounds(609,340,40,40);
	        nobelyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(nobelyum);
	        
	        JLabel lavrensiyum = new JLabel("Lr");
	        lavrensiyum.setBounds(646,340,40,40);
	        lavrensiyum.setFont(new Font("Helvetica",Font.PLAIN,22));
	        panel.add(lavrensiyum);
	        
	        ekran.add(panel,BorderLayout.CENTER);
	        ekran.setVisible(true);
	        
	        digerClassaIsle(A1,A2,B3,B4,B5,B6,B7,B8,B8,B82,B1,B2,A3,A4,A5,A6,A7,A8,ekran
	        		,hidrojen,helyum,lityum,berilyum,bor);
	        
	    }
	    public void digerClassaIsle(JLabel A1, JLabel A2, JLabel B3 
			, JLabel B4, JLabel B5, JLabel B6 ,JLabel B7, JLabel B8, JLabel B81
			, JLabel B82, JLabel B1, JLabel B2 , JLabel A3, JLabel A4 ,JLabel A5, JLabel A6
			, JLabel A7, JLabel A8, JFrame ekran, JLabel hidrojen, JLabel helyum, JLabel lityum
			, JLabel berilyum , JLabel bor) {
	}
	}