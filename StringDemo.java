package secondtask;

import java.util.ArrayList;
import java.util.List;


//contains
//substring
//split
//start and end with

public class StringDemo {
	String s;

	
	public StringDemo(String s)
	{
	this.s=s;
	
	}
	
		public  int compto(String s1)
		{
			char[]ch=s.toCharArray();
			char[]ch1=s1.toCharArray();
			int k=0;
			for(int i=0;i<ch1.length;i++)
			{
				if(ch[i]!=ch1[i])
				{
					k=(int)ch[i]-(int)ch1[i];
					return k;
				}
			}
			return 0;
		
		}
	
		public  String  m1(String s1)//concat
		{
			return s+s1;
		}
		public char chAt(int n)
		{
			char[] ch=s.toCharArray();
			return ch[n];
		}
	
		public   boolean eq(String s1)//equals
		{	
			char [] ch=s.toCharArray();
			char[] ch1=s1.toCharArray();
			int k=0,v,t;
			if(ch.length>=ch1.length)
			{
				v=ch.length;
				t=ch1.length;
			}
			else
			{
				v=ch1.length;
				t=ch.length;
			}
			for(int i=0;i<t;i++)
			{
				if(ch[i]==ch1[i])
				{
					k++;
				}
				else
				{
					return false;
				}
			}
			if(v==k)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	
		public  boolean isety(String s1)

		{
		
			if(s1.length()==0)
			{
				return true;
			} 
			else
			{
				return false;
			}
		}
		
		public  String lwrcase1()
		{
					
			char Arr[] = s.toCharArray();
            for (int i = 0; i <Arr.length; i++) 
            {       
                    if (Arr[i] >= 'A' && Arr[i] <= 'Z')
                    {
                            Arr[i] = (char) (Arr[i] + 32);
                    }
            }
            String s1=new String(Arr);
            return s1;
		}
		
		public  String uprcase1()
		{
			char arr[]=s.toCharArray();
				for (int i = 0; i <arr.length; i++)
				{
                    if(arr[i]>='a' && arr[i]<='z')
    				{
    					arr[i]=(char) (arr[i]-32);
    				}
            }
				String s1 = new String(arr);
				return s1;	
			
        }
		public char[] tocharar()
		{
		
			char[] charr=new char[s.length()];
			for(int i=0;i<s.length();i++) 
			{
				charr[i]= s.charAt(i);	
			}
			return charr;
		}
		
		public  int len1()
		{
	
			char[] cr =s.toCharArray();
			int i=0;
			for(char c:cr)
			{
				i++;
			}
			return i;	
		}
		
		public boolean Startwith(String s1)
		{
			char[] char1 = s.toCharArray();
			char[] char2 = s1.toCharArray();
			int i,j,k=0,v;
			if(char1.length<=char2.length)
			{
				v=char1.length;
			}
			else
			{
				v=char2.length;
			}
			
			for(i=0;i<v;i++)
			{
				if(char1[i]==char2[i])
				{
					k++;
				}
				else {
					break;
				}
			}
		
			if(v==k)
			{
				return true;
			}
			else
			{
				if(v>k) 
				{
				return false;
				}
				else
				{
					return false;
				}
			}
		}
		
		public boolean endswith(String s1)
		{
			char[] ch=s.toCharArray();
			char[] ch1=s1.toCharArray();
			int i,j,k=0,num;
			num=s.length()-s1.length();
			for(i=num;i<s.length();i++)
			{
				for(j=0;j<s1.length();j++)
				{
					if(ch[i]==ch1[j])
					{
						k++;
						break;
						
					}
				}
			}
			if(s1.length()==k)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		public String trim()
		{
			
			int l=s.length();
			String s2="";
		    for(int i=0;i<l;i++)
			{
			if(s.charAt(i)!=' ')
		    {
			         s2+=s.charAt(i);
			}
		    else
				 continue;
			}
			return s2;
		}
	
		public String subst(int n,int m)
		
		{
			
			StringBuilder sb=new StringBuilder();
			int stfrom=n;
			int endbefore=m,i;
			for(i=stfrom;i<endbefore;i++)
			{
				sb.append(s.charAt(i));
				
			}
			String s1=new String(sb);
			return s1;
			
		}
		
		public  String rep(char a, char b)
		{
			
			char[]ch=s.toCharArray();
			int i;
			for(i=0;i<s.length();i++)
			{
				if(ch[i]==a)
				{
					ch[i]=b;
				}
				
			}
			String s1=new String(ch);
			
			return s1;
			
		}
		
		public boolean tocontains(String s1)
		{
			char[] cr=s.toCharArray();
			char[] cr1=s1.toCharArray();
			int i,j,k=0;
			if(cr.length>cr1.length)
			{
				for(i=0;i<cr.length;i++)
					{
						if(cr[i]==cr1[0]) 
						{
							for(j=0;j<cr1.length;j++)
							{
								if(cr[i]==cr1[j])
								{	i++;
									k++;
								}
								
							}
						}
					}
				}
			if(k==cr1.length)
			{
				return true;
			}
				return false;
			}	

		
		/*public String split(String s1)
		{
			char[] ch=s.toCharArray();
			char[] ch1=s1.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]==ch1[0])
				{
					ch[i]='\n';	
				}
			}
			String s2=new String(ch);
			//String[] str=new String[] {s2};
			return s2;
			
		}*/
		
		public String[] Split(char c) {
			char[] ch=s.toCharArray();
			String sh="";
			List<String> al=new ArrayList<String>();
			for(int i=0;i<ch.length;i++) 
			{
				if(ch[i]!=c)
				{
					sh+=ch[i];
				}
				else
				{
					al.add(sh);
					sh="";
				}
				
			}
			al.add(sh);
			String[] s1 = new String[al.size()];
			for(int i=0;i<al.size();i++)
			{
				s1[i]=al.get(i);
			}
			return s1;
		}
		
		public int codepAt(int n)
		{
			
			char[] ch=s.toCharArray();
			int k=ch[n];
			return k;
			
		}
		public int codecount(int n,int m)
		{
			char[] ch=s.toCharArray();
			int l=m-n;
			return l;
		}
		public int codepbefore(int n)
		{
			char[] ch=s.toCharArray();
			int k=ch[n-1];
			return k;
			
		}
	public static void main(String[] args) {
		//boolean yes = 'v'>='A';
			//System.out.println(yes);
		
	}
}
	