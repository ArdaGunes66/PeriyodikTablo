package PeriyodikTabloDene;

import java.io.File;
import java.io.FileReader;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bilgiler {
       
    public void A1BilgiOkuVeYazdir(JPanel panel) {
        
        File A1GrubuBilgileri = new File("res/A1GrubuBilgileri.txt");
        BufferedReader A1Oku = null;
        
        try {
            A1Oku = new BufferedReader(new FileReader(A1GrubuBilgileri));
            String satir;
            int yPosition = 10;
            
            while ((satir = A1Oku.readLine()) != null) {
                JLabel label = new JLabel(satir); 
                label.setBounds(10, 30 + yPosition, 400, 20);
                panel.add(label); 
                yPosition += 15;
            }
            
            JLabel GenelBilgiler = new JLabel("Genel Bilgiler");
            GenelBilgiler.setBounds(10, 10, 400, 20);
            GenelBilgiler.setFont(new Font("Helvetica",Font.PLAIN,15));
            GenelBilgiler.setForeground(Color.RED);
            panel.add(GenelBilgiler);
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (A1Oku != null) {
                try {
                    A1Oku.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
        public void A2BilgiOkuVeYazdir(JPanel panel) {
            
            File A2GrubuBilgileri = new File("res/A2GrubuBilgileri.txt");
            BufferedReader A2Oku = null;
             
            try {
                A2Oku = new BufferedReader(new FileReader(A2GrubuBilgileri));
                String satir;
                int yPosition = 10;
                
                while ((satir = A2Oku.readLine()) != null) {
                    JLabel label = new JLabel(satir); 
                    label.setBounds(10, 30 + yPosition, 400, 20);
                    panel.add(label); 
                    yPosition += 15;
                }
                
                JLabel GenelBilgiler = new JLabel("Genel Bilgiler");
                GenelBilgiler.setBounds(10, 10, 400, 20);
                GenelBilgiler.setFont(new Font("Helvetica",Font.PLAIN,15));
                GenelBilgiler.setForeground(Color.RED);
                panel.add(GenelBilgiler);
                
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (A2Oku != null) {
                    try {
                        A2Oku.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
    }
           public void A3BilgiOkuVeYazdir(JPanel panel) {
            
            File A3GrubuBilgileri = new File("res/A3GrubuBilgileri.txt");
            BufferedReader A3Oku = null;
             
            try {
                A3Oku = new BufferedReader(new FileReader(A3GrubuBilgileri));
                String satir;
                int yPosition = 10;
                
                while ((satir = A3Oku.readLine()) != null) {
                    JLabel label = new JLabel(satir); 
                    label.setBounds(10, 30 + yPosition, 400, 20);
                    panel.add(label); 
                    yPosition += 15;
                }
                
                JLabel GenelBilgiler = new JLabel("Genel Bilgiler");
                GenelBilgiler.setBounds(10, 10, 400, 20);
                GenelBilgiler.setFont(new Font("Helvetica",Font.PLAIN,15));
                GenelBilgiler.setForeground(Color.RED);
                panel.add(GenelBilgiler);
                
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (A3Oku != null) {
                    try {
                        A3Oku.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
    }
           
           public void A4BilgiOkuVeYazdir(JPanel panel) {
               
               File A4GrubuBilgileri = new File("res/A4GrubuBilgileri.txt");
               BufferedReader A4Oku = null;
                
               try {
                   A4Oku = new BufferedReader(new FileReader(A4GrubuBilgileri));
                   String satir;
                   int yPosition = 10;
                   
                   while ((satir = A4Oku.readLine()) != null) {
                       JLabel label = new JLabel(satir); 
                       label.setBounds(10, 30 + yPosition, 400, 20);
                       panel.add(label); 
                       yPosition += 15;
                   }
                   
                   JLabel GenelBilgiler = new JLabel("Genel Bilgiler");
                   GenelBilgiler.setBounds(10, 10, 400, 20);
                   GenelBilgiler.setFont(new Font("Helvetica",Font.PLAIN,15));
                   GenelBilgiler.setForeground(Color.RED);
                   panel.add(GenelBilgiler);
                   
               } catch (IOException e) {
                   e.printStackTrace();
               } finally {
                   if (A4Oku != null) {
                       try {
                           A4Oku.close();
                       } catch (IOException e) {
                           e.printStackTrace();
                       }
                   }
               }
       }
             public void A5BilgiOkuVeYazdir(JPanel panel) {
               
               File A5GrubuBilgileri = new File("res/A5GrubuBilgileri.txt");
               BufferedReader A5Oku = null;
                
               try {
                   A5Oku = new BufferedReader(new FileReader(A5GrubuBilgileri));
                   String satir;
                   int yPosition = 10;
                   
                   while ((satir = A5Oku.readLine()) != null) {
                       JLabel label = new JLabel(satir); 
                       label.setBounds(10, 30 + yPosition, 400, 20);
                       panel.add(label); 
                       yPosition += 15;
                   }
                   
                   JLabel GenelBilgiler = new JLabel("Genel Bilgiler");
                   GenelBilgiler.setBounds(10, 10, 400, 20);
                   GenelBilgiler.setFont(new Font("Helvetica",Font.PLAIN,15));
                   GenelBilgiler.setForeground(Color.RED);
                   panel.add(GenelBilgiler);
                   
               } catch (IOException e) {
                   e.printStackTrace();
               } finally {
                   if (A5Oku != null) {
                       try {
                           A5Oku.close();
                       } catch (IOException e) {
                           e.printStackTrace();
                       }
                   }
               }
       }
             public void A6BilgiOkuVeYazdir(JPanel panel) {
                 
                 File A6GrubuBilgileri = new File("res/A6GrubuBilgileri.txt");
                 BufferedReader A6Oku = null;
                  
                 try {
                     A6Oku = new BufferedReader(new FileReader(A6GrubuBilgileri));
                     String satir;
                     int yPosition = 10;
                     
                     while ((satir = A6Oku.readLine()) != null) {
                         JLabel label = new JLabel(satir); 
                         label.setBounds(10, 30 + yPosition, 400, 20);
                         panel.add(label); 
                         yPosition += 15;
                     }
                     
                     JLabel GenelBilgiler = new JLabel("Genel Bilgiler");
                     GenelBilgiler.setBounds(10, 10, 400, 20);
                     GenelBilgiler.setFont(new Font("Helvetica",Font.PLAIN,15));
                     GenelBilgiler.setForeground(Color.RED);
                     panel.add(GenelBilgiler);
                     
                 } catch (IOException e) {
                     e.printStackTrace();
                 } finally {
                     if (A6Oku != null) {
                         try {
                             A6Oku.close();
                         } catch (IOException e) {
                             e.printStackTrace();
                         }
                     }
                 }
         }
             public void A7BilgiOkuVeYazdir(JPanel panel) {
                 
                 File A7GrubuBilgileri = new File("res/A7GrubuBilgileri.txt");
                 BufferedReader A7Oku = null;
                  
                 try {
                     A7Oku = new BufferedReader(new FileReader(A7GrubuBilgileri));
                     String satir;
                     int yPosition = 10;
                     
                     while ((satir = A7Oku.readLine()) != null) {
                         JLabel label = new JLabel(satir); 
                         label.setBounds(10, 30 + yPosition, 400, 20);
                         panel.add(label); 
                         yPosition += 15;
                     }
                     
                     JLabel GenelBilgiler = new JLabel("Genel Bilgiler");
                     GenelBilgiler.setBounds(10, 10, 400, 20);
                     GenelBilgiler.setFont(new Font("Helvetica",Font.PLAIN,15));
                     GenelBilgiler.setForeground(Color.RED);
                     panel.add(GenelBilgiler);
                     
                 } catch (IOException e) {
                     e.printStackTrace();
                 } finally {
                     if (A7Oku != null) {
                         try {
                             A7Oku.close();
                         } catch (IOException e) {
                             e.printStackTrace();
                         }
                     }
                 }
         }
             public void A8BilgiOkuVeYazdir(JPanel panel) {
                 
                 File A8GrubuBilgileri = new File("res/A8GrubuBilgileri.txt");
                 BufferedReader A8Oku = null;
                  
                 try {
                     A8Oku = new BufferedReader(new FileReader(A8GrubuBilgileri));
                     String satir;
                     int yPosition = 10;
                     
                     while ((satir = A8Oku.readLine()) != null) {
                         JLabel label = new JLabel(satir); 
                         label.setBounds(10, 30 + yPosition, 400, 20);
                         panel.add(label); 
                         yPosition += 15;
                     }
                     
                     JLabel GenelBilgiler = new JLabel("Genel Bilgiler");
                     GenelBilgiler.setBounds(10, 10, 400, 20);
                     GenelBilgiler.setFont(new Font("Helvetica",Font.PLAIN,15));
                     GenelBilgiler.setForeground(Color.RED);
                     panel.add(GenelBilgiler);
                     
                 } catch (IOException e) {
                     e.printStackTrace();
                 } finally {
                     if (A8Oku != null) {
                         try {
                             A8Oku.close();
                         } catch (IOException e) {
                             e.printStackTrace();
                         }
                     }
                 }
         }
               public void B1BilgiOkuVeYazdir(JPanel panel) {
                 
                 File B1GrubuBilgileri = new File("res/B1GrubuBilgileri.txt");
                 BufferedReader B1Oku = null;
                  
                 try {
                     B1Oku = new BufferedReader(new FileReader(B1GrubuBilgileri));
                     String satir;
                     int yPosition = 10;
                     
                     while ((satir = B1Oku.readLine()) != null) {
                         JLabel label = new JLabel(satir); 
                         label.setBounds(10, 30 + yPosition, 400, 20);
                         panel.add(label); 
                         yPosition += 15;
                     }
                     
                     JLabel GenelBilgiler = new JLabel("Genel Bilgiler");
                     GenelBilgiler.setBounds(10, 10, 400, 20);
                     GenelBilgiler.setFont(new Font("Helvetica",Font.PLAIN,15));
                     GenelBilgiler.setForeground(Color.RED);
                     panel.add(GenelBilgiler);
                     
                 } catch (IOException e) {
                     e.printStackTrace();
                 } finally {
                     if (B1Oku != null) {
                         try {
                             B1Oku.close();
                         } catch (IOException e) {
                             e.printStackTrace();
                         }
                     }
                 }
         }
               public void B2BilgiOkuVeYazdir(JPanel panel) {
                   
                   File B2GrubuBilgileri = new File("res/B2GrubuBilgileri.txt");
                   BufferedReader B2Oku = null;
                    
                   try {
                       B2Oku = new BufferedReader(new FileReader(B2GrubuBilgileri));
                       String satir;
                       int yPosition = 10;
                       
                       while ((satir = B2Oku.readLine()) != null) {
                           JLabel label = new JLabel(satir); 
                           label.setBounds(10, 30 + yPosition, 400, 20);
                           panel.add(label); 
                           yPosition += 15;
                       }
                       
                       JLabel GenelBilgiler = new JLabel("Genel Bilgiler");
                       GenelBilgiler.setBounds(10, 10, 400, 20);
                       GenelBilgiler.setFont(new Font("Helvetica",Font.PLAIN,15));
                       GenelBilgiler.setForeground(Color.RED);
                       panel.add(GenelBilgiler);
                       
                   } catch (IOException e) {
                       e.printStackTrace();
                   } finally {
                       if (B2Oku != null) {
                           try {
                               B2Oku.close();
                           } catch (IOException e) {
                               e.printStackTrace();
                           }
                       }
                   }
           }
               public void B3BilgiOkuVeYazdir(JPanel panel) {
                   
                   File B3GrubuBilgileri = new File("res/B3GrubuBilgileri.txt");
                   BufferedReader B3Oku = null;
                    
                   try {
                       B3Oku = new BufferedReader(new FileReader(B3GrubuBilgileri));
                       String satir;
                       int yPosition = 10;
                       
                       while ((satir = B3Oku.readLine()) != null) {
                           JLabel label = new JLabel(satir); 
                           label.setBounds(10, 30 + yPosition, 400, 20);
                           panel.add(label); 
                           yPosition += 15;
                       }
                       
                       JLabel GenelBilgiler = new JLabel("Genel Bilgiler");
                       GenelBilgiler.setBounds(10, 10, 400, 20);
                       GenelBilgiler.setFont(new Font("Helvetica",Font.PLAIN,15));
                       GenelBilgiler.setForeground(Color.RED);
                       panel.add(GenelBilgiler);
                       
                   } catch (IOException e) {
                       e.printStackTrace();
                   } finally {
                       if (B3Oku != null) {
                           try {
                               B3Oku.close();
                           } catch (IOException e) {
                               e.printStackTrace();
                           }
                       }
                   }
           }
               public void B4BilgiOkuVeYazdir(JPanel panel) {
                   
                   File B4GrubuBilgileri = new File("res/B4GrubuBilgileri.txt");
                   BufferedReader B4Oku = null;
                    
                   try {
                       B4Oku = new BufferedReader(new FileReader(B4GrubuBilgileri));
                       String satir;
                       int yPosition = 10;
                       
                       while ((satir = B4Oku.readLine()) != null) {
                           JLabel label = new JLabel(satir); 
                           label.setBounds(10, 30 + yPosition, 400, 20);
                           panel.add(label); 
                           yPosition += 15;
                       }
                       
                       JLabel GenelBilgiler = new JLabel("Genel Bilgiler");
                       GenelBilgiler.setBounds(10, 10, 400, 20);
                       GenelBilgiler.setFont(new Font("Helvetica",Font.PLAIN,15));
                       GenelBilgiler.setForeground(Color.RED);
                       panel.add(GenelBilgiler);
                       
                   } catch (IOException e) {
                       e.printStackTrace();
                   } finally {
                       if (B4Oku != null) {
                           try {
                               B4Oku.close();
                           } catch (IOException e) {
                               e.printStackTrace();
                           }
                       }
                   }
           }
               public void B5BilgiOkuVeYazdir(JPanel panel) {
                   
                   File B5GrubuBilgileri = new File("res/B5GrubuBilgileri.txt");
                   BufferedReader B5Oku = null;
                    
                   try {
                       B5Oku = new BufferedReader(new FileReader(B5GrubuBilgileri));
                       String satir;
                       int yPosition = 10;
                       
                       while ((satir = B5Oku.readLine()) != null) {
                           JLabel label = new JLabel(satir); 
                           label.setBounds(10, 30 + yPosition, 400, 20);
                           panel.add(label); 
                           yPosition += 15;
                       }
                       
                       JLabel GenelBilgiler = new JLabel("Genel Bilgiler");
                       GenelBilgiler.setBounds(10, 10, 400, 20);
                       GenelBilgiler.setFont(new Font("Helvetica",Font.PLAIN,15));
                       GenelBilgiler.setForeground(Color.RED);
                       panel.add(GenelBilgiler);
                       
                   } catch (IOException e) {
                       e.printStackTrace();
                   } finally {
                       if (B5Oku != null) {
                           try {
                               B5Oku.close();
                           } catch (IOException e) {
                               e.printStackTrace();
                           }
                       } 
                   }
           }
               public void B6BilgiOkuVeYazdir(JPanel panel) {
                   
                   File B6GrubuBilgileri = new File("res/B6GrubuBilgileri.txt");
                   BufferedReader B6Oku = null;
                    
                   try {
                       B6Oku = new BufferedReader(new FileReader(B6GrubuBilgileri));
                       String satir;
                       int yPosition = 10;
                       
                       while ((satir = B6Oku.readLine()) != null) {
                           JLabel label = new JLabel(satir); 
                           label.setBounds(10, 30 + yPosition, 400, 20);
                           panel.add(label); 
                           yPosition += 15;
                       }
                       
                       JLabel GenelBilgiler = new JLabel("Genel Bilgiler");
                       GenelBilgiler.setBounds(10, 10, 400, 20);
                       GenelBilgiler.setFont(new Font("Helvetica",Font.PLAIN,15));
                       GenelBilgiler.setForeground(Color.RED);
                       panel.add(GenelBilgiler);
                       
                   } catch (IOException e) {
                       e.printStackTrace();
                   } finally {
                       if (B6Oku != null) {
                           try {
                               B6Oku.close();
                           } catch (IOException e) {
                               e.printStackTrace();
                           }
                       }
                   }
           }   
               public void B7BilgiOkuVeYazdir(JPanel panel) {
                   
                   File B7GrubuBilgileri = new File("res/B7GrubuBilgileri.txt");
                   BufferedReader B7Oku = null;
                    
                   try {
                       B7Oku = new BufferedReader(new FileReader(B7GrubuBilgileri));
                       String satir;
                       int yPosition = 10;
                       
                       while ((satir = B7Oku.readLine()) != null) {
                           JLabel label = new JLabel(satir); 
                           label.setBounds(10, 30 + yPosition, 400, 20);
                           panel.add(label); 
                           yPosition += 15;
                       }
                       
                       JLabel GenelBilgiler = new JLabel("Genel Bilgiler");
                       GenelBilgiler.setBounds(10, 10, 400, 20);
                       GenelBilgiler.setFont(new Font("Helvetica",Font.PLAIN,15));
                       GenelBilgiler.setForeground(Color.RED);
                       panel.add(GenelBilgiler);
                       
                   } catch (IOException e) {
                       e.printStackTrace();
                   } finally {
                       if (B7Oku != null) {
                           try {
                               B7Oku.close();
                           } catch (IOException e) {
                               e.printStackTrace();
                           }
                       }
                   }
           }
               public void B8BilgiOkuVeYazdir(JPanel panel) {
                   
                   File B8GrubuBilgileri = new File("res/B8GrubuBilgileri.txt");
                   BufferedReader B8Oku = null;
                    
                   try {
                       B8Oku = new BufferedReader(new FileReader(B8GrubuBilgileri));
                       String satir;
                       int yPosition = 10;
                       
                       while ((satir = B8Oku.readLine()) != null) {
                           JLabel label = new JLabel(satir); 
                           label.setBounds(10, 30 + yPosition, 400, 20);
                           panel.add(label); 
                           yPosition += 15;
                       }
                       
                       JLabel GenelBilgiler = new JLabel("Genel Bilgiler");
                       GenelBilgiler.setBounds(10, 10, 400, 20);
                       GenelBilgiler.setFont(new Font("Helvetica",Font.PLAIN,15));
                       GenelBilgiler.setForeground(Color.RED);
                       panel.add(GenelBilgiler);
                       
                   } catch (IOException e) {
                       e.printStackTrace();
                   } finally {
                       if (B8Oku != null) {
                           try {
                               B8Oku.close();
                           } catch (IOException e) {
                               e.printStackTrace();
                           }
                       }
                   }
           }
               
                public void HidrojenOkuVeYazdir(JPanel panel) {
                   
                   File Hidrojen = new File("elementler/HidrojenBilgileri.txt");
                   BufferedReader HidrojenOku = null;
                    
                   try {
                       HidrojenOku = new BufferedReader(new FileReader(Hidrojen));
                       String satir;
                       int yPosition = 10;
                       
                       while ((satir = HidrojenOku.readLine()) != null) {
                           JLabel label = new JLabel(satir); 
                           label.setBounds(10, 30 + yPosition, 400, 20);
                           panel.add(label); 
                           yPosition += 15;
                       }
                       
                       JLabel GenelBilgiler = new JLabel("Genel Bilgiler");
                       GenelBilgiler.setBounds(10, 10, 400, 20);
                       GenelBilgiler.setFont(new Font("Helvetica",Font.PLAIN,15));
                       GenelBilgiler.setForeground(Color.RED);
                       panel.add(GenelBilgiler);
                       
                       JLabel Izotoplari = new JLabel("İzotopları");
                       Izotoplari.setBounds(10, 291, 400, 20);
                       Izotoplari.setFont(new Font("Helvetica",Font.PLAIN,15));
                       Izotoplari.setForeground(Color.RED);
                       panel.add(Izotoplari);
                       
                       JLabel FizikselOzellikleri = new JLabel("Fiziksel Özellikler");
                       FizikselOzellikleri.setBounds(10, 620, 400, 20);
                       FizikselOzellikleri.setFont(new Font("Helvetica",Font.PLAIN,15));
                       FizikselOzellikleri.setForeground(Color.RED);
                       panel.add(FizikselOzellikleri);
                       
                       JLabel KimyasalOzellikler = new JLabel("Kimyasal Özellikler");
                       KimyasalOzellikler.setBounds(10, 905, 400, 20);
                       KimyasalOzellikler.setFont(new Font("Helvetica",Font.PLAIN,15));
                       KimyasalOzellikler.setForeground(Color.RED);
                       panel.add(KimyasalOzellikler);
                       
                       JLabel BiyolojikRolu = new JLabel("Biyolojik Rolü");
                       BiyolojikRolu.setBounds(10, 1131, 400, 20);
                       BiyolojikRolu.setFont(new Font("Helvetica",Font.PLAIN,15));
                       BiyolojikRolu.setForeground(Color.RED);
                       panel.add(BiyolojikRolu);
                       
                       JLabel EndustriyelKullanimlar = new JLabel("Endüstriyel Kullanımlar");
                       EndustriyelKullanimlar.setBounds(10, 1325, 400, 20);
                       EndustriyelKullanimlar.setFont(new Font("Helvetica",Font.PLAIN,15));
                       EndustriyelKullanimlar.setForeground(Color.RED);
                       panel.add(EndustriyelKullanimlar);
                       
                       JLabel Kesfi = new JLabel("Keşfi");
                       Kesfi.setBounds(10, 1684, 400, 20);
                       Kesfi.setFont(new Font("Helvetica",Font.PLAIN,15));
                       Kesfi.setForeground(Color.RED);
                       panel.add(Kesfi);
                       
                       JLabel DogadaBulunusu = new JLabel("Doğada Bulunuşu");
                       DogadaBulunusu.setBounds(10, 1835, 400, 20);
                       DogadaBulunusu.setFont(new Font("Helvetica",Font.PLAIN,15));
                       DogadaBulunusu.setForeground(Color.RED);
                       panel.add(DogadaBulunusu);
                       
                       JLabel GelecektekiPotansiyeli = new JLabel("Gelecekteki Potansiyeli");
                       GelecektekiPotansiyeli.setBounds(10, 2000, 400, 20);
                       GelecektekiPotansiyeli.setFont(new Font("Helvetica",Font.PLAIN,15));
                       GelecektekiPotansiyeli.setForeground(Color.RED);
                       panel.add(GelecektekiPotansiyeli);
                       
                       JLabel Tehlikeleri = new JLabel("Tehlikeleri");
                       Tehlikeleri.setBounds(10, 2120, 400, 20);
                       Tehlikeleri.setFont(new Font("Helvetica",Font.PLAIN,15));
                       Tehlikeleri.setForeground(Color.RED);
                       panel.add(Tehlikeleri);
                       
                   } catch (IOException e) {
                       e.printStackTrace();
                   } finally {
                       if (HidrojenOku != null) {
                           try {
                               HidrojenOku.close();
                           } catch (IOException e) {
                               e.printStackTrace();
                           }
                       }
                   }
           }
                public void HelyumOkuVeYazdir(JPanel panel) {
                    
                    File Helyum = new File("elementler/HelyumBilgileri.txt");
                    BufferedReader HelyumOku = null;
                     
                    try {
                    	HelyumOku = new BufferedReader(new FileReader(Helyum));
                        String satir;
                        int yPosition = 10;
                        
                        while ((satir = HelyumOku.readLine()) != null) {
                            JLabel label = new JLabel(satir); 
                            label.setBounds(10, 30 + yPosition, 400, 20);
                            panel.add(label); 
                            yPosition += 15;
                        }
                        
                        JLabel GenelBilgiler = new JLabel("Genel Bilgiler");
                        GenelBilgiler.setBounds(10, 10, 400, 20);
                        GenelBilgiler.setFont(new Font("Helvetica",Font.PLAIN,15));
                        GenelBilgiler.setForeground(Color.RED);
                        panel.add(GenelBilgiler);
                        
                        JLabel Izotoplari = new JLabel("İzotopları");
                        Izotoplari.setBounds(10, 276, 400, 20);
                        Izotoplari.setFont(new Font("Helvetica",Font.PLAIN,15));
                        Izotoplari.setForeground(Color.RED);
                        panel.add(Izotoplari);
                        
                        JLabel FizikselOzellikleri = new JLabel("Fiziksel Özellikler");
                        FizikselOzellikleri.setBounds(10, 440, 400, 20);
                        FizikselOzellikleri.setFont(new Font("Helvetica",Font.PLAIN,15));
                        FizikselOzellikleri.setForeground(Color.RED);
                        panel.add(FizikselOzellikleri);
                        
                        JLabel KimyasalOzellikler = new JLabel("Kimyasal Özellikler");
                        KimyasalOzellikler.setBounds(10, 785, 400, 20);
                        KimyasalOzellikler.setFont(new Font("Helvetica",Font.PLAIN,15));
                        KimyasalOzellikler.setForeground(Color.RED);
                        panel.add(KimyasalOzellikler);
                        
                        JLabel BiyolojikRolu = new JLabel("Biyolojik Rolü");
                        BiyolojikRolu.setBounds(10, 980, 400, 20);
                        BiyolojikRolu.setFont(new Font("Helvetica",Font.PLAIN,15));
                        BiyolojikRolu.setForeground(Color.RED);
                        panel.add(BiyolojikRolu);
                        
                        JLabel EndustriyelKullanimlar = new JLabel("Endüstriyel Kullanımlar");
                        EndustriyelKullanimlar.setBounds(10, 1190, 400, 20);
                        EndustriyelKullanimlar.setFont(new Font("Helvetica",Font.PLAIN,15));
                        EndustriyelKullanimlar.setForeground(Color.RED);
                        panel.add(EndustriyelKullanimlar);
                        
                        JLabel Kesfi = new JLabel("Keşfi");
                        Kesfi.setBounds(10, 1579, 400, 20);
                        Kesfi.setFont(new Font("Helvetica",Font.PLAIN,15));
                        Kesfi.setForeground(Color.RED);
                        panel.add(Kesfi);
                        
                        JLabel DogadaBulunusu = new JLabel("Doğada Bulunuşu");
                        DogadaBulunusu.setBounds(10, 1730, 400, 20);
                        DogadaBulunusu.setFont(new Font("Helvetica",Font.PLAIN,15));
                        DogadaBulunusu.setForeground(Color.RED);
                        panel.add(DogadaBulunusu);
                        
                        JLabel GelecektekiPotansiyeli = new JLabel("Gelecekteki Potansiyeli");
                        GelecektekiPotansiyeli.setBounds(10, 1955, 400, 20);
                        GelecektekiPotansiyeli.setFont(new Font("Helvetica",Font.PLAIN,15));
                        GelecektekiPotansiyeli.setForeground(Color.RED);
                        panel.add(GelecektekiPotansiyeli);
                        
                        JLabel Tehlikeleri = new JLabel("Tehlikeleri");
                        Tehlikeleri.setBounds(10, 2136, 400, 20);
                        Tehlikeleri.setFont(new Font("Helvetica",Font.PLAIN,15));
                        Tehlikeleri.setForeground(Color.RED);
                        panel.add(Tehlikeleri);
                        
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        if (HelyumOku != null) {
                            try {
                            	HelyumOku.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
            }
                  public void LityumOkuVeYazdir(JPanel panel) {
                    
                    File Lityum = new File("elementler/LityumBilgileri.txt");
                    BufferedReader LityumOku = null;
                     
                    try {
                    	LityumOku = new BufferedReader(new FileReader(Lityum));
                        String satir;
                        int yPosition = 10;
                        
                        while ((satir = LityumOku.readLine()) != null) {
                            JLabel label = new JLabel(satir); 
                            label.setBounds(10, 30 + yPosition, 400, 20);
                            panel.add(label); 
                            yPosition += 15;
                        }
                        
                        JLabel GenelBilgiler = new JLabel("Genel Bilgiler");
                        GenelBilgiler.setBounds(10, 10, 400, 20);
                        GenelBilgiler.setFont(new Font("Helvetica",Font.PLAIN,15));
                        GenelBilgiler.setForeground(Color.RED);
                        panel.add(GenelBilgiler);
                        
                        JLabel Izotoplari = new JLabel("İzotopları");
                        Izotoplari.setBounds(10, 291, 400, 20);
                        Izotoplari.setFont(new Font("Helvetica",Font.PLAIN,15));
                        Izotoplari.setForeground(Color.RED);
                        panel.add(Izotoplari);
                        
                        JLabel FizikselOzellikleri = new JLabel("Fiziksel Özellikler");
                        FizikselOzellikleri.setBounds(10, 547, 400, 20);
                        FizikselOzellikleri.setFont(new Font("Helvetica",Font.PLAIN,15));
                        FizikselOzellikleri.setForeground(Color.RED);
                        panel.add(FizikselOzellikleri);
                        
                        JLabel KimyasalOzellikler = new JLabel("Kimyasal Özellikler");
                        KimyasalOzellikler.setBounds(10, 861, 400, 20);
                        KimyasalOzellikler.setFont(new Font("Helvetica",Font.PLAIN,15));
                        KimyasalOzellikler.setForeground(Color.RED);
                        panel.add(KimyasalOzellikler);
                        
                        JLabel BiyolojikRolu = new JLabel("Biyolojik Rolü");
                        BiyolojikRolu.setBounds(10, 1176, 400, 20);
                        BiyolojikRolu.setFont(new Font("Helvetica",Font.PLAIN,15));
                        BiyolojikRolu.setForeground(Color.RED);
                        panel.add(BiyolojikRolu);
                        
                        JLabel EndustriyelKullanimlar = new JLabel("Endüstriyel Kullanımlar");
                        EndustriyelKullanimlar.setBounds(10, 1372, 400, 20);
                        EndustriyelKullanimlar.setFont(new Font("Helvetica",Font.PLAIN,15));
                        EndustriyelKullanimlar.setForeground(Color.RED);
                        panel.add(EndustriyelKullanimlar);
                        
                        JLabel Kesfi = new JLabel("Keşfi");
                        Kesfi.setBounds(10, 1774, 400, 20);
                        Kesfi.setFont(new Font("Helvetica",Font.PLAIN,15));
                        Kesfi.setForeground(Color.RED);
                        panel.add(Kesfi);
                        
                        JLabel DogadaBulunusu = new JLabel("Doğada Bulunuşu");
                        DogadaBulunusu.setBounds(10, 1971, 400, 20);
                        DogadaBulunusu.setFont(new Font("Helvetica",Font.PLAIN,15));
                        DogadaBulunusu.setForeground(Color.RED);
                        panel.add(DogadaBulunusu);
                        
                        JLabel GelecektekiPotansiyeli = new JLabel("Gelecekteki Potansiyeli");
                        GelecektekiPotansiyeli.setBounds(10, 2195, 400, 20);
                        GelecektekiPotansiyeli.setFont(new Font("Helvetica",Font.PLAIN,15));
                        GelecektekiPotansiyeli.setForeground(Color.RED);
                        panel.add(GelecektekiPotansiyeli);
                        
                        JLabel Tehlikeleri = new JLabel("Tehlikeleri");
                        Tehlikeleri.setBounds(10, 2437, 400, 20);
                        Tehlikeleri.setFont(new Font("Helvetica",Font.PLAIN,15));
                        Tehlikeleri.setForeground(Color.RED);
                        panel.add(Tehlikeleri);
                        
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        if (LityumOku != null) {
                            try {
                            	LityumOku.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
            }
                  public void BerilyumOkuVeYazdir(JPanel panel) {
                      
                      File Berilyum = new File("elementler/BerilyumBilgileri.txt");
                      BufferedReader BerilyumOku = null;
                       
                      try {
                      	BerilyumOku = new BufferedReader(new FileReader(Berilyum));
                          String satir;
                          int yPosition = 10;
                          
                          while ((satir = BerilyumOku.readLine()) != null) {
                              JLabel label = new JLabel(satir); 
                              label.setBounds(10, 30 + yPosition, 400, 20);
                              panel.add(label); 
                              yPosition += 15;
                          }
                          
                          JLabel GenelBilgiler = new JLabel("Genel Bilgiler");
                          GenelBilgiler.setBounds(10, 10, 400, 20);
                          GenelBilgiler.setFont(new Font("Helvetica",Font.PLAIN,15));
                          GenelBilgiler.setForeground(Color.RED);
                          panel.add(GenelBilgiler);
                          
                          JLabel Izotoplari = new JLabel("İzotopları");
                          Izotoplari.setBounds(10, 291, 400, 20);
                          Izotoplari.setFont(new Font("Helvetica",Font.PLAIN,15));
                          Izotoplari.setForeground(Color.RED);
                          panel.add(Izotoplari);
                          
                          JLabel FizikselOzellikleri = new JLabel("Fiziksel Özellikler");
                          FizikselOzellikleri.setBounds(10, 515, 400, 20);
                          FizikselOzellikleri.setFont(new Font("Helvetica",Font.PLAIN,15));
                          FizikselOzellikleri.setForeground(Color.RED);
                          panel.add(FizikselOzellikleri);
                          
                          JLabel KimyasalOzellikler = new JLabel("Kimyasal Özellikler");
                          KimyasalOzellikler.setBounds(10, 770, 400, 20);
                          KimyasalOzellikler.setFont(new Font("Helvetica",Font.PLAIN,15));
                          KimyasalOzellikler.setForeground(Color.RED);
                          panel.add(KimyasalOzellikler);
                          
                          JLabel BiyolojikRolu = new JLabel("Biyolojik Rolü");
                          BiyolojikRolu.setBounds(10, 1010, 400, 20);
                          BiyolojikRolu.setFont(new Font("Helvetica",Font.PLAIN,15));
                          BiyolojikRolu.setForeground(Color.RED);
                          panel.add(BiyolojikRolu);
                          
                          JLabel EndustriyelKullanimlar = new JLabel("Endüstriyel Kullanımlar");
                          EndustriyelKullanimlar.setBounds(10, 1207, 400, 20);
                          EndustriyelKullanimlar.setFont(new Font("Helvetica",Font.PLAIN,15));
                          EndustriyelKullanimlar.setForeground(Color.RED);
                          panel.add(EndustriyelKullanimlar);
                          
                          JLabel Kesfi = new JLabel("Keşfi");
                          Kesfi.setBounds(10, 1534, 400, 20);
                          Kesfi.setFont(new Font("Helvetica",Font.PLAIN,15));
                          Kesfi.setForeground(Color.RED);
                          panel.add(Kesfi);
                          
                          JLabel DogadaBulunusu = new JLabel("Doğada Bulunuşu");
                          DogadaBulunusu.setBounds(10, 1687, 400, 20);
                          DogadaBulunusu.setFont(new Font("Helvetica",Font.PLAIN,15));
                          DogadaBulunusu.setForeground(Color.RED);
                          panel.add(DogadaBulunusu);
                          
                          JLabel GelecektekiPotansiyeli = new JLabel("Gelecekteki Potansiyeli");
                          GelecektekiPotansiyeli.setBounds(10, 1850, 400, 20);
                          GelecektekiPotansiyeli.setFont(new Font("Helvetica",Font.PLAIN,15));
                          GelecektekiPotansiyeli.setForeground(Color.RED);
                          panel.add(GelecektekiPotansiyeli);
                          
                          JLabel Tehlikeleri = new JLabel("Tehlikeleri");
                          Tehlikeleri.setBounds(10, 2060, 400, 20);
                          Tehlikeleri.setFont(new Font("Helvetica",Font.PLAIN,15));
                          Tehlikeleri.setForeground(Color.RED);
                          panel.add(Tehlikeleri);
                          
                      } catch (IOException e) {
                          e.printStackTrace();
                      } finally {
                          if (BerilyumOku != null) {
                              try {
                              	BerilyumOku.close();
                              } catch (IOException e) {
                                  e.printStackTrace();
                              }
                          }
                      }
              }
                    public void BorOkuVeYazdir(JPanel panel) {
                      
                      File Bor = new File("elementler/BorBilgileri.txt");
                      BufferedReader BorOku = null;
                       
                      try {
                      	BorOku = new BufferedReader(new FileReader(Bor));
                          String satir;
                          int yPosition = 10;
                          
                          while ((satir = BorOku.readLine()) != null) {
                              JLabel label = new JLabel(satir); 
                              label.setBounds(10, 30 + yPosition, 400, 20);
                              panel.add(label); 
                              yPosition += 15;
                          }
                          
                          JLabel GenelBilgiler = new JLabel("Genel Bilgiler");
                          GenelBilgiler.setBounds(10, 10, 400, 20);
                          GenelBilgiler.setFont(new Font("Helvetica",Font.PLAIN,15));
                          GenelBilgiler.setForeground(Color.RED);
                          panel.add(GenelBilgiler);
                          
                          JLabel Izotoplari = new JLabel("İzotopları");
                          Izotoplari.setBounds(10, 307, 400, 20);
                          Izotoplari.setFont(new Font("Helvetica",Font.PLAIN,15));
                          Izotoplari.setForeground(Color.RED);
                          panel.add(Izotoplari);
                          
                          JLabel FizikselOzellikleri = new JLabel("Fiziksel Özellikler");
                          FizikselOzellikleri.setBounds(10, 561, 400, 20);
                          FizikselOzellikleri.setFont(new Font("Helvetica",Font.PLAIN,15));
                          FizikselOzellikleri.setForeground(Color.RED);
                          panel.add(FizikselOzellikleri);
                          
                          JLabel KimyasalOzellikler = new JLabel("Kimyasal Özellikler");
                          KimyasalOzellikler.setBounds(10, 846, 400, 20);
                          KimyasalOzellikler.setFont(new Font("Helvetica",Font.PLAIN,15));
                          KimyasalOzellikler.setForeground(Color.RED);
                          panel.add(KimyasalOzellikler);
                          
                          JLabel BiyolojikRolu = new JLabel("Biyolojik Rolü");
                          BiyolojikRolu.setBounds(10, 1103, 400, 20);
                          BiyolojikRolu.setFont(new Font("Helvetica",Font.PLAIN,15));
                          BiyolojikRolu.setForeground(Color.RED);
                          panel.add(BiyolojikRolu);
                          
                          JLabel EndustriyelKullanimlar = new JLabel("Endüstriyel Kullanımlar");
                          EndustriyelKullanimlar.setBounds(10, 1357, 400, 20);
                          EndustriyelKullanimlar.setFont(new Font("Helvetica",Font.PLAIN,15));
                          EndustriyelKullanimlar.setForeground(Color.RED);
                          panel.add(EndustriyelKullanimlar);
                          
                          JLabel Kesfi = new JLabel("Keşfi");
                          Kesfi.setBounds(10, 1809, 400, 20);
                          Kesfi.setFont(new Font("Helvetica",Font.PLAIN,15));
                          Kesfi.setForeground(Color.RED);
                          panel.add(Kesfi);
                          
                          JLabel DogadaBulunusu = new JLabel("Doğada Bulunuşu");
                          DogadaBulunusu.setBounds(10, 2002, 400, 20);
                          DogadaBulunusu.setFont(new Font("Helvetica",Font.PLAIN,15));
                          DogadaBulunusu.setForeground(Color.RED);
                          panel.add(DogadaBulunusu);
                          
                          JLabel GelecektekiPotansiyeli = new JLabel("Gelecekteki Potansiyeli");
                          GelecektekiPotansiyeli.setBounds(10, 2227, 400, 20);
                          GelecektekiPotansiyeli.setFont(new Font("Helvetica",Font.PLAIN,15));
                          GelecektekiPotansiyeli.setForeground(Color.RED);
                          panel.add(GelecektekiPotansiyeli);
                          
                          JLabel Tehlikeleri = new JLabel("Tehlikeleri");
                          Tehlikeleri.setBounds(10, 2528, 400, 20);
                          Tehlikeleri.setFont(new Font("Helvetica",Font.PLAIN,15));
                          Tehlikeleri.setForeground(Color.RED);
                          panel.add(Tehlikeleri);
                          
                      } catch (IOException e) {
                          e.printStackTrace();
                      } finally {
                          if (BorOku != null) {
                              try {
                              	BorOku.close();
                              } catch (IOException e) {
                                  e.printStackTrace();
                              }
                          }
                      }
              }
}