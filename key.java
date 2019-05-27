public class key {
	public static void main(String args[]) throws InterruptedException{
		for(int z=0;z<1;z++){
		 int rm3 = 0;
		 int gm3 = 0;
		 int bm3 = 0;
		 boolean[] rmath = new boolean[256];
		 boolean[] gmath = new boolean[256];
		 boolean[] bmath = new boolean[256];
		  int[] r = new int [256]; 
		 int[] g = new int [256]; 
		 int[] b = new int [256]; 
		 int rs;
		 int gs;
		 int bs;
		 int rgbcheck = 0;
		 int rgbcheck2 = 0;
		 int rgbcheck3 = 0;
		 rs = ((int)(Math.random()*20000+1000))%250;
		 gs = ((int)(Math.random()*20000+1000))%250;
		 bs = ((int)(Math.random()*20000+1000))%250;
		 rs+=1;
		 gs+=1;
		 bs+=1;
		 int rcheck3 = 256;
		 rgbcheck = 0;
		 rgbcheck2 = 0;
		 rgbcheck3 = 0;
		 while ((rgbcheck < 255)) {	
			 rm3 = (rm3 + rs);
		     while (((rm3 > 255)  || (rm3 < 0))) {
		         if ((rm3 > 255)) {
		             rm3 = (0   + (rm3 - 255));
		         }
		         else if ((rm3 < 0)) {
		             rm3 = (0 + (255 - (rm3 * -1)));		             
		         }
		         
		      }		     
		     if (((rm3 <= 255)  && (rm3 >= 0))) {
		         if ((rmath[rm3] == false)) {
		             rmath[rm3] = true;
		             r[rgbcheck] = rm3;
		             rgbcheck++;	          
		         }
		         else {
		            int o = 255;
		             while ((rmath[rm3] == true)) {		            	 
		                 rm3++;
		                 if ((rm3 > 255)) {
		                     rm3 = 0;
		                 }			                 
		                o--;
		                 if ((o < 1)) {
		                   o = 1;
		                 }			                 
		                 if (((rm3 > 0) 
		                             && (rm3 < 255))) {
		                     rcheck3 = rm3;
		                 }		                 
		             }
		             if ((rmath[rm3] == false)) {
		                     rmath[rm3] = true;
		                     r[rgbcheck] = rm3;
		                     rgbcheck++;
		             }		             	         
		     }
		 } 
		 }
		     int gcheck3 = 256;
		     rgbcheck2 = 0;
		     while ((rgbcheck2 < 255)) {
		         gm3 = (gm3 + gs);
		         while (((gm3 > 255) 
		                     || (gm3 < 0))) {
		             if ((gm3 > 255)) {
		                 gm3 = (0 
		                             + (gm3 - 255));
		             }
		             else if ((gm3 < 0)) {
		                 gm3 = (0 + (255 
		                             - (gm3 * -1)));
		             }
		             
		         } 
		         if (((gm3 <= 255) 
		        		 && (gm3 >= 0))) {
		             if ((gmath[gm3] == false)) {
		                 gmath[gm3] = true;
		                 g[rgbcheck2] = gm3;
		                 rgbcheck2++;
		             }
		             else {
		                 int o = 255;
		                 while ((gmath[gm3] == true)) {
		                     gm3++;
		                     if ((gm3 > 255)) {
		                         gm3 = 0;
		                     }                  
		                     o--;
		                     if ((o < 1)) {
		                         o = 1;
		                     }                  
		                     if (((gm3 > 0) 
		                                 && (gm3 < 255))) {
		                         gcheck3 = gm3;
		                     }		                    		                     
		                 }
		                  if ((gmath[gm3] == false)) {
		                         gmath[gm3] = true;
		                         g[rgbcheck2] = gm3;
		                         rgbcheck2++;
		                     }		                 
		             }
		             
		         }
		     }
		         int bcheck3 = 256;
		         rgbcheck3 = 0;
		         while ((rgbcheck3 < 255)) {
		             bm3 = (bm3 + bs);
		             while (((bm3 > 255) 
		                         || (bm3 < 0))) {
		                 if ((bm3 > 255)) {
		                     bm3 = (0 
		                                 + (bm3 - 255));
		                 }
		                 else if ((bm3 < 0)) {
		                     bm3 = (0 + (255 
		                                 - (bm3 * -1)));
		                 }
		                 
		             }			            
		             if (((bm3 <= 255) 
		                         && (bm3 >= 0))) {
		                 if ((bmath[bm3] == false)) {
		                     bmath[bm3] = true;
		                     b[rgbcheck3] = bm3;
		                     rgbcheck3++;
		                 }
		                 else {
		                     int o = 255;
		                     while ((bmath[bm3] == true)) {
		                         bm3++;
		                         if ((bm3 > 255)) {
		                             bm3 = 0;
		                         }			                         
		                         o--;
		                         if ((o < 1)) {
		                             o = 1;
		                         }			                         
		                         if (((bm3 > 0) 
		                                     && (bm3 < 255))) {
		                             bcheck3 = bm3;
		                         }           	                         
		                         		                     }
		                     if ((bmath[bm3] == false)) {
		                             bmath[bm3] = true;
		                             b[rgbcheck3] = bm3;
		                             rgbcheck3++;
		                         }		                     
		                 }						    					         
		       }
		 }		        
		      String  strnumber ;
		      String str;       
		         str="";
		         strnumber="";
		         for(int q=0;q<=255;q++){
		        	 strnumber=Integer.toString(r[q]);
		        			 if ((r[q] < 100)) {
		        				    strnumber = ("0" + strnumber);
		        				}
		        				if ((r[q] < 10)) {
		        				    strnumber = ("0" + strnumber);
		        				};
		        				str = (str + strnumber);
		         }
		         for(int q=0;q<=255;q++){
		        	 strnumber=Integer.toString(g[q]);
		        			 if ((g[q] < 100)) {
		        				    strnumber = ("0" + strnumber);
		        				}
		        				if ((g[q] < 10)) {
		        				    strnumber = ("0" + strnumber);
		        				};
		        				str = (str + strnumber);
		         }
		         for(int q=0;q<=255;q++){
		        	 strnumber=Integer.toString(b[q]);
		        			 if ((b[q] < 100)) {
		        				    strnumber = ("0" + strnumber);
		        				}
		        				if ((b[q]< 10)) {
		        				    strnumber = ("0" + strnumber);
		        				};
		        				str = (str + strnumber);
		         }
		         System.out.println("ª÷Æ_A:");
		         System.out.println(str);
		}
		for(int z=0;z<1;z++){
			 int rm3 = 0;
			 int gm3 = 0;
			 int bm3 = 0;
			 boolean[] rmath = new boolean[256];
			 boolean[] gmath = new boolean[256];
			 boolean[] bmath = new boolean[256];
			 int[] r = new int [256]; 
			 int[] g = new int [256]; 
			 int[] b = new int [256]; 
			 int rs;
			 int gs;
			 int bs;		
			 int rgbcheck = 0;
			 int rgbcheck2 = 0;
			 int rgbcheck3 = 0;
			 rs = ((int)(Math.random()*20000+1000))%250;
			 gs = ((int)(Math.random()*20000+1000))%250;
			 bs = ((int)(Math.random()*20000+1000))%250;
			 rs+=1;
			 gs+=1;
			 bs+=1;
			int rcheck3 = 256;
			 rgbcheck = 0;
			 rgbcheck2 = 0;
			 rgbcheck3 = 0;
			 while ((rgbcheck < 255)) {
				 rm3 = (rm3 + rs);
			     while (((rm3 > 255) 
			                 || (rm3 < 0))) {
			         if ((rm3 > 255)) {
			             rm3 = (0 
			                         + (rm3 - 255));
			         }
			         else if ((rm3 < 0)) {
			             rm3 = (0 + (255 
			                         - (rm3 * -1)));
			         }			         
			     }		     
			     if (((rm3 <= 255) 
			                 && (rm3 >= 0))) {
			         if ((rmath[rm3] == false)) {
			             rmath[rm3] = true;
			             r[rgbcheck] = rm3;
			             rgbcheck++;
			         }
			         else {
			             int o = 255;
			             while ((rmath[rm3] == true)) {
			                 rm3++;
			                 if ((rm3 > 255)) {
			                     rm3 = 0;
			                 }			                 
			                 o--;
			                 if ((o < 1)) {
			                     o = 1;
			                 }			                 
			                 if (((rm3 > 0) 
			                             && (rm3 < 255))) {
			                     rcheck3 = rm3;
			                 }			                			                 
			             }
			             if ((rmath[rm3] == false)) {
			                     rmath[rm3] = true;
			                     r[rgbcheck] = rm3;
			                     rgbcheck++;
			                 }			             
			         }
			         
			     }
			 } 
			     int gcheck3 = 256;
			     rgbcheck2 = 0;
			     while ((rgbcheck2 < 255)) {
			         gm3 = (gm3 + gs);
			         while (((gm3 > 255) 
			                     || (gm3 < 0))) {
			             if ((gm3 > 255)) {
			                 gm3 = (0 
			                             + (gm3 - 255));
			             }
			             else if ((gm3 < 0)) {
			                 gm3 = (0 + (255 
			                             - (gm3 * -1)));
			             }
			             
			         } 
			         if (((gm3 <= 255) 
			        		 && (gm3 >= 0))) {
			             if ((gmath[gm3] == false)) {
			                 gmath[gm3] = true;
			                 g[rgbcheck2] = gm3;
			                 rgbcheck2++;
			             }
			             else {
			                 int o = 255;
			                 while ((gmath[gm3] == true)) {
			                     gm3++;
			                     if ((gm3 > 255)) {
			                         gm3 = 0;
			                     }                  
			                     o--;
			                     if ((o < 1)) {
			                         o = 1;
			                     }                  
			                     if (((gm3 > 0) 
			                                 && (gm3 < 255))) {
			                         gcheck3 = gm3;
			                     }			                    			                     
			                 }
			                  if ((gmath[gm3] == false)) {
			                         gmath[gm3] = true;
			                         g[rgbcheck2] = gm3;
			                         rgbcheck2++;
			                     }			               			                 
			             }
			             
			         }
			     }
			         int bcheck3 = 256;
			         rgbcheck3 = 0;
			         while ((rgbcheck3 < 255)) {
			             bm3 = (bm3 + bs);
			             while (((bm3 > 255) 
			                         || (bm3 < 0))) {
			                 if ((bm3 > 255)) {
			                     bm3 = (0 
			                                 + (bm3 - 255));
			                 }
			                 else if ((bm3 < 0)) {
			                     bm3 = (0 + (255 
			                                 - (bm3 * -1)));
			                 }
			                 
			             }			            
			             if (((bm3 <= 255) 
			                         && (bm3 >= 0))) {
			                 if ((bmath[bm3] == false)) {
			                     bmath[bm3] = true;
			                     b[rgbcheck3] = bm3;
			                     rgbcheck3++;
			                 }
			                 else {
			                     int o = 255;
			                     while ((bmath[bm3] == true)) {
			                         bm3++;
			                         if ((bm3 > 255)) {
			                             bm3 = 0;
			                         }			                         
			                         o--;
			                         if ((o < 1)) {
			                             o = 1;
			                         }			                         
			                         if (((bm3 > 0) 
			                                     && (bm3 < 255))) {
			                             bcheck3 = bm3;
			                         }           			                        			                         
			                     }
			                     
			                      if ((bmath[bm3] == false)) {
			                             bmath[bm3] = true;
			                             b[rgbcheck3] = bm3;
			                             rgbcheck3++;
			                         }
			                     
			                 }						    					         
			       }
			 }		        
			      String  strnumber ;
			      String str;       
			         str="";
			         strnumber="";
			         for(int q=0;q<=255;q++){
			        	 strnumber=Integer.toString(r[q]);
			        			 if ((r[q] < 100)) {
			        				    strnumber = ("0" + strnumber);
			        				}
			        				if ((r[q] < 10)) {
			        				    strnumber = ("0" + strnumber);
			        				};
			        				str = (str + strnumber);
			         }
			         for(int q=0;q<=255;q++){
			        	 strnumber=Integer.toString(g[q]);
			        			 if ((g[q] < 100)) {
			        				    strnumber = ("0" + strnumber);
			        				}
			        				if ((g[q] < 10)) {
			        				    strnumber = ("0" + strnumber);
			        				};
			        				str = (str + strnumber);
			         }
			         for(int q=0;q<=255;q++){
			        	 strnumber=Integer.toString(b[q]);
			        			 if ((b[q] < 100)) {
			        				    strnumber = ("0" + strnumber);
			        				}
			        				if ((b[q]< 10)) {
			        				    strnumber = ("0" + strnumber);
			        				};
			        				str = (str + strnumber);
			         }
			         System.out.println("ª÷Æ_B:");
			         System.out.println(str);
			}
	}
}