package LeetCode;

import java.util.ArrayList;
import java.util.List;


public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<Integer>();
        if(matrix.length==0)
            return list;

        // 总数循环 i表示圈数
        for(int i=0;list.size()<matrix.length*matrix[0].length;i++)
        {

            //向左遍历
            for(int j=i;j<matrix[0].length-i;j++)
                list.add(matrix[i][j]);

            // 向下遍历
            for(int k=i+1;k<matrix.length-i-1;k++)
                list.add(matrix[k][matrix[0].length-1-i]);


            if(matrix.length-1-i>i)
            {
                // 向右遍历
                for(int m=matrix[0].length-i-1;m>=i;m--)
                    list.add(matrix[matrix.length-1-i][m]);
            }

            if(matrix[0].length-1-i>i)
            {
                // 向上遍历
                for(int n=matrix.length-i-2;n>i;n--)
                    list.add(matrix[n][i]);
            }

        }
        return list;
    }

    public static void main(String[] args) {
        int[][] test = {{1,2,3},{4,5,6},{7,8,9}};
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        System.out.println(spiralMatrix.spiralOrder(test));

    }
}
