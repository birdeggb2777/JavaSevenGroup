//解密檔
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
	import java.awt.image.ColorModel;
	import java.awt.image.DataBuffer;
	import java.awt.image.DataBufferInt;
	import java.awt.image.DirectColorModel;
	import java.awt.image.Raster;
	import java.awt.image.WritableRaster;
	import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
	import javax.imageio.ImageIO;
	import javax.swing.ImageIcon;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JScrollPane;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
public class decrypted {
		static int[] data; 
		static int[] data2; 
		static int[] data3; 
		static int[] data4; 
		static String Filename;static BufferedImage img;static BufferedImage img2;
		static BufferedImage img3;
		static BufferedImage img4;
		 static String keyA;
		 static String keyB;
		 static JFrame f;
		 static int Height,Width;
		 static JFrame f2;
		 static JFrame f3;
			public static BufferedImage
		CreateBufferedImage_Direct(int[] rgbData,int Height,int Width){
				DataBuffer db = new DataBufferInt(rgbData, Height*Width);
				WritableRaster raster = Raster.createPackedRaster(db, Width,
				Height, Width,
				new int[] {0xff0000, 0xff00,0xff},
				null);
				 ColorModel cm = new DirectColorModel(24, 0xff0000,
				0xff00, 0xff);
				 return new BufferedImage(cm, raster, false, null); 
		 	}
		public static void main(String args[]) throws IOException{
			java.util.Scanner inputkeyA=new java.util.Scanner(System.in);
			System.out.println("請輸入金鑰A");
			 keyA	=inputkeyA.nextLine();	
			 java.util.Scanner inputkeyB=new java.util.Scanner(System.in);
				System.out.println("請輸入金鑰B");
				 keyB	=inputkeyB.nextLine();	
				 for(int zz =0;zz<1;zz++){
						 for (int z=0;z<2;z++){  
				try{
			img = ImageIO.read(new File("C:\\ckey\\A.png"));
			img2 = ImageIO.read(new File("C:\\ckey\\A.png"));
			img3 = ImageIO.read(new File("C:\\ckey\\A.png"));
			img4 = ImageIO.read(new File("C:\\ckey\\A.png"));
					}catch(Exception e){
			}
            Height=img.getHeight();
			 Width=img.getWidth(); 
			data=img.getRGB(0,0,Width,Height,null,0,Width);
			data2=img.getRGB(0,0,Width,Height,null,0,Width);
			data3=img.getRGB(0,0,Width,Height,null,0,Width);
			data4=img.getRGB(0,0,Width,Height,null,0,Width);
					img=CreateBufferedImage_Direct(data,Height,Width);
					img2=CreateBufferedImage_Direct(data,Height,Width);
					img3=CreateBufferedImage_Direct(data,Height,Width);
					img4=CreateBufferedImage_Direct(data,Height,Width);
			       int r1[] =new int[256]  ;
                    int g1[]=new int[256]  ;
                    int b1[] =new int[256]  ;
                    int r2[]=new int[256]  ;
                    int g2[]=new int[256]  ;
                    int b2[]=new int[256]  ;
                    int rr1[]=new int[256]  ;
                    int gg1[]=new int[256]  ;
                    int bb1[]=new int[256]  ;
                    int rr2[]=new int[256]  ;
                    int gg2[]=new int[256]  ;
                    int bb2[]=new int[256]  ;			
                    for(int xy=0;xy<Height*Width;xy++){
       				 int rgb=data[xy];
       				 int rr=(rgb&0x00ff0000)>> 16;
       				 int gg=(rgb&0x0000ff00)>> 8;
       				 int bb=(rgb&0x000000ff);
       				 r1[rr]+=1;	
       				 g1[gg]+=1;
       				 b1[bb]+=1;
       				 rgb=(0xff000000|rr<<16|gg<<8|bb);    					 
       			}
                    int max_value;
                    for (int ii = 0; (ii <= 255); ii++) {
                        max_value = 0;
                        for (int i = 0; (i <= 255); i++) {
                            if ((max_value < r1[i])) {
                                max_value = r1[i];
                            }
                            
                        }                      
                        for (int i = 0; (i <= 255); i++) {
                            if ((r1[i] == max_value)) {
                                if ((r1[i] == 0)) {
                                    r1[i] = -10;
                                    break;
                                }                               
                                rr1[ii] = i;
                                r1[i] = -5;
                                break;
                            }
                            
                        }
                        
                    }
                    for (int ii = 0; (ii <= 255); ii++) {
                        max_value = 0;
                        for (int i = 0; (i <= 255); i++) {
                            if ((max_value < g1[i])) {
                                max_value = g1[i];
                            }
                            
                        }                        
                        for (int i = 0; (i <= 255); i++) {
                            if ((g1[i] == max_value)) {
                                if ((g1[i] == 0)) {
                                    g1[i] = -10;
                                    break;
                                }                               
                                gg1[ii] = i;
                                g1[i] = -5;
                                break;
                            }
                            
                        }
                        
                    }
                    for (int ii = 0; (ii <= 255); ii++) {
                        max_value = 0;
                        for (int i = 0; (i <= 255); i++) {
                            if ((max_value < b1[i])) {
                                max_value = b1[i];
                            }
                            
                        }
                        for (int i = 0; (i <= 255); i++) {
                            if ((b1[i] == max_value)) {
                                if ((b1[i] == 0)) {
                                    b1[i] = -10;
                                    break;
                                }                               
                                bb1[ii] = i;
                                b1[i] = -5;
                                break;
                            }
                            
                        }
                        
                    }                   
                    data=img.getRGB(0,0,Width,Height,null,0,Width);
        			data2=img.getRGB(0,0,Width,Height,null,0,Width);
        			data3=img.getRGB(0,0,Width,Height,null,0,Width);
        			data4=img.getRGB(0,0,Width,Height,null,0,Width);
        					img=CreateBufferedImage_Direct(data,Height,Width);
        					img2=CreateBufferedImage_Direct(data,Height,Width);
        					img3=CreateBufferedImage_Direct(data,Height,Width);
        					img4=CreateBufferedImage_Direct(data,Height,Width);
					 for (int q=0;q<1;q++){													
							int rgbnumber  = 0;
							int[] b =new int[256];
							int[] g =new int[256];
							int[] r =new int[256];
							for (int i= 0;i<=255;i++){
						                    b[i] = Integer.parseInt(keyA.substring(rgbnumber,rgbnumber+3));
						                    rgbnumber += 3;
						               }
						               for (int i= 0;i<=255;i++){
						                    g[i] = Integer.parseInt(keyA.substring(rgbnumber,rgbnumber+3));
						                    rgbnumber += 3;
						               }
						                for (int i= 0;i<=255;i++){
						                    r[i] = Integer.parseInt(keyA.substring(rgbnumber,rgbnumber+3));
						                    rgbnumber += 3;
						               }
					         int[] rchange1 = new int [256];
								int[] rchange2= new int [256];
								for (int iii = 0; (iii <= 255); iii++) {
								    rchange1[iii] = r[iii];
								    rchange2[rchange1[iii]] = iii;
								}
								int[] gchange1 = new int [256];
								int[] gchange2= new int [256];
								for (int iiii = 0; (iiii <= 255); iiii++) {
								    gchange1[iiii] = g[iiii];
								    gchange2[gchange1[iiii]] = iiii;
								}
								int[] bchange1 = new int [256];
								int[] bchange2= new int [256];
								for (int iiiii = 0; (iiiii <= 255); iiiii++) {
								    bchange1[iiiii] = b[iiiii];
								    bchange2[bchange1[iiiii]] = iiiii;
								    
								}				
								for(int y=0;y<Height;y++){
									 for(int x=0;x<Width;x++){
									 int offset=y*Width+x;
									 int rgb=data[offset];
									 int rr=(rgb&0x00ff0000)>> 16;
									 int gg=(rgb&0x0000ff00)>> 8;
									 int bb=(rgb&0x000000ff);
									 rr=rchange2[rchange1[rchange2[rr]]];
									 gg=gchange2[gchange1[gchange2[gg]]];
									 bb=bchange2[bchange1[bchange2[bb]]];
									 rgb=(0xff000000|rr<<16|gg<<8|bb);
									 data[offset]=rgb;								 
								}
					 }
					 data=img.getRGB(0,0,Width,Height,null,0,Width);
						data2=img.getRGB(0,0,Width,Height,null,0,Width);
						data3=img.getRGB(0,0,Width,Height,null,0,Width);
						data4=img.getRGB(0,0,Width,Height,null,0,Width);
								img=CreateBufferedImage_Direct(data,Height,Width);
								img2=CreateBufferedImage_Direct(data,Height,Width);
								img3=CreateBufferedImage_Direct(data,Height,Width);
								img4=CreateBufferedImage_Direct(data,Height,Width);
								 for(int xy=0;xy<Height*Width;xy++){
				       				 int rgb=data[xy];
				       				 int rr=(rgb&0x00ff0000)>> 16;
				       				 int gg=(rgb&0x0000ff00)>> 8;
				       				 int bb=(rgb&0x000000ff);
				       				 r2[rr]+=1;	
				       				 g2[gg]+=1;
				       				 b2[bb]+=1;			       				 					 
				       			}}
								 for (int ii = 0; (ii <= 255); ii++) {
									    max_value = 0;
									    for (int i = 0; (i <= 255); i++) {
									        if ((max_value < r2[i])) {
									            max_value = r2[i];
									        }
									        
									    }									    
									    for (int i = 0; (i <= 255); i++) {
									        if ((r2[i] == max_value)) {
									            if ((r2[i] == 0)) {
									                r2[i] = -10;
									                break;
									            }								            
									            rr2[ii] = i;
									            r2[i] = -5;
									            break;
									        }
									        
									    }
									    
									}
									for (int ii = 0; (ii <= 255); ii++) {
									    max_value = 0;
									    for (int i = 0; (i <= 255); i++) {
									        if ((max_value < g2[i])) {
									            max_value = g2[i];
									        }
									        
									    }									    
									    for (int i = 0; (i <= 255); i++) {
									        if ((g2[i] == 0)) {
									            g2[i] = -10;
									            break;
									        }
									        
									        if ((g2[i] == max_value)) {
									            gg2[ii] = i;
									            g2[i] = -5;
									            break;
									        }
									        
									    }
									    
									}
									for (int ii = 0; (ii <= 255); ii++) {
									    max_value = 0;
									    for (int i = 0; (i <= 255); i++) {
									        if ((max_value < b2[i])) {
									            max_value = b2[i];
									        }
									        
									    }								    
									    for (int i = 0; (i <= 255); i++) {
									        if ((b2[i] == max_value)) {
									            if ((b2[i] == 0)) {
									                b2[i] = -10;
									                break;
									            }				            
									            bb2[ii] = i;
									            b2[i] = -5;
									            break;
									        }
									        
									    }
									    
									}					 
						data=img.getRGB(0,0,Width,Height,null,0,Width);
						data2=img.getRGB(0,0,Width,Height,null,0,Width);
						data3=img.getRGB(0,0,Width,Height,null,0,Width);
						data4=img.getRGB(0,0,Width,Height,null,0,Width);				
								img=CreateBufferedImage_Direct(data,Height,Width);
								img2=CreateBufferedImage_Direct(data,Height,Width);
								img3=CreateBufferedImage_Direct(data,Height,Width);
								img4=CreateBufferedImage_Direct(data,Height,Width);
									int sumnumber[] = new int[data.length+1];
									for(int xy=0;xy<data.length;xy+=2){
										sumnumber[xy]=xy/2;
										sumnumber[xy+1]=xy/2+data.length/2;																
									}
									for(int xy=0;xy<(data.length);xy++){													
										int offset=sumnumber[xy];
										 int rgb=data2[xy];
										 int r=(rgb&0x00ff0000);
										 int g=(rgb&0x0000ff00);
										 int b=(rgb&0x000000ff);
										 rgb=(0xff000000|r|g|b);
										 data[offset]=rgb;																		
									}
									data=img.getRGB(0,0,Width,Height,null,0,Width);
									data2=img.getRGB(0,0,Width,Height,null,0,Width);
									data3=img.getRGB(0,0,Width,Height,null,0,Width);
									data4=img.getRGB(0,0,Width,Height,null,0,Width);
											img=CreateBufferedImage_Direct(data,Height,Width);
											img2=CreateBufferedImage_Direct(data,Height,Width);
											img3=CreateBufferedImage_Direct(data,Height,Width);
											img4=CreateBufferedImage_Direct(data,Height,Width);					
							int he =Height-rr2[1]-1;
							 for(int i= 0 ;i<Width; i++){
								 for(int k= 0 ;k<he; k++){
									int rgb=data2[he  + i * he  - k ];
									 int rgb1=data[he  + i * he  - k ];
									 int r=(rgb&0x00ff0000);
									 int g=(rgb&0x0000ff00);
									 int b=(rgb&0x000000ff);
									 rgb=(0xff000000|r|g|b);
									 data[k + i * he ]=rgb;
									  }
							 }
							 he =Height-gg2[1]-1;
							 for(int i= 0 ;i<Width; i++){
								 for(int k= 0 ;k<he; k++){
									 int rgb=data2[he  + i * he  - k ];
									 int rgb1=data[he  + i * he  - k ];
									 int r=(rgb&0x00ff0000);
									 int g=(rgb&0x0000ff00);
									 int b=(rgb&0x000000ff);
									 rgb=(0xff000000|r|g|b);
									 data3[k + i * he]=rgb;
									  }
							 }
							 he =Height-bb2[1]-1;
							 for(int i= 0 ;i<Width; i++){
								 for(int k= 0 ;k<he; k++){
									 int rgb=data2[he  + i * he  - k ];
									 int rgb1=data[he  + i * he  - k ];
									 int r=(rgb&0x00ff0000);
									 int g=(rgb&0x0000ff00);
									 int b=(rgb&0x000000ff);
									 rgb=(0xff000000|r|g|b);
									 data4[k + i * he]=rgb;
									  }
							 }
								 for(int xy=0;xy<Height*Width;xy++){
									 int offset=xy;
									 int rgb=data[offset];
									 int rgb3=data3[offset];
									 int rgb4=data4[offset];
									 int r=(rgb&0x00ff0000);
									 int g=(rgb3&0x0000ff00);
									 int b=(rgb4&0x000000ff);
									 rgb=(0xff000000|r|g|b);
									 data[offset]=rgb;
								 }	
								 data=img.getRGB(0,0,Width,Height,null,0,Width);
									data2=img.getRGB(0,0,Width,Height,null,0,Width);
									data3=img.getRGB(0,0,Width,Height,null,0,Width);
									data4=img.getRGB(0,0,Width,Height,null,0,Width);
									img=CreateBufferedImage_Direct(data,Height,Width);
									img2=CreateBufferedImage_Direct(data,Height,Width);
									img3=CreateBufferedImage_Direct(data,Height,Width);
									img4=CreateBufferedImage_Direct(data,Height,Width);							
								for (int q=0 ; q<1 ;q++){
									 int wiwir[][]  = new int[Width][Height];
									 int wiwig[][]  = new int[Width][Height];
									 int wiwib[][]  = new int[Width][Height];
									 for(int y=0;y<Height;y++){
										 for(int x=0;x<Width;x++){
											 int offset=y*(Width)+x;							 
											 int rgb= data2[offset]; 
											 int r=(rgb&0x00ff0000)>>16;
											 int g=(rgb&0x0000ff00)>>8;
											 int b=rgb&0x000000ff;										
											 wiwir[x][y]=r;
											 wiwig[x][y]=g;
											 wiwib[x][y]=b;
											  }
									 }
									 int wiwir2[][]  = new int[Height][Width];
									 int wiwig2[][]  = new int[Height][Width];
									 int wiwib2[][]  = new int[Height][Width];
									 for(int y=0;y<Height;y++){
										 for(int x=0;x<Width;x++){
											wiwir2[y][x] =wiwir[x][y];
											wiwig2[y][x] =wiwig[x][y];
											wiwib2[y][x] =wiwib[x][y];
										 }}						 						 
									int ii9 =0;
										  for(int y=0;y<Width;y++){
										 for(int x=0;x<Height;x++){
											 int offset=ii9;							 
											 int rgb; 
											 int r=wiwir2[x][y];
											 int g=wiwig2[x][y];
											 int b=wiwib2[x][y];
											 rgb=(0xff000000|r<<16|g<<8|b);
											data[ii9]=rgb;	
											ii9+=1;
										 }
									 }
										  }
								data=img.getRGB(0,0,Width,Height,null,0,Width);
								data2=img.getRGB(0,0,Width,Height,null,0,Width);
								data3=img.getRGB(0,0,Width,Height,null,0,Width);
								data4=img.getRGB(0,0,Width,Height,null,0,Width);
								img=CreateBufferedImage_Direct(data,Height,Width);
								img2=CreateBufferedImage_Direct(data,Height,Width);
								img3=CreateBufferedImage_Direct(data,Height,Width);
								img4=CreateBufferedImage_Direct(data,Height,Width);
								 he =Height-rr1[1]-1;
								 for(int i= 0 ;i<Width; i++){
									 for(int k= 0 ;k<he; k++){
										int rgb=data2[he  + i * he  - k ];
										 int rgb1=data[he  + i * he  - k ];
										 int r=(rgb&0x00ff0000);
										 int g=(rgb&0x0000ff00);
										 int b=(rgb&0x000000ff);
										 rgb=(0xff000000|r|g|b);
										 data[k + i * he ]=rgb;
										  }
								 }
								 he =Height-gg1[1]-1;
								 for(int i= 0 ;i<Width; i++){
									 for(int k= 0 ;k<he; k++){
										 int rgb=data2[he  + i * he  - k ];
										 int rgb1=data[he  + i * he  - k ];
										 int r=(rgb&0x00ff0000);
										 int g=(rgb&0x0000ff00);
										 int b=(rgb&0x000000ff);
										 rgb=(0xff000000|r|g|b);
										 data3[k + i * he]=rgb;
										  }
								 }
								 he =Height-bb1[1]-1;
								 for(int i= 0 ;i<Width; i++){
									 for(int k= 0 ;k<he; k++){
										 int rgb=data2[he  + i * he  - k ];
										 int rgb1=data[he  + i * he  - k ];
										 int r=(rgb&0x00ff0000);
										 int g=(rgb&0x0000ff00);
										 int b=(rgb&0x000000ff);
										 rgb=(0xff000000|r|g|b);
										 data4[k + i * he]=rgb;
										  }
								 }
									 for(int xy=0;xy<Height*Width;xy++){
										 int offset=xy;
										 int rgb=data[offset];
										 int rgb3=data3[offset];
										 int rgb4=data4[offset];
										 int r=(rgb&0x00ff0000);
										 int g=(rgb3&0x0000ff00);
										 int b=(rgb4&0x000000ff);
										 rgb=(0xff000000|r|g|b);
										 data[offset]=rgb;
									 }						
								data=img.getRGB(0,0,Width,Height,null,0,Width);
								data2=img.getRGB(0,0,Width,Height,null,0,Width);
								data3=img.getRGB(0,0,Width,Height,null,0,Width);
								data4=img.getRGB(0,0,Width,Height,null,0,Width);
								img=CreateBufferedImage_Direct(data,Height,Width);
								img2=CreateBufferedImage_Direct(data,Height,Width);
								img3=CreateBufferedImage_Direct(data,Height,Width);
								img4=CreateBufferedImage_Direct(data,Height,Width);
								for (int q=0 ; q<1 ;q++){
									 int wiwi =Height;
									 int hehe=Width;
									 int wiwir[][]  = new int[wiwi][hehe];
									 int wiwig[][]  = new int[wiwi][hehe];
									 int wiwib[][]  = new int[wiwi][hehe];
									 for(int y=0;y<hehe;y++){
										 for(int x=0;x<wiwi;x++){
											 int offset=y*(wiwi)+x;							 
											 int rgb= data2[offset]; 
											 int r=(rgb&0x00ff0000)>>16;
											 int g=(rgb&0x0000ff00)>>8;
											 int b=rgb&0x000000ff;			
											 wiwir[x][y]=r;
											 wiwig[x][y]=g;
											 wiwib[x][y]=b;
											  }
									 }
									 int wiwir2[][]  = new int[hehe][wiwi];
									 int wiwig2[][]  = new int[hehe][wiwi];
									 int wiwib2[][]  = new int[hehe][wiwi];
									 for(int y=0;y<hehe;y++){
										 for(int x=0;x<wiwi;x++){
											wiwir2[y][x] =wiwir[x][y];
											wiwig2[y][x] =wiwig[x][y];
											wiwib2[y][x] =wiwib[x][y];
										 }}							 						 
									int ii9 =0;
										  for(int y=0;y<wiwi;y++){
										 for(int x=0;x<hehe;x++){
											 int offset=ii9;							 
											 int rgb; // 反轉顏色
											 int r=wiwir2[x][y];
											 int g=wiwig2[x][y];
											 int b=wiwib2[x][y];
											 rgb=(0xff000000|r<<16|g<<8|b);
											 //data[offset]=rgb;
											data[ii9]=rgb;	
											ii9+=1;
										 }
									 }
										  }	
								data=img.getRGB(0,0,Width,Height,null,0,Width);
									data2=img.getRGB(0,0,Width,Height,null,0,Width);
									data3=img.getRGB(0,0,Width,Height,null,0,Width);
									data4=img.getRGB(0,0,Width,Height,null,0,Width);
									img=CreateBufferedImage_Direct(data,Height,Width);
									img2=CreateBufferedImage_Direct(data,Height,Width);
									img3=CreateBufferedImage_Direct(data,Height,Width);
									img4=CreateBufferedImage_Direct(data,Height,Width);																		
						
			 }					
						ImageIO.write(img, "png", new File("C:\\ckey\\A.png"));
						img = ImageIO.read(new File("C:\\ckey\\A.png"));
						f2 = new JFrame("");
						 f2.setVisible(true);
						 JScrollPane	 scrollPane = new JScrollPane(new JLabel(new ImageIcon(img)));
						f2.getContentPane().add(scrollPane);
						f2.pack();	
						f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 }	
				 for(int zz =0;zz<1;zz++){
					 for (int z=0;z<2;z++){  
		img = ImageIO.read(new File("C:\\ckey\\B.png"));
		img2 = ImageIO.read(new File("C:\\ckey\\B.png"));
		img3 = ImageIO.read(new File("C:\\ckey\\B.png"));
		img4 = ImageIO.read(new File("C:\\ckey\\B.png"));
        Height=img.getHeight();
		 Width=img.getWidth(); 
		data=img.getRGB(0,0,Width,Height,null,0,Width);
		data2=img.getRGB(0,0,Width,Height,null,0,Width);
		data3=img.getRGB(0,0,Width,Height,null,0,Width);
		data4=img.getRGB(0,0,Width,Height,null,0,Width);
				img=CreateBufferedImage_Direct(data,Height,Width);
				img2=CreateBufferedImage_Direct(data,Height,Width);
				img3=CreateBufferedImage_Direct(data,Height,Width);
				img4=CreateBufferedImage_Direct(data,Height,Width);
		       int r1[] =new int[256]  ;
                int g1[]=new int[256]  ;
                int b1[] =new int[256]  ;
                int r2[]=new int[256]  ;
                int g2[]=new int[256]  ;
                int b2[]=new int[256]  ;
                int rr1[]=new int[256]  ;
                int gg1[]=new int[256]  ;
                int bb1[]=new int[256]  ;
                int rr2[]=new int[256]  ;
                int gg2[]=new int[256]  ;
                int bb2[]=new int[256]  ;			
                for(int xy=0;xy<Height*Width;xy++){
   				 int rgb=data[xy];
   				 int rr=(rgb&0x00ff0000)>> 16;
   				 int gg=(rgb&0x0000ff00)>> 8;
   				 int bb=(rgb&0x000000ff);
   				 r1[rr]+=1;	
   				 g1[gg]+=1;
   				 b1[bb]+=1;
   				 rgb=(0xff000000|rr<<16|gg<<8|bb);    					 
   			}
                int max_value;
                for (int ii = 0; (ii <= 255); ii++) {
                    max_value = 0;
                    for (int i = 0; (i <= 255); i++) {
                        if ((max_value < r1[i])) {
                            max_value = r1[i];
                        }
                        
                    }             
                    for (int i = 0; (i <= 255); i++) {
                        if ((r1[i] == max_value)) {
                            if ((r1[i] == 0)) {
                                r1[i] = -10;
                                break;
                            }                            
                            rr1[ii] = i;
                            r1[i] = -5;
                            break;
                        }
                        
                    }
                    
                }
                for (int ii = 0; (ii <= 255); ii++) {
                    max_value = 0;
                    for (int i = 0; (i <= 255); i++) {
                        if ((max_value < g1[i])) {
                            max_value = g1[i];
                        }
                        
                    }                   
                    for (int i = 0; (i <= 255); i++) {
                        if ((g1[i] == max_value)) {
                            if ((g1[i] == 0)) {
                                g1[i] = -10;
                                break;
                            }
                            
                            gg1[ii] = i;
                            g1[i] = -5;
                            break;
                        }
                        
                    }
                    
                }
                for (int ii = 0; (ii <= 255); ii++) {
                    max_value = 0;
                    for (int i = 0; (i <= 255); i++) {
                        if ((max_value < b1[i])) {
                            max_value = b1[i];
                        }
                        
                    }                   
                    for (int i = 0; (i <= 255); i++) {
                        if ((b1[i] == max_value)) {
                            if ((b1[i] == 0)) {
                                b1[i] = -10;
                                break;
                            }
                            
                            bb1[ii] = i;
                            b1[i] = -5;
                            break;
                        }
                        
                    }
                    
                }      
                data=img.getRGB(0,0,Width,Height,null,0,Width);
    			data2=img.getRGB(0,0,Width,Height,null,0,Width);
    			data3=img.getRGB(0,0,Width,Height,null,0,Width);
    			data4=img.getRGB(0,0,Width,Height,null,0,Width);
    					img=CreateBufferedImage_Direct(data,Height,Width);
    					img2=CreateBufferedImage_Direct(data,Height,Width);
    					img3=CreateBufferedImage_Direct(data,Height,Width);
    					img4=CreateBufferedImage_Direct(data,Height,Width);
				 for (int q=0;q<1;q++){												
						int rgbnumber  = 0;
						int[] b =new int[256];
						int[] g =new int[256];
						int[] r =new int[256];					           
				               for (int i= 0;i<=255;i++){
					                    b[i] = Integer.parseInt(keyB.substring(rgbnumber,rgbnumber+3));
					                    rgbnumber += 3;
					               }
					               for (int i= 0;i<=255;i++){
					                    g[i] = Integer.parseInt(keyB.substring(rgbnumber,rgbnumber+3));
					                    rgbnumber += 3;
					               }
					                for (int i= 0;i<=255;i++){
					                    r[i] = Integer.parseInt(keyB.substring(rgbnumber,rgbnumber+3));
					                    rgbnumber += 3;
					               }
				         int[] rchange1 = new int [256];
							int[] rchange2= new int [256];
							for (int iii = 0; (iii <= 255); iii++) {
							    rchange1[iii] = r[iii];
							    rchange2[rchange1[iii]] = iii;
							}
							int[] gchange1 = new int [256];
							int[] gchange2= new int [256];
							for (int iiii = 0; (iiii <= 255); iiii++) {
							    gchange1[iiii] = g[iiii];
							    gchange2[gchange1[iiii]] = iiii;
							}
							int[] bchange1 = new int [256];
							int[] bchange2= new int [256];
							for (int iiiii = 0; (iiiii <= 255); iiiii++) {
							    bchange1[iiiii] = b[iiiii];
							    bchange2[bchange1[iiiii]] = iiiii; 
							}	
							for(int y=0;y<Height;y++){
								 for(int x=0;x<Width;x++){
								 int offset=y*Width+x;
								 int rgb=data[offset];
								 int rr=(rgb&0x00ff0000)>> 16;
								 int gg=(rgb&0x0000ff00)>> 8;
								 int bb=(rgb&0x000000ff);
								 rr=rchange2[rchange1[rchange2[rr]]];
								 gg=gchange2[gchange1[gchange2[gg]]];
								 bb=bchange2[bchange1[bchange2[bb]]];
								 rgb=(0xff000000|rr<<16|gg<<8|bb);
								 data[offset]=rgb;								 
							}
				 }
				 data=img.getRGB(0,0,Width,Height,null,0,Width);
					data2=img.getRGB(0,0,Width,Height,null,0,Width);
					data3=img.getRGB(0,0,Width,Height,null,0,Width);
					data4=img.getRGB(0,0,Width,Height,null,0,Width);
							img=CreateBufferedImage_Direct(data,Height,Width);
							img2=CreateBufferedImage_Direct(data,Height,Width);
							img3=CreateBufferedImage_Direct(data,Height,Width);
							img4=CreateBufferedImage_Direct(data,Height,Width);
							 for(int xy=0;xy<Height*Width;xy++){
			       				 int rgb=data[xy];
			       				 int rr=(rgb&0x00ff0000)>> 16;
			       				 int gg=(rgb&0x0000ff00)>> 8;
			       				 int bb=(rgb&0x000000ff);
			       				 r2[rr]+=1;	
			       				 g2[gg]+=1;
			       				 b2[bb]+=1;			       				 					 
			       			}}
							 for (int ii = 0; (ii <= 255); ii++) {
								    max_value = 0;
								    for (int i = 0; (i <= 255); i++) {
								        if ((max_value < r2[i])) {
								            max_value = r2[i];
								        }
								        
								    }   
								    for (int i = 0; (i <= 255); i++) {
								        if ((r2[i] == max_value)) {
								            if ((r2[i] == 0)) {
								                r2[i] = -10;
								                break;
								            } 
								            rr2[ii] = i;
								            r2[i] = -5;
								            break;
								        }
								        
								    }
								    
								}
								for (int ii = 0; (ii <= 255); ii++) {
								    max_value = 0;
								    for (int i = 0; (i <= 255); i++) {
								        if ((max_value < g2[i])) {
								            max_value = g2[i];
								        }
								        
								    }  
								    for (int i = 0; (i <= 255); i++) {
								        if ((g2[i] == 0)) {
								            g2[i] = -10;
								            break;
								        }
								        if ((g2[i] == max_value)) {
								            gg2[ii] = i;
								            g2[i] = -5;
								            break;
								        }
								        
								    }
								}
								for (int ii = 0; (ii <= 255); ii++) {
								    max_value = 0;
								    for (int i = 0; (i <= 255); i++) {
								        if ((max_value < b2[i])) {
								            max_value = b2[i];
								        }
								        
								    }						    
								    for (int i = 0; (i <= 255); i++) {
								        if ((b2[i] == max_value)) {
								            if ((b2[i] == 0)) {
								                b2[i] = -10;
								                break;
								            }    
								            bb2[ii] = i;
								            b2[i] = -5;
								            break;
								        }								        
								    }								    
								}					 
					data=img.getRGB(0,0,Width,Height,null,0,Width);
					data2=img.getRGB(0,0,Width,Height,null,0,Width);
					data3=img.getRGB(0,0,Width,Height,null,0,Width);
					data4=img.getRGB(0,0,Width,Height,null,0,Width);				
							img=CreateBufferedImage_Direct(data,Height,Width);
							img2=CreateBufferedImage_Direct(data,Height,Width);
							img3=CreateBufferedImage_Direct(data,Height,Width);
							img4=CreateBufferedImage_Direct(data,Height,Width);
								int sumnumber[] = new int[data.length+1];
								for(int xy=0;xy<data.length;xy+=2){
									sumnumber[xy]=xy/2;
									sumnumber[xy+1]=xy/2+data.length/2;																
								}
								for(int xy=0;xy<(data.length);xy++){													
									int offset=sumnumber[xy];
									 int rgb=data2[xy];
									 int r=(rgb&0x00ff0000);
									 int g=(rgb&0x0000ff00);
									 int b=(rgb&0x000000ff);
									 rgb=(0xff000000|r|g|b);
									 data[offset]=rgb;																		
								}
								data=img.getRGB(0,0,Width,Height,null,0,Width);
								data2=img.getRGB(0,0,Width,Height,null,0,Width);
								data3=img.getRGB(0,0,Width,Height,null,0,Width);
								data4=img.getRGB(0,0,Width,Height,null,0,Width);
										img=CreateBufferedImage_Direct(data,Height,Width);
										img2=CreateBufferedImage_Direct(data,Height,Width);
										img3=CreateBufferedImage_Direct(data,Height,Width);
										img4=CreateBufferedImage_Direct(data,Height,Width);					
						int he =Height-rr2[1]-1;
						 for(int i= 0 ;i<Width; i++){
							 for(int k= 0 ;k<he; k++){
								int rgb=data2[he  + i * he  - k ];
								 int rgb1=data[he  + i * he  - k ];
								 int r=(rgb&0x00ff0000);
								 int g=(rgb&0x0000ff00);
								 int b=(rgb&0x000000ff);
								 rgb=(0xff000000|r|g|b);
								 data[k + i * he ]=rgb;
								  }
						 }
						 he =Height-gg2[1]-1;
						 for(int i= 0 ;i<Width; i++){
							 for(int k= 0 ;k<he; k++){
								 int rgb=data2[he  + i * he  - k ];
								 int rgb1=data[he  + i * he  - k ];
								 int r=(rgb&0x00ff0000);
								 int g=(rgb&0x0000ff00);
								 int b=(rgb&0x000000ff);
								 rgb=(0xff000000|r|g|b);
								 data3[k + i * he]=rgb;
								  }
						 }
						 he =Height-bb2[1]-1;
						 for(int i= 0 ;i<Width; i++){
							 for(int k= 0 ;k<he; k++){
								 int rgb=data2[he  + i * he  - k ];
								 int rgb1=data[he  + i * he  - k ];
								 int r=(rgb&0x00ff0000);
								 int g=(rgb&0x0000ff00);
								 int b=(rgb&0x000000ff);
								 rgb=(0xff000000|r|g|b);
								 data4[k + i * he]=rgb;
								  }
						 }
							 for(int xy=0;xy<Height*Width;xy++){
								 int offset=xy;
								 int rgb=data[offset];
								 int rgb3=data3[offset];
								 int rgb4=data4[offset];
								 int r=(rgb&0x00ff0000);
								 int g=(rgb3&0x0000ff00);
								 int b=(rgb4&0x000000ff);
								 rgb=(0xff000000|r|g|b);
								 data[offset]=rgb;
							 }	
							 data=img.getRGB(0,0,Width,Height,null,0,Width);
								data2=img.getRGB(0,0,Width,Height,null,0,Width);
								data3=img.getRGB(0,0,Width,Height,null,0,Width);
								data4=img.getRGB(0,0,Width,Height,null,0,Width);
								img=CreateBufferedImage_Direct(data,Height,Width);
								img2=CreateBufferedImage_Direct(data,Height,Width);
								img3=CreateBufferedImage_Direct(data,Height,Width);
								img4=CreateBufferedImage_Direct(data,Height,Width);							
							for (int q=0 ; q<1 ;q++){
								 int wiwir[][]  = new int[Width][Height];
								 int wiwig[][]  = new int[Width][Height];
								 int wiwib[][]  = new int[Width][Height];
								 for(int y=0;y<Height;y++){
									 for(int x=0;x<Width;x++){
										 int offset=y*(Width)+x;							 
										 int rgb= data2[offset]; 
										 int r=(rgb&0x00ff0000)>>16;
										 int g=(rgb&0x0000ff00)>>8;
										 int b=rgb&0x000000ff;										
										 wiwir[x][y]=r;
										 wiwig[x][y]=g;
										 wiwib[x][y]=b;
										  }
								 }
								 int wiwir2[][]  = new int[Height][Width];
								 int wiwig2[][]  = new int[Height][Width];
								 int wiwib2[][]  = new int[Height][Width];
								 for(int y=0;y<Height;y++){
									 for(int x=0;x<Width;x++){
										wiwir2[y][x] =wiwir[x][y];
										wiwig2[y][x] =wiwig[x][y];
										wiwib2[y][x] =wiwib[x][y];
									 }}						 						 
								int ii9 =0;
									  for(int y=0;y<Width;y++){
									 for(int x=0;x<Height;x++){
										 int offset=ii9;							 
										 int rgb; 
										 int r=wiwir2[x][y];
										 int g=wiwig2[x][y];
										 int b=wiwib2[x][y];
										 rgb=(0xff000000|r<<16|g<<8|b);
										data[ii9]=rgb;	
										ii9+=1;
									 }
								 }
									  }
							data=img.getRGB(0,0,Width,Height,null,0,Width);
							data2=img.getRGB(0,0,Width,Height,null,0,Width);
							data3=img.getRGB(0,0,Width,Height,null,0,Width);
							data4=img.getRGB(0,0,Width,Height,null,0,Width);
							img=CreateBufferedImage_Direct(data,Height,Width);
							img2=CreateBufferedImage_Direct(data,Height,Width);
							img3=CreateBufferedImage_Direct(data,Height,Width);
							img4=CreateBufferedImage_Direct(data,Height,Width);
							 he =Height-rr1[1]-1;
							 for(int i= 0 ;i<Width; i++){
								 for(int k= 0 ;k<he; k++){
									int rgb=data2[he  + i * he  - k ];
									 int rgb1=data[he  + i * he  - k ];
									 int r=(rgb&0x00ff0000);
									 int g=(rgb&0x0000ff00);
									 int b=(rgb&0x000000ff);
									 rgb=(0xff000000|r|g|b);
									 data[k + i * he ]=rgb;
									  }
							 }
							 he =Height-gg1[1]-1;
							 for(int i= 0 ;i<Width; i++){
								 for(int k= 0 ;k<he; k++){
									 int rgb=data2[he  + i * he  - k ];
									 int rgb1=data[he  + i * he  - k ];
									 int r=(rgb&0x00ff0000);
									 int g=(rgb&0x0000ff00);
									 int b=(rgb&0x000000ff);
									 rgb=(0xff000000|r|g|b);
									 data3[k + i * he]=rgb;
									  }
							 }
							 he =Height-bb1[1]-1;
							 for(int i= 0 ;i<Width; i++){
								 for(int k= 0 ;k<he; k++){
									 int rgb=data2[he  + i * he  - k ];
									 int rgb1=data[he  + i * he  - k ];
									 int r=(rgb&0x00ff0000);
									 int g=(rgb&0x0000ff00);
									 int b=(rgb&0x000000ff);
									 rgb=(0xff000000|r|g|b);
									 data4[k + i * he]=rgb;
									  }
							 }
								 for(int xy=0;xy<Height*Width;xy++){
									 int offset=xy;
									 int rgb=data[offset];
									 int rgb3=data3[offset];
									 int rgb4=data4[offset];
									 int r=(rgb&0x00ff0000);
									 int g=(rgb3&0x0000ff00);
									 int b=(rgb4&0x000000ff);
									 rgb=(0xff000000|r|g|b);
									 data[offset]=rgb;
								 }						
							data=img.getRGB(0,0,Width,Height,null,0,Width);
							data2=img.getRGB(0,0,Width,Height,null,0,Width);
							data3=img.getRGB(0,0,Width,Height,null,0,Width);
							data4=img.getRGB(0,0,Width,Height,null,0,Width);
							img=CreateBufferedImage_Direct(data,Height,Width);
							img2=CreateBufferedImage_Direct(data,Height,Width);
							img3=CreateBufferedImage_Direct(data,Height,Width);
							img4=CreateBufferedImage_Direct(data,Height,Width);
							for (int q=0 ; q<1 ;q++){
								 int wiwi =Height;
								 int hehe=Width;
								 int wiwir[][]  = new int[wiwi][hehe];
								 int wiwig[][]  = new int[wiwi][hehe];
								 int wiwib[][]  = new int[wiwi][hehe];
								 for(int y=0;y<hehe;y++){
									 for(int x=0;x<wiwi;x++){
										 int offset=y*(wiwi)+x;							 
										 int rgb= data2[offset]; 
										 int r=(rgb&0x00ff0000)>>16;
										 int g=(rgb&0x0000ff00)>>8;
										 int b=rgb&0x000000ff;			
										 wiwir[x][y]=r;
										 wiwig[x][y]=g;
										 wiwib[x][y]=b;
										  }
								 }
								 int wiwir2[][]  = new int[hehe][wiwi];
								 int wiwig2[][]  = new int[hehe][wiwi];
								 int wiwib2[][]  = new int[hehe][wiwi];
								 for(int y=0;y<hehe;y++){
									 for(int x=0;x<wiwi;x++){
										wiwir2[y][x] =wiwir[x][y];
										wiwig2[y][x] =wiwig[x][y];
										wiwib2[y][x] =wiwib[x][y];
									 }}							 						 
								int ii9 =0;
									  for(int y=0;y<wiwi;y++){
									 for(int x=0;x<hehe;x++){
										 int offset=ii9;							 
										 int rgb; // 反轉顏色
										 int r=wiwir2[x][y];
										 int g=wiwig2[x][y];
										 int b=wiwib2[x][y];
										 rgb=(0xff000000|r<<16|g<<8|b);
										 //data[offset]=rgb;
										data[ii9]=rgb;	
										ii9+=1;
									 }
								 }
									  }	
							data=img.getRGB(0,0,Width,Height,null,0,Width);
								data2=img.getRGB(0,0,Width,Height,null,0,Width);
								data3=img.getRGB(0,0,Width,Height,null,0,Width);
								data4=img.getRGB(0,0,Width,Height,null,0,Width);
								img=CreateBufferedImage_Direct(data,Height,Width);
								img2=CreateBufferedImage_Direct(data,Height,Width);
								img3=CreateBufferedImage_Direct(data,Height,Width);
								img4=CreateBufferedImage_Direct(data,Height,Width);																		
					
		 }					
					ImageIO.write(img, "png", new File("C:\\ckey\\B.png"));
					img = ImageIO.read(new File("C:\\ckey\\B.png"));
					f2 = new JFrame("");
					 f2.setVisible(true);
					 JScrollPane	 scrollPane = new JScrollPane(new JLabel(new ImageIcon(img)));
					f2.getContentPane().add(scrollPane);
					f2.pack();	
					f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 }
				 
				 try{
						img = ImageIO.read(new File("C:\\ckey\\A.png"));
						img2 = ImageIO.read(new File("C:\\ckey\\B.png"));
						img3 = ImageIO.read(new File("C:\\ckey\\A.png"));
						img4 = ImageIO.read(new File("C:\\ckey\\B.png"));
								}catch(Exception e){
						}
						
						 Height=img.getHeight();
						 Width=img.getWidth();
						data=img.getRGB(0,0,Width,Height,null,0,Width);
						data2=img2.getRGB(0,0,Width,Height,null,0,Width);
						data3=img3.getRGB(0,0,Width,Height,null,0,Width);
						data4=img4.getRGB(0,0,Width,Height,null,0,Width);
								img=CreateBufferedImage_Direct(data,Height,Width);
								img2=CreateBufferedImage_Direct(data,Height,Width);
								img3=CreateBufferedImage_Direct(data,Height,Width);
								img4=CreateBufferedImage_Direct(data,Height,Width);								
								for(int xy=0;xy<(data.length);xy++){													
									int offset=xy;
									 int rgb=data[xy];
									 int rgb2=data2[xy];
									 int r=(rgb&0x00ff0000)>> 16;
									 int g=(rgb&0x0000ff00)>> 8;
									 int b=(rgb&0x000000ff);
									 int r2=(rgb2&0x00ff0000)>> 16;
									 int g2=(rgb2&0x0000ff00)>> 8;
									 int b2=(rgb2&0x000000ff);
									 r=r+r2;
									 g=g+g2;
									 b=b+b2;
									 rgb=(0xff000000|r<<16|g<<8|b);
									 data[offset]=rgb;	
									} 								
								ImageIO.write(img, "png", new File("C:\\ckey\\解密後.png"));
								f = new JFrame("");
								 f.setVisible(true);
								JScrollPane scrollPane = new JScrollPane(new JLabel(new ImageIcon(img)));
								f.getContentPane().add(scrollPane);
								f.pack();
								f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	 
		}					
		}