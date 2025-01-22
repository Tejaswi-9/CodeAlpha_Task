import java.util.Scanner;
public class Teacher{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of Students: ");
        int n=s.nextInt();
        System.out.println("Enter no. of Subjects: ");
        int m=s.nextInt();
        int sum=0,average=0,max=0,min=10;
        int Stu[][]=new int[n][m];
        System.out.println("Select Grades \nOssum 10 \nExecellent 9 \nvery good 8\ngood 7 \nfair 6 \npoor 5\nfail");
        for(int i=0;i<n;i++){
            System.out.println("Enter Grades for Student "+(i+1)+ " for "+m+ " subjects ");
            for(int j=0;j<m;j++){
                Stu[i][j]=s.nextInt();
            }
        }
        System.out.print("Subject\t\t");
        for(int i=1;i<=m;i++){
           System.out.print(i+"\t");
        }
        System.out.print("Average\tmax\tmin");
        System.out.println();
        for(int i=0;i<n;i++){
            sum=average=0;
            System.out.print("Student "+(i+1)+"\t");
            for(int j=0;j<m;j++){
             sum+=Stu[i][j];
             if(Stu[i][j]>max){
                max=Stu[i][j];
             }
             if(Stu[i][j]<min)
             {
                min=Stu[i][j];  
             }
             System.out.print(""+Stu[i][j]+"\t");
            }
            average=sum/m;
            System.out.print(""+average+"\t "+max+"\t "+min);
            max=0;
            min=10;
            System.out.println();
        }
    }
}