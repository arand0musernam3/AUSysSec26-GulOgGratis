package zw;

import a3.i3;
import android.accounts.Account;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import androidx.camera.core.ImageCaptureException;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.app.tgtg.R;
import com.google.android.gms.internal.measurement.ae;
import com.google.android.gms.internal.measurement.af;
import com.google.android.gms.internal.measurement.ag;
import com.google.android.gms.internal.measurement.he;
import com.google.android.gms.internal.measurement.hf;
import com.google.android.gms.internal.measurement.i5;
import com.google.android.gms.internal.measurement.la;
import com.google.android.gms.internal.measurement.tc;
import com.google.android.gms.internal.measurement.xd;
import com.google.android.gms.internal.measurement.ye;
import com.google.android.gms.internal.measurement.zc;
import com.google.android.gms.internal.measurement.ze;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.components.DependencyException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import y00.i4;
import zendesk.core.ui.android.internal.xml.richtext.codeblock.CodeBlockHandler;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q2 implements u30.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static HashSet f48332g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f48333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f48334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f48335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f48336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f48337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f48338f;

    public q2(o30.a0 a0Var, o30.g0 g0Var) {
        long j9 = Integer.MIN_VALUE;
        this.f48334b = new AtomicLong((j9 & 4294967295L) | (j9 << 32));
        this.f48335c = new AtomicReference(null);
        this.f48336d = new AtomicReference(null);
        o30.g0 g0Var2 = o30.g0.INSTANCE;
        this.f48337e = new o30.a1(g0Var2);
        o30.b1 b1Var = new o30.b1();
        this.f48338f = b1Var;
        tc tcVar = new tc();
        tcVar.f11889b = a0Var;
        g0Var.getClass();
        tcVar.f11890c = g0Var;
        this.f48333a = tcVar;
        b1Var.a(tcVar, g0Var2);
    }

    public static void A(e0 e0Var, String str) {
        n1 n1VarG = e0Var.f48323a.G(str);
        if (n1VarG == null) {
            Log.w("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(n1VarG instanceof e0)) {
            y("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (n1VarG == e0Var) {
            y("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        e0 e0Var2 = (e0) n1VarG;
        if (e0Var.f48182i == null) {
            e0Var.f48182i = e0Var2.f48182i;
        }
        if (e0Var.f48183j == null) {
            e0Var.f48183j = e0Var2.f48183j;
        }
        if (e0Var.f48184k == null) {
            e0Var.f48184k = e0Var2.f48184k;
        }
        if (e0Var.f48181h.isEmpty()) {
            e0Var.f48181h = e0Var2.f48181h;
        }
        try {
            if (e0Var instanceof o1) {
                o1 o1Var = (o1) e0Var;
                o1 o1Var2 = (o1) n1VarG;
                if (o1Var.f48307m == null) {
                    o1Var.f48307m = o1Var2.f48307m;
                }
                if (o1Var.f48308n == null) {
                    o1Var.f48308n = o1Var2.f48308n;
                }
                if (o1Var.f48309o == null) {
                    o1Var.f48309o = o1Var2.f48309o;
                }
                if (o1Var.f48310p == null) {
                    o1Var.f48310p = o1Var2.f48310p;
                }
            } else {
                B((s1) e0Var, (s1) n1VarG);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = e0Var2.l;
        if (str2 != null) {
            A(e0Var, str2);
        }
    }

    public static void B(s1 s1Var, s1 s1Var2) {
        if (s1Var.f48353m == null) {
            s1Var.f48353m = s1Var2.f48353m;
        }
        if (s1Var.f48354n == null) {
            s1Var.f48354n = s1Var2.f48354n;
        }
        if (s1Var.f48355o == null) {
            s1Var.f48355o = s1Var2.f48355o;
        }
        if (s1Var.f48356p == null) {
            s1Var.f48356p = s1Var2.f48356p;
        }
        if (s1Var.f48357q == null) {
            s1Var.f48357q = s1Var2.f48357q;
        }
    }

    public static void C(s0 s0Var, String str) {
        n1 n1VarG = s0Var.f48323a.G(str);
        if (n1VarG == null) {
            Log.w("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(n1VarG instanceof s0)) {
            y("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (n1VarG == s0Var) {
            y("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        s0 s0Var2 = (s0) n1VarG;
        if (s0Var.f48345p == null) {
            s0Var.f48345p = s0Var2.f48345p;
        }
        if (s0Var.f48346q == null) {
            s0Var.f48346q = s0Var2.f48346q;
        }
        if (s0Var.f48347r == null) {
            s0Var.f48347r = s0Var2.f48347r;
        }
        if (s0Var.f48348s == null) {
            s0Var.f48348s = s0Var2.f48348s;
        }
        if (s0Var.f48349t == null) {
            s0Var.f48349t = s0Var2.f48349t;
        }
        if (s0Var.f48350u == null) {
            s0Var.f48350u = s0Var2.f48350u;
        }
        if (s0Var.f48351v == null) {
            s0Var.f48351v = s0Var2.f48351v;
        }
        if (s0Var.f48263i.isEmpty()) {
            s0Var.f48263i = s0Var2.f48263i;
        }
        if (s0Var.f48360o == null) {
            s0Var.f48360o = s0Var2.f48360o;
        }
        if (s0Var.f48339n == null) {
            s0Var.f48339n = s0Var2.f48339n;
        }
        String str2 = s0Var2.f48352w;
        if (str2 != null) {
            C(s0Var, str2);
        }
    }

    public static LayerDrawable J(p.c2 c2Var, Context context, int i11) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i11);
        Drawable drawableD = c2Var.d(context, R.drawable.abc_star_black_48dp);
        Drawable drawableD2 = c2Var.d(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableD instanceof BitmapDrawable) && drawableD.getIntrinsicWidth() == dimensionPixelSize && drawableD.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableD;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableD.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableD2 instanceof BitmapDrawable) && drawableD2.getIntrinsicWidth() == dimensionPixelSize && drawableD2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableD2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableD2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean M(h1 h1Var, long j9) {
        return (h1Var.f48204a & j9) != 0;
    }

    public static void N(q6.g0 g0Var) {
        androidx.constraintlayout.widget.w sharedValues = ConstraintLayout.getSharedValues();
        int i11 = g0Var.f36212u;
        l50.a aVar = new l50.a(9);
        HashMap map = sharedValues.f2532a;
        HashSet hashSet = (HashSet) map.get(Integer.valueOf(i11));
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(Integer.valueOf(i11), hashSet);
        }
        hashSet.add(new WeakReference(aVar));
    }

    public static Path Q(t0 t0Var) {
        Path path = new Path();
        float[] fArr = t0Var.f48359o;
        path.moveTo(fArr[0], fArr[1]);
        int i11 = 2;
        while (true) {
            float[] fArr2 = t0Var.f48359o;
            if (i11 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i11], fArr2[i11 + 1]);
            i11 += 2;
        }
        if (t0Var instanceof u0) {
            path.close();
        }
        if (t0Var.f48284h == null) {
            t0Var.f48284h = l(path);
        }
        return path;
    }

    public static void h(float f11, float f12, float f13, float f14, float f15, boolean z11, boolean z12, float f16, float f17, r0 r0Var) {
        if (f11 == f16 && f12 == f17) {
            return;
        }
        if (f13 == 0.0f || f14 == 0.0f) {
            r0Var.e(f16, f17);
            return;
        }
        float fAbs = Math.abs(f13);
        float fAbs2 = Math.abs(f14);
        double radians = Math.toRadians(((double) f15) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d3 = ((double) (f11 - f16)) / 2.0d;
        double d11 = ((double) (f12 - f17)) / 2.0d;
        double d12 = (dSin * d11) + (dCos * d3);
        double d13 = (dCos * d11) + ((-dSin) * d3);
        double d14 = fAbs * fAbs;
        double d15 = fAbs2 * fAbs2;
        double d16 = d12 * d12;
        double d17 = d13 * d13;
        double d18 = (d17 / d15) + (d16 / d14);
        if (d18 > 0.99999d) {
            double dSqrt = Math.sqrt(d18) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d14 = fAbs * fAbs;
            d15 = fAbs2 * fAbs2;
        }
        double d19 = z11 == z12 ? -1.0d : 1.0d;
        double d21 = d14 * d15;
        double d22 = d14 * d17;
        double d23 = d15 * d16;
        double d24 = ((d21 - d22) - d23) / (d22 + d23);
        if (d24 < 0.0d) {
            d24 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d24) * d19;
        double d25 = fAbs;
        double d26 = fAbs2;
        double d27 = ((d25 * d13) / d26) * dSqrt2;
        double d28 = dSqrt2 * (-((d26 * d12) / d25));
        double d29 = ((dCos * d27) - (dSin * d28)) + (((double) (f11 + f16)) / 2.0d);
        double d31 = (dCos * d28) + (dSin * d27) + (((double) (f12 + f17)) / 2.0d);
        double d32 = (d12 - d27) / d25;
        double d33 = (d13 - d28) / d26;
        double d34 = ((-d12) - d27) / d25;
        double d35 = ((-d13) - d28) / d26;
        double d36 = (d33 * d33) + (d32 * d32);
        double dAcos = Math.acos(d32 / Math.sqrt(d36)) * (d33 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = ((d33 * d35) + (d32 * d34)) / Math.sqrt(((d35 * d35) + (d34 * d34)) * d36);
        double dAcos2 = ((d32 * d35) - (d33 * d34) < 0.0d ? -1.0d : 1.0d) * (dSqrt3 < -1.0d ? 3.141592653589793d : dSqrt3 > 1.0d ? 0.0d : Math.acos(dSqrt3));
        if (!z12 && dAcos2 > 0.0d) {
            dAcos2 -= 6.283185307179586d;
        } else if (z12 && dAcos2 < 0.0d) {
            dAcos2 += 6.283185307179586d;
        }
        double d37 = dAcos2 % 6.283185307179586d;
        double d38 = dAcos % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d37) * 2.0d) / 3.141592653589793d);
        double d39 = d37 / ((double) iCeil);
        double d41 = d39 / 2.0d;
        double dSin2 = (Math.sin(d41) * 1.3333333333333333d) / (Math.cos(d41) + 1.0d);
        int i11 = iCeil * 6;
        float[] fArr = new float[i11];
        int i12 = 0;
        int i13 = 0;
        while (i12 < iCeil) {
            double d42 = d38;
            double d43 = (((double) i12) * d39) + d42;
            double dCos2 = Math.cos(d43);
            double dSin3 = Math.sin(d43);
            int i14 = i12;
            int i15 = i13;
            fArr[i15] = (float) (dCos2 - (dSin2 * dSin3));
            fArr[i13 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d44 = d43 + d39;
            double dCos3 = Math.cos(d44);
            double dSin4 = Math.sin(d44);
            fArr[i15 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i15 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            fArr[i15 + 4] = (float) dCos3;
            i13 = i15 + 6;
            fArr[i15 + 5] = (float) dSin4;
            i12 = i14 + 1;
            d38 = d42;
            iCeil = iCeil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f15);
        matrix.postTranslate((float) d29, (float) d31);
        matrix.mapPoints(fArr);
        fArr[i11 - 2] = f16;
        fArr[i11 - 1] = f17;
        for (int i16 = 0; i16 < i11; i16 += 6) {
            r0Var.c(fArr[i16], fArr[i16 + 1], fArr[i16 + 2], fArr[i16 + 3], fArr[i16 + 4], fArr[i16 + 5]);
        }
    }

    public static void h0(o2 o2Var, boolean z11, q1 q1Var) {
        int i11;
        h1 h1Var = o2Var.f48311a;
        float fFloatValue = (z11 ? h1Var.f48207d : h1Var.f48209f).floatValue();
        if (q1Var instanceof a0) {
            i11 = ((a0) q1Var).f48153a;
        } else if (!(q1Var instanceof b0)) {
            return;
        } else {
            i11 = o2Var.f48311a.f48216n.f48153a;
        }
        int iR = r(fFloatValue, i11);
        if (z11) {
            o2Var.f48314d.setColor(iR);
        } else {
            o2Var.f48315e.setColor(iR);
        }
    }

    public static final void i(q2 q2Var, Throwable th2) {
        kotlin.collections.t tVar = (kotlin.collections.t) q2Var.f48338f;
        x80.i iVar = (x80.i) q2Var.f48337e;
        if (iVar.n(th2, false)) {
            for (Object objD = iVar.d(); !(objD instanceof x80.o); objD = iVar.d()) {
                x80.p.b(objD);
                tVar.addLast(objD);
            }
            if (tVar.isEmpty()) {
                return;
            }
            ((Function1) q2Var.f48334b).invoke(new ArrayList(tVar));
            tVar.clear();
        }
    }

    public static void i0(Drawable drawable, int i11, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = p.m.f33945b;
        }
        drawableMutate.setColorFilter(p.m.c(i11, mode));
    }

    public static boolean j(int i11, int[] iArr) {
        for (int i12 : iArr) {
            if (i12 == i11) {
                return true;
            }
        }
        return false;
    }

    public static h4.a l(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new h4.a(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if (r1 != 8) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Matrix n(h4.a r9, h4.a r10, zw.v r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L91
            zw.t r1 = r11.f48365a
            if (r1 != 0) goto Ld
            goto L91
        Ld:
            float r2 = r9.f21376d
            float r3 = r10.f21376d
            float r2 = r2 / r3
            float r3 = r9.f21377e
            float r4 = r10.f21377e
            float r3 = r3 / r4
            float r4 = r10.f21374b
            float r4 = -r4
            float r5 = r10.f21375c
            float r5 = -r5
            zw.v r6 = zw.v.f48363c
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L33
            float r10 = r9.f21374b
            float r9 = r9.f21375c
            r0.preTranslate(r10, r9)
            r0.preScale(r2, r3)
            r0.preTranslate(r4, r5)
            return r0
        L33:
            zw.u r11 = r11.f48366b
            zw.u r6 = zw.u.slice
            if (r11 != r6) goto L3e
            float r11 = java.lang.Math.max(r2, r3)
            goto L42
        L3e:
            float r11 = java.lang.Math.min(r2, r3)
        L42:
            float r2 = r9.f21376d
            float r2 = r2 / r11
            float r3 = r9.f21377e
            float r3 = r3 / r11
            int[] r6 = zw.h2.f48229a
            int r7 = r1.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L5b;
                case 2: goto L5b;
                case 3: goto L5b;
                case 4: goto L56;
                case 5: goto L56;
                case 6: goto L56;
                default: goto L55;
            }
        L55:
            goto L60
        L56:
            float r7 = r10.f21376d
            float r7 = r7 - r2
        L59:
            float r4 = r4 - r7
            goto L60
        L5b:
            float r7 = r10.f21376d
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L59
        L60:
            int r1 = r1.ordinal()
            r1 = r6[r1]
            r2 = 2
            if (r1 == r2) goto L7f
            r2 = 3
            if (r1 == r2) goto L7a
            r2 = 5
            if (r1 == r2) goto L7f
            r2 = 6
            if (r1 == r2) goto L7a
            r2 = 7
            if (r1 == r2) goto L7f
            r2 = 8
            if (r1 == r2) goto L7a
            goto L84
        L7a:
            float r10 = r10.f21377e
            float r10 = r10 - r3
        L7d:
            float r5 = r5 - r10
            goto L84
        L7f:
            float r10 = r10.f21377e
            float r10 = r10 - r3
            float r10 = r10 / r8
            goto L7d
        L84:
            float r10 = r9.f21374b
            float r9 = r9.f21375c
            r0.preTranslate(r10, r9)
            r0.preScale(r11, r11)
            r0.preTranslate(r4, r5)
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.q2.n(h4.a, h4.a, zw.v):android.graphics.Matrix");
    }

    public static Typeface q(String str, Integer num, z0 z0Var) {
        int i11;
        boolean z11 = z0Var == z0.Italic;
        i11 = num.intValue() > 500 ? z11 ? 3 : 1 : z11 ? 2 : 0;
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i11);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i11);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i11);
            case "serif":
                return Typeface.create(Typeface.SERIF, i11);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i11);
            default:
                return null;
        }
    }

    public static int r(float f11, int i11) {
        int i12 = 255;
        int iRound = Math.round(((i11 >> 24) & 255) * f11);
        if (iRound < 0) {
            i12 = 0;
        } else if (iRound <= 255) {
            i12 = iRound;
        }
        return (i12 << 24) | (i11 & 16777215);
    }

    public static ColorStateList s(Context context, int i11) {
        int iC = p.u2.c(context, R.attr.colorControlHighlight);
        int iB = p.u2.b(context, R.attr.colorButtonNormal);
        int[] iArr = p.u2.f34030b;
        int[] iArr2 = p.u2.f34032d;
        int iC2 = x6.c.c(iC, i11);
        return new ColorStateList(new int[][]{iArr, iArr2, p.u2.f34031c, p.u2.f34034f}, new int[]{iB, iC2, x6.c.c(iC, i11), i11});
    }

    public static void y(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public o2 D(n1 n1Var) {
        o2 o2Var = new o2();
        n0(o2Var, h1.a());
        E(n1Var, o2Var);
        return o2Var;
    }

    public void E(p1 p1Var, o2 o2Var) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (p1Var instanceof n1) {
                arrayList.add(0, (n1) p1Var);
            }
            Object obj = p1Var.f48324b;
            if (obj == null) {
                break;
            } else {
                p1Var = (p1) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o0(o2Var, (n1) it.next());
        }
        o2 o2Var2 = (o2) this.f48335c;
        o2Var.f48317g = o2Var2.f48317g;
        o2Var.f48316f = o2Var2.f48316f;
    }

    public d1 F() {
        d1 d1Var;
        h1 h1Var = ((o2) this.f48335c).f48311a;
        if (h1Var.f48222t == f1.LTR || (d1Var = h1Var.f48223u) == d1.Middle) {
            return h1Var.f48223u;
        }
        d1 d1Var2 = d1.Start;
        return d1Var == d1Var2 ? d1.End : d1Var2;
    }

    public int G() {
        int i11;
        a.a.t();
        pd.g.n("The ImageReader is not initialized.", ((ld.k) this.f48334b) != null);
        ld.k kVar = (ld.k) this.f48334b;
        synchronized (kVar.f27647c) {
            i11 = ((s0.f1) kVar.f27648d).i() - kVar.f27645a;
        }
        return i11;
    }

    public u30.m H(Class cls) {
        return a(u30.o.a(cls));
    }

    public xf.a I() {
        ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) this.f48335c).readLock();
        lock.lock();
        try {
            return (xf.a) this.f48336d;
        } finally {
            lock.unlock();
        }
    }

    public b0.a0 K(gy.c cVar) {
        b0.a0 a0Var;
        u70.t tVar = (u70.t) this.f48337e;
        u70.t tVar2 = (u70.t) this.f48336d;
        cVar.getClass();
        gy.c cVar2 = gy.c.V_1;
        if (cVar.compareTo(gy.c.V_2) <= 0 && cVar.compareTo(cVar2) >= 0) {
            iy.c cVar3 = (iy.c) tVar2.getValue();
            a0Var = cVar3.f24241d.length() > 0 ? cVar3 : null;
            return a0Var != null ? a0Var : (iy.a) tVar.getValue();
        }
        iy.c cVar4 = (iy.c) tVar2.getValue();
        if (cVar4.f24241d.length() <= 0) {
            cVar4 = null;
        }
        if (cVar4 != null) {
            return cVar4;
        }
        iy.d dVar = (iy.d) ((u70.t) this.f48338f).getValue();
        a0Var = dVar.f24242d.length() > 0 ? dVar : null;
        return a0Var != null ? a0Var : (iy.a) tVar.getValue();
    }

    public ColorStateList L(Context context, int i11) {
        if (i11 == R.drawable.abc_edit_text_material) {
            return androidx.core.app.e.b(context, R.color.abc_tint_edittext);
        }
        if (i11 == 2131230854) {
            return androidx.core.app.e.b(context, R.color.abc_tint_switch_track);
        }
        if (i11 != R.drawable.abc_switch_thumb_material) {
            if (i11 == R.drawable.abc_btn_default_mtrl_shape) {
                return s(context, p.u2.c(context, R.attr.colorButtonNormal));
            }
            if (i11 == R.drawable.abc_btn_borderless_material) {
                return s(context, 0);
            }
            if (i11 == R.drawable.abc_btn_colored_material) {
                return s(context, p.u2.c(context, R.attr.colorAccent));
            }
            if (i11 == 2131230849 || i11 == R.drawable.abc_spinner_textfield_background_material) {
                return androidx.core.app.e.b(context, R.color.abc_tint_spinner);
            }
            if (j(i11, (int[]) this.f48334b)) {
                return p.u2.d(context, R.attr.colorControlNormal);
            }
            if (j(i11, (int[]) this.f48337e)) {
                return androidx.core.app.e.b(context, R.color.abc_tint_default);
            }
            if (j(i11, (int[]) this.f48338f)) {
                return androidx.core.app.e.b(context, R.color.abc_tint_btn_checkable);
            }
            if (i11 == R.drawable.abc_seekbar_thumb_material) {
                return androidx.core.app.e.b(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = p.u2.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = p.u2.f34030b;
            iArr2[0] = p.u2.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = p.u2.f34033e;
            iArr2[1] = p.u2.c(context, R.attr.colorControlActivated);
            iArr[2] = p.u2.f34034f;
            iArr2[2] = p.u2.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = p.u2.f34030b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = p.u2.f34033e;
            iArr2[1] = p.u2.c(context, R.attr.colorControlActivated);
            iArr[2] = p.u2.f34034f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public Path O(y yVar) {
        k0 k0Var = yVar.f48399o;
        float fD = k0Var != null ? k0Var.d(this) : 0.0f;
        k0 k0Var2 = yVar.f48400p;
        float f11 = k0Var2 != null ? k0Var2.f(this) : 0.0f;
        float fA = yVar.f48401q.a(this);
        float f12 = fD - fA;
        float f13 = f11 - fA;
        float f14 = fD + fA;
        float f15 = f11 + fA;
        if (yVar.f48284h == null) {
            float f16 = 2.0f * fA;
            yVar.f48284h = new h4.a(f12, f13, f16, f16);
        }
        float f17 = fA * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f13);
        float f18 = fD + f17;
        float f19 = f11 - f17;
        path.cubicTo(f18, f13, f14, f19, f14, f11);
        float f20 = f11 + f17;
        path.cubicTo(f14, f20, f18, f15, fD, f15);
        float f21 = fD - f17;
        path.cubicTo(f21, f15, f12, f20, f12, f11);
        path.cubicTo(f12, f19, f21, f13, fD, f13);
        path.close();
        return path;
    }

    public Path P(d0 d0Var) {
        k0 k0Var = d0Var.f48176o;
        float fD = k0Var != null ? k0Var.d(this) : 0.0f;
        k0 k0Var2 = d0Var.f48177p;
        float f11 = k0Var2 != null ? k0Var2.f(this) : 0.0f;
        float fD2 = d0Var.f48178q.d(this);
        float f12 = d0Var.f48179r.f(this);
        float f13 = fD - fD2;
        float f14 = f11 - f12;
        float f15 = fD + fD2;
        float f16 = f11 + f12;
        if (d0Var.f48284h == null) {
            d0Var.f48284h = new h4.a(f13, f14, fD2 * 2.0f, 2.0f * f12);
        }
        float f17 = fD2 * 0.5522848f;
        float f18 = f12 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f14);
        float f19 = fD + f17;
        float f20 = f11 - f18;
        path.cubicTo(f19, f14, f15, f20, f15, f11);
        float f21 = f11 + f18;
        path.cubicTo(f15, f21, f19, f16, fD, f16);
        float f22 = fD - f17;
        path.cubicTo(f22, f16, f13, f21, f13, f11);
        path.cubicTo(f13, f20, f22, f14, fD, f14);
        path.close();
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Path R(zw.v0 r20) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.q2.R(zw.v0):android.graphics.Path");
    }

    public h4.a S(k0 k0Var, k0 k0Var2, k0 k0Var3, k0 k0Var4) {
        float fD = k0Var != null ? k0Var.d(this) : 0.0f;
        float f11 = k0Var2 != null ? k0Var2.f(this) : 0.0f;
        o2 o2Var = (o2) this.f48335c;
        h4.a aVar = o2Var.f48317g;
        if (aVar == null) {
            aVar = o2Var.f48316f;
        }
        return new h4.a(fD, f11, k0Var3 != null ? k0Var3.d(this) : aVar.f21376d, k0Var4 != null ? k0Var4.f(this) : aVar.f21377e);
    }

    public Path T(m1 m1Var, boolean z11) {
        Path pathR;
        Path pathK;
        ((Stack) this.f48336d).push((o2) this.f48335c);
        o2 o2Var = new o2((o2) this.f48335c);
        this.f48335c = o2Var;
        o0(o2Var, m1Var);
        if (!u() || !q0()) {
            this.f48335c = (o2) ((Stack) this.f48336d).pop();
            return null;
        }
        if (m1Var instanceof f2) {
            if (!z11) {
                y("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            f2 f2Var = (f2) m1Var;
            n1 n1VarG = m1Var.f48323a.G(f2Var.f48192o);
            if (n1VarG == null) {
                y("Use reference '%s' not found", f2Var.f48192o);
                this.f48335c = (o2) ((Stack) this.f48336d).pop();
                return null;
            }
            if (!(n1VarG instanceof m1)) {
                this.f48335c = (o2) ((Stack) this.f48336d).pop();
                return null;
            }
            pathR = T((m1) n1VarG, false);
            if (pathR != null) {
                if (f2Var.f48284h == null) {
                    f2Var.f48284h = l(pathR);
                }
                Matrix matrix = f2Var.f48203n;
                if (matrix != null) {
                    pathR.transform(matrix);
                }
                if (((o2) this.f48335c).f48311a.E != null && (pathK = k(m1Var, m1Var.f48284h)) != null) {
                    pathR.op(pathK, Path.Op.INTERSECT);
                }
                this.f48335c = (o2) ((Stack) this.f48336d).pop();
                return pathR;
            }
            return null;
        }
        if (m1Var instanceof g0) {
            g0 g0Var = (g0) m1Var;
            if (m1Var instanceof q0) {
                k2 k2Var = new k2(((q0) m1Var).f48331o);
                h4.a aVar = m1Var.f48284h;
                Path path = k2Var.f48267a;
                if (aVar == null) {
                    m1Var.f48284h = l(path);
                }
                pathR = path;
            } else {
                pathR = m1Var instanceof v0 ? R((v0) m1Var) : m1Var instanceof y ? O((y) m1Var) : m1Var instanceof d0 ? P((d0) m1Var) : m1Var instanceof t0 ? Q((t0) m1Var) : null;
            }
            if (pathR != null) {
                if (g0Var.f48284h == null) {
                    g0Var.f48284h = l(pathR);
                }
                Matrix matrix2 = g0Var.f48202n;
                if (matrix2 != null) {
                    pathR.transform(matrix2);
                }
                y0 y0Var = ((o2) this.f48335c).f48311a.F;
                pathR.setFillType((y0Var == null || y0Var != y0.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
            }
            return null;
        }
        if (!(m1Var instanceof y1)) {
            y("Invalid %s element found in clipPath definition", m1Var.n());
            return null;
        }
        y1 y1Var = (y1) m1Var;
        ArrayList arrayList = y1Var.f48172n;
        float f11 = 0.0f;
        float fD = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((k0) y1Var.f48172n.get(0)).d(this);
        ArrayList arrayList2 = y1Var.f48173o;
        float f12 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((k0) y1Var.f48173o.get(0)).f(this);
        ArrayList arrayList3 = y1Var.f48174p;
        float fD2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((k0) y1Var.f48174p.get(0)).d(this);
        ArrayList arrayList4 = y1Var.f48175q;
        if (arrayList4 != null && arrayList4.size() != 0) {
            f11 = ((k0) y1Var.f48175q.get(0)).f(this);
        }
        if (((o2) this.f48335c).f48311a.f48223u != d1.Start) {
            float fM = m(y1Var);
            if (((o2) this.f48335c).f48311a.f48223u == d1.Middle) {
                fM /= 2.0f;
            }
            fD -= fM;
        }
        if (y1Var.f48284h == null) {
            n2 n2Var = new n2(this, fD, f12);
            x(y1Var, n2Var);
            RectF rectF = (RectF) n2Var.f48303h;
            y1Var.f48284h = new h4.a(rectF.left, rectF.top, rectF.width(), ((RectF) n2Var.f48303h).height());
        }
        Path path2 = new Path();
        x(y1Var, new n2(this, fD + fD2, f12 + f11, path2));
        Matrix matrix3 = y1Var.f48402r;
        if (matrix3 != null) {
            path2.transform(matrix3);
        }
        y0 y0Var2 = ((o2) this.f48335c).f48311a.F;
        path2.setFillType((y0Var2 == null || y0Var2 != y0.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
        pathR = path2;
        if (((o2) this.f48335c).f48311a.E != null) {
            pathR.op(pathK, Path.Op.INTERSECT);
        }
        this.f48335c = (o2) ((Stack) this.f48336d).pop();
        return pathR;
    }

    public void U(m0.n0 n0Var) throws Exception {
        r0.n nVar;
        r0.n nVar2;
        a.a.t();
        if (((r0.n) this.f48333a) == null) {
            wd.a.I("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + n0Var);
            n0Var.close();
            return;
        }
        s0.k2 k2VarB = n0Var.Y().b();
        if (((Integer) k2VarB.f38373a.get(((r0.n) this.f48333a).f37491i)) == null) {
            wd.a.I("CaptureNode", "Discarding ImageProxy which was acquired for another request, mCurrentRequest id = " + ((r0.n) this.f48333a).f37483a + ", ImageProxy tagBundle keys = " + k2VarB.f38373a.keySet());
            n0Var.close();
            return;
        }
        a.a.t();
        r0.c cVar = (r0.c) this.f48336d;
        Objects.requireNonNull(cVar);
        cVar.f37442a.accept(new r0.d((r0.n) this.f48333a, n0Var));
        r0.n nVar3 = (r0.n) this.f48333a;
        r0.a aVar = (r0.a) this.f48337e;
        boolean z11 = aVar != null && aVar.f37436h.size() > 1;
        if (z11 && (nVar2 = (r0.n) this.f48333a) != null) {
            nVar2.f37484b.b(n0Var.getFormat());
        }
        if (!z11 || ((nVar = (r0.n) this.f48333a) != null && nVar.f37484b.a())) {
            this.f48333a = null;
        }
        wd.a.y("ProcessingRequest", "onImageCaptured: request ID = " + nVar3.f37483a);
        if (nVar3.l != -1) {
            nVar3.a(100);
        }
        r0.o oVar = nVar3.f37490h;
        a.a.t();
        if (oVar.f37500g) {
            return;
        }
        if (!oVar.f37501h) {
            a.a.t();
            if (!oVar.f37500g && !oVar.f37501h) {
                oVar.f37501h = true;
            }
        }
        oVar.f37498e.b(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void V(r0.n nVar) {
        a.a.t();
        pd.g.n("only one capture stage is supported.", nVar.f37492j.size() == 1);
        pd.g.n("Too many acquire images. Close image to be able to process next.", G() > 0);
        this.f48333a = nVar;
        ListenableFuture listenableFuture = nVar.f37493k;
        listenableFuture.a(new x0.f((int) (0 == true ? 1 : 0), (Object) listenableFuture, (Object) new oz.m(this, nVar, false, 13)), w.b.F());
    }

    public void W(h4.a aVar) {
        Canvas canvas = (Canvas) this.f48333a;
        if (((o2) this.f48335c).f48311a.G != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            n0 n0Var = (n0) ((t5.a) this.f48334b).G(((o2) this.f48335c).f48311a.G);
            d0(n0Var, aVar);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            d0(n0Var, aVar);
            canvas.restore();
            canvas.restore();
        }
        j0();
    }

    public boolean X() {
        n1 n1VarG;
        int i11 = 0;
        if (((o2) this.f48335c).f48311a.f48215m.floatValue() >= 1.0f && ((o2) this.f48335c).f48311a.G == null) {
            return false;
        }
        Canvas canvas = (Canvas) this.f48333a;
        int iFloatValue = (int) (((o2) this.f48335c).f48311a.f48215m.floatValue() * 256.0f);
        if (iFloatValue >= 0) {
            i11 = 255;
            if (iFloatValue <= 255) {
                i11 = iFloatValue;
            }
        }
        canvas.saveLayerAlpha(null, i11, 31);
        ((Stack) this.f48336d).push((o2) this.f48335c);
        o2 o2Var = new o2((o2) this.f48335c);
        this.f48335c = o2Var;
        String str = o2Var.f48311a.G;
        if (str != null && ((n1VarG = ((t5.a) this.f48334b).G(str)) == null || !(n1VarG instanceof n0))) {
            y("Mask reference '%s' not found", ((o2) this.f48335c).f48311a.G);
            ((o2) this.f48335c).f48311a.G = null;
        }
        return true;
    }

    public void Y(i1 i1Var, h4.a aVar, h4.a aVar2, v vVar) {
        if (aVar.f21376d == 0.0f || aVar.f21377e == 0.0f) {
            return;
        }
        if (vVar == null && (vVar = i1Var.f48339n) == null) {
            vVar = v.f48364d;
        }
        o0((o2) this.f48335c, i1Var);
        if (u()) {
            o2 o2Var = (o2) this.f48335c;
            o2Var.f48316f = aVar;
            if (!o2Var.f48311a.f48224v.booleanValue()) {
                h4.a aVar3 = ((o2) this.f48335c).f48316f;
                f0(aVar3.f21374b, aVar3.f21375c, aVar3.f21376d, aVar3.f21377e);
            }
            o(i1Var, ((o2) this.f48335c).f48316f);
            Canvas canvas = (Canvas) this.f48333a;
            o2 o2Var2 = (o2) this.f48335c;
            if (aVar2 != null) {
                canvas.concat(n(o2Var2.f48316f, aVar2, vVar));
                ((o2) this.f48335c).f48317g = i1Var.f48360o;
            } else {
                h4.a aVar4 = o2Var2.f48316f;
                canvas.translate(aVar4.f21374b, aVar4.f21375c);
            }
            boolean zX = X();
            p0();
            a0(i1Var, true);
            if (zX) {
                W(i1Var.f48284h);
            }
            m0(i1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Z(p1 p1Var) {
        k0 k0Var;
        String str;
        int iIndexOf;
        Set setA;
        k0 k0Var2;
        Boolean bool;
        if (p1Var instanceof o0) {
            return;
        }
        k0();
        if ((p1Var instanceof n1) && (bool = ((n1) p1Var).f48295d) != null) {
            ((o2) this.f48335c).f48318h = bool.booleanValue();
        }
        if (p1Var instanceof i1) {
            i1 i1Var = (i1) p1Var;
            Y(i1Var, S(i1Var.f48237p, i1Var.f48238q, i1Var.f48239r, i1Var.f48240s), i1Var.f48360o, i1Var.f48339n);
        } else {
            Bitmap bitmapDecodeByteArray = null;
            if (p1Var instanceof f2) {
                f2 f2Var = (f2) p1Var;
                Canvas canvas = (Canvas) this.f48333a;
                k0 k0Var3 = f2Var.f48195r;
                if ((k0Var3 == null || !k0Var3.i()) && ((k0Var2 = f2Var.f48196s) == null || !k0Var2.i())) {
                    o0((o2) this.f48335c, f2Var);
                    if (u()) {
                        p1 p1VarG = f2Var.f48323a.G(f2Var.f48192o);
                        if (p1VarG == null) {
                            y("Use reference '%s' not found", f2Var.f48192o);
                        } else {
                            Matrix matrix = f2Var.f48203n;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            k0 k0Var4 = f2Var.f48193p;
                            float fD = k0Var4 != null ? k0Var4.d(this) : 0.0f;
                            k0 k0Var5 = f2Var.f48194q;
                            canvas.translate(fD, k0Var5 != null ? k0Var5.f(this) : 0.0f);
                            o(f2Var, f2Var.f48284h);
                            boolean zX = X();
                            ((Stack) this.f48337e).push(f2Var);
                            ((Stack) this.f48338f).push(((Canvas) this.f48333a).getMatrix());
                            if (p1VarG instanceof i1) {
                                i1 i1Var2 = (i1) p1VarG;
                                h4.a aVarS = S(null, null, f2Var.f48195r, f2Var.f48196s);
                                k0();
                                Y(i1Var2, aVarS, i1Var2.f48360o, i1Var2.f48339n);
                                j0();
                            } else if (p1VarG instanceof v1) {
                                k0 k0Var6 = f2Var.f48195r;
                                if (k0Var6 == null) {
                                    k0Var6 = new k0(100.0f, e2.percent);
                                }
                                k0 k0Var7 = f2Var.f48196s;
                                if (k0Var7 == null) {
                                    k0Var7 = new k0(100.0f, e2.percent);
                                }
                                h4.a aVarS2 = S(null, null, k0Var6, k0Var7);
                                k0();
                                v1 v1Var = (v1) p1VarG;
                                if (aVarS2.f21376d != 0.0f && aVarS2.f21377e != 0.0f) {
                                    v vVar = v1Var.f48339n;
                                    if (vVar == null) {
                                        vVar = v.f48364d;
                                    }
                                    o0((o2) this.f48335c, v1Var);
                                    o2 o2Var = (o2) this.f48335c;
                                    o2Var.f48316f = aVarS2;
                                    if (!o2Var.f48311a.f48224v.booleanValue()) {
                                        h4.a aVar = ((o2) this.f48335c).f48316f;
                                        f0(aVar.f21374b, aVar.f21375c, aVar.f21376d, aVar.f21377e);
                                    }
                                    h4.a aVar2 = v1Var.f48360o;
                                    o2 o2Var2 = (o2) this.f48335c;
                                    if (aVar2 != null) {
                                        canvas.concat(n(o2Var2.f48316f, aVar2, vVar));
                                        ((o2) this.f48335c).f48317g = v1Var.f48360o;
                                    } else {
                                        h4.a aVar3 = o2Var2.f48316f;
                                        canvas.translate(aVar3.f21374b, aVar3.f21375c);
                                    }
                                    boolean zX2 = X();
                                    a0(v1Var, true);
                                    if (zX2) {
                                        W(v1Var.f48284h);
                                    }
                                    m0(v1Var);
                                }
                                j0();
                            } else {
                                Z(p1VarG);
                            }
                            ((Stack) this.f48337e).pop();
                            ((Stack) this.f48338f).pop();
                            if (zX) {
                                W(f2Var.f48284h);
                            }
                            m0(f2Var);
                        }
                    }
                }
            } else if (p1Var instanceof u1) {
                u1 u1Var = (u1) p1Var;
                o0((o2) this.f48335c, u1Var);
                if (u()) {
                    Matrix matrix2 = u1Var.f48203n;
                    if (matrix2 != null) {
                        ((Canvas) this.f48333a).concat(matrix2);
                    }
                    o(u1Var, u1Var.f48284h);
                    boolean zX3 = X();
                    String language = Locale.getDefault().getLanguage();
                    Iterator it = u1Var.f48263i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        p1 p1Var2 = (p1) it.next();
                        if (p1Var2 instanceof j1) {
                            j1 j1Var = (j1) p1Var2;
                            if (j1Var.b() == null && ((setA = j1Var.a()) == null || (!setA.isEmpty() && setA.contains(language)))) {
                                Set setE = j1Var.e();
                                if (setE != null) {
                                    if (f48332g == null) {
                                        synchronized (q2.class) {
                                            HashSet hashSet = new HashSet();
                                            f48332g = hashSet;
                                            hashSet.add("Structure");
                                            f48332g.add("BasicStructure");
                                            f48332g.add("ConditionalProcessing");
                                            f48332g.add("Image");
                                            f48332g.add("Style");
                                            f48332g.add("ViewportAttribute");
                                            f48332g.add("Shape");
                                            f48332g.add("BasicText");
                                            f48332g.add("PaintAttribute");
                                            f48332g.add("BasicPaintAttribute");
                                            f48332g.add("OpacityAttribute");
                                            f48332g.add("BasicGraphicsAttribute");
                                            f48332g.add("Marker");
                                            f48332g.add("Gradient");
                                            f48332g.add("Pattern");
                                            f48332g.add("Clip");
                                            f48332g.add("BasicClip");
                                            f48332g.add("Mask");
                                            f48332g.add("View");
                                        }
                                    }
                                    if (setE.isEmpty() || !f48332g.containsAll(setE)) {
                                    }
                                }
                                Set setL = j1Var.l();
                                if (setL == null) {
                                    Set setM = j1Var.m();
                                    if (setM == null) {
                                        Z(p1Var2);
                                        break;
                                    }
                                    setM.isEmpty();
                                } else {
                                    setL.isEmpty();
                                }
                            }
                        }
                    }
                    if (zX3) {
                        W(u1Var.f48284h);
                    }
                    m0(u1Var);
                }
            } else if (p1Var instanceof h0) {
                h0 h0Var = (h0) p1Var;
                o0((o2) this.f48335c, h0Var);
                if (u()) {
                    Matrix matrix3 = h0Var.f48203n;
                    if (matrix3 != null) {
                        ((Canvas) this.f48333a).concat(matrix3);
                    }
                    o(h0Var, h0Var.f48284h);
                    boolean zX4 = X();
                    a0(h0Var, true);
                    if (zX4) {
                        W(h0Var.f48284h);
                    }
                    m0(h0Var);
                }
            } else {
                if (p1Var instanceof j0) {
                    j0 j0Var = (j0) p1Var;
                    Canvas canvas2 = (Canvas) this.f48333a;
                    k0 k0Var8 = j0Var.f48253r;
                    if (k0Var8 != null && !k0Var8.i() && (k0Var = j0Var.f48254s) != null && !k0Var.i() && (str = j0Var.f48250o) != null) {
                        v vVar2 = j0Var.f48339n;
                        if (vVar2 == null) {
                            vVar2 = v.f48364d;
                        }
                        if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                            try {
                                byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                            } catch (Exception e5) {
                                Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e5);
                            }
                        }
                        if (bitmapDecodeByteArray != null) {
                            h4.a aVar4 = new h4.a(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                            o0((o2) this.f48335c, j0Var);
                            if (u() && q0()) {
                                Matrix matrix4 = j0Var.f48255t;
                                if (matrix4 != null) {
                                    canvas2.concat(matrix4);
                                }
                                k0 k0Var9 = j0Var.f48251p;
                                float fD2 = k0Var9 != null ? k0Var9.d(this) : 0.0f;
                                k0 k0Var10 = j0Var.f48252q;
                                float f11 = k0Var10 != null ? k0Var10.f(this) : 0.0f;
                                float fD3 = j0Var.f48253r.d(this);
                                float fD4 = j0Var.f48254s.d(this);
                                o2 o2Var3 = (o2) this.f48335c;
                                o2Var3.f48316f = new h4.a(fD2, f11, fD3, fD4);
                                if (!o2Var3.f48311a.f48224v.booleanValue()) {
                                    h4.a aVar5 = ((o2) this.f48335c).f48316f;
                                    f0(aVar5.f21374b, aVar5.f21375c, aVar5.f21376d, aVar5.f21377e);
                                }
                                j0Var.f48284h = ((o2) this.f48335c).f48316f;
                                m0(j0Var);
                                o(j0Var, j0Var.f48284h);
                                boolean zX5 = X();
                                p0();
                                canvas2.save();
                                canvas2.concat(n(((o2) this.f48335c).f48316f, aVar4, vVar2));
                                canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint(((o2) this.f48335c).f48311a.M != c1.optimizeSpeed ? 2 : 0));
                                canvas2.restore();
                                if (zX5) {
                                    W(j0Var.f48284h);
                                }
                            }
                        }
                    }
                } else if (p1Var instanceof q0) {
                    q0 q0Var = (q0) p1Var;
                    if (q0Var.f48331o != null) {
                        o0((o2) this.f48335c, q0Var);
                        if (u() && q0()) {
                            o2 o2Var4 = (o2) this.f48335c;
                            if (o2Var4.f48313c || o2Var4.f48312b) {
                                Matrix matrix5 = q0Var.f48202n;
                                if (matrix5 != null) {
                                    ((Canvas) this.f48333a).concat(matrix5);
                                }
                                Path path = new k2(q0Var.f48331o).f48267a;
                                if (q0Var.f48284h == null) {
                                    q0Var.f48284h = l(path);
                                }
                                m0(q0Var);
                                p(q0Var);
                                o(q0Var, q0Var.f48284h);
                                boolean zX6 = X();
                                o2 o2Var5 = (o2) this.f48335c;
                                if (o2Var5.f48312b) {
                                    y0 y0Var = o2Var5.f48311a.f48206c;
                                    path.setFillType((y0Var == null || y0Var != y0.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    v(q0Var, path);
                                }
                                if (((o2) this.f48335c).f48313c) {
                                    w(path);
                                }
                                c0(q0Var);
                                if (zX6) {
                                    W(q0Var.f48284h);
                                }
                            }
                        }
                    }
                } else if (p1Var instanceof v0) {
                    v0 v0Var = (v0) p1Var;
                    k0 k0Var11 = v0Var.f48369q;
                    if (k0Var11 != null && v0Var.f48370r != null && !k0Var11.i() && !v0Var.f48370r.i()) {
                        o0((o2) this.f48335c, v0Var);
                        if (u() && q0()) {
                            Matrix matrix6 = v0Var.f48202n;
                            if (matrix6 != null) {
                                ((Canvas) this.f48333a).concat(matrix6);
                            }
                            Path pathR = R(v0Var);
                            m0(v0Var);
                            p(v0Var);
                            o(v0Var, v0Var.f48284h);
                            boolean zX7 = X();
                            if (((o2) this.f48335c).f48312b) {
                                v(v0Var, pathR);
                            }
                            if (((o2) this.f48335c).f48313c) {
                                w(pathR);
                            }
                            if (zX7) {
                                W(v0Var.f48284h);
                            }
                        }
                    }
                } else if (p1Var instanceof y) {
                    y yVar = (y) p1Var;
                    k0 k0Var12 = yVar.f48401q;
                    if (k0Var12 != null && !k0Var12.i()) {
                        o0((o2) this.f48335c, yVar);
                        if (u() && q0()) {
                            Matrix matrix7 = yVar.f48202n;
                            if (matrix7 != null) {
                                ((Canvas) this.f48333a).concat(matrix7);
                            }
                            Path pathO = O(yVar);
                            m0(yVar);
                            p(yVar);
                            o(yVar, yVar.f48284h);
                            boolean zX8 = X();
                            if (((o2) this.f48335c).f48312b) {
                                v(yVar, pathO);
                            }
                            if (((o2) this.f48335c).f48313c) {
                                w(pathO);
                            }
                            if (zX8) {
                                W(yVar.f48284h);
                            }
                        }
                    }
                } else if (p1Var instanceof d0) {
                    d0 d0Var = (d0) p1Var;
                    k0 k0Var13 = d0Var.f48178q;
                    if (k0Var13 != null && d0Var.f48179r != null && !k0Var13.i() && !d0Var.f48179r.i()) {
                        o0((o2) this.f48335c, d0Var);
                        if (u() && q0()) {
                            Matrix matrix8 = d0Var.f48202n;
                            if (matrix8 != null) {
                                ((Canvas) this.f48333a).concat(matrix8);
                            }
                            Path pathP = P(d0Var);
                            m0(d0Var);
                            p(d0Var);
                            o(d0Var, d0Var.f48284h);
                            boolean zX9 = X();
                            if (((o2) this.f48335c).f48312b) {
                                v(d0Var, pathP);
                            }
                            if (((o2) this.f48335c).f48313c) {
                                w(pathP);
                            }
                            if (zX9) {
                                W(d0Var.f48284h);
                            }
                        }
                    }
                } else if (p1Var instanceof l0) {
                    l0 l0Var = (l0) p1Var;
                    o0((o2) this.f48335c, l0Var);
                    if (u() && q0() && ((o2) this.f48335c).f48313c) {
                        Matrix matrix9 = l0Var.f48202n;
                        if (matrix9 != null) {
                            ((Canvas) this.f48333a).concat(matrix9);
                        }
                        k0 k0Var14 = l0Var.f48271o;
                        float fD5 = k0Var14 == null ? 0.0f : k0Var14.d(this);
                        k0 k0Var15 = l0Var.f48272p;
                        float f12 = k0Var15 == null ? 0.0f : k0Var15.f(this);
                        k0 k0Var16 = l0Var.f48273q;
                        float fD6 = k0Var16 == null ? 0.0f : k0Var16.d(this);
                        k0 k0Var17 = l0Var.f48274r;
                        f = k0Var17 != null ? k0Var17.f(this) : 0.0f;
                        if (l0Var.f48284h == null) {
                            l0Var.f48284h = new h4.a(Math.min(fD5, fD6), Math.min(f12, f), Math.abs(fD6 - fD5), Math.abs(f - f12));
                        }
                        Path path2 = new Path();
                        path2.moveTo(fD5, f12);
                        path2.lineTo(fD6, f);
                        m0(l0Var);
                        p(l0Var);
                        o(l0Var, l0Var.f48284h);
                        boolean zX10 = X();
                        w(path2);
                        c0(l0Var);
                        if (zX10) {
                            W(l0Var.f48284h);
                        }
                    }
                } else if (p1Var instanceof u0) {
                    u0 u0Var = (u0) p1Var;
                    o0((o2) this.f48335c, u0Var);
                    if (u() && q0()) {
                        o2 o2Var6 = (o2) this.f48335c;
                        if (o2Var6.f48313c || o2Var6.f48312b) {
                            Matrix matrix10 = u0Var.f48202n;
                            if (matrix10 != null) {
                                ((Canvas) this.f48333a).concat(matrix10);
                            }
                            if (u0Var.f48359o.length >= 2) {
                                Path pathQ = Q(u0Var);
                                m0(u0Var);
                                p(u0Var);
                                o(u0Var, u0Var.f48284h);
                                boolean zX11 = X();
                                if (((o2) this.f48335c).f48312b) {
                                    v(u0Var, pathQ);
                                }
                                if (((o2) this.f48335c).f48313c) {
                                    w(pathQ);
                                }
                                c0(u0Var);
                                if (zX11) {
                                    W(u0Var.f48284h);
                                }
                            }
                        }
                    }
                } else if (p1Var instanceof t0) {
                    t0 t0Var = (t0) p1Var;
                    o0((o2) this.f48335c, t0Var);
                    if (u() && q0()) {
                        o2 o2Var7 = (o2) this.f48335c;
                        if (o2Var7.f48313c || o2Var7.f48312b) {
                            Matrix matrix11 = t0Var.f48202n;
                            if (matrix11 != null) {
                                ((Canvas) this.f48333a).concat(matrix11);
                            }
                            if (t0Var.f48359o.length >= 2) {
                                Path pathQ2 = Q(t0Var);
                                m0(t0Var);
                                y0 y0Var2 = ((o2) this.f48335c).f48311a.f48206c;
                                pathQ2.setFillType((y0Var2 == null || y0Var2 != y0.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                p(t0Var);
                                o(t0Var, t0Var.f48284h);
                                boolean zX12 = X();
                                if (((o2) this.f48335c).f48312b) {
                                    v(t0Var, pathQ2);
                                }
                                if (((o2) this.f48335c).f48313c) {
                                    w(pathQ2);
                                }
                                c0(t0Var);
                                if (zX12) {
                                    W(t0Var.f48284h);
                                }
                            }
                        }
                    }
                } else if (p1Var instanceof y1) {
                    y1 y1Var = (y1) p1Var;
                    o0((o2) this.f48335c, y1Var);
                    if (u()) {
                        Matrix matrix12 = y1Var.f48402r;
                        if (matrix12 != null) {
                            ((Canvas) this.f48333a).concat(matrix12);
                        }
                        ArrayList arrayList = y1Var.f48172n;
                        float fD7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((k0) y1Var.f48172n.get(0)).d(this);
                        ArrayList arrayList2 = y1Var.f48173o;
                        float f13 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((k0) y1Var.f48173o.get(0)).f(this);
                        ArrayList arrayList3 = y1Var.f48174p;
                        float fD8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((k0) y1Var.f48174p.get(0)).d(this);
                        ArrayList arrayList4 = y1Var.f48175q;
                        if (arrayList4 != null && arrayList4.size() != 0) {
                            f = ((k0) y1Var.f48175q.get(0)).f(this);
                        }
                        d1 d1VarF = F();
                        if (d1VarF != d1.Start) {
                            float fM = m(y1Var);
                            if (d1VarF == d1.Middle) {
                                fM /= 2.0f;
                            }
                            fD7 -= fM;
                        }
                        if (y1Var.f48284h == null) {
                            n2 n2Var = new n2(this, fD7, f13);
                            x(y1Var, n2Var);
                            RectF rectF = (RectF) n2Var.f48303h;
                            y1Var.f48284h = new h4.a(rectF.left, rectF.top, rectF.width(), ((RectF) n2Var.f48303h).height());
                        }
                        m0(y1Var);
                        p(y1Var);
                        o(y1Var, y1Var.f48284h);
                        boolean zX13 = X();
                        x(y1Var, new m2(this, fD7 + fD8, f13 + f));
                        if (zX13) {
                            W(y1Var.f48284h);
                        }
                    }
                }
            }
        }
        j0();
    }

    @Override // u30.c
    public u30.m a(u30.o oVar) {
        if (((Set) this.f48335c).contains(oVar)) {
            return ((u30.c) this.f48338f).a(oVar);
        }
        qc.y.n("Attempting to request an undeclared dependency Deferred<", oVar, ">.");
        return null;
    }

    public void a0(k1 k1Var, boolean z11) {
        if (z11) {
            ((Stack) this.f48337e).push(k1Var);
            ((Stack) this.f48338f).push(((Canvas) this.f48333a).getMatrix());
        }
        Iterator it = k1Var.f48263i.iterator();
        while (it.hasNext()) {
            Z((p1) it.next());
        }
        if (z11) {
            ((Stack) this.f48337e).pop();
            ((Stack) this.f48338f).pop();
        }
    }

    @Override // u30.c
    public Object b(Class cls) {
        if (!((Set) this.f48333a).contains(u30.o.a(cls))) {
            throw new DependencyException(w.a0.n("Attempting to request an undeclared dependency ", cls, "."));
        }
        Object objB = ((u30.c) this.f48338f).b(cls);
        if (!cls.equals(q40.b.class)) {
            return objB;
        }
        return new u30.p();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fb, code lost:
    
        if (r8 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b0(zw.m0 r13, zw.j2 r14) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.q2.b0(zw.m0, zw.j2):void");
    }

    @Override // u30.c
    public t40.b c(Class cls) {
        return g(u30.o.a(cls));
    }

    public void c0(g0 g0Var) {
        m0 m0Var;
        m0 m0Var2;
        m0 m0Var3;
        int i11;
        float f11;
        float f12;
        float f13;
        ArrayList arrayList;
        int size;
        h1 h1Var = ((o2) this.f48335c).f48311a;
        String str = h1Var.f48226x;
        if (str == null && h1Var.f48227y == null && h1Var.f48228z == null) {
            return;
        }
        if (str == null) {
            m0Var = null;
        } else {
            n1 n1VarG = g0Var.f48323a.G(str);
            if (n1VarG != null) {
                m0Var = (m0) n1VarG;
            } else {
                y("Marker reference '%s' not found", ((o2) this.f48335c).f48311a.f48226x);
                m0Var = null;
            }
        }
        String str2 = ((o2) this.f48335c).f48311a.f48227y;
        if (str2 == null) {
            m0Var2 = null;
        } else {
            n1 n1VarG2 = g0Var.f48323a.G(str2);
            if (n1VarG2 != null) {
                m0Var2 = (m0) n1VarG2;
            } else {
                y("Marker reference '%s' not found", ((o2) this.f48335c).f48311a.f48227y);
                m0Var2 = null;
            }
        }
        String str3 = ((o2) this.f48335c).f48311a.f48228z;
        if (str3 == null) {
            m0Var3 = null;
        } else {
            n1 n1VarG3 = g0Var.f48323a.G(str3);
            if (n1VarG3 != null) {
                m0Var3 = (m0) n1VarG3;
            } else {
                y("Marker reference '%s' not found", ((o2) this.f48335c).f48311a.f48228z);
                m0Var3 = null;
            }
        }
        float f14 = 0.0f;
        if (g0Var instanceof q0) {
            arrayList = new i2(this, ((q0) g0Var).f48331o).f48241a;
            f12 = 0.0f;
            i11 = 1;
        } else if (g0Var instanceof l0) {
            l0 l0Var = (l0) g0Var;
            k0 k0Var = l0Var.f48271o;
            float fD = k0Var != null ? k0Var.d(this) : 0.0f;
            k0 k0Var2 = l0Var.f48272p;
            float f15 = k0Var2 != null ? k0Var2.f(this) : 0.0f;
            k0 k0Var3 = l0Var.f48273q;
            float fD2 = k0Var3 != null ? k0Var3.d(this) : 0.0f;
            k0 k0Var4 = l0Var.f48274r;
            float f16 = k0Var4 != null ? k0Var4.f(this) : 0.0f;
            ArrayList arrayList2 = new ArrayList(2);
            float f17 = fD2 - fD;
            i11 = 1;
            float f18 = f16 - f15;
            arrayList2.add(new j2(fD, f15, f17, f18));
            arrayList2.add(new j2(fD2, f16, f17, f18));
            f12 = 0.0f;
            arrayList = arrayList2;
        } else {
            i11 = 1;
            t0 t0Var = (t0) g0Var;
            int length = t0Var.f48359o.length;
            if (length < 2) {
                arrayList = null;
                f12 = 0.0f;
            } else {
                ArrayList arrayList3 = new ArrayList();
                float[] fArr = t0Var.f48359o;
                j2 j2Var = new j2(fArr[0], fArr[1], 0.0f, 0.0f);
                int i12 = 2;
                float f19 = 0.0f;
                float f20 = 0.0f;
                while (true) {
                    f11 = j2Var.f48257b;
                    f12 = f14;
                    f13 = j2Var.f48256a;
                    if (i12 >= length) {
                        break;
                    }
                    float[] fArr2 = t0Var.f48359o;
                    float f21 = fArr2[i12];
                    float f22 = fArr2[i12 + 1];
                    j2Var.a(f21, f22);
                    arrayList3.add(j2Var);
                    j2Var = new j2(f21, f22, f21 - f13, f22 - f11);
                    i12 += 2;
                    f20 = f22;
                    f19 = f21;
                    f14 = f12;
                }
                if (t0Var instanceof u0) {
                    float[] fArr3 = t0Var.f48359o;
                    float f23 = fArr3[0];
                    if (f19 != f23) {
                        float f24 = fArr3[1];
                        if (f20 != f24) {
                            j2Var.a(f23, f24);
                            arrayList3.add(j2Var);
                            j2 j2Var2 = new j2(f23, f24, f23 - f13, f24 - f11);
                            j2Var2.b((j2) arrayList3.get(0));
                            arrayList3.add(j2Var2);
                            arrayList3.set(0, j2Var2);
                        }
                    }
                } else {
                    arrayList3.add(j2Var);
                }
                arrayList = arrayList3;
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        h1 h1Var2 = ((o2) this.f48335c).f48311a;
        h1Var2.f48228z = null;
        h1Var2.f48227y = null;
        h1Var2.f48226x = null;
        if (m0Var != null) {
            b0(m0Var, (j2) arrayList.get(0));
        }
        if (m0Var2 != null && arrayList.size() > 2) {
            j2 j2Var3 = (j2) arrayList.get(0);
            j2 j2Var4 = (j2) arrayList.get(i11);
            int i13 = 1;
            while (i13 < size - 1) {
                i13++;
                j2 j2Var5 = (j2) arrayList.get(i13);
                if (j2Var4.f48260e) {
                    float f25 = j2Var4.f48258c;
                    float f26 = j2Var4.f48259d;
                    float f27 = j2Var4.f48256a;
                    float f28 = f27 - j2Var3.f48256a;
                    float f29 = j2Var4.f48257b;
                    float f31 = ((f29 - j2Var3.f48257b) * f26) + (f28 * f25);
                    if (f31 == f12) {
                        f31 = ((j2Var5.f48256a - f27) * f25) + ((j2Var5.f48257b - f29) * f26);
                    }
                    if (f31 <= f12 && (f31 != f12 || (f25 <= f12 && f26 < f12))) {
                        j2Var4.f48258c = -f25;
                        j2Var4.f48259d = -f26;
                    }
                }
                b0(m0Var2, j2Var4);
                j2Var3 = j2Var4;
                j2Var4 = j2Var5;
            }
        }
        if (m0Var3 != null) {
            b0(m0Var3, (j2) arrayList.get(size - 1));
        }
    }

    @Override // u30.c
    public t40.b d(u30.o oVar) {
        if (((Set) this.f48337e).contains(oVar)) {
            return ((u30.c) this.f48338f).d(oVar);
        }
        qc.y.n("Attempting to request an undeclared dependency Provider<Set<", oVar, ">>.");
        return null;
    }

    public void d0(n0 n0Var, h4.a aVar) {
        float fD;
        float f11;
        Canvas canvas = (Canvas) this.f48333a;
        Boolean bool = n0Var.f48290n;
        if (bool == null || !bool.booleanValue()) {
            k0 k0Var = n0Var.f48292p;
            float fB = k0Var != null ? k0Var.b(this, 1.0f) : 1.2f;
            k0 k0Var2 = n0Var.f48293q;
            float fB2 = k0Var2 != null ? k0Var2.b(this, 1.0f) : 1.2f;
            fD = fB * aVar.f21376d;
            f11 = fB2 * aVar.f21377e;
        } else {
            k0 k0Var3 = n0Var.f48292p;
            fD = k0Var3 != null ? k0Var3.d(this) : aVar.f21376d;
            k0 k0Var4 = n0Var.f48293q;
            f11 = k0Var4 != null ? k0Var4.f(this) : aVar.f21377e;
        }
        if (fD == 0.0f || f11 == 0.0f) {
            return;
        }
        k0();
        o2 o2VarD = D(n0Var);
        this.f48335c = o2VarD;
        o2VarD.f48311a.f48215m = Float.valueOf(1.0f);
        boolean zX = X();
        canvas.save();
        Boolean bool2 = n0Var.f48291o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(aVar.f21374b, aVar.f21375c);
            canvas.scale(aVar.f21376d, aVar.f21377e);
        }
        a0(n0Var, false);
        canvas.restore();
        if (zX) {
            W(aVar);
        }
        j0();
    }

    @Override // u30.c
    public Object e(u30.o oVar) {
        if (((Set) this.f48333a).contains(oVar)) {
            return ((u30.c) this.f48338f).e(oVar);
        }
        qc.y.n("Attempting to request an undeclared dependency ", oVar, ".");
        return null;
    }

    public void e0(r0.e eVar) {
        int i11;
        boolean z11;
        a.a.t();
        r0.n nVar = (r0.n) this.f48333a;
        if (nVar == null || (i11 = nVar.f37483a) != eVar.f37448a) {
            return;
        }
        ImageCaptureException imageCaptureException = eVar.f37449b;
        wd.a.J("ProcessingRequest", "onCaptureFailure: request ID = " + i11, imageCaptureException);
        r0.o oVar = nVar.f37490h;
        r0.f fVar = oVar.f37494a;
        a.a.t();
        if (oVar.f37500g) {
            return;
        }
        a.a.t();
        int i12 = fVar.f37450a;
        if (i12 > 0) {
            z11 = true;
            fVar.f37450a = i12 - 1;
        } else {
            z11 = false;
        }
        if (!z11) {
            a.a.t();
            fVar.f37452c.execute(new m0.l(fVar, imageCaptureException));
        }
        oVar.a();
        oVar.f37498e.d(imageCaptureException);
        if (z11) {
            r0.q qVar = oVar.f37495b;
            a.a.t();
            wd.a.p("TakePictureManagerImpl", "Add a new request for retrying.");
            qVar.f37505a.addFirst(fVar);
            qVar.b();
        }
    }

    @Override // u30.c
    public Set f(u30.o oVar) {
        if (((Set) this.f48336d).contains(oVar)) {
            return ((u30.c) this.f48338f).f(oVar);
        }
        qc.y.n("Attempting to request an undeclared dependency Set<", oVar, ">.");
        return null;
    }

    public void f0(float f11, float f12, float f13, float f14) {
        float fD = f13 + f11;
        float f15 = f14 + f12;
        x xVar = ((o2) this.f48335c).f48311a.f48225w;
        if (xVar != null) {
            f11 += ((k0) xVar.f48381d).d(this);
            f12 += ((k0) ((o2) this.f48335c).f48311a.f48225w.f48378a).f(this);
            fD -= ((k0) ((o2) this.f48335c).f48311a.f48225w.f48379b).d(this);
            f15 -= ((k0) ((o2) this.f48335c).f48311a.f48225w.f48380c).f(this);
        }
        ((Canvas) this.f48333a).clipRect(f11, f12, fD, f15);
    }

    @Override // u30.c
    public t40.b g(u30.o oVar) {
        if (((Set) this.f48334b).contains(oVar)) {
            return ((u30.c) this.f48338f).g(oVar);
        }
        qc.y.n("Attempting to request an undeclared dependency Provider<", oVar, ">.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g0(xf.a r11, xf.e r12) {
        /*
            r10 = this;
            r12.getClass()
            xf.a r0 = r10.I()
            java.lang.Object r1 = r10.f48335c
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = (java.util.concurrent.locks.ReentrantReadWriteLock) r1
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.readLock()
            int r3 = r1.getWriteHoldCount()
            r4 = 0
            if (r3 != 0) goto L1b
            int r3 = r1.getReadHoldCount()
            goto L1c
        L1b:
            r3 = r4
        L1c:
            r5 = r4
        L1d:
            if (r5 >= r3) goto L25
            r2.unlock()
            int r5 = r5 + 1
            goto L1d
        L25:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            r10.f48336d = r11     // Catch: java.lang.Throwable -> Lad
            xf.e r5 = xf.e.Initialized     // Catch: java.lang.Throwable -> Lad
        L30:
            if (r4 >= r3) goto L38
            r2.lock()
            int r4 = r4 + 1
            goto L30
        L38:
            r1.unlock()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r0)
            if (r1 != 0) goto Lac
            java.lang.Object r1 = r10.f48337e
            monitor-enter(r1)
            java.lang.Object r2 = r10.f48338f     // Catch: java.lang.Throwable -> La8
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2     // Catch: java.lang.Throwable -> La8
            java.util.Set r2 = kotlin.collections.CollectionsKt.v0(r2)     // Catch: java.lang.Throwable -> La8
            monitor-exit(r1)
            xf.e r1 = xf.e.Initialized
            r3 = 0
            if (r12 == r1) goto L7c
            java.lang.String r12 = r11.f44243a
            java.lang.String r1 = r0.f44243a
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r1)
            r5 = r12 ^ 1
            java.lang.String r1 = r11.f44244b
            java.lang.String r4 = r0.f44244b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            r8 = r1 ^ 1
            if (r12 == 0) goto L6b
            if (r1 == 0) goto L6b
            goto L7c
        L6b:
            java.lang.Object r12 = r10.f48334b
            a90.d r12 = (a90.d) r12
            xf.d r4 = new xf.d
            r9 = 0
            r6 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r11 = 3
            v80.f0.B(r12, r3, r3, r4, r11)
            goto L7d
        L7c:
            r7 = r11
        L7d:
            java.util.Iterator r11 = r2.iterator()
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lac
            java.lang.Object r11 = r11.next()
            if (r11 != 0) goto La4
            java.lang.String r11 = r7.f44243a
            java.lang.String r12 = r0.f44243a
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r12)
            if (r11 == 0) goto La3
            java.lang.String r11 = r7.f44244b
            java.lang.String r12 = r0.f44244b
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r12)
            if (r11 != 0) goto La2
            throw r3
        La2:
            throw r3
        La3:
            throw r3
        La4:
            org.bouncycastle.jce.provider.a.c()
            return
        La8:
            r0 = move-exception
            r11 = r0
            monitor-exit(r1)
            throw r11
        Lac:
            return
        Lad:
            r0 = move-exception
            r11 = r0
        Laf:
            if (r4 >= r3) goto Lb7
            r2.lock()
            int r4 = r4 + 1
            goto Laf
        Lb7:
            r1.unlock()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.q2.g0(xf.a, xf.e):void");
    }

    public void j0() {
        ((Canvas) this.f48333a).restore();
        this.f48335c = (o2) ((Stack) this.f48336d).pop();
    }

    public Path k(m1 m1Var, h4.a aVar) {
        Path pathT;
        n1 n1VarG = m1Var.f48323a.G(((o2) this.f48335c).f48311a.E);
        if (n1VarG == null) {
            y("ClipPath reference '%s' not found", ((o2) this.f48335c).f48311a.E);
            return null;
        }
        z zVar = (z) n1VarG;
        ((Stack) this.f48336d).push((o2) this.f48335c);
        this.f48335c = D(zVar);
        Boolean bool = zVar.f48405o;
        boolean z11 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(aVar.f21374b, aVar.f21375c);
            matrix.preScale(aVar.f21376d, aVar.f21377e);
        }
        Matrix matrix2 = zVar.f48203n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (p1 p1Var : zVar.f48263i) {
            if ((p1Var instanceof m1) && (pathT = T((m1) p1Var, true)) != null) {
                path.op(pathT, Path.Op.UNION);
            }
        }
        if (((o2) this.f48335c).f48311a.E != null) {
            if (zVar.f48284h == null) {
                zVar.f48284h = l(path);
            }
            Path pathK = k(zVar, zVar.f48284h);
            if (pathK != null) {
                path.op(pathK, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f48335c = (o2) ((Stack) this.f48336d).pop();
        return path;
    }

    public void k0() {
        ((Canvas) this.f48333a).save();
        ((Stack) this.f48336d).push((o2) this.f48335c);
        this.f48335c = new o2((o2) this.f48335c);
    }

    public String l0(String str, boolean z11, boolean z12) {
        if (((o2) this.f48335c).f48318h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll(CodeBlockHandler.NEWLINE_REGEX, "").replaceAll("\\t", " ");
        if (z11) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z12) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    public float m(a2 a2Var) {
        p2 p2Var = new p2(this);
        x(a2Var, p2Var);
        return p2Var.f48325d;
    }

    public void m0(m1 m1Var) {
        if (m1Var.f48324b == null || m1Var.f48284h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) ((Stack) this.f48338f).peek()).invert(matrix)) {
            h4.a aVar = m1Var.f48284h;
            float f11 = aVar.f21374b;
            float f12 = aVar.f21375c;
            float fC = aVar.c();
            h4.a aVar2 = m1Var.f48284h;
            float f13 = aVar2.f21375c;
            float fC2 = aVar2.c();
            float fD = m1Var.f48284h.d();
            h4.a aVar3 = m1Var.f48284h;
            float[] fArr = {f11, f12, fC, f13, fC2, fD, aVar3.f21374b, aVar3.d()};
            matrix.preConcat(((Canvas) this.f48333a).getMatrix());
            matrix.mapPoints(fArr);
            float f14 = fArr[0];
            float f15 = fArr[1];
            RectF rectF = new RectF(f14, f15, f14, f15);
            for (int i11 = 2; i11 <= 6; i11 += 2) {
                float f16 = fArr[i11];
                if (f16 < rectF.left) {
                    rectF.left = f16;
                }
                if (f16 > rectF.right) {
                    rectF.right = f16;
                }
                float f17 = fArr[i11 + 1];
                if (f17 < rectF.top) {
                    rectF.top = f17;
                }
                if (f17 > rectF.bottom) {
                    rectF.bottom = f17;
                }
            }
            m1 m1Var2 = (m1) ((Stack) this.f48337e).peek();
            h4.a aVar4 = m1Var2.f48284h;
            float f18 = rectF.left;
            float f19 = rectF.top;
            if (aVar4 == null) {
                m1Var2.f48284h = new h4.a(f18, f19, rectF.right - f18, rectF.bottom - f19);
                return;
            }
            float f20 = rectF.right - f18;
            float f21 = rectF.bottom - f19;
            if (f18 < aVar4.f21374b) {
                aVar4.f21374b = f18;
            }
            if (f19 < aVar4.f21375c) {
                aVar4.f21375c = f19;
            }
            if (f18 + f20 > aVar4.c()) {
                aVar4.f21376d = (f18 + f20) - aVar4.f21374b;
            }
            if (f19 + f21 > aVar4.d()) {
                aVar4.f21377e = (f19 + f21) - aVar4.f21375c;
            }
        }
    }

    public void n0(o2 o2Var, h1 h1Var) {
        if (M(h1Var, 4096L)) {
            o2Var.f48311a.f48216n = h1Var.f48216n;
        }
        if (M(h1Var, 2048L)) {
            o2Var.f48311a.f48215m = h1Var.f48215m;
        }
        boolean zM = M(h1Var, 1L);
        a0 a0Var = a0.f48152c;
        if (zM) {
            o2Var.f48311a.f48205b = h1Var.f48205b;
            q1 q1Var = h1Var.f48205b;
            o2Var.f48312b = (q1Var == null || q1Var == a0Var) ? false : true;
        }
        if (M(h1Var, 4L)) {
            o2Var.f48311a.f48207d = h1Var.f48207d;
        }
        if (M(h1Var, 6149L)) {
            h0(o2Var, true, o2Var.f48311a.f48205b);
        }
        if (M(h1Var, 2L)) {
            o2Var.f48311a.f48206c = h1Var.f48206c;
        }
        if (M(h1Var, 8L)) {
            o2Var.f48311a.f48208e = h1Var.f48208e;
            q1 q1Var2 = h1Var.f48208e;
            o2Var.f48313c = (q1Var2 == null || q1Var2 == a0Var) ? false : true;
        }
        if (M(h1Var, 16L)) {
            o2Var.f48311a.f48209f = h1Var.f48209f;
        }
        if (M(h1Var, 6168L)) {
            h0(o2Var, false, o2Var.f48311a.f48208e);
        }
        if (M(h1Var, 34359738368L)) {
            o2Var.f48311a.L = h1Var.L;
        }
        if (M(h1Var, 32L)) {
            h1 h1Var2 = o2Var.f48311a;
            k0 k0Var = h1Var.f48210g;
            h1Var2.f48210g = k0Var;
            o2Var.f48315e.setStrokeWidth(k0Var.a(this));
        }
        if (M(h1Var, 64L)) {
            h1 h1Var3 = o2Var.f48311a;
            Paint paint = o2Var.f48315e;
            h1Var3.f48211h = h1Var.f48211h;
            int i11 = h2.f48230b[h1Var.f48211h.ordinal()];
            if (i11 == 1) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (i11 == 2) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (i11 == 3) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (M(h1Var, 128L)) {
            h1 h1Var4 = o2Var.f48311a;
            Paint paint2 = o2Var.f48315e;
            h1Var4.f48212i = h1Var.f48212i;
            int i12 = h2.f48231c[h1Var.f48212i.ordinal()];
            if (i12 == 1) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (i12 == 2) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (i12 == 3) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (M(h1Var, 256L)) {
            o2Var.f48311a.f48213j = h1Var.f48213j;
            o2Var.f48315e.setStrokeMiter(h1Var.f48213j.floatValue());
        }
        if (M(h1Var, 512L)) {
            o2Var.f48311a.f48214k = h1Var.f48214k;
        }
        if (M(h1Var, 1024L)) {
            o2Var.f48311a.l = h1Var.l;
        }
        Typeface typefaceQ = null;
        if (M(h1Var, 1536L)) {
            h1 h1Var5 = o2Var.f48311a;
            Paint paint3 = o2Var.f48315e;
            k0[] k0VarArr = h1Var5.f48214k;
            if (k0VarArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = k0VarArr.length;
                int i13 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i13];
                float f11 = 0.0f;
                for (int i14 = 0; i14 < i13; i14++) {
                    float fA = h1Var5.f48214k[i14 % length].a(this);
                    fArr[i14] = fA;
                    f11 += fA;
                }
                if (f11 == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fA2 = h1Var5.l.a(this);
                    if (fA2 < 0.0f) {
                        fA2 = (fA2 % f11) + f11;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fA2));
                }
            }
        }
        if (M(h1Var, 16384L)) {
            float textSize = ((o2) this.f48335c).f48314d.getTextSize();
            o2Var.f48311a.f48218p = h1Var.f48218p;
            o2Var.f48314d.setTextSize(h1Var.f48218p.b(this, textSize));
            o2Var.f48315e.setTextSize(h1Var.f48218p.b(this, textSize));
        }
        if (M(h1Var, 8192L)) {
            o2Var.f48311a.f48217o = h1Var.f48217o;
        }
        if (M(h1Var, 32768L)) {
            if (h1Var.f48219q.intValue() == -1 && o2Var.f48311a.f48219q.intValue() > 100) {
                h1 h1Var6 = o2Var.f48311a;
                h1Var6.f48219q = Integer.valueOf(h1Var6.f48219q.intValue() - 100);
            } else if (h1Var.f48219q.intValue() != 1 || o2Var.f48311a.f48219q.intValue() >= 900) {
                o2Var.f48311a.f48219q = h1Var.f48219q;
            } else {
                h1 h1Var7 = o2Var.f48311a;
                h1Var7.f48219q = Integer.valueOf(h1Var7.f48219q.intValue() + 100);
            }
        }
        if (M(h1Var, 65536L)) {
            o2Var.f48311a.f48220r = h1Var.f48220r;
        }
        if (M(h1Var, 106496L)) {
            h1 h1Var8 = o2Var.f48311a;
            ArrayList arrayList = h1Var8.f48217o;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && (typefaceQ = q((String) it.next(), h1Var8.f48219q, h1Var8.f48220r)) == null) {
                }
            }
            if (typefaceQ == null) {
                typefaceQ = q("serif", h1Var8.f48219q, h1Var8.f48220r);
            }
            o2Var.f48314d.setTypeface(typefaceQ);
            o2Var.f48315e.setTypeface(typefaceQ);
        }
        if (M(h1Var, 131072L)) {
            h1 h1Var9 = o2Var.f48311a;
            Paint paint4 = o2Var.f48315e;
            Paint paint5 = o2Var.f48314d;
            h1Var9.f48221s = h1Var.f48221s;
            e1 e1Var = h1Var.f48221s;
            e1 e1Var2 = e1.LineThrough;
            paint5.setStrikeThruText(e1Var == e1Var2);
            e1 e1Var3 = h1Var.f48221s;
            e1 e1Var4 = e1.Underline;
            paint5.setUnderlineText(e1Var3 == e1Var4);
            paint4.setStrikeThruText(h1Var.f48221s == e1Var2);
            paint4.setUnderlineText(h1Var.f48221s == e1Var4);
        }
        if (M(h1Var, 68719476736L)) {
            o2Var.f48311a.f48222t = h1Var.f48222t;
        }
        if (M(h1Var, 262144L)) {
            o2Var.f48311a.f48223u = h1Var.f48223u;
        }
        if (M(h1Var, 524288L)) {
            o2Var.f48311a.f48224v = h1Var.f48224v;
        }
        if (M(h1Var, 2097152L)) {
            o2Var.f48311a.f48226x = h1Var.f48226x;
        }
        if (M(h1Var, 4194304L)) {
            o2Var.f48311a.f48227y = h1Var.f48227y;
        }
        if (M(h1Var, 8388608L)) {
            o2Var.f48311a.f48228z = h1Var.f48228z;
        }
        if (M(h1Var, 16777216L)) {
            o2Var.f48311a.A = h1Var.A;
        }
        if (M(h1Var, 33554432L)) {
            o2Var.f48311a.B = h1Var.B;
        }
        if (M(h1Var, 1048576L)) {
            o2Var.f48311a.f48225w = h1Var.f48225w;
        }
        if (M(h1Var, 268435456L)) {
            o2Var.f48311a.E = h1Var.E;
        }
        if (M(h1Var, 536870912L)) {
            o2Var.f48311a.F = h1Var.F;
        }
        if (M(h1Var, 1073741824L)) {
            o2Var.f48311a.G = h1Var.G;
        }
        if (M(h1Var, 67108864L)) {
            o2Var.f48311a.C = h1Var.C;
        }
        if (M(h1Var, 134217728L)) {
            o2Var.f48311a.D = h1Var.D;
        }
        if (M(h1Var, 8589934592L)) {
            o2Var.f48311a.J = h1Var.J;
        }
        if (M(h1Var, 17179869184L)) {
            o2Var.f48311a.K = h1Var.K;
        }
        if (M(h1Var, 137438953472L)) {
            o2Var.f48311a.M = h1Var.M;
        }
    }

    public void o(m1 m1Var, h4.a aVar) {
        Path pathK;
        if (((o2) this.f48335c).f48311a.E == null || (pathK = k(m1Var, aVar)) == null) {
            return;
        }
        ((Canvas) this.f48333a).clipPath(pathK);
    }

    public void o0(o2 o2Var, n1 n1Var) {
        boolean z11 = n1Var.f48324b == null;
        h1 h1Var = o2Var.f48311a;
        Float fValueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        h1Var.A = bool;
        if (!z11) {
            bool = Boolean.FALSE;
        }
        h1Var.f48224v = bool;
        h1Var.f48225w = null;
        h1Var.E = null;
        h1Var.f48215m = fValueOf;
        h1Var.C = a0.f48151b;
        h1Var.D = fValueOf;
        h1Var.G = null;
        h1Var.H = null;
        h1Var.I = fValueOf;
        h1Var.J = null;
        h1Var.K = fValueOf;
        h1Var.L = g1.None;
        h1 h1Var2 = n1Var.f48296e;
        if (h1Var2 != null) {
            n0(o2Var, h1Var2);
        }
        ArrayList arrayList = (ArrayList) ((i4) ((t5.a) this.f48334b).f39792c).f44863b;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (o oVar : (ArrayList) ((i4) ((t5.a) this.f48334b).f39792c).f44863b) {
                if (i3.v(oVar.f48304a, n1Var)) {
                    n0(o2Var, oVar.f48305b);
                }
            }
        }
        h1 h1Var3 = n1Var.f48297f;
        if (h1Var3 != null) {
            n0(o2Var, h1Var3);
        }
    }

    public void p(m1 m1Var) {
        q1 q1Var = ((o2) this.f48335c).f48311a.f48205b;
        if (q1Var instanceof p0) {
            t(true, m1Var.f48284h, (p0) q1Var);
        }
        q1 q1Var2 = ((o2) this.f48335c).f48311a.f48208e;
        if (q1Var2 instanceof p0) {
            t(false, m1Var.f48284h, (p0) q1Var2);
        }
    }

    public void p0() {
        int iR;
        h1 h1Var = ((o2) this.f48335c).f48311a;
        q1 q1Var = h1Var.J;
        if (q1Var instanceof a0) {
            iR = ((a0) q1Var).f48153a;
        } else if (!(q1Var instanceof b0)) {
            return;
        } else {
            iR = h1Var.f48216n.f48153a;
        }
        Float f11 = h1Var.K;
        if (f11 != null) {
            iR = r(f11.floatValue(), iR);
        }
        ((Canvas) this.f48333a).drawColor(iR);
    }

    public boolean q0() {
        Boolean bool = ((o2) this.f48335c).f48311a.B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public o30.j r0() {
        AtomicLong atomicLong;
        long j9;
        final int i11;
        ListenableFuture listenableFutureA;
        o30.b1 b1Var = (o30.b1) this.f48338f;
        if (b1Var.isDone()) {
            return b1Var;
        }
        do {
            atomicLong = (AtomicLong) this.f48334b;
            j9 = atomicLong.get();
            i11 = (int) (j9 >>> 32);
        } while (!atomicLong.compareAndSet(j9, (((long) (((int) j9) + 1)) & 4294967295L) | (((long) i11) << 32)));
        AtomicReference atomicReference = (AtomicReference) this.f48336d;
        o30.b1 b1Var2 = new o30.b1();
        ListenableFuture listenableFuture = (ListenableFuture) atomicReference.getAndSet(b1Var2);
        if (listenableFuture == null) {
            i5 i5VarA = ag.a(new androidx.constraintlayout.widget.z(this, i11, 2));
            o30.g0 g0Var = o30.g0.INSTANCE;
            o30.d1 d1Var = new o30.d1();
            d1Var.f31868i = new o30.c1(d1Var, i5VarA);
            g0Var.execute(d1Var);
            listenableFutureA = d1Var;
        } else {
            o30.b0 b0Var = new o30.b0() { // from class: com.google.android.gms.internal.measurement.xe
                @Override // o30.b0
                public final /* synthetic */ ListenableFuture apply(Object obj) {
                    return this.f12040a.v0(i11);
                }
            };
            int i12 = ag.f11261a;
            listenableFutureA = o30.o0.a(listenableFuture, Throwable.class, new zc(3, hf.a(), b0Var), (o30.a1) this.f48337e);
        }
        b1Var2.o(listenableFutureA);
        ze zeVar = new ze(this, i11);
        b1Var2.a(new ye(this, b1Var2, zeVar, 0), o30.g0.INSTANCE);
        return zeVar;
    }

    public void s0(String str) {
        la.e(ae.f11256a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        la.e(!ae.f11258c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.f48335c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c A[PHI: r6 r13 r15 r28
      0x009c: PHI (r6v14 float) = (r6v10 float), (r6v20 float) binds: [B:67:0x00ca, B:50:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r13v16 float) = (r13v14 float), (r13v30 float) binds: [B:67:0x00ca, B:50:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r15v15 float) = (r15v13 float), (r15v30 float) binds: [B:67:0x00ca, B:50:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r28v3 float) = (r28v2 float), (r28v5 float) binds: [B:67:0x00ca, B:50:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(boolean r26, h4.a r27, zw.p0 r28) {
        /*
            Method dump skipped, instruction units count: 979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.q2.t(boolean, h4.a, zw.p0):void");
    }

    public void t0(String str) {
        if (str.startsWith(ExpiryDateInput.SEPARATOR)) {
            str = str.substring(1);
        }
        Pattern pattern = ae.f11256a;
        this.f48337e = str;
    }

    public boolean u() {
        Boolean bool = ((o2) this.f48335c).f48311a.A;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public Uri u0() {
        String strN;
        String str = (String) this.f48334b;
        String str2 = (String) this.f48335c;
        Account account = xd.f12039a;
        Account account2 = (Account) this.f48336d;
        la.e(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        la.e(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        la.e(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (xd.f12039a.equals(account2)) {
            strN = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            strN = e0.f.n(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str3, ":", str4);
        }
        String str5 = (String) this.f48337e;
        StringBuilder sb2 = new StringBuilder(strN.length() + str2.length() + str.length() + 2 + 1 + 1 + String.valueOf(str5).length());
        j4.s.A(sb2, ExpiryDateInput.SEPARATOR, str, ExpiryDateInput.SEPARATOR, str2);
        return new Uri.Builder().scheme(AnalyticsPlatformParams.channel).authority((String) this.f48333a).path(e0.f.o(sb2, ExpiryDateInput.SEPARATOR, strN, ExpiryDateInput.SEPARATOR, str5)).encodedFragment(he.a(((k30.c) this.f48338f).e())).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(zw.m1 r23, android.graphics.Path r24) {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.q2.v(zw.m1, android.graphics.Path):void");
    }

    public o30.j v0(int i11) {
        Executor executor;
        AtomicLong atomicLong = (AtomicLong) this.f48334b;
        if (((int) (atomicLong.get() >>> 32)) > i11) {
            o30.p0 p0Var = o30.p0.f31903h;
            return p0Var != null ? p0Var : new o30.p0();
        }
        af afVar = new af(i11);
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.f48335c;
            af afVar2 = (af) atomicReference.get();
            if (afVar2 != null && afVar2.f11260h > i11) {
                o30.p0 p0Var2 = o30.p0.f31903h;
                return p0Var2 != null ? p0Var2 : new o30.p0();
            }
            while (!atomicReference.compareAndSet(afVar2, afVar)) {
                if (atomicReference.get() != afVar2) {
                    break;
                }
            }
            if (((int) (atomicLong.get() >>> 32)) > i11) {
                afVar.cancel(true);
                while (!atomicReference.compareAndSet(afVar, null) && atomicReference.get() == afVar) {
                }
                return afVar;
            }
            tc tcVar = (tc) this.f48333a;
            o30.a0 a0Var = (o30.a0) tcVar.f11889b;
            if (a0Var == null || (executor = (Executor) tcVar.f11890c) == null) {
                afVar.o((o30.b1) this.f48338f);
                return afVar;
            }
            i5 i5VarA = ag.a(a0Var);
            o30.d1 d1Var = new o30.d1();
            d1Var.f31868i = new o30.c1(d1Var, i5VarA);
            executor.execute(d1Var);
            afVar.o(d1Var);
            return afVar;
        }
    }

    public void w(Path path) {
        o2 o2Var = (o2) this.f48335c;
        g1 g1Var = o2Var.f48311a.L;
        g1 g1Var2 = g1.NonScalingStroke;
        Canvas canvas = (Canvas) this.f48333a;
        if (g1Var != g1Var2) {
            canvas.drawPath(path, o2Var.f48315e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = ((o2) this.f48335c).f48315e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, ((o2) this.f48335c).f48315e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public void x(a2 a2Var, ox.h hVar) {
        float f11;
        float f12;
        float fD;
        d1 d1VarF;
        if (u()) {
            Iterator it = a2Var.f48263i.iterator();
            boolean z11 = true;
            while (it.hasNext()) {
                p1 p1Var = (p1) it.next();
                if (p1Var instanceof d2) {
                    hVar.M(l0(((d2) p1Var).f48180c, z11, !it.hasNext()));
                } else if (hVar.u((a2) p1Var)) {
                    if (p1Var instanceof b2) {
                        k0();
                        b2 b2Var = (b2) p1Var;
                        o0((o2) this.f48335c, b2Var);
                        if (u() && q0()) {
                            n1 n1VarG = b2Var.f48323a.G(b2Var.f48166n);
                            if (n1VarG == null) {
                                y("TextPath reference '%s' not found", b2Var.f48166n);
                            } else {
                                q0 q0Var = (q0) n1VarG;
                                k2 k2Var = new k2(q0Var.f48331o);
                                Matrix matrix = q0Var.f48202n;
                                Path path = k2Var.f48267a;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                k0 k0Var = b2Var.f48167o;
                                f = k0Var != null ? k0Var.b(this, pathMeasure.getLength()) : 0.0f;
                                d1 d1VarF2 = F();
                                if (d1VarF2 != d1.Start) {
                                    float fM = m(b2Var);
                                    if (d1VarF2 == d1.Middle) {
                                        fM /= 2.0f;
                                    }
                                    f -= fM;
                                }
                                p(b2Var.f48168p);
                                boolean zX = X();
                                x(b2Var, new l2(this, path, f));
                                if (zX) {
                                    W(b2Var.f48284h);
                                }
                            }
                        }
                        j0();
                    } else if (p1Var instanceof x1) {
                        k0();
                        x1 x1Var = (x1) p1Var;
                        o0((o2) this.f48335c, x1Var);
                        if (u()) {
                            ArrayList arrayList = x1Var.f48172n;
                            boolean z12 = arrayList != null && arrayList.size() > 0;
                            boolean z13 = hVar instanceof m2;
                            if (z13) {
                                float fD2 = !z12 ? ((m2) hVar).f48285d : ((k0) x1Var.f48172n.get(0)).d(this);
                                ArrayList arrayList2 = x1Var.f48173o;
                                f12 = (arrayList2 == null || arrayList2.size() == 0) ? ((m2) hVar).f48286e : ((k0) x1Var.f48173o.get(0)).f(this);
                                ArrayList arrayList3 = x1Var.f48174p;
                                fD = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((k0) x1Var.f48174p.get(0)).d(this);
                                ArrayList arrayList4 = x1Var.f48175q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    f = ((k0) x1Var.f48175q.get(0)).f(this);
                                }
                                float f13 = fD2;
                                f11 = f;
                                f = f13;
                            } else {
                                f11 = 0.0f;
                                f12 = 0.0f;
                                fD = 0.0f;
                            }
                            if (z12 && (d1VarF = F()) != d1.Start) {
                                float fM2 = m(x1Var);
                                if (d1VarF == d1.Middle) {
                                    fM2 /= 2.0f;
                                }
                                f -= fM2;
                            }
                            p(x1Var.f48383r);
                            if (z13) {
                                m2 m2Var = (m2) hVar;
                                m2Var.f48285d = f + fD;
                                m2Var.f48286e = f12 + f11;
                            }
                            boolean zX2 = X();
                            x(x1Var, hVar);
                            if (zX2) {
                                W(x1Var.f48284h);
                            }
                        }
                        j0();
                    } else if (p1Var instanceof w1) {
                        k0();
                        w1 w1Var = (w1) p1Var;
                        o0((o2) this.f48335c, w1Var);
                        if (u()) {
                            p(w1Var.f48376o);
                            n1 n1VarG2 = p1Var.f48323a.G(w1Var.f48375n);
                            if (n1VarG2 == null || !(n1VarG2 instanceof a2)) {
                                y("Tref reference '%s' not found", w1Var.f48375n);
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                z((a2) n1VarG2, sb2);
                                if (sb2.length() > 0) {
                                    hVar.M(sb2.toString());
                                }
                            }
                        }
                        j0();
                    }
                }
                z11 = false;
            }
        }
    }

    public void z(a2 a2Var, StringBuilder sb2) {
        Iterator it = a2Var.f48263i.iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            p1 p1Var = (p1) it.next();
            if (p1Var instanceof a2) {
                z((a2) p1Var, sb2);
            } else if (p1Var instanceof d2) {
                sb2.append(l0(((d2) p1Var).f48180c, z11, !it.hasNext()));
            }
            z11 = false;
        }
    }

    public q2(Context context) {
        this.f48334b = "files";
        this.f48335c = "common";
        this.f48336d = ae.f11257b;
        this.f48337e = "";
        k30.d dVar = k30.h.f25901b;
        this.f48338f = new k30.c(4);
        la.e(context != null, "Context cannot be null", new Object[0]);
        this.f48333a = context.getPackageName();
    }
}
