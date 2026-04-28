package n3;

import java.util.ArrayList;
import m3.l2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3.s f30439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f30440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30441c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30445g;
    public int l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b5.y f30442d = new b5.y();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f30443e = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f30446h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f30447i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f30448j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30449k = -1;

    public b(m3.s sVar, a aVar) {
        this.f30439a = sVar;
        this.f30440b = aVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.f30446h;
        if (arrayList.isEmpty()) {
            this.f30445g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i11 = this.f30445g;
        if (i11 > 0) {
            m0 m0Var = this.f30440b.f30437h;
            m0Var.K(i0.f30465c);
            m0Var.f30475j[m0Var.f30476k - m0Var.f30473h[m0Var.f30474i - 1].f30469a] = i11;
            this.f30445g = 0;
        }
        ArrayList arrayList = this.f30446h;
        if (arrayList.isEmpty()) {
            return;
        }
        a aVar = this.f30440b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i12 = 0; i12 < size; i12++) {
            objArr[i12] = arrayList.get(i12);
        }
        aVar.getClass();
        if (size != 0) {
            m0 m0Var2 = aVar.f30437h;
            m0Var2.K(k.f30468c);
            na0.a.t0(m0Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i11 = this.l;
        if (i11 > 0) {
            int i12 = this.f30447i;
            if (i12 >= 0) {
                b();
                m0 m0Var = this.f30440b.f30437h;
                m0Var.K(a0.f30438c);
                int i13 = m0Var.f30476k - m0Var.f30473h[m0Var.f30474i - 1].f30469a;
                int[] iArr = m0Var.f30475j;
                iArr[i13] = i12;
                iArr[i13 + 1] = i11;
                this.f30447i = -1;
            } else {
                int i14 = this.f30449k;
                int i15 = this.f30448j;
                b();
                m0 m0Var2 = this.f30440b.f30437h;
                m0Var2.K(v.f30490c);
                int i16 = m0Var2.f30476k - m0Var2.f30473h[m0Var2.f30474i - 1].f30469a;
                int[] iArr2 = m0Var2.f30475j;
                iArr2[i16 + 1] = i14;
                iArr2[i16] = i15;
                iArr2[i16 + 2] = i11;
                this.f30448j = -1;
                this.f30449k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z11) {
        l2 l2Var = this.f30439a.G;
        int i11 = z11 ? l2Var.f29327i : l2Var.f29325g;
        int i12 = i11 - this.f30444f;
        if (i12 < 0) {
            m3.v.a("Tried to seek backward");
        }
        if (i12 > 0) {
            m0 m0Var = this.f30440b.f30437h;
            m0Var.K(d.f30454c);
            m0Var.f30475j[m0Var.f30476k - m0Var.f30473h[m0Var.f30474i - 1].f30469a] = i12;
            this.f30444f = i11;
        }
    }

    public final void e() {
        l2 l2Var = this.f30439a.G;
        if (l2Var.f29321c > 0) {
            int i11 = l2Var.f29327i;
            b5.y yVar = this.f30442d;
            if (yVar.a(-2) != i11) {
                if (!this.f30441c && this.f30443e) {
                    d(false);
                    this.f30440b.f30437h.K(q.f30481c);
                    this.f30441c = true;
                }
                if (i11 > 0) {
                    m3.a aVarA = l2Var.a(i11);
                    yVar.c(i11);
                    d(false);
                    m0 m0Var = this.f30440b.f30437h;
                    m0Var.K(p.f30480c);
                    na0.a.t0(m0Var, 0, aVarA);
                    this.f30441c = true;
                }
            }
        }
    }

    public final void f(int i11, int i12) {
        if (i12 > 0) {
            if (!(i11 >= 0)) {
                m3.v.a("Invalid remove index " + i11);
            }
            if (this.f30447i == i11) {
                this.l += i12;
                return;
            }
            c();
            this.f30447i = i11;
            this.l = i12;
        }
    }
}
