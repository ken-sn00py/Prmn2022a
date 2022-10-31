package lecture01;

public class kadai15 {
    public static void main(String[] args) {

        int[] score = {41,85,72,38,80};
        String grade;

        for(int i=0;i<5;i++){
            if(score[i] >= 90){
                grade = "秀";
            } else if(score[i] >= 80){
                grade = "優";
            } else if(score[i] >= 70){
                grade = "良";
            } else if(score[i] >= 60){
                grade = "可";
            }else{
                grade = "不可";
            }
            System.out.println(i+"番 "+score[i]+"点　"+grade);
        }
        int max = max(score);
        int min = min(score);
        double ave = average(score);

        System.out.println("最高点 "+max+"点");
        System.out.println("最低点 "+min+"点");
        System.out.println("平均点"+ave+"点");
    }

    static int max(int score[]){

        int a = score[0];
        for(int i=0;i<5;i++){
            if(score[i]>a){
                a=score[i];
            }
        }
        return a;

    }
    static int min(int score[]){

        int a = score[0];
        for(int i=0;i<5;i++){
            if(score[i]<a){
                a=score[i];
            }
        }
        return a;

    }

    static double average(int score[]){

        int sum = 0;
        for(int i=0;i<5;i++){
            sum = sum + score[i];
        }
        double ave = sum/score.length;
        return ave;

    }

}

