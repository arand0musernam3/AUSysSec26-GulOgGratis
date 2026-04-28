package k6;

import f6.t;
import java.util.HashMap;
import org.bouncycastle.iana.AEADAlgorithm;
import z4.t0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f25993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f25995b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f25996b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f25998c0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public f f26002e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public f f26004f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public t0 f26006g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public n6.g f26008h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final HashMap f26010i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public HashMap f26012j0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f25997c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25999d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26001e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f26003f = -1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f26005g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f26007h = 0.5f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f26009i = 0.5f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f26011j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26013k = 0;
    public int l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f26014m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f26015n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f26016o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f26017p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f26018q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f26019r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f26020s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f26021t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f26022u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f26023v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f26024w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f26025x = Float.NaN;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f26026y = Float.NaN;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f26027z = Float.NaN;
    public float A = Float.NaN;
    public float B = Float.NaN;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public int I = 0;
    public Object J = null;
    public Object K = null;
    public Object L = null;
    public Object M = null;
    public Object N = null;
    public Object O = null;
    public Object P = null;
    public Object Q = null;
    public Object R = null;
    public Object S = null;
    public b T = null;
    public Object U = null;
    public Object V = null;
    public b W = null;
    public Object X = null;
    public Object Y = null;
    public Object Z = null;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Object f25994a0 = null;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public j f26000d0 = null;

    public b(t tVar) {
        String str = f.f26035h;
        f fVar = new f(str);
        String str2 = f.f26036i;
        fVar.f26045f = str2;
        this.f26002e0 = fVar;
        f fVar2 = new f(str);
        fVar2.f26045f = str2;
        this.f26004f0 = fVar2;
        this.f26010i0 = new HashMap();
        this.f26012j0 = new HashMap();
        this.f25995b = tVar;
    }

    @Override // k6.h
    public final void a(n6.g gVar) {
        if (gVar == null) {
            return;
        }
        this.f26008h0 = gVar;
        gVar.f30591i0 = this.f26006g0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l6.e] */
    @Override // k6.h
    public void apply() {
        if (this.f26008h0 == null) {
            return;
        }
        ?? r02 = this.f25997c;
        if (r02 != 0) {
            r02.apply();
        }
        this.f26002e0.a(this.f26008h0, 0);
        this.f26004f0.a(this.f26008h0, 1);
        this.J = j(this.J);
        this.K = j(this.K);
        this.L = j(this.L);
        this.M = j(this.M);
        this.N = j(this.N);
        this.O = j(this.O);
        this.P = j(this.P);
        this.Q = j(this.Q);
        this.R = j(this.R);
        this.S = j(this.S);
        this.U = j(this.U);
        this.V = j(this.V);
        this.X = j(this.X);
        this.Y = j(this.Y);
        this.Z = j(this.Z);
        d(this.f26008h0, this.J, j.LEFT_TO_LEFT);
        d(this.f26008h0, this.K, j.LEFT_TO_RIGHT);
        d(this.f26008h0, this.L, j.RIGHT_TO_LEFT);
        d(this.f26008h0, this.M, j.RIGHT_TO_RIGHT);
        d(this.f26008h0, this.N, j.START_TO_START);
        d(this.f26008h0, this.O, j.START_TO_END);
        d(this.f26008h0, this.P, j.END_TO_START);
        d(this.f26008h0, this.Q, j.END_TO_END);
        d(this.f26008h0, this.R, j.TOP_TO_TOP);
        d(this.f26008h0, this.S, j.TOP_TO_BOTTOM);
        d(this.f26008h0, this.T, j.TOP_TO_BASELINE);
        d(this.f26008h0, this.U, j.BOTTOM_TO_TOP);
        d(this.f26008h0, this.V, j.BOTTOM_TO_BOTTOM);
        d(this.f26008h0, this.W, j.BOTTOM_TO_BASELINE);
        d(this.f26008h0, this.X, j.BASELINE_TO_BASELINE);
        d(this.f26008h0, this.Y, j.BASELINE_TO_TOP);
        d(this.f26008h0, this.Z, j.BASELINE_TO_BOTTOM);
        d(this.f26008h0, this.f25994a0, j.CIRCULAR_CONSTRAINT);
        int i11 = this.f25999d;
        if (i11 != 0) {
            this.f26008h0.f30598m0 = i11;
        }
        int i12 = this.f26001e;
        if (i12 != 0) {
            this.f26008h0.f30600n0 = i12;
        }
        float f11 = this.f26003f;
        if (f11 != -1.0f) {
            this.f26008h0.f30602o0[0] = f11;
        }
        float f12 = this.f26005g;
        if (f12 != -1.0f) {
            this.f26008h0.f30602o0[1] = f12;
        }
        n6.g gVar = this.f26008h0;
        gVar.f30587g0 = this.f26007h;
        gVar.f30589h0 = this.f26009i;
        n nVar = gVar.f30592j;
        nVar.f26055f = this.f26025x;
        nVar.f26056g = this.f26026y;
        nVar.f26057h = this.f26027z;
        nVar.f26058i = this.A;
        nVar.f26059j = this.B;
        nVar.f26060k = this.C;
        nVar.l = this.D;
        nVar.f26061m = this.E;
        nVar.f26062n = this.G;
        nVar.f26063o = this.H;
        nVar.f26064p = this.F;
        int i13 = this.I;
        nVar.f26065q = i13;
        gVar.f30593j0 = i13;
        HashMap map = this.f26010i0;
        if (map != null) {
            for (String str : map.keySet()) {
                Integer num = (Integer) map.get(str);
                n nVar2 = this.f26008h0.f30592j;
                int iIntValue = num.intValue();
                HashMap map2 = nVar2.f26066r;
                if (map2.containsKey(str)) {
                    ((h6.a) map2.get(str)).f21496c = iIntValue;
                } else {
                    h6.a aVar = new h6.a();
                    aVar.f21497d = Float.NaN;
                    aVar.f21494a = str;
                    aVar.f21495b = 902;
                    aVar.f21496c = iIntValue;
                    map2.put(str, aVar);
                }
            }
        }
        HashMap map3 = this.f26012j0;
        if (map3 != null) {
            for (String str2 : map3.keySet()) {
                float fFloatValue = ((Float) this.f26012j0.get(str2)).floatValue();
                HashMap map4 = this.f26008h0.f30592j.f26066r;
                if (map4.containsKey(str2)) {
                    ((h6.a) map4.get(str2)).f21497d = fFloatValue;
                } else {
                    h6.a aVar2 = new h6.a();
                    aVar2.f21496c = Integer.MIN_VALUE;
                    aVar2.f21494a = str2;
                    aVar2.f21495b = 901;
                    aVar2.f21497d = fFloatValue;
                    map4.put(str2, aVar2);
                }
            }
        }
    }

    @Override // k6.h
    public n6.g b() {
        if (this.f26008h0 == null) {
            n6.g gVar = new n6.g(this.f26002e0.f26043d, this.f26004f0.f26043d);
            this.f26008h0 = gVar;
            gVar.f30591i0 = this.f26006g0;
        }
        return this.f26008h0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l6.e] */
    @Override // k6.h
    public final l6.e c() {
        return this.f25997c;
    }

    public final void d(n6.g gVar, Object obj, j jVar) {
        n6.g gVarB = obj instanceof h ? ((h) obj).b() : null;
        if (gVarB == null) {
            return;
        }
        int[] iArr = a.f25992a;
        int i11 = iArr[jVar.ordinal()];
        switch (iArr[jVar.ordinal()]) {
            case 1:
                n6.c cVar = n6.c.LEFT;
                gVar.k(cVar).b(gVarB.k(cVar), this.f26011j, this.f26017p, false);
                break;
            case 2:
                gVar.k(n6.c.LEFT).b(gVarB.k(n6.c.RIGHT), this.f26011j, this.f26017p, false);
                break;
            case 3:
                gVar.k(n6.c.RIGHT).b(gVarB.k(n6.c.LEFT), this.f26013k, this.f26018q, false);
                break;
            case 4:
                n6.c cVar2 = n6.c.RIGHT;
                gVar.k(cVar2).b(gVarB.k(cVar2), this.f26013k, this.f26018q, false);
                break;
            case 5:
                n6.c cVar3 = n6.c.LEFT;
                gVar.k(cVar3).b(gVarB.k(cVar3), this.l, this.f26019r, false);
                break;
            case 6:
                gVar.k(n6.c.LEFT).b(gVarB.k(n6.c.RIGHT), this.l, this.f26019r, false);
                break;
            case 7:
                gVar.k(n6.c.RIGHT).b(gVarB.k(n6.c.LEFT), this.f26014m, this.f26020s, false);
                break;
            case 8:
                n6.c cVar4 = n6.c.RIGHT;
                gVar.k(cVar4).b(gVarB.k(cVar4), this.f26014m, this.f26020s, false);
                break;
            case 9:
                n6.c cVar5 = n6.c.TOP;
                gVar.k(cVar5).b(gVarB.k(cVar5), this.f26015n, this.f26021t, false);
                break;
            case 10:
                gVar.k(n6.c.TOP).b(gVarB.k(n6.c.BOTTOM), this.f26015n, this.f26021t, false);
                break;
            case 11:
                gVar.x(n6.c.TOP, gVarB, n6.c.BASELINE, this.f26015n, this.f26021t);
                break;
            case 12:
                gVar.k(n6.c.BOTTOM).b(gVarB.k(n6.c.TOP), this.f26016o, this.f26022u, false);
                break;
            case 13:
                n6.c cVar6 = n6.c.BOTTOM;
                gVar.k(cVar6).b(gVarB.k(cVar6), this.f26016o, this.f26022u, false);
                break;
            case 14:
                gVar.x(n6.c.BOTTOM, gVarB, n6.c.BASELINE, this.f26016o, this.f26022u);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                gVar.x(n6.c.BASELINE, gVarB, n6.c.BOTTOM, this.f26023v, this.f26024w);
                break;
            case 16:
                gVar.x(n6.c.BASELINE, gVarB, n6.c.TOP, this.f26023v, this.f26024w);
                break;
            case 17:
                n6.c cVar7 = n6.c.BASELINE;
                gVar.x(cVar7, gVarB, cVar7, this.f26023v, this.f26024w);
                break;
            case 18:
                float f11 = this.f25996b0;
                int i12 = (int) this.f25998c0;
                n6.c cVar8 = n6.c.CENTER;
                gVar.x(cVar8, gVarB, cVar8, i12, 0);
                gVar.E = f11;
                break;
        }
    }

    public final void e(Object obj) {
        this.f26000d0 = j.BOTTOM_TO_BOTTOM;
        this.V = obj;
    }

    public final void f() {
        j jVar = this.f26000d0;
        if (jVar == null) {
            this.J = null;
            this.K = null;
            this.f26011j = 0;
            this.L = null;
            this.M = null;
            this.f26013k = 0;
            this.N = null;
            this.O = null;
            this.l = 0;
            this.P = null;
            this.Q = null;
            this.f26014m = 0;
            this.R = null;
            this.S = null;
            this.f26015n = 0;
            this.U = null;
            this.V = null;
            this.f26016o = 0;
            this.X = null;
            this.f25994a0 = null;
            this.f26007h = 0.5f;
            this.f26009i = 0.5f;
            this.f26017p = 0;
            this.f26018q = 0;
            this.f26019r = 0;
            this.f26020s = 0;
            this.f26021t = 0;
            this.f26022u = 0;
            return;
        }
        switch (a.f25992a[jVar.ordinal()]) {
            case 1:
            case 2:
                this.J = null;
                this.K = null;
                this.f26011j = 0;
                this.f26017p = 0;
                break;
            case 3:
            case 4:
                this.L = null;
                this.M = null;
                this.f26013k = 0;
                this.f26018q = 0;
                break;
            case 5:
            case 6:
                this.N = null;
                this.O = null;
                this.l = 0;
                this.f26019r = 0;
                break;
            case 7:
            case 8:
                this.P = null;
                this.Q = null;
                this.f26014m = 0;
                this.f26020s = 0;
                break;
            case 9:
            case 10:
            case 11:
                this.R = null;
                this.S = null;
                this.T = null;
                this.f26015n = 0;
                this.f26021t = 0;
                break;
            case 12:
            case 13:
            case 14:
                this.U = null;
                this.V = null;
                this.W = null;
                this.f26016o = 0;
                this.f26022u = 0;
                break;
            case 17:
                this.X = null;
                break;
            case 18:
                this.f25994a0 = null;
                break;
        }
    }

    public final void g() {
        if (this.N != null) {
            this.f26000d0 = j.START_TO_START;
        } else {
            this.f26000d0 = j.START_TO_END;
        }
        f();
        if (this.P != null) {
            this.f26000d0 = j.END_TO_START;
        } else {
            this.f26000d0 = j.END_TO_END;
        }
        f();
        if (this.J != null) {
            this.f26000d0 = j.LEFT_TO_LEFT;
        } else {
            this.f26000d0 = j.LEFT_TO_RIGHT;
        }
        f();
        if (this.L != null) {
            this.f26000d0 = j.RIGHT_TO_LEFT;
        } else {
            this.f26000d0 = j.RIGHT_TO_RIGHT;
        }
        f();
    }

    @Override // k6.h
    public final Object getKey() {
        return this.f25993a;
    }

    public final void h() {
        if (this.R != null) {
            this.f26000d0 = j.TOP_TO_TOP;
        } else {
            this.f26000d0 = j.TOP_TO_BOTTOM;
        }
        f();
        this.f26000d0 = j.BASELINE_TO_BASELINE;
        f();
        if (this.U != null) {
            this.f26000d0 = j.BOTTOM_TO_TOP;
        } else {
            this.f26000d0 = j.BOTTOM_TO_BOTTOM;
        }
        f();
    }

    public final void i(Object obj) {
        this.f26000d0 = j.END_TO_END;
        this.Q = obj;
    }

    public final Object j(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof b) ? (h) this.f25995b.f17431c.get(obj) : obj;
    }

    public b k(int i11) {
        j jVar = this.f26000d0;
        if (jVar == null) {
            this.f26011j = i11;
            this.f26013k = i11;
            this.l = i11;
            this.f26014m = i11;
            this.f26015n = i11;
            this.f26016o = i11;
            return this;
        }
        switch (a.f25992a[jVar.ordinal()]) {
            case 1:
            case 2:
                this.f26011j = i11;
                break;
            case 3:
            case 4:
                this.f26013k = i11;
                break;
            case 5:
            case 6:
                this.l = i11;
                break;
            case 7:
            case 8:
                this.f26014m = i11;
                break;
            case 9:
            case 10:
            case 11:
                this.f26015n = i11;
                break;
            case 12:
            case 13:
            case 14:
                this.f26016o = i11;
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
            case 16:
            case 17:
                this.f26023v = i11;
                break;
            case 18:
                this.f25998c0 = i11;
                break;
        }
        return this;
    }

    public b l(Float f11) {
        return k(this.f25995b.c(f11));
    }

    public final void m(int i11) {
        j jVar = this.f26000d0;
        if (jVar == null) {
            this.f26017p = i11;
            this.f26018q = i11;
            this.f26019r = i11;
            this.f26020s = i11;
            this.f26021t = i11;
            this.f26022u = i11;
            return;
        }
        switch (a.f25992a[jVar.ordinal()]) {
            case 1:
            case 2:
                this.f26017p = i11;
                break;
            case 3:
            case 4:
                this.f26018q = i11;
                break;
            case 5:
            case 6:
                this.f26019r = i11;
                break;
            case 7:
            case 8:
                this.f26020s = i11;
                break;
            case 9:
            case 10:
            case 11:
                this.f26021t = i11;
                break;
            case 12:
            case 13:
            case 14:
                this.f26022u = i11;
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
            case 16:
            case 17:
                this.f26024w = i11;
                break;
        }
    }

    public final void n(Float f11) {
        m(this.f25995b.c(f11));
    }

    public final void o(Object obj) {
        this.f26000d0 = j.START_TO_START;
        this.N = obj;
    }

    public final void p(Object obj) {
        this.f26000d0 = j.TOP_TO_TOP;
        this.R = obj;
    }
}
