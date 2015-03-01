import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ajju1 extends Applet implements Runnable
{
	boolean nt;
	Button b1,b2,b3,b4;
	Thread t=null;
	int x,y;
	int p,q,i;
	String str="";
	public void init()
	{
			setLayout(null);
			b1=new Button("UP LEFT");
			b2=new Button("UP RIGHT");
			b3=new Button("DOWN RIGHT");
			b4=new Button("DOWN LEFT");
			b1.setBounds(50,10,150,30);
			b2.setBounds(700,10,150,30);
			b3.setBounds(50,600,150,30);
			b4.setBounds(700,600,150,30);
			add(b1);
			add(b2);
			add(b3);
			
			add(b4);
			x=210;
			y=10;
			p=q=50;
			
		}
		public void start()
		{
		t=new Thread(this);
			t.start();
		b1.addActionListener(new ActionListener()
			{
					public void actionPerformed(ActionEvent e5)
					{
				str=e5.getActionCommand();
		System.out.println(str);
			
		}
		
		
		
		});
		b2.addActionListener(new ActionListener()
			{
					public void actionPerformed(ActionEvent e5)
					{
				str=e5.getActionCommand();
		System.out.println(str);
			
		}
		
		
		
		});
		b3.addActionListener(new ActionListener()
			{
					public void actionPerformed(ActionEvent e5)
					{
				str=e5.getActionCommand();
		System.out.println(str);
			
		}
		
		
		
		});
		b4.addActionListener(new ActionListener()
			{
					public void actionPerformed(ActionEvent e5)
					{
				str=e5.getActionCommand();
		System.out.println(str);
			
		}	
		
		
		
		});
		
		}
	public void run()
	{
		for(;;)
			try{
			System.out.println("hasnain in run");
			System.out.println("Hasnain X Y "+x+"  "+y);
			System.out.println(str);
					if(str.equals("DOWN LEFT") )
					{ 
						System.out.println("hasnain in UP left if ");
	

						for(;;)
							{		
								if(x==210 && y==10)
									{	
										for(;;)
											{
												if(x<425)
													{	
														x++;
			
													}
		
												Thread.sleep(10);		
												System.out.println("sfsff");
	
												repaint();
		
												if(x==425)
													{
														break;
													}
		
											}
										
										for(;;)
											{		if(y<305)
														{	
															y++;
			
														}
													Thread.sleep(10);
					
													repaint();
		
													if(y==305)
														{
															break;
														}
	
											}	
										for(;;)
										{		
												if(y<600)
													{	
															y++;
			
													}
														Thread.sleep(10);
					
														repaint();
		
												if(y==600)
													{
														break;
													}
		
	
										}
								
	
	
										for(;;)
										{		
			
											if(x<700)
												{	
													x++;
			
												}
											Thread.sleep(10);
					
											repaint();
		
											if(x==640)
												{
															break;
												}
		
										}
										if(true)
										{
										break;}
				}

				//if

				else
				{
				
						break;
				}
				}//for
	for(i=0;i<700;i++)
		{		System.out.println("hasnain in UP right if ");
	
			if(x==210 && y==600)
			{	
			
			for(i=0;i<700;i++)
		{		
	
				if(x<700)
				{	
					x++;
			
				}
			Thread.sleep(10);
					
				repaint();
		
		if(x==640)
		{
			break;
		}
		
			}
		}
		else
		{
		break;
		
		}
	
	}
	for(i=0;i<700;i++)
		{		
			if(x==640 && y==10)
			{	
			
			for(i=0;i<700;i++)
		{		
	
				if(y<600)
				{	
					y++;
			
				}
			Thread.sleep(10);
					
				repaint();
		
		if(y==700)
		{
			break;
		}
		
	}
	}//if
	else
	{
		break;
	}
}	
	
		}
		
		
		
		
		
		//up rigth
	System.out.println("HASNAIN X Y "+x+"  " +y);
				if(str.equals("UP RIGHT") )
					{
					
						System.out.println("HASNAIN IN U RiGHT");
						

						for(;;)
							{	
								if(x==210 && y==600)
									{
										
										for(;;)
											{
												if(x<425)
													{	
														x++;
			
													}
		
												Thread.sleep(10);		
					
												repaint();
		
												if(x==425)
													{
														break;
													}
		
											}
										
										for(;;)
											{		if(y>305)
														{	
															y--;
			
														}
													Thread.sleep(10);
					
													repaint();
		
													if(y==305)
														{
															break;
														}
	
											}	
										for(;;)
										{		
												if(y>10)
													{	
															y--;
			
													}
														Thread.sleep(10);
					
														repaint();
		
												if(y==10)
													{
														break;
													}
		
	
										}
								
	
	
										for(;;)
										{		
			
											if(x<700)
												{	
													x++;
			
												}
											Thread.sleep(10);
					
											repaint();
		
											if(x==640)
												{
															break;
												}
		
										}
										if(true)
										{
										break;}
				}//if
				else 
				{
					break;
				}
				}//for
	for(i=0;i<700;i++)
		{		
			if(x==210 && y==10)
			{	
			
			for(i=0;i<700;i++)
		{		
	
				if(x<700)
				{	
					x++;
			
				}
			Thread.sleep(10);
					
				repaint();
		
		if(x==640)
		{
			break;
		}
		
			}
		}
	}
	for(i=0;i<700;i++)
		{		
			if(x==640 && y==600)
			{	
			System.out.println("hasnain ");
			for(i=0;i<700;i++)
		{		
	
				if(y>10)
				{	
					y--;
			
				}
			Thread.sleep(10);
					
				repaint();
		
		if(y==10)
		{
			break;
		}
		
	}
	}
}	
	
		}
		
		
		
		
		//DOWN RIGHT
		
	System.out.println("HASNAIN X Y "+x+"  " +y);
				if(str.equals("DOWN RIGHT") )
					{
					
						System.out.println("HASNAIN IN DOWN RiGHT");
						

						for(;;)
							{	
								if(x==640 && y==10)
									{
										
										for(;;)
											{
												if(x>425)
													{	
														x--;
			
													}
		
												Thread.sleep(10);		
					
												repaint();
		
												if(x==425)
													{
														break;
													}
		
											}
										
										for(;;)
											{		if(y<305)
														{	
															y++;
			
														}
													Thread.sleep(10);
					
													repaint();
		
													if(y==305)
														{
															break;
														}
	
											}	
										for(;;)
										{		
												if(y<600)
													{	
															y++;
			
													}
														Thread.sleep(10);
					
														repaint();
		
												if(y==600)
													{
														break;
													}
		
	
										}
								
	
	
										for(;;)
										{		
			
											if(x>210)
												{	
													x--;
			
												}
											Thread.sleep(10);
					
											repaint();
		
											if(x==210)
												{
															break;
												}
		
										}
										if(true)
										{
										break;}
				}//if
				else 
				{
					break;
				}
				}//for
	for(i=0;i<700;i++)
		{		
			if(x==210 && y==10)
			{	
			
			for(i=0;i<700;i++)
		{		
	
				if(y<600)
				{	
					y++;
			
				}
			Thread.sleep(10);
					
				repaint();
		
		if(y==600)
		{
			break;
		}
		
			}
		}
		
		else
		{
		
			break;
		}
	}
	for(i=0;i<700;i++)
		{		
			if(x==640 && y==600)
			{	
			System.out.println("hasnain ");
			for(i=0;i<700;i++)
		{		
	
				if(x>210)
				{	
					x--;
			
				}
			Thread.sleep(10);
					
				repaint();
		
		if(y==10)
		{
			break;
		}
		
	}
	}
	else
	{
		break;
	}
}	
	
		}
	//UP LEFT	
		
		
		
		
	System.out.println("HASNAIN X Y "+x+"  " +y);
				if(str.equals("UP LEFT") )
					{
					
						System.out.println("HASNAIN IN DOWN RiGHT");
						

						for(;;)
							{	
								if(x==640 && y==600)
									{
										
										for(;;)
											{
												if(x>425)
													{	
														x--;
			
													}
		
												Thread.sleep(10);		
					
												repaint();
		
												if(x==425)
													{
														break;
													}
		
											}
										
										for(;;)
											{		if(y>305)
														{	
															y--;
			
														}
													Thread.sleep(10);
					
													repaint();
		
													if(y==305)
														{
															break;
														}
	
											}	
										for(;;)
										{		
												if(y>10)
													{	
															y--;
			
													}
														Thread.sleep(10);
					
														repaint();
		
												if(y==10)
													{
														break;
													}
		
	
										}
								
	
	
										for(;;)
										{		
			
											if(x>210)
												{	
													x--;
			
												}
											Thread.sleep(10);
					
											repaint();
		
											if(x==210)
												{
															break;
												}
		
										}
										if(true)
										{
										break;}
				}//if
				else 
				{
					break;
				}
				}//for
	for(i=0;i<700;i++)
		{		
			if(x==640 && y==10)
			{	
			
			for(i=0;i<700;i++)
		{		
	
				if(x>210)
				{	
					x--;
			
				}
			Thread.sleep(10);
					
				repaint();
		
		if(x==210)
		{
			break;
		}
		
			}
		}
		
		else
		{
		
			break;
		}
	}
	for(i=0;i<700;i++)
		{		
			if(x==210 && y==600)
			{	
			System.out.println("hasnain ");
			for(i=0;i<700;i++)
		{		
	
				if(y>10)
				{	
					y--;
			
				}
			Thread.sleep(10);
					
				repaint();
		
		if(y==10)
		{
			break;
		}
		
	}
	}
	else
	{
		break;
	}
}	
	
		}
			
		
	
	}//try
	catch(Exception e)
	{
		System.out.println("ERROR"+e);
	}		
}
		
	public void paint(Graphics g)
	{
		Color c1=new Color(138,117,94);
		g.fillRect(x,y,p,q);
	
	}
}