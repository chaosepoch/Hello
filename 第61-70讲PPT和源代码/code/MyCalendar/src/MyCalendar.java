import java.util.Scanner;

/* ����1900-1-1������һ������˵Ҫ����ÿ���µĵ�һ�������ڼ���
 * ��Ҫͳ������µĵ�һ�����1900-1-1һ�����˶����졣
 * 
 * */

public class MyCalendar {

	//�ж��Ƿ�������
	public static boolean isRun(int year)
	{
		if((year%4==0&&year%100!=0)||(year%400==0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//������ݺ��·ݣ����ظ��µ�������
	public static int getMonthDays(int year,int month)
	{
		int days = 31;
		switch(month)
		{
		   case 4:
		   case 6:
		   case 9:
		   case 11:
			   days = 30;
			   break;
		   case 2:
			   if(isRun(year))
			   {
				   days = 29;
			   }
			   else
			   {
				   days = 28;
			   }
			   break;
		}
		return days;
	}
	
	//���������ݺ��·ݣ����������µĵ�һ�����1900-1-1���˶����졣
	public static int getTotalDays(int year,int month)
	{
		int totalDays = 0;
		for(int i=1900;i<year;i++)
		{
			if(isRun(i))
			{
				totalDays+=366;
			}
			else
			{
				totalDays+=365;
			}
		}
		for(int i=1;i<month;i++)
		{
			totalDays+=getMonthDays(year,i);
		}
		return totalDays;
	}
	
	public static void main(String[] args) {
		
		int year; //�û���������
		int month; //�û�������·�
        int day;//����µĵ�һ�������ڼ� 
		int totalDays;//����µĵ�һ�����1900-1-1һ�����˶�����
        int monthDays;//��ʾ���µ�������
        
		Scanner in = new Scanner(System.in);
		System.out.println("*****��ӭʹ��������******");
		System.out.println("��������ݣ�");
		year = in.nextInt();
		System.out.println("�������·ݣ�");
		month = in.nextInt();
		System.out.println("��������ǣ�"+year+"��"+month+"��");
		if(isRun(year))
		{
			System.out.println(year+"��"+"�����꣡");
		}
		else
		{
			System.out.println(year+"��"+"��ƽ�꣡");
		}
	    monthDays = getMonthDays(year,month);
		totalDays = getTotalDays(year,month);
		totalDays++; //���������
		day = totalDays%7; //�õ����ڼ�
		
		System.out.println("������\t����һ\t���ڶ�\t������\t������\t������\t������\t");
		int iCount=0;  //�����������������Ƿ���
		for(int i=0;i<day;i++)
		{
			System.out.print("\t");
			iCount++;
		}
		for(int i=1;i<=monthDays;i++)
		{
			System.out.print(i+"\t");
			iCount++;
			if(iCount%7==0)
			{
				System.out.println();
			}
		}
		
	}

}
