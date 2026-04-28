package x6;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Trace;
import o00.x0;
import q1.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final na0.a f43879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f43880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Paint f43881c;

    static {
        Trace.beginSection(x0.G("TypefaceCompat static init"));
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            f43879a = new j();
        } else if (i11 >= 29) {
            f43879a = new i();
        } else if (i11 >= 28) {
            f43879a = new h();
        } else {
            f43879a = new g();
        }
        f43880b = new b0(16);
        f43881c = null;
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e6, code lost:
    
        r7 = r12.build();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r16, w6.c r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, w6.a r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.f.a(android.content.Context, w6.c, android.content.res.Resources, int, java.lang.String, int, int, w6.a, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i11, String str, int i12, int i13) {
        return resources.getResourcePackageName(i11) + '-' + str + '-' + i12 + '-' + i11 + '-' + i13;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        if (f43881c == null) {
            f43881c = new Paint();
        }
        f43881c.setTextSize(10.0f);
        f43881c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f43881c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
