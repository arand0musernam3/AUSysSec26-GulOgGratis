package n6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o6.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f30567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f30568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f30569f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g6.h f30572i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f30564a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30570g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f30571h = Integer.MIN_VALUE;

    public d(g gVar, c cVar) {
        this.f30567d = gVar;
        this.f30568e = cVar;
    }

    public final void a(d dVar, int i11) {
        b(dVar, i11, Integer.MIN_VALUE, false);
    }

    public final boolean b(d dVar, int i11, int i12, boolean z11) {
        if (dVar == null) {
            j();
            return true;
        }
        if (!z11 && !i(dVar)) {
            return false;
        }
        this.f30569f = dVar;
        if (dVar.f30564a == null) {
            dVar.f30564a = new HashSet();
        }
        HashSet hashSet = this.f30569f.f30564a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f30570g = i11;
        this.f30571h = i12;
        return true;
    }

    public final void c(int i11, ArrayList arrayList, q qVar) {
        HashSet hashSet = this.f30564a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                o6.i.b(((d) it.next()).f30567d, i11, arrayList, qVar);
            }
        }
    }

    public final int d() {
        if (this.f30566c) {
            return this.f30565b;
        }
        return 0;
    }

    public final int e() {
        d dVar;
        if (this.f30567d.f30593j0 == 8) {
            return 0;
        }
        int i11 = this.f30571h;
        return (i11 == Integer.MIN_VALUE || (dVar = this.f30569f) == null || dVar.f30567d.f30593j0 != 8) ? this.f30570g : i11;
    }

    public final d f() {
        c cVar = this.f30568e;
        int iOrdinal = cVar.ordinal();
        g gVar = this.f30567d;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return gVar.M;
            case 2:
                return gVar.N;
            case 3:
                return gVar.K;
            case 4:
                return gVar.L;
            default:
                i4.a.d(cVar.name());
                return null;
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f30564a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f30569f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0071 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(n6.d r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L5
            goto L73
        L5:
            n6.g r1 = r6.f30567d
            n6.c r6 = r6.f30568e
            n6.c r2 = r5.f30568e
            r3 = 1
            if (r6 != r2) goto L1d
            n6.c r6 = n6.c.BASELINE
            if (r2 != r6) goto L71
            boolean r6 = r1.F
            if (r6 == 0) goto L73
            n6.g r6 = r5.f30567d
            boolean r6 = r6.F
            if (r6 != 0) goto L71
            goto L73
        L1d:
            int r4 = r2.ordinal()
            switch(r4) {
                case 0: goto L73;
                case 1: goto L5b;
                case 2: goto L43;
                case 3: goto L5b;
                case 4: goto L43;
                case 5: goto L3a;
                case 6: goto L2d;
                case 7: goto L73;
                case 8: goto L73;
                default: goto L24;
            }
        L24:
            java.lang.String r6 = r2.name()
            i4.a.d(r6)
            r6 = 0
            return r6
        L2d:
            n6.c r1 = n6.c.BASELINE
            if (r6 == r1) goto L73
            n6.c r1 = n6.c.CENTER_X
            if (r6 == r1) goto L73
            n6.c r1 = n6.c.CENTER_Y
            if (r6 == r1) goto L73
            goto L71
        L3a:
            n6.c r1 = n6.c.LEFT
            if (r6 == r1) goto L73
            n6.c r1 = n6.c.RIGHT
            if (r6 != r1) goto L71
            goto L73
        L43:
            n6.c r2 = n6.c.TOP
            if (r6 == r2) goto L4e
            n6.c r2 = n6.c.BOTTOM
            if (r6 != r2) goto L4c
            goto L4e
        L4c:
            r2 = r0
            goto L4f
        L4e:
            r2 = r3
        L4f:
            boolean r1 = r1 instanceof n6.l
            if (r1 == 0) goto L5a
            if (r2 != 0) goto L71
            n6.c r1 = n6.c.CENTER_Y
            if (r6 != r1) goto L73
            goto L71
        L5a:
            return r2
        L5b:
            n6.c r2 = n6.c.LEFT
            if (r6 == r2) goto L66
            n6.c r2 = n6.c.RIGHT
            if (r6 != r2) goto L64
            goto L66
        L64:
            r2 = r0
            goto L67
        L66:
            r2 = r3
        L67:
            boolean r1 = r1 instanceof n6.l
            if (r1 == 0) goto L72
            if (r2 != 0) goto L71
            n6.c r1 = n6.c.CENTER_X
            if (r6 != r1) goto L73
        L71:
            return r3
        L72:
            return r2
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.d.i(n6.d):boolean");
    }

    public final void j() {
        HashSet hashSet;
        d dVar = this.f30569f;
        if (dVar != null && (hashSet = dVar.f30564a) != null) {
            hashSet.remove(this);
            if (this.f30569f.f30564a.size() == 0) {
                this.f30569f.f30564a = null;
            }
        }
        this.f30564a = null;
        this.f30569f = null;
        this.f30570g = 0;
        this.f30571h = Integer.MIN_VALUE;
        this.f30566c = false;
        this.f30565b = 0;
    }

    public final void k() {
        g6.h hVar = this.f30572i;
        if (hVar == null) {
            this.f30572i = new g6.h(g6.g.UNRESTRICTED);
        } else {
            hVar.d();
        }
    }

    public final void l(int i11) {
        this.f30565b = i11;
        this.f30566c = true;
    }

    public final String toString() {
        return this.f30567d.f30596l0 + ":" + this.f30568e.toString();
    }
}
