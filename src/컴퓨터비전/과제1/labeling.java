package 컴퓨터비전.과제1;
import java.io.*;
import java.util.*;

public class labeling {
    static int[][] L;
    static int C = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[][] I = new int[N][M];
        L = new int[N][M];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                L[i][j] = 0;
                I[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        labeling(I);

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                System.out.print(L[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("구성요소 = " + C);
    }

    public static void labeling(int[][] img) {
        int cols = img.length;
        int rows = img[0].length;
        int nextLabel = 1;

        for(int i = 0; i < cols; i++){
            for(int j = 0; j < rows; j++) {
                if(img[i][j] == 1 && L[i][j] == 0 && i < cols && j < rows){
                    L[i][j] = nextLabel;
                    nextCheck(i+1, j, rows, cols, img, nextLabel);
                    nextCheck(i+1, j+1, rows, cols, img, nextLabel);
                    nextCheck(i, j+1, rows, cols, img, nextLabel);
                    nextCheck(i-1, j+1, rows, cols, img, nextLabel);
                    nextCheck(i-1, j, rows, cols, img, nextLabel);
                    nextCheck(i-1, j-1, rows, cols, img, nextLabel);
                    nextCheck(i, j-1, rows, cols, img, nextLabel);
                    nextCheck(i+1, j-1, rows, cols, img, nextLabel);
                    nextLabel++;
                    C++;
                }
            }
        }
    }

    public static void nextCheck(int x, int y, int rows, int cols, int[][] img, int nextLabel) {
        if(x >= 0 && y >= 0 && x < rows && y < cols) {
            if(img[y][x] == 1 && L[y][x] == 0) {
                L[y][x] = nextLabel;
                nextCheck(x+1, y, rows, cols, img, nextLabel);
                nextCheck(x+1, y+1, rows, cols, img, nextLabel);
                nextCheck(x, y+1, rows, cols, img, nextLabel);
                nextCheck(x-1, y+1, rows, cols, img, nextLabel);
                nextCheck(x-1, y, rows, cols, img, nextLabel);
                nextCheck(x-1, y-1, rows, cols, img, nextLabel);
                nextCheck(x, y-1, rows, cols, img, nextLabel);
                nextCheck(x+1, y-1, rows, cols, img, nextLabel);
            }
        }
    }

}
