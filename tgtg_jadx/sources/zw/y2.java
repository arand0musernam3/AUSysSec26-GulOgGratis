package zw;

import com.braze.Constants;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.i18n.TextBundle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y2 {
    private static final /* synthetic */ y2[] $VALUES;
    public static final y2 SWITCH;
    public static final y2 UNSUPPORTED;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y2 f48403a;
    private static final Map<String, y2> cache;
    public static final y2 circle;
    public static final y2 clipPath;
    public static final y2 defs;
    public static final y2 desc;
    public static final y2 ellipse;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final y2 f48404g;
    public static final y2 image;
    public static final y2 line;
    public static final y2 linearGradient;
    public static final y2 marker;
    public static final y2 mask;
    public static final y2 path;
    public static final y2 pattern;
    public static final y2 polygon;
    public static final y2 polyline;
    public static final y2 radialGradient;
    public static final y2 rect;
    public static final y2 solidColor;
    public static final y2 stop;
    public static final y2 style;
    public static final y2 svg;
    public static final y2 symbol;
    public static final y2 text;
    public static final y2 textPath;
    public static final y2 title;
    public static final y2 tref;
    public static final y2 tspan;
    public static final y2 use;
    public static final y2 view;

    static {
        y2 y2Var = new y2("svg", 0);
        svg = y2Var;
        y2 y2Var2 = new y2(Constants.BRAZE_PUSH_CONTENT_KEY, 1);
        f48403a = y2Var2;
        y2 y2Var3 = new y2("circle", 2);
        circle = y2Var3;
        y2 y2Var4 = new y2("clipPath", 3);
        clipPath = y2Var4;
        y2 y2Var5 = new y2("defs", 4);
        defs = y2Var5;
        y2 y2Var6 = new y2("desc", 5);
        desc = y2Var6;
        y2 y2Var7 = new y2("ellipse", 6);
        ellipse = y2Var7;
        y2 y2Var8 = new y2("g", 7);
        f48404g = y2Var8;
        y2 y2Var9 = new y2("image", 8);
        image = y2Var9;
        y2 y2Var10 = new y2("line", 9);
        line = y2Var10;
        y2 y2Var11 = new y2("linearGradient", 10);
        linearGradient = y2Var11;
        y2 y2Var12 = new y2("marker", 11);
        marker = y2Var12;
        y2 y2Var13 = new y2("mask", 12);
        mask = y2Var13;
        y2 y2Var14 = new y2("path", 13);
        path = y2Var14;
        y2 y2Var15 = new y2("pattern", 14);
        pattern = y2Var15;
        y2 y2Var16 = new y2("polygon", 15);
        polygon = y2Var16;
        y2 y2Var17 = new y2("polyline", 16);
        polyline = y2Var17;
        y2 y2Var18 = new y2("radialGradient", 17);
        radialGradient = y2Var18;
        y2 y2Var19 = new y2("rect", 18);
        rect = y2Var19;
        y2 y2Var20 = new y2("solidColor", 19);
        solidColor = y2Var20;
        y2 y2Var21 = new y2("stop", 20);
        stop = y2Var21;
        y2 y2Var22 = new y2("style", 21);
        style = y2Var22;
        y2 y2Var23 = new y2("SWITCH", 22);
        SWITCH = y2Var23;
        y2 y2Var24 = new y2("symbol", 23);
        symbol = y2Var24;
        y2 y2Var25 = new y2(TextBundle.TEXT_ENTRY, 24);
        text = y2Var25;
        y2 y2Var26 = new y2("textPath", 25);
        textPath = y2Var26;
        y2 y2Var27 = new y2(MessageBundle.TITLE_ENTRY, 26);
        title = y2Var27;
        y2 y2Var28 = new y2("tref", 27);
        tref = y2Var28;
        y2 y2Var29 = new y2("tspan", 28);
        tspan = y2Var29;
        y2 y2Var30 = new y2("use", 29);
        use = y2Var30;
        y2 y2Var31 = new y2("view", 30);
        view = y2Var31;
        y2 y2Var32 = new y2("UNSUPPORTED", 31);
        UNSUPPORTED = y2Var32;
        $VALUES = new y2[]{y2Var, y2Var2, y2Var3, y2Var4, y2Var5, y2Var6, y2Var7, y2Var8, y2Var9, y2Var10, y2Var11, y2Var12, y2Var13, y2Var14, y2Var15, y2Var16, y2Var17, y2Var18, y2Var19, y2Var20, y2Var21, y2Var22, y2Var23, y2Var24, y2Var25, y2Var26, y2Var27, y2Var28, y2Var29, y2Var30, y2Var31, y2Var32};
        cache = new HashMap();
        for (y2 y2Var33 : values()) {
            if (y2Var33 == SWITCH) {
                cache.put("switch", y2Var33);
            } else if (y2Var33 != UNSUPPORTED) {
                cache.put(y2Var33.name(), y2Var33);
            }
        }
    }

    public static y2 a(String str) {
        y2 y2Var = cache.get(str);
        return y2Var != null ? y2Var : UNSUPPORTED;
    }

    public static y2 valueOf(String str) {
        return (y2) Enum.valueOf(y2.class, str);
    }

    public static y2[] values() {
        return (y2[]) $VALUES.clone();
    }
}
