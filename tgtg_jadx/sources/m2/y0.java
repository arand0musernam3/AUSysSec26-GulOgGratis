package m2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ y0[] $VALUES;
    public static final y0 CENTER;
    public static final y0 CHARACTER_PALETTE;
    public static final y0 COPY;
    public static final y0 CUT;
    public static final y0 DELETE_FROM_LINE_START;
    public static final y0 DELETE_NEXT_CHAR;
    public static final y0 DELETE_NEXT_WORD;
    public static final y0 DELETE_PREV_CHAR;
    public static final y0 DELETE_PREV_WORD;
    public static final y0 DELETE_TO_LINE_END;
    public static final y0 DESELECT;
    public static final y0 DOWN;
    public static final y0 END;
    public static final y0 HOME;
    public static final y0 LEFT_CHAR;
    public static final y0 LEFT_WORD;
    public static final y0 LINE_END;
    public static final y0 LINE_LEFT;
    public static final y0 LINE_RIGHT;
    public static final y0 LINE_START;
    public static final y0 NEW_LINE;
    public static final y0 NEXT_PARAGRAPH;
    public static final y0 PAGE_DOWN;
    public static final y0 PAGE_UP;
    public static final y0 PASTE;
    public static final y0 PREV_PARAGRAPH;
    public static final y0 REDO;
    public static final y0 RIGHT_CHAR;
    public static final y0 RIGHT_WORD;
    public static final y0 SELECT_ALL;
    public static final y0 SELECT_DOWN;
    public static final y0 SELECT_END;
    public static final y0 SELECT_HOME;
    public static final y0 SELECT_LEFT_CHAR;
    public static final y0 SELECT_LEFT_WORD;
    public static final y0 SELECT_LINE_END;
    public static final y0 SELECT_LINE_LEFT;
    public static final y0 SELECT_LINE_RIGHT;
    public static final y0 SELECT_LINE_START;
    public static final y0 SELECT_NEXT_PARAGRAPH;
    public static final y0 SELECT_PAGE_DOWN;
    public static final y0 SELECT_PAGE_UP;
    public static final y0 SELECT_PREV_PARAGRAPH;
    public static final y0 SELECT_RIGHT_CHAR;
    public static final y0 SELECT_RIGHT_WORD;
    public static final y0 SELECT_UP;
    public static final y0 TAB;
    public static final y0 UNDO;
    public static final y0 UP;
    private final boolean editsText;

    static {
        y0 y0Var = new y0("LEFT_CHAR", 0, false);
        LEFT_CHAR = y0Var;
        y0 y0Var2 = new y0("RIGHT_CHAR", 1, false);
        RIGHT_CHAR = y0Var2;
        y0 y0Var3 = new y0("RIGHT_WORD", 2, false);
        RIGHT_WORD = y0Var3;
        y0 y0Var4 = new y0("LEFT_WORD", 3, false);
        LEFT_WORD = y0Var4;
        y0 y0Var5 = new y0("NEXT_PARAGRAPH", 4, false);
        NEXT_PARAGRAPH = y0Var5;
        y0 y0Var6 = new y0("PREV_PARAGRAPH", 5, false);
        PREV_PARAGRAPH = y0Var6;
        y0 y0Var7 = new y0("LINE_START", 6, false);
        LINE_START = y0Var7;
        y0 y0Var8 = new y0("LINE_END", 7, false);
        LINE_END = y0Var8;
        y0 y0Var9 = new y0("LINE_LEFT", 8, false);
        LINE_LEFT = y0Var9;
        y0 y0Var10 = new y0("LINE_RIGHT", 9, false);
        LINE_RIGHT = y0Var10;
        y0 y0Var11 = new y0("UP", 10, false);
        UP = y0Var11;
        y0 y0Var12 = new y0("DOWN", 11, false);
        DOWN = y0Var12;
        y0 y0Var13 = new y0("CENTER", 12, false);
        CENTER = y0Var13;
        y0 y0Var14 = new y0("PAGE_UP", 13, false);
        PAGE_UP = y0Var14;
        y0 y0Var15 = new y0("PAGE_DOWN", 14, false);
        PAGE_DOWN = y0Var15;
        y0 y0Var16 = new y0("HOME", 15, false);
        HOME = y0Var16;
        y0 y0Var17 = new y0("END", 16, false);
        END = y0Var17;
        y0 y0Var18 = new y0("COPY", 17, false);
        COPY = y0Var18;
        y0 y0Var19 = new y0("PASTE", 18, true);
        PASTE = y0Var19;
        y0 y0Var20 = new y0("CUT", 19, true);
        CUT = y0Var20;
        y0 y0Var21 = new y0("DELETE_PREV_CHAR", 20, true);
        DELETE_PREV_CHAR = y0Var21;
        y0 y0Var22 = new y0("DELETE_NEXT_CHAR", 21, true);
        DELETE_NEXT_CHAR = y0Var22;
        y0 y0Var23 = new y0("DELETE_PREV_WORD", 22, true);
        DELETE_PREV_WORD = y0Var23;
        y0 y0Var24 = new y0("DELETE_NEXT_WORD", 23, true);
        DELETE_NEXT_WORD = y0Var24;
        y0 y0Var25 = new y0("DELETE_FROM_LINE_START", 24, true);
        DELETE_FROM_LINE_START = y0Var25;
        y0 y0Var26 = new y0("DELETE_TO_LINE_END", 25, true);
        DELETE_TO_LINE_END = y0Var26;
        y0 y0Var27 = new y0("SELECT_ALL", 26, false);
        SELECT_ALL = y0Var27;
        y0 y0Var28 = new y0("SELECT_LEFT_CHAR", 27, false);
        SELECT_LEFT_CHAR = y0Var28;
        y0 y0Var29 = new y0("SELECT_RIGHT_CHAR", 28, false);
        SELECT_RIGHT_CHAR = y0Var29;
        y0 y0Var30 = new y0("SELECT_UP", 29, false);
        SELECT_UP = y0Var30;
        y0 y0Var31 = new y0("SELECT_DOWN", 30, false);
        SELECT_DOWN = y0Var31;
        y0 y0Var32 = new y0("SELECT_PAGE_UP", 31, false);
        SELECT_PAGE_UP = y0Var32;
        y0 y0Var33 = new y0("SELECT_PAGE_DOWN", 32, false);
        SELECT_PAGE_DOWN = y0Var33;
        y0 y0Var34 = new y0("SELECT_HOME", 33, false);
        SELECT_HOME = y0Var34;
        y0 y0Var35 = new y0("SELECT_END", 34, false);
        SELECT_END = y0Var35;
        y0 y0Var36 = new y0("SELECT_LEFT_WORD", 35, false);
        SELECT_LEFT_WORD = y0Var36;
        y0 y0Var37 = new y0("SELECT_RIGHT_WORD", 36, false);
        SELECT_RIGHT_WORD = y0Var37;
        y0 y0Var38 = new y0("SELECT_NEXT_PARAGRAPH", 37, false);
        SELECT_NEXT_PARAGRAPH = y0Var38;
        y0 y0Var39 = new y0("SELECT_PREV_PARAGRAPH", 38, false);
        SELECT_PREV_PARAGRAPH = y0Var39;
        y0 y0Var40 = new y0("SELECT_LINE_START", 39, false);
        SELECT_LINE_START = y0Var40;
        y0 y0Var41 = new y0("SELECT_LINE_END", 40, false);
        SELECT_LINE_END = y0Var41;
        y0 y0Var42 = new y0("SELECT_LINE_LEFT", 41, false);
        SELECT_LINE_LEFT = y0Var42;
        y0 y0Var43 = new y0("SELECT_LINE_RIGHT", 42, false);
        SELECT_LINE_RIGHT = y0Var43;
        y0 y0Var44 = new y0("DESELECT", 43, false);
        DESELECT = y0Var44;
        y0 y0Var45 = new y0("NEW_LINE", 44, true);
        NEW_LINE = y0Var45;
        y0 y0Var46 = new y0("TAB", 45, true);
        TAB = y0Var46;
        y0 y0Var47 = new y0("UNDO", 46, true);
        UNDO = y0Var47;
        y0 y0Var48 = new y0("REDO", 47, true);
        REDO = y0Var48;
        y0 y0Var49 = new y0("CHARACTER_PALETTE", 48, true);
        CHARACTER_PALETTE = y0Var49;
        y0[] y0VarArr = {y0Var, y0Var2, y0Var3, y0Var4, y0Var5, y0Var6, y0Var7, y0Var8, y0Var9, y0Var10, y0Var11, y0Var12, y0Var13, y0Var14, y0Var15, y0Var16, y0Var17, y0Var18, y0Var19, y0Var20, y0Var21, y0Var22, y0Var23, y0Var24, y0Var25, y0Var26, y0Var27, y0Var28, y0Var29, y0Var30, y0Var31, y0Var32, y0Var33, y0Var34, y0Var35, y0Var36, y0Var37, y0Var38, y0Var39, y0Var40, y0Var41, y0Var42, y0Var43, y0Var44, y0Var45, y0Var46, y0Var47, y0Var48, y0Var49};
        $VALUES = y0VarArr;
        $ENTRIES = new a80.b(y0VarArr);
    }

    public y0(String str, int i11, boolean z11) {
        this.editsText = z11;
    }

    public static y0 valueOf(String str) {
        return (y0) Enum.valueOf(y0.class, str);
    }

    public static y0[] values() {
        return (y0[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.editsText;
    }
}
