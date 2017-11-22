
package dodge;
class Window {
    static final int XBORDER = 0;
    static final int YBORDER = 30;
    
    static final int TOP_BORDER = 0;
    static final int BOTTOM_BORDER = 0;
    
    static final int YTITLE = 30;
    static final int WINDOW_BORDER = 8;
    static final int WINDOW_WIDTH = 2*(WINDOW_BORDER + XBORDER) + 1100;
    static final int WINDOW_HEIGHT = YTITLE + WINDOW_BORDER + 1000;
    static int xsize = -1;
    static int ysize = -1;


/////////////////////////////////////////////////////////////////////////
    public static int getX(int x) {
        return (x + XBORDER + WINDOW_BORDER);
    }

    public static int getY(int y) {
        return (y + TOP_BORDER + YTITLE );
//        return (y + YBORDER + YTITLE );
        
    }

    public static int getYNormal(int y) {
        return (-y + TOP_BORDER + YTITLE + getHeight2());
//        return (-y + YBORDER + YTITLE + getHeight2());
        
    }
    
    public static int getWidth2() {
        return (xsize - 2 * (XBORDER + WINDOW_BORDER));
    }

    public static int getHeight2() {
//        return (ysize - 2 * YBORDER - WINDOW_BORDER - YTITLE);
        return (ysize - (BOTTOM_BORDER + TOP_BORDER) - WINDOW_BORDER - YTITLE);
    }    
}