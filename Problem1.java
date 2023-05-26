import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 필요한 자료형을 넣어주세요
        ArrayList<Number> list = new ArrayList<Number>();
        System.out.print("Enter five integers and five doubles: ");

        /*
            list 입력 코드
         */
        System.out.println("Enter five integers and five doubles: ");
        for(int i=0; i<5; i++){
            int a = input.nextInt();
            list.add(a);
        }
        for(int i=0; i<5; i++){
            double a = input.nextDouble();
            list.add(a);
        }


        sort(list);

        /*
            list 출력 코드
         */
        for(Number num : list){
            if (num instanceof Integer) {
                System.out.print(num + " ");
            }
            else if (num instanceof Double) {
                System.out.print(num + " ");
            }
        }
    }

    public static void sort(ArrayList<Number> list) {
         /*
            list 정렬 코드
         */
        Collections.sort(list, new java.util.Comparator<Number>() {
            public int compare(Number num1, Number num2) {
                return Double.compare(num1.doubleValue(), num2.doubleValue());
            }
        }
        );
    }
}

