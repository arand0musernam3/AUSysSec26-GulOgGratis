package g1;

import a40.q;
import al.u;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Size;
import androidx.camera.core.ProcessingException;
import androidx.lifecycle.n1;
import c1.n;
import c1.p;
import c1.r;
import c50.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m0.b0;
import m0.c0;
import m0.k1;
import m0.m1;
import s0.c1;
import s0.c2;
import s0.d1;
import s0.g0;
import s0.i0;
import s0.i1;
import s0.l1;
import s0.n2;
import s0.o2;
import s0.r0;
import s0.r2;
import s0.u0;
import s0.u1;
import s0.v1;
import s0.z1;
import v0.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends m1 {
    public n A;
    public u1 B;
    public u1 C;
    public v1 D;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f18081r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h f18082s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b0 f18083t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b0 f18084u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a8.h f18085v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public n1 f18086w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public n f18087x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public n f18088y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public n f18089z;

    public d(i0 i0Var, i0 i0Var2, b0 b0Var, b0 b0Var2, HashSet hashSet, r2 r2Var) {
        super(H(hashSet));
        this.f18081r = H(hashSet);
        this.f18083t = b0Var;
        this.f18084u = b0Var2;
        this.f18082s = new h(i0Var, i0Var2, hashSet, r2Var, new e.b(this, 7));
        HashSet hashSet2 = ((m1) hashSet.iterator().next()).f28559h;
        this.f28559h = hashSet2 != null ? new HashSet(hashSet2) : null;
    }

    public static e H(HashSet hashSet) {
        i1 i1VarH = i1.h();
        new se.b(i1VarH);
        i1VarH.v(c1.f38307w0, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            m1 m1Var = (m1) it.next();
            if (m1Var.f28560i.g(o2.U0)) {
                arrayList.add(m1Var.f28560i.n());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        i1VarH.v(e.f18090b, arrayList);
        i1VarH.v(d1.C0, 2);
        i1VarH.v(o2.Z0, c2.PREVIEW_VIDEO_STILL);
        return new e(l1.e(i1VarH));
    }

    public final void D() {
        v1 v1Var = this.D;
        if (v1Var != null) {
            v1Var.b();
            this.D = null;
        }
        n nVar = this.f18087x;
        if (nVar != null) {
            nVar.b();
            this.f18087x = null;
        }
        n nVar2 = this.f18088y;
        if (nVar2 != null) {
            nVar2.b();
            this.f18088y = null;
        }
        n nVar3 = this.f18089z;
        if (nVar3 != null) {
            nVar3.b();
            this.f18089z = null;
        }
        n nVar4 = this.A;
        if (nVar4 != null) {
            nVar4.b();
            this.A = null;
        }
        a8.h hVar = this.f18085v;
        if (hVar != null) {
            ((c1.e) hVar.f973b).a();
            a.a.K(new u(hVar, 16));
            this.f18085v = null;
        }
        n1 n1Var = this.f18086w;
        if (n1Var != null) {
            ((p) n1Var.f3499a).a();
            a.a.K(new d1.e(n1Var, 0));
            this.f18086w = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List E(String str, String str2, o2 o2Var, s0.n nVar, s0.n nVar2) {
        boolean z11;
        c0 c0Var = nVar.f38404c;
        a.a.t();
        h hVar = this.f18082s;
        if (nVar2 == null) {
            n nVarF = F(str, str2, o2Var, nVar, null);
            i0 i0VarD = d();
            Objects.requireNonNull(i0VarD);
            a8.h hVar2 = new a8.h(i0VarD, new c1.e(c0Var));
            this.f18085v = hVar2;
            boolean z12 = this.l != null;
            int iW = ((d1) this.f28560i).w(0);
            hVar.getClass();
            HashMap map = new HashMap();
            for (m1 m1Var : hVar.f18097a) {
                b bVar = hVar.f18107k;
                i0 i0Var = hVar.f18102f;
                h hVar3 = hVar;
                boolean z13 = z12;
                e1.c cVarS = hVar3.s(m1Var, bVar, i0Var, nVarF, iW, z13);
                int iN = hVar3.f18102f.b().n(((d1) m1Var.f28560i).w(0));
                f fVar = (f) hVar3.f18099c.get(m1Var);
                Objects.requireNonNull(fVar);
                fVar.f18093b.f18114c = iN;
                map.put(m1Var, cVarS);
                hVar = hVar3;
                z12 = z13;
            }
            h hVar4 = hVar;
            boolean z14 = z12;
            ArrayList arrayList = new ArrayList(map.values());
            if (nVarF == null) {
                w.l("Null surfaceEdge");
                return null;
            }
            c1.e eVar = (c1.e) hVar2.f973b;
            a.a.t();
            wd.a.p("SurfaceProcessorNode", "[StreamSharing] SurfaceProcessorNode Transform (Processor=" + eVar + "\n   inputEdge = " + nVarF);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                wd.a.p("SurfaceProcessorNode", "   outputConfig = " + ((e1.c) it.next()));
            }
            hVar2.f975d = new r();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                e1.c cVar = (e1.c) it2.next();
                r rVar = (r) hVar2.f975d;
                Rect rect = cVar.f15440d;
                int i11 = cVar.f15442f;
                boolean z15 = cVar.f15443g;
                Iterator it3 = it2;
                Matrix matrix = new Matrix(nVarF.f6897b);
                RectF rectF = new RectF(rect);
                Size size = cVar.f15441e;
                HashMap map2 = map;
                matrix.postConcat(o.a(rectF, o.i(size), i11, z15));
                pd.g.j(o.e(o.h(i11, o.g(rect)), size));
                Rect rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
                g40.b bVarB = nVarF.f6902g.b();
                bVarB.f20000a = size;
                rVar.put(cVar, new n(cVar.f15438b, cVar.f15439c, bVarB.d(), matrix, false, rect2, nVarF.f6904i - i11, -1, nVarF.f6900e != z15));
                it2 = it3;
                map = map2;
            }
            HashMap map3 = map;
            try {
                eVar.b(nVarF.c((i0) hVar2.f974c, true));
            } catch (ProcessingException e5) {
                wd.a.s("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e5);
            }
            for (Map.Entry entry : ((r) hVar2.f975d).entrySet()) {
                hVar2.j(nVarF, entry);
                n nVar3 = (n) entry.getValue();
                q qVar = new q(hVar2, nVarF, entry, 8);
                nVar3.getClass();
                a.a.t();
                nVar3.a();
                nVar3.f6907m.add(qVar);
            }
            nVarF.f6909o.add(new c1.q((r) hVar2.f975d, 0));
            r rVar2 = (r) hVar2.f975d;
            HashMap map4 = new HashMap();
            for (Map.Entry entry2 : map3.entrySet()) {
                map4.put((m1) entry2.getKey(), (n) rVar2.get(entry2.getValue()));
            }
            hVar4.y(map4, hVar4.v(nVarF, z14));
            Object[] objArr = {this.B.c()};
            ArrayList arrayList2 = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList2.add(obj);
            return Collections.unmodifiableList(arrayList2);
        }
        n nVarF2 = F(str, str2, o2Var, nVar, nVar2);
        Matrix matrix2 = this.f28563m;
        i0 i0VarJ = j();
        Objects.requireNonNull(i0VarJ);
        boolean zO = i0VarJ.o();
        Size size2 = nVar2.f38402a;
        Rect rect3 = this.l;
        if (rect3 != null) {
            z11 = false;
        } else {
            z11 = false;
            rect3 = new Rect(0, 0, size2.getWidth(), size2.getHeight());
        }
        i0 i0VarJ2 = j();
        Objects.requireNonNull(i0VarJ2);
        int i12 = i(i0VarJ2, z11);
        i0 i0VarJ3 = j();
        Objects.requireNonNull(i0VarJ3);
        n nVar4 = new n(3, 34, nVar2, matrix2, zO, rect3, i12, -1, n(i0VarJ3));
        this.f18088y = nVar4;
        Objects.requireNonNull(j());
        this.A = nVar4;
        u1 u1VarG = G(this.f18088y, o2Var, nVar2);
        this.C = u1VarG;
        v1 v1Var = this.D;
        if (v1Var != null) {
            v1Var.b();
        }
        v1 v1Var2 = new v1(new c(this, str, str2, o2Var, nVar, nVar2));
        this.D = v1Var2;
        u1VarG.f38451f = v1Var2;
        n nVar5 = this.A;
        i0 i0VarD2 = d();
        i0 i0VarJ4 = j();
        d1.d dVar = new d1.d(c0Var, this.f18083t, this.f18084u);
        n1 n1Var = new n1();
        n1Var.f3500b = i0VarD2;
        n1Var.f3501c = i0VarJ4;
        n1Var.f3499a = dVar;
        this.f18086w = n1Var;
        boolean z16 = this.l != null;
        int iW2 = ((d1) this.f28560i).w(0);
        hVar.getClass();
        HashMap map5 = new HashMap();
        h hVar5 = hVar;
        for (m1 m1Var2 : hVar5.f18097a) {
            e1.c cVarS2 = hVar5.s(m1Var2, hVar5.f18107k, hVar5.f18102f, nVarF2, iW2, z16);
            b bVar2 = hVar5.l;
            Objects.requireNonNull(bVar2);
            i0 i0Var2 = hVar5.f18103g;
            Objects.requireNonNull(i0Var2);
            n nVar6 = nVar5;
            e1.c cVarS3 = hVar5.s(m1Var2, bVar2, i0Var2, nVar6, iW2, z16);
            int iN2 = hVar5.f18102f.b().n(((d1) m1Var2.f28560i).w(0));
            f fVar2 = (f) hVar5.f18099c.get(m1Var2);
            Objects.requireNonNull(fVar2);
            fVar2.f18093b.f18114c = iN2;
            map5.put(m1Var2, new d1.a(cVarS2, cVarS3));
            nVar5 = nVar6;
        }
        n nVar7 = nVar5;
        n1 n1Var2 = this.f18086w;
        ArrayList arrayList3 = new ArrayList(map5.values());
        d1.b bVar3 = new d1.b(nVarF2, nVar7, arrayList3);
        n1Var2.getClass();
        a.a.t();
        StringBuilder sb2 = new StringBuilder("[StreamSharing] DualSurfaceProcessorNode Transform Processor = ");
        p pVar = (p) n1Var2.f3499a;
        sb2.append(pVar);
        sb2.append("\n   primary input = ");
        sb2.append(nVarF2);
        sb2.append("\n   secondary input = ");
        sb2.append(nVar7);
        wd.a.p("DualSurfaceProcessorNode", sb2.toString());
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            wd.a.p("SurfaceProcessorNode", "   outputConfig = " + ((d1.a) it4.next()));
        }
        n1Var2.f3503e = bVar3;
        n1Var2.f3502d = new r();
        d1.b bVar4 = (d1.b) n1Var2.f3503e;
        n nVar8 = bVar4.f13670a;
        n nVar9 = bVar4.f13671b;
        Iterator it5 = bVar4.f13672c.iterator();
        while (it5.hasNext()) {
            d1.a aVar = (d1.a) it5.next();
            r rVar3 = (r) n1Var2.f3502d;
            e1.c cVar2 = aVar.f13668a;
            Rect rect4 = cVar2.f15440d;
            Iterator it6 = it5;
            int i13 = cVar2.f15442f;
            HashMap map6 = map5;
            boolean z17 = cVar2.f15443g;
            h hVar6 = hVar5;
            Matrix matrix3 = new Matrix(nVar8.f6897b);
            RectF rectF2 = new RectF(rect4);
            Size size3 = cVar2.f15441e;
            boolean z18 = z16;
            matrix3.postConcat(o.a(rectF2, o.i(size3), i13, z17));
            pd.g.j(o.e(o.h(i13, o.g(rect4)), size3));
            Rect rect5 = new Rect(0, 0, size3.getWidth(), size3.getHeight());
            g40.b bVarB2 = nVar8.f6902g.b();
            bVarB2.f20000a = size3;
            rVar3.put(aVar, new n(cVar2.f15438b, cVar2.f15439c, bVarB2.d(), matrix3, false, rect5, nVar8.f6904i - i13, -1, nVar8.f6900e != z17));
            it5 = it6;
            map5 = map6;
            hVar5 = hVar6;
            z16 = z18;
        }
        h hVar7 = hVar5;
        boolean z19 = z16;
        HashMap map7 = map5;
        try {
            pVar.b(nVar8.c((i0) n1Var2.f3500b, true));
        } catch (ProcessingException e11) {
            wd.a.s("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e11);
        }
        try {
            pVar.b(nVar9.c((i0) n1Var2.f3501c, false));
        } catch (ProcessingException e12) {
            wd.a.s("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e12);
        }
        i0 i0Var3 = (i0) n1Var2.f3500b;
        i0 i0Var4 = (i0) n1Var2.f3501c;
        for (Map.Entry entry3 : ((r) n1Var2.f3502d).entrySet()) {
            n1 n1Var3 = n1Var2;
            n nVar10 = nVar8;
            n nVar11 = nVar9;
            n1Var3.k(i0Var3, i0Var4, nVar10, nVar11, entry3);
            n nVar12 = (n) entry3.getValue();
            i0 i0Var5 = i0Var4;
            i0 i0Var6 = i0Var3;
            d1.f fVar3 = new d1.f(n1Var3, i0Var6, i0Var5, nVar10, nVar11, entry3, 0);
            n1Var2 = n1Var3;
            i0Var3 = i0Var6;
            i0Var4 = i0Var5;
            nVar12.getClass();
            a.a.t();
            nVar12.a();
            nVar12.f6907m.add(fVar3);
            nVar8 = nVar10;
            nVar9 = nVar11;
        }
        r rVar4 = (r) n1Var2.f3502d;
        HashMap map8 = new HashMap();
        for (Map.Entry entry4 : map7.entrySet()) {
            map8.put((m1) entry4.getKey(), (n) rVar4.get(entry4.getValue()));
        }
        hVar7.y(map8, hVar7.v(nVarF2, z19));
        Object[] objArr2 = {this.B.c(), this.C.c()};
        ArrayList arrayList4 = new ArrayList(2);
        for (int i14 = 0; i14 < 2; i14++) {
            Object obj2 = objArr2[i14];
            Objects.requireNonNull(obj2);
            arrayList4.add(obj2);
        }
        return Collections.unmodifiableList(arrayList4);
    }

    public final n F(String str, String str2, o2 o2Var, s0.n nVar, s0.n nVar2) {
        Matrix matrix = this.f28563m;
        i0 i0VarD = d();
        Objects.requireNonNull(i0VarD);
        boolean zO = i0VarD.o();
        Size size = nVar.f38402a;
        Rect rect = this.l;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        i0 i0VarD2 = d();
        Objects.requireNonNull(i0VarD2);
        int i11 = i(i0VarD2, false);
        i0 i0VarD3 = d();
        Objects.requireNonNull(i0VarD3);
        n nVar3 = new n(3, 34, nVar, matrix, zO, rect, i11, -1, n(i0VarD3));
        this.f18087x = nVar3;
        Objects.requireNonNull(d());
        this.f18089z = nVar3;
        u1 u1VarG = G(this.f18087x, o2Var, nVar);
        this.B = u1VarG;
        v1 v1Var = this.D;
        if (v1Var != null) {
            v1Var.b();
        }
        v1 v1Var2 = new v1(new c(this, str, str2, o2Var, nVar, nVar2));
        this.D = v1Var2;
        u1VarG.f38451f = v1Var2;
        return this.f18089z;
    }

    public final u1 G(n nVar, o2 o2Var, s0.n nVar2) {
        u1 u1VarD = u1.d(o2Var, nVar2.f38402a);
        i0.w wVar = u1VarD.f38447b;
        h hVar = this.f18082s;
        Iterator it = hVar.f18097a.iterator();
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((z1) ((m1) it.next()).f28560i.d(o2.J0)).f38494g.f38440c;
            List list = z1.f38487j;
            if (list.indexOf(Integer.valueOf(i11)) < list.indexOf(Integer.valueOf(i12))) {
                i11 = i12;
            }
        }
        if (i11 != -1) {
            wVar.f22745b = i11;
        }
        Size size = nVar2.f38402a;
        Iterator it2 = hVar.f18097a.iterator();
        while (it2.hasNext()) {
            z1 z1VarC = u1.d(((m1) it2.next()).f28560i, size).c();
            r0 r0Var = z1VarC.f38494g;
            wVar.b(r0Var.f38441d);
            List<s0.p> list2 = z1VarC.f38492e;
            ArrayList arrayList = u1VarD.f38450e;
            for (s0.p pVar : list2) {
                wVar.c(pVar);
                if (!arrayList.contains(pVar)) {
                    arrayList.add(pVar);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : z1VarC.f38491d) {
                ArrayList arrayList2 = u1VarD.f38449d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : z1VarC.f38490c) {
                ArrayList arrayList3 = u1VarD.f38448c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            wVar.e(r0Var.f38439b);
        }
        nVar.getClass();
        a.a.t();
        nVar.a();
        pd.g.n("Consumer can only be linked once.", !nVar.f6905j);
        nVar.f6905j = true;
        u1VarD.b(nVar.l, nVar2.f38404c, -1);
        wVar.c(hVar.f18104h);
        u0 u0Var = nVar2.f38407f;
        if (u0Var != null) {
            wVar.e(u0Var);
        }
        u1VarD.f38453h = nVar2.f38405d;
        a(u1VarD, nVar2);
        return u1VarD;
    }

    @Override // m0.m1
    public final o2 g(boolean z11, r2 r2Var) {
        e eVar = this.f18081r;
        u0 u0VarA = r2Var.a(eVar.n(), 1);
        if (z11) {
            u0VarA = u0.u(u0VarA, eVar.f18091a);
        }
        if (u0VarA == null) {
            return null;
        }
        return ((se.b) m(u0VarA)).f();
    }

    @Override // m0.m1
    public final Set k(g0 g0Var) {
        HashSet hashSet = this.f18082s.f18097a;
        HashSet hashSet2 = null;
        if (hashSet.isEmpty()) {
            return null;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Set setK = ((m1) it.next()).k(g0Var);
            if (setK != null) {
                if (hashSet2 == null) {
                    hashSet2 = new HashSet(setK);
                } else {
                    hashSet2.retainAll(setK);
                }
            }
        }
        return hashSet2;
    }

    @Override // m0.m1
    public final Set l() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // m0.m1
    public final n2 m(u0 u0Var) {
        return new se.b(i1.s(u0Var));
    }

    @Override // m0.m1
    public final void r() {
        h hVar = this.f18082s;
        for (m1 m1Var : hVar.f18097a) {
            f fVar = (f) hVar.f18099c.get(m1Var);
            Objects.requireNonNull(fVar);
            m1Var.b(fVar, null, null, m1Var.g(true, hVar.f18101e));
        }
    }

    @Override // m0.m1
    public final void s() {
        Iterator it = this.f18082s.f18097a.iterator();
        while (it.hasNext()) {
            ((m1) it.next()).s();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0120, code lost:
    
        if (r12 != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ee  */
    @Override // m0.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s0.o2 t(s0.g0 r18, s0.n2 r19) {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.d.t(s0.g0, s0.n2):s0.o2");
    }

    @Override // m0.m1
    public final void u() {
        this.f28552a = true;
        Iterator it = this.f18082s.f18097a.iterator();
        while (it.hasNext()) {
            ((m1) it.next()).u();
        }
    }

    @Override // m0.m1
    public final void v() {
        this.f28552a = false;
        Iterator it = this.f18082s.f18097a.iterator();
        while (it.hasNext()) {
            ((m1) it.next()).v();
        }
    }

    @Override // m0.m1
    public final s0.n w(u0 u0Var) {
        this.B.a(u0Var);
        Object[] objArr = {this.B.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(Collections.unmodifiableList(arrayList));
        g40.b bVarB = this.f28561j.b();
        bVarB.f20005f = u0Var;
        return bVarB.d();
    }

    @Override // m0.m1
    public final s0.n x(s0.n nVar, s0.n nVar2) {
        wd.a.p("StreamSharing", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + nVar + ", secondaryStreamSpec " + nVar2);
        B(E(f(), j() == null ? null : j().q().d(), this.f28560i, nVar, nVar2));
        this.f28556e = k1.ACTIVE;
        q();
        return nVar;
    }

    @Override // m0.m1
    public final void y() {
        D();
        h hVar = this.f18082s;
        for (m1 m1Var : hVar.f18097a) {
            f fVar = (f) hVar.f18099c.get(m1Var);
            Objects.requireNonNull(fVar);
            m1Var.A(fVar);
        }
    }
}
