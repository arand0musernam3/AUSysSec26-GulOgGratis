package f3;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b0.z;
import b2.m;
import b2.n;
import b2.o;
import b2.p;
import b4.s;
import b5.b0;
import b5.k;
import b5.r;
import c5.v0;
import i4.t;
import i4.v;
import i4.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import q1.o0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends s implements k, r, b0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b2.k f17235o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f17236p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f17237q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f17238r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Function0 f17239s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ae.c f17240t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f17241u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f17243w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public d f17245y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public e f17246z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f17242v = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o0 f17244x = new o0();

    public a(b2.k kVar, boolean z11, float f11, y yVar, Function0 function0) {
        this.f17235o = kVar;
        this.f17236p = z11;
        this.f17237q = f11;
        this.f17238r = yVar;
        this.f17239s = function0;
    }

    public final void L0(p pVar) {
        e eVar;
        if (!(pVar instanceof n)) {
            if (pVar instanceof o) {
                e eVar2 = this.f17246z;
                if (eVar2 != null) {
                    eVar2.d();
                    return;
                }
                return;
            }
            if (!(pVar instanceof m) || (eVar = this.f17246z) == null) {
                return;
            }
            eVar.d();
            return;
        }
        n nVar = (n) pVar;
        long j9 = this.f17242v;
        float f11 = this.f17241u;
        d dVar = this.f17245y;
        if (dVar == null) {
            Object obj = (View) b5.o.e(this, v0.f7394f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    i4.a.i(org.bouncycastle.jcajce.provider.asymmetric.a.c(obj, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"));
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    d dVar2 = new d(viewGroup.getContext());
                    viewGroup.addView(dVar2);
                    dVar = dVar2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i11);
                    if (childAt instanceof d) {
                        dVar = (d) childAt;
                        break;
                    }
                    i11++;
                }
            }
            this.f17245y = dVar;
        }
        ArrayList arrayList = dVar.f17253b;
        dn.k kVar = dVar.f17255d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) kVar.f15018b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) kVar.f15018b;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) kVar.f15019c;
        e eVar3 = (e) linkedHashMap.get(this);
        if (eVar3 == null) {
            ArrayList arrayList2 = dVar.f17254c;
            arrayList2.getClass();
            eVar3 = (e) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (eVar3 == null) {
                if (dVar.f17256e > d0.g(arrayList)) {
                    eVar3 = new e(dVar.getContext());
                    dVar.addView(eVar3);
                    arrayList.add(eVar3);
                } else {
                    eVar3 = (e) arrayList.get(dVar.f17256e);
                    a aVar = (a) linkedHashMap3.get(eVar3);
                    if (aVar != null) {
                        aVar.f17246z = null;
                        b5.o.h(aVar);
                        e eVar4 = (e) linkedHashMap2.get(aVar);
                        if (eVar4 != null) {
                        }
                        linkedHashMap2.remove(aVar);
                        eVar3.c();
                    }
                }
                int i12 = dVar.f17256e;
                if (i12 < dVar.f17252a - 1) {
                    dVar.f17256e = i12 + 1;
                } else {
                    dVar.f17256e = 0;
                }
            }
            linkedHashMap2.put(this, eVar3);
            linkedHashMap3.put(eVar3, this);
        }
        e eVar5 = eVar3;
        eVar5.b(nVar, this.f17236p, j9, j80.c.b(f11), this.f17238r.a(), ((b) this.f17239s.invoke()).f17250d, new cw.b(this, 12));
        this.f17246z = eVar5;
        b5.o.h(this);
    }

    @Override // b4.s
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // b5.b0
    public final void k(long j9) {
        float fC0;
        this.f17243w = true;
        z5.c cVar = b5.m.g(this).f5889z;
        this.f17242v = z.z(j9);
        float f11 = this.f17237q;
        if (Float.isNaN(f11)) {
            long j11 = this.f17242v;
            float f12 = c.f17251a;
            float fD = h4.e.d(j11);
            fC0 = h4.b.c((((long) Float.floatToRawIntBits(h4.e.b(j11))) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32)) / 2.0f;
            if (this.f17236p) {
                fC0 += cVar.c0(c.f17251a);
            }
        } else {
            fC0 = cVar.c0(f11);
        }
        this.f17241u = fC0;
        o0 o0Var = this.f17244x;
        Object[] objArr = o0Var.f35721a;
        int i11 = o0Var.f35722b;
        for (int i12 = 0; i12 < i11; i12++) {
            L0((p) objArr[i12]);
        }
        o0Var.j();
    }

    @Override // b5.r
    public final void n(b5.o0 o0Var) throws Throwable {
        k4.b bVar = o0Var.f5908a;
        o0Var.b();
        ae.c cVar = this.f17240t;
        if (cVar != null) {
            float f11 = this.f17241u;
            long jA = this.f17238r.a();
            float fFloatValue = ((Number) ((t1.b) cVar.f1244c).d()).floatValue();
            if (fFloatValue > 0.0f) {
                long jB = v.b(fFloatValue, jA);
                if (cVar.f1242a) {
                    float fD = h4.e.d(bVar.d());
                    float fB = h4.e.b(bVar.d());
                    j30.g gVar = bVar.f25938b;
                    long jO = gVar.o();
                    gVar.i().e();
                    try {
                        ((jd.f) gVar.f24502b).d(0.0f, 0.0f, fD, fB, 1);
                        k4.d.w0(o0Var, jB, f11, 0L, null, 124);
                    } finally {
                        r8.k.y(gVar, jO);
                    }
                } else {
                    k4.d.w0(o0Var, jB, f11, 0L, null, 124);
                }
            }
        }
        t tVarI = bVar.f25938b.i();
        e eVar = this.f17246z;
        if (eVar != null) {
            eVar.m963setRipplePropertiesbiQXAtU(this.f17242v, j80.c.b(this.f17241u), this.f17238r.a(), ((b) this.f17239s.invoke()).f17250d);
            eVar.draw(i4.d.a(tVarI));
        }
    }

    @Override // b4.s
    public final void onAttach() {
        f0.B(getCoroutineScope(), null, null, new d8.c(this, (x70.c) null, 20), 3);
    }

    @Override // b4.s
    public final void onDetach() throws Throwable {
        d dVar = this.f17245y;
        if (dVar != null) {
            this.f17246z = null;
            b5.o.h(this);
            dn.k kVar = dVar.f17255d;
            e eVar = (e) ((LinkedHashMap) kVar.f15018b).get(this);
            if (eVar != null) {
                eVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) kVar.f15018b;
                e eVar2 = (e) linkedHashMap.get(this);
                if (eVar2 != null) {
                }
                linkedHashMap.remove(this);
                dVar.f17254c.add(eVar);
            }
        }
    }
}
