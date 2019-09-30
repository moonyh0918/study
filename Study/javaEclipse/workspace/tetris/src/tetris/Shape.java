package tetris;		//현재 속한 패키지

import java.util.Random;	//랜덤함수를 쓰기 위해 외부 패키지의 클래스를 가져옴

public class Shape {

    protected enum Tetrominoe { NoShape, ZShape, SShape, LineShape, 
               TShape, SquareShape, LShape, MirroredLShape };		//조각을 구분하기위해 enum으로 묶어둠

    private Tetrominoe pieceShape;	//어떤 조각인지 알기위한 변수
    private int coords[][];
    private int[][][] coordsTable;


    public Shape() {
        
        initShape();
    }
    
    private void initShape() {

        coords = new int[4][2];
        setShape(Tetrominoe.NoShape);
    }

    protected void setShape(Tetrominoe shape) {

         coordsTable = new int[][][] {
            { { 0, 0 },   { 0, 0 },   { 0, 0 },   { 0, 0 } },
            { { 0, -1 },  { 0, 0 },   { -1, 0 },  { -1, 1 } },
            { { 0, -1 },  { 0, 0 },   { 1, 0 },   { 1, 1 } },
            { { 0, -1 },  { 0, 0 },   { 0, 1 },   { 0, 2 } },
            { { -1, 0 },  { 0, 0 },   { 1, 0 },   { 0, 1 } },
            { { 0, 0 },   { 1, 0 },   { 0, 1 },   { 1, 1 } },
            { { -1, -1 }, { 0, -1 },  { 0, 0 },   { 0, 1 } },
            { { 1, -1 },  { 0, -1 },  { 0, 0 },   { 0, 1 } }
        };

        for (int i = 0; i < 4 ; i++) {
            
            for (int j = 0; j < 2; ++j) {
                
                coords[i][j] = coordsTable[shape.ordinal()][i][j];
            }
        }
        
        pieceShape = shape;
    }

    private void setX(int index, int x) { coords[index][0] = x; }
    private void setY(int index, int y) { coords[index][1] = y; }
    public int x(int index) { return coords[index][0]; }
    public int y(int index) { return coords[index][1]; }
    public Tetrominoe getShape()  { return pieceShape; }

    public void setRandomShape() {
        
        Random r = new Random();
        int x = Math.abs(r.nextInt()) % 7 + 1;
        Tetrominoe[] values = Tetrominoe.values(); 
        setShape(values[x]);
    }

    public int minX() {
        
      int m = coords[0][0];
      
      for (int i=0; i < 4; i++) {
          
          m = Math.min(m, coords[i][0]);
      }
      
      return m;
    }


    public int minY() {
        
      int m = coords[0][1];
      
      for (int i=0; i < 4; i++) {
          
          m = Math.min(m, coords[i][1]);
      }
      
      return m;
    }

    public Shape rotateLeft() {	//왼쪽으로 회전
        
        if (pieceShape == Tetrominoe.SquareShape)	//정사각형일떈 바로 리턴
            return this;

        Shape result = new Shape();
        result.pieceShape = pieceShape;

        for (int i = 0; i < 4; ++i) {
            
            result.setX(i, y(i));
            result.setY(i, -x(i));
        }
        
        return result;
    }

    public Shape rotateRight() {	//오른쪽으로 회전
        
        if (pieceShape == Tetrominoe.SquareShape)	//정사각형일떈 바로 리턴
            return this;

        Shape result = new Shape();
        result.pieceShape = pieceShape;

        for (int i = 0; i < 4; ++i) {

            result.setX(i, -y(i));
            result.setY(i, x(i));
        }
        
        return result;
    }
}