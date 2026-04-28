package l4;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.fragment.app.r;
import b0.z;
import com.braze.h2;
import i0.w;
import i4.g0;
import i4.m0;
import i4.n0;
import i4.o0;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z5.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f27273a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Outline f27278f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f27282j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g0 f27283k;
    public i4.h l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i4.h f27284m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f27285n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k4.b f27286o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public w f27287p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f27288q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f27290s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f27291t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f27292u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f27293v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f27294w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RectF f27295x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z5.c f27274b = k4.c.f25941a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f27275c = m.Ltr;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function1 f27276d = a.f27270b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f27277e = new r(this, 25);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27279g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f27280h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f27281i = 9205357640488583168L;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ae.c f27289r = new ae.c();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        Intrinsics.areEqual(lowerCase, "robolectric");
    }

    public b(d dVar) {
        this.f27273a = dVar;
        dVar.C(false);
        this.f27291t = 0L;
        this.f27292u = 0L;
        this.f27293v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.f27279g) {
            boolean z11 = this.f27294w;
            Outline outline2 = null;
            d dVar = this.f27273a;
            if (z11 || dVar.K() > 0.0f) {
                i4.h hVar = this.l;
                if (hVar != null) {
                    RectF rectF = this.f27295x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f27295x = rectF;
                    }
                    boolean z12 = hVar instanceof i4.h;
                    if (!z12) {
                        h2.a("Unable to obtain android.graphics.Path");
                        return;
                    }
                    hVar.f23258a.computeBounds(rectF, false);
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 > 28 || hVar.f23258a.isConvex()) {
                        outline = this.f27278f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f27278f = outline;
                        }
                        if (i11 >= 30) {
                            f5.b.q(outline, hVar);
                        } else {
                            if (!z12) {
                                h2.a("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(hVar.f23258a);
                        }
                        this.f27285n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f27278f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f27285n = true;
                        outline = null;
                    }
                    this.l = hVar;
                    if (outline != null) {
                        outline.setAlpha(dVar.a());
                        outline2 = outline;
                    }
                    dVar.h(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.f27285n && this.f27294w) {
                        dVar.C(false);
                        dVar.k();
                    } else {
                        dVar.C(this.f27294w);
                    }
                } else {
                    dVar.C(this.f27294w);
                    Outline outline4 = this.f27278f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f27278f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jZ = z.z(this.f27292u);
                    long j9 = this.f27280h;
                    long j11 = this.f27281i;
                    if (j11 != 9205357640488583168L) {
                        jZ = j11;
                    }
                    int i12 = (int) (j9 >> 32);
                    int i13 = (int) (j9 & 4294967295L);
                    int i14 = (int) (jZ >> 32);
                    int i15 = (int) (jZ & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i12)), Math.round(Float.intBitsToFloat(i13)), Math.round(Float.intBitsToFloat(i14) + Float.intBitsToFloat(i12)), Math.round(Float.intBitsToFloat(i15) + Float.intBitsToFloat(i13)), this.f27282j);
                    outline5.setAlpha(dVar.a());
                    dVar.h(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i15)))) | (((long) Math.round(Float.intBitsToFloat(i14))) << 32));
                }
            } else {
                dVar.C(false);
                dVar.h(null, 0L);
            }
        }
        this.f27279g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r15 = this;
            boolean r0 = r15.f27290s
            if (r0 == 0) goto L75
            int r0 = r15.f27288q
            if (r0 != 0) goto L75
            ae.c r0 = r15.f27289r
            java.lang.Object r1 = r0.f1243b
            l4.b r1 = (l4.b) r1
            if (r1 == 0) goto L1c
            int r2 = r1.f27288q
            int r2 = r2 + (-1)
            r1.f27288q = r2
            r1.b()
            r1 = 0
            r0.f1243b = r1
        L1c:
            java.lang.Object r0 = r0.f1245d
            q1.u0 r0 = (q1.u0) r0
            if (r0 == 0) goto L70
            java.lang.Object[] r1 = r0.f35769b
            long[] r2 = r0.f35768a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L6d
            r4 = 0
            r5 = r4
        L2d:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L68
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L47:
            if (r10 >= r8) goto L66
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L62
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            l4.b r11 = (l4.b) r11
            int r12 = r11.f27288q
            int r12 = r12 + (-1)
            r11.f27288q = r12
            r11.b()
        L62:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L47
        L66:
            if (r8 != r9) goto L6d
        L68:
            if (r5 == r3) goto L6d
            int r5 = r5 + 1
            goto L2d
        L6d:
            r0.e()
        L70:
            l4.d r0 = r15.f27273a
            r0.k()
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.b.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(k4.d r15) {
        /*
            r14 = this;
            ae.c r0 = r14.f27289r
            java.lang.Object r1 = r0.f1243b
            l4.b r1 = (l4.b) r1
            r0.f1244c = r1
            java.lang.Object r1 = r0.f1245d
            q1.u0 r1 = (q1.u0) r1
            if (r1 == 0) goto L29
            boolean r2 = r1.c()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.f1246e
            q1.u0 r2 = (q1.u0) r2
            if (r2 != 0) goto L23
            q1.u0 r2 = q1.j1.f35777a
            q1.u0 r2 = new q1.u0
            r2.<init>()
            r0.f1246e = r2
        L23:
            r2.k(r1)
            r1.e()
        L29:
            r1 = 1
            r0.f1242a = r1
            kotlin.jvm.functions.Function1 r1 = r14.f27276d
            r1.invoke(r15)
            r15 = 0
            r0.f1242a = r15
            java.lang.Object r1 = r0.f1244c
            l4.b r1 = (l4.b) r1
            if (r1 == 0) goto L43
            int r2 = r1.f27288q
            int r2 = r2 + (-1)
            r1.f27288q = r2
            r1.b()
        L43:
            java.lang.Object r0 = r0.f1246e
            q1.u0 r0 = (q1.u0) r0
            if (r0 == 0) goto L9c
            boolean r1 = r0.c()
            if (r1 == 0) goto L9c
            java.lang.Object[] r1 = r0.f35769b
            long[] r2 = r0.f35768a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L99
            r4 = r15
        L59:
            r5 = r2[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L94
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r15
        L73:
            if (r9 >= r7) goto L92
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L8e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            l4.b r10 = (l4.b) r10
            int r11 = r10.f27288q
            int r11 = r11 + (-1)
            r10.f27288q = r11
            r10.b()
        L8e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L73
        L92:
            if (r7 != r8) goto L99
        L94:
            if (r4 == r3) goto L99
            int r4 = r4 + 1
            goto L59
        L99:
            r0.e()
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.b.c(k4.d):void");
    }

    public final g0 d() {
        g0 n0Var;
        g0 g0Var = this.f27283k;
        i4.h hVar = this.l;
        if (g0Var != null) {
            return g0Var;
        }
        if (hVar != null) {
            m0 m0Var = new m0(hVar);
            this.f27283k = m0Var;
            return m0Var;
        }
        long jZ = z.z(this.f27292u);
        long j9 = this.f27280h;
        long j11 = this.f27281i;
        if (j11 != 9205357640488583168L) {
            jZ = j11;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jZ >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jZ & 4294967295L)) + fIntBitsToFloat2;
        float f11 = this.f27282j;
        if (f11 > 0.0f) {
            n0Var = new o0(nx.d.k(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f11)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f11)))));
        } else {
            n0Var = new n0(new h4.c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f27283k = n0Var;
        return n0Var;
    }

    public final void e(float f11) {
        d dVar = this.f27273a;
        if (dVar.a() == f11) {
            return;
        }
        dVar.u(f11);
    }

    public final void f(long j9, long j11, float f11) {
        if (h4.b.b(this.f27280h, j9) && h4.e.a(this.f27281i, j11) && this.f27282j == f11 && this.l == null) {
            return;
        }
        this.f27283k = null;
        this.l = null;
        this.f27279g = true;
        this.f27285n = false;
        this.f27280h = j9;
        this.f27281i = j11;
        this.f27282j = f11;
        a();
    }
}
