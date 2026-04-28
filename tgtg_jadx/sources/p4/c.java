package p4;

import i4.l0;
import i4.x0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f34254b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i4.h f34260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Function1 f34261i;
    public float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f34264m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f34265n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f34268q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f34269r;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f34255c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f34256d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f34257e = i4.v.f23315h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f34258f = h0.f34349a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34259g = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.fragment.app.r f34262j = new androidx.fragment.app.r(this, 27);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f34263k = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f34266o = 1.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f34267p = 1.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f34270s = true;

    @Override // p4.d0
    public final void a(k4.d dVar) {
        if (this.f34270s) {
            float[] fArrA = this.f34254b;
            if (fArrA == null) {
                fArrA = l0.a();
                this.f34254b = fArrA;
            } else {
                l0.d(fArrA);
            }
            l0.h(fArrA, this.f34268q + this.f34264m, this.f34269r + this.f34265n);
            l0.e(this.l, fArrA);
            l0.f(fArrA, this.f34266o, this.f34267p);
            l0.h(fArrA, -this.f34264m, -this.f34265n);
            this.f34270s = false;
        }
        if (this.f34259g) {
            if (!this.f34258f.isEmpty()) {
                i4.h hVarA = this.f34260h;
                if (hVarA == null) {
                    hVarA = i4.l.a();
                    this.f34260h = hVarA;
                }
                c0.b(this.f34258f, hVarA);
            }
            this.f34259g = false;
        }
        j30.g gVarG0 = dVar.g0();
        long jO = gVarG0.o();
        gVarG0.i().e();
        try {
            j30.g gVar = (j30.g) ((jd.f) gVarG0.f24502b).f24983b;
            float[] fArr = this.f34254b;
            if (fArr != null) {
                gVar.i().h(fArr);
            }
            i4.h hVar = this.f34260h;
            if (!this.f34258f.isEmpty() && hVar != null) {
                gVar.i().c(hVar);
            }
            ArrayList arrayList = this.f34255c;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((d0) arrayList.get(i11)).a(dVar);
            }
        } finally {
            r8.k.y(gVarG0, jO);
        }
    }

    @Override // p4.d0
    public final Function1 b() {
        return this.f34261i;
    }

    @Override // p4.d0
    public final void d(androidx.fragment.app.r rVar) {
        this.f34261i = rVar;
    }

    public final void e(int i11, d0 d0Var) {
        ArrayList arrayList = this.f34255c;
        if (i11 < arrayList.size()) {
            arrayList.set(i11, d0Var);
        } else {
            arrayList.add(d0Var);
        }
        g(d0Var);
        d0Var.d(this.f34262j);
        c();
    }

    public final void f(long j9) {
        if (this.f34256d && j9 != 16) {
            long j11 = this.f34257e;
            if (j11 == 16) {
                this.f34257e = j9;
                return;
            }
            n0 n0Var = h0.f34349a;
            if (i4.v.h(j11) == i4.v.h(j9) && i4.v.g(j11) == i4.v.g(j9) && i4.v.e(j11) == i4.v.e(j9)) {
                return;
            }
            this.f34256d = false;
            this.f34257e = i4.v.f23315h;
        }
    }

    public final void g(d0 d0Var) {
        if (!(d0Var instanceof h)) {
            if (d0Var instanceof c) {
                c cVar = (c) d0Var;
                if (cVar.f34256d && this.f34256d) {
                    f(cVar.f34257e);
                    return;
                } else {
                    this.f34256d = false;
                    this.f34257e = i4.v.f23315h;
                    return;
                }
            }
            return;
        }
        h hVar = (h) d0Var;
        i4.r rVar = hVar.f34330b;
        if (this.f34256d && rVar != null) {
            if (rVar instanceof x0) {
                f(((x0) rVar).f23332a);
            } else {
                this.f34256d = false;
                this.f34257e = i4.v.f23315h;
            }
        }
        i4.r rVar2 = hVar.f34335g;
        if (this.f34256d && rVar2 != null) {
            if (rVar2 instanceof x0) {
                f(((x0) rVar2).f23332a);
            } else {
                this.f34256d = false;
                this.f34257e = i4.v.f23315h;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.f34263k);
        ArrayList arrayList = this.f34255c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            d0 d0Var = (d0) arrayList.get(i11);
            sb2.append("\t");
            sb2.append(d0Var.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
