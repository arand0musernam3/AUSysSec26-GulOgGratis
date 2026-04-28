package y0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import g1.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m0.b0;
import m0.k;
import m0.m1;
import m0.p;
import m0.q;
import m0.s0;
import m0.x;
import s0.d1;
import s0.i0;
import s0.i1;
import s0.l1;
import s0.n;
import s0.o2;
import s0.r2;
import s0.t0;
import s0.u0;
import s0.z;
import s0.z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0.d f44540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0.d f44541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r2 f44542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f44543d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w.e f44546g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z f44549j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m1 f44552n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g1.d f44553o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f44554p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b0 f44555q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ub.a f44557s;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f44544e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f44545f = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f44547h = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Range f44548i = n.f38401h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f44550k = new Object();
    public boolean l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u0 f44551m = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w2.z f44556r = new w2.z(2);

    public d(i0 i0Var, i0 i0Var2, s0.c cVar, s0.c cVar2, b0 b0Var, b0 b0Var2, w.e eVar, ub.a aVar, r2 r2Var) {
        this.f44549j = cVar.f38305c;
        this.f44540a = new s0.d(i0Var, cVar);
        if (i0Var2 == null || cVar2 == null) {
            this.f44541b = null;
        } else {
            this.f44541b = new s0.d(i0Var2, cVar2);
        }
        this.f44554p = b0Var;
        this.f44555q = b0Var2;
        this.f44546g = eVar;
        this.f44542c = r2Var;
        this.f44543d = w0.e.v(cVar, cVar2);
        this.f44557s = aVar;
    }

    public static void B(HashMap map) {
        HashSet hashSet;
        for (Map.Entry entry : map.entrySet()) {
            m1 m1Var = (m1) entry.getKey();
            Set set = (Set) entry.getValue();
            if (set != null) {
                m1Var.getClass();
                hashSet = new HashSet(set);
            } else {
                hashSet = null;
            }
            m1Var.f28559h = hashSet;
        }
    }

    public static ArrayList C(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((m1) it.next()).getClass();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw e0.f.e(it2);
            }
        }
        return arrayList2;
    }

    public static HashMap g(LinkedHashSet linkedHashSet, o0.c cVar) {
        HashMap map = new HashMap();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            m1 m1Var = (m1) it.next();
            map.put(m1Var, m1Var.f28559h);
            HashSet hashSet = null;
            LinkedHashSet linkedHashSet2 = cVar != null ? cVar.f31618a : null;
            if (linkedHashSet2 != null) {
                hashSet = new HashSet(linkedHashSet2);
            }
            m1Var.f28559h = hashSet;
        }
        return map;
    }

    public static Matrix t(Rect rect, Size size) {
        pd.g.i("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static HashMap w(ArrayList arrayList, r2 r2Var, r2 r2Var2, Range range) {
        o2 o2VarG;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m1 m1Var = (m1) it.next();
            if (m1Var instanceof g1.d) {
                g1.d dVar = (g1.d) m1Var;
                s0.m1 m1Var2 = new s0.m1(l1.e(new x(1).f28633a));
                d1.l(m1Var2);
                s0 s0Var = new s0(m1Var2);
                s0Var.f28593s = s0.f28591z;
                o2 o2VarG2 = s0Var.g(false, r2Var);
                if (o2VarG2 == null) {
                    o2VarG = null;
                } else {
                    i1 i1VarS = i1.s(o2VarG2);
                    i1VarS.y(i.f44570e1);
                    o2VarG = ((se.b) dVar.m(i1VarS)).f();
                }
            } else {
                o2VarG = m1Var.g(false, r2Var);
            }
            o2 o2VarG3 = m1Var.g(true, r2Var2);
            i1 i1VarS2 = o2VarG3 != null ? i1.s(o2VarG3) : i1.h();
            i1VarS2.v(o2.O0, 0);
            if (!n.f38401h.equals(range)) {
                i1VarS2.x(o2.P0, t0.HIGH_PRIORITY_REQUIRED, range);
                i1VarS2.v(o2.Q0, Boolean.TRUE);
            }
            o2 o2VarF = m1Var.m(i1VarS2).f();
            c cVar = new c();
            cVar.f44538a = o2VarG;
            cVar.f44539b = o2VarF;
            map.put(m1Var, cVar);
        }
        return map;
    }

    public final void A(ArrayList arrayList) {
        synchronized (this.f44550k) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((m1) it.next()).f28559h = null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f44544e);
            linkedHashSet.removeAll(arrayList);
            e(s(linkedHashSet, this.f44541b != null));
        }
    }

    @Override // m0.k
    public final q b() {
        throw null;
    }

    public final void c(Collection collection, o0.c cVar) {
        wd.a.p("CameraUseCaseAdapter", "addUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + cVar);
        synchronized (this.f44550k) {
            try {
                s0.d dVar = this.f44540a;
                z zVar = this.f44549j;
                dVar.i(zVar);
                s0.d dVar2 = this.f44541b;
                if (dVar2 != null) {
                    dVar2.i(zVar);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f44544e);
                linkedHashSet.addAll(collection);
                HashMap mapG = g(linkedHashSet, cVar);
                try {
                    e(s(linkedHashSet, this.f44541b != null));
                } catch (IllegalArgumentException e5) {
                    B(mapG);
                    throw new CameraUseCaseAdapter$CameraException(e5);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(a aVar) {
        Map map = aVar.f44535i.f44563a;
        ArrayList<m1> arrayList = aVar.f44528b;
        synchronized (this.f44550k) {
            try {
                for (m1 m1Var : arrayList) {
                    Rect rectI = this.f44540a.f38311b.f38278a.i();
                    n nVar = (n) map.get(m1Var);
                    nVar.getClass();
                    Matrix matrixT = t(rectI, nVar.f38402a);
                    m1Var.getClass();
                    m1Var.f28563m = new Matrix(matrixT);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        List list = this.f44547h;
        ArrayList arrayList2 = aVar.f44528b;
        LinkedHashSet linkedHashSet = aVar.f44527a;
        ArrayList arrayListC = C(arrayList2, list);
        ArrayList arrayList3 = new ArrayList(linkedHashSet);
        arrayList3.removeAll(arrayList2);
        ArrayList arrayListC2 = C(arrayList3, arrayListC);
        if (!arrayListC2.isEmpty()) {
            wd.a.I("CameraUseCaseAdapter", "Unused effects: " + arrayListC2);
        }
        Iterator it = aVar.f44531e.iterator();
        while (it.hasNext()) {
            ((m1) it.next()).A(this.f44540a);
        }
        this.f44540a.m(aVar.f44531e);
        if (this.f44541b != null) {
            for (m1 m1Var2 : aVar.f44531e) {
                s0.d dVar = this.f44541b;
                Objects.requireNonNull(dVar);
                m1Var2.A(dVar);
            }
            s0.d dVar2 = this.f44541b;
            Objects.requireNonNull(dVar2);
            dVar2.m(aVar.f44531e);
        }
        if (aVar.f44531e.isEmpty()) {
            for (m1 m1Var3 : aVar.f44530d) {
                Map map2 = aVar.f44535i.f44563a;
                if (map2.containsKey(m1Var3)) {
                    n nVar2 = (n) map2.get(m1Var3);
                    Objects.requireNonNull(nVar2);
                    u0 u0Var = nVar2.f38407f;
                    if (u0Var != null) {
                        z1 z1Var = m1Var3.f28566p;
                        l1 l1Var = z1Var.f38494g.f38439b;
                        Objects.requireNonNull(u0Var);
                        if (u0Var.c().size() == z1Var.f38494g.f38439b.c().size()) {
                            for (s0.g gVar : u0Var.c()) {
                                if (!l1Var.f38383a.containsKey(gVar) || !Objects.equals(l1Var.d(gVar), u0Var.d(gVar))) {
                                }
                            }
                        }
                        m1Var3.f28561j = m1Var3.w(u0Var);
                        if (this.l) {
                            this.f44540a.e(m1Var3);
                            s0.d dVar3 = this.f44541b;
                            if (dVar3 != null) {
                                dVar3.e(m1Var3);
                            }
                        }
                    }
                }
            }
        }
        for (m1 m1Var4 : aVar.f44529c) {
            c cVar = (c) aVar.f44534h.get(m1Var4);
            Objects.requireNonNull(cVar);
            s0.d dVar4 = this.f44541b;
            s0.d dVar5 = this.f44540a;
            o2 o2Var = cVar.f44538a;
            if (dVar4 != null) {
                m1Var4.b(dVar5, dVar4, o2Var, cVar.f44539b);
                n nVar3 = (n) aVar.f44535i.f44563a.get(m1Var4);
                nVar3.getClass();
                g gVar2 = aVar.f44536j;
                gVar2.getClass();
                m1Var4.C(nVar3, (n) gVar2.f44563a.get(m1Var4));
            } else {
                m1Var4.b(dVar5, null, o2Var, cVar.f44539b);
                n nVar4 = (n) aVar.f44535i.f44563a.get(m1Var4);
                nVar4.getClass();
                m1Var4.C(nVar4, null);
            }
        }
        if (this.l) {
            this.f44540a.l(aVar.f44529c);
            s0.d dVar6 = this.f44541b;
            if (dVar6 != null) {
                dVar6.l(aVar.f44529c);
            }
        }
        Iterator it2 = aVar.f44529c.iterator();
        while (it2.hasNext()) {
            ((m1) it2.next()).q();
        }
        this.f44544e.clear();
        this.f44544e.addAll(aVar.f44527a);
        this.f44545f.clear();
        this.f44545f.addAll(aVar.f44528b);
        this.f44552n = aVar.f44533g;
        this.f44553o = aVar.f44532f;
    }

    public final void r() {
        synchronized (this.f44550k) {
            try {
                if (!this.l) {
                    if (!this.f44545f.isEmpty()) {
                        this.f44540a.i(this.f44549j);
                        s0.d dVar = this.f44541b;
                        if (dVar != null) {
                            dVar.i(this.f44549j);
                        }
                    }
                    this.f44540a.l(this.f44545f);
                    s0.d dVar2 = this.f44541b;
                    if (dVar2 != null) {
                        dVar2.l(this.f44545f);
                    }
                    synchronized (this.f44550k) {
                        try {
                            u0 u0Var = this.f44551m;
                            if (u0Var != null) {
                                this.f44540a.f38312c.g(u0Var);
                            }
                        } finally {
                        }
                    }
                    Iterator it = this.f44545f.iterator();
                    while (it.hasNext()) {
                        ((m1) it.next()).q();
                    }
                    this.l = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x015d, code lost:
    
        if (r2 != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0163, code lost:
    
        return s(r25, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y0.a s(java.util.LinkedHashSet r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.d.s(java.util.LinkedHashSet, boolean):y0.a");
    }

    public final void u() {
        synchronized (this.f44550k) {
            try {
                if (this.l) {
                    this.f44540a.m(new ArrayList(this.f44545f));
                    s0.d dVar = this.f44541b;
                    if (dVar != null) {
                        dVar.m(new ArrayList(this.f44545f));
                    }
                    synchronized (this.f44550k) {
                        j jVar = this.f44540a.f38312c;
                        this.f44551m = jVar.f18110b.f();
                        jVar.i();
                    }
                    this.l = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int v() {
        int i11;
        synchronized (this.f44550k) {
            try {
                w.e eVar = this.f44546g;
                synchronized (eVar.f42668b) {
                    i11 = eVar.f42672f;
                }
                return i11 == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final HashSet x(LinkedHashSet linkedHashSet, boolean z11) {
        int i11;
        HashSet hashSet = new HashSet();
        synchronized (this.f44550k) {
            Iterator it = this.f44547h.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
            i11 = z11 ? 3 : 0;
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            m1 m1Var = (m1) it2.next();
            pd.g.i("Only support one level of sharing for now.", !(m1Var instanceof g1.d));
            Iterator it3 = m1Var.l().iterator();
            while (true) {
                if (it3.hasNext()) {
                    int iIntValue = ((Integer) it3.next()).intValue();
                    if ((i11 & iIntValue) == iIntValue) {
                        hashSet.add(m1Var);
                        break;
                    }
                }
            }
        }
        return hashSet;
    }

    public final List y() {
        ArrayList arrayList;
        synchronized (this.f44550k) {
            arrayList = new ArrayList(this.f44544e);
        }
        return arrayList;
    }

    public final void z() {
        synchronized (this.f44550k) {
            this.f44549j.p();
        }
    }
}
