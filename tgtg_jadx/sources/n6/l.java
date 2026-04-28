package n6;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends g {
    public boolean A0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public float f30649v0 = -1.0f;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f30650w0 = -1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f30651x0 = -1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public d f30652y0 = this.L;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f30653z0 = 0;

    public l() {
        this.T.clear();
        this.T.add(this.f30652y0);
        int length = this.S.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.S[i11] = this.f30652y0;
        }
    }

    @Override // n6.g
    public final boolean C() {
        return this.A0;
    }

    @Override // n6.g
    public final boolean D() {
        return this.A0;
    }

    @Override // n6.g
    public final void V(g6.c cVar, boolean z11) {
        if (this.W == null) {
            return;
        }
        d dVar = this.f30652y0;
        cVar.getClass();
        int iN = g6.c.n(dVar);
        if (this.f30653z0 == 1) {
            this.f30577b0 = iN;
            this.f30579c0 = 0;
            O(this.W.m());
            T(0);
            return;
        }
        this.f30577b0 = 0;
        this.f30579c0 = iN;
        T(this.W.s());
        O(0);
    }

    public final void W(int i11) {
        this.f30652y0.l(i11);
        this.A0 = true;
    }

    public final void X(int i11) {
        if (this.f30653z0 == i11) {
            return;
        }
        this.f30653z0 = i11;
        ArrayList arrayList = this.T;
        arrayList.clear();
        if (this.f30653z0 == 1) {
            this.f30652y0 = this.K;
        } else {
            this.f30652y0 = this.L;
        }
        arrayList.add(this.f30652y0);
        d[] dVarArr = this.S;
        int length = dVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            dVarArr[i12] = this.f30652y0;
        }
    }

    @Override // n6.g
    public final void c(g6.c cVar, boolean z11) {
        h hVar = (h) this.W;
        if (hVar == null) {
            return;
        }
        Object objK = hVar.k(c.LEFT);
        Object objK2 = hVar.k(c.RIGHT);
        g gVar = this.W;
        boolean z12 = gVar != null && gVar.V[0] == f.WRAP_CONTENT;
        if (this.f30653z0 == 0) {
            objK = hVar.k(c.TOP);
            objK2 = hVar.k(c.BOTTOM);
            g gVar2 = this.W;
            z12 = gVar2 != null && gVar2.V[1] == f.WRAP_CONTENT;
        }
        if (this.A0) {
            d dVar = this.f30652y0;
            if (dVar.f30566c) {
                g6.h hVarK = cVar.k(dVar);
                cVar.d(hVarK, this.f30652y0.d());
                if (this.f30650w0 != -1) {
                    if (z12) {
                        cVar.f(cVar.k(objK2), hVarK, 0, 5);
                    }
                } else if (this.f30651x0 != -1 && z12) {
                    g6.h hVarK2 = cVar.k(objK2);
                    cVar.f(hVarK, cVar.k(objK), 0, 5);
                    cVar.f(hVarK2, hVarK, 0, 5);
                }
                this.A0 = false;
                return;
            }
        }
        if (this.f30650w0 != -1) {
            g6.h hVarK3 = cVar.k(this.f30652y0);
            cVar.e(hVarK3, cVar.k(objK), this.f30650w0, 8);
            if (z12) {
                cVar.f(cVar.k(objK2), hVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f30651x0 != -1) {
            g6.h hVarK4 = cVar.k(this.f30652y0);
            g6.h hVarK5 = cVar.k(objK2);
            cVar.e(hVarK4, hVarK5, -this.f30651x0, 8);
            if (z12) {
                cVar.f(hVarK4, cVar.k(objK), 0, 5);
                cVar.f(hVarK5, hVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f30649v0 != -1.0f) {
            g6.h hVarK6 = cVar.k(this.f30652y0);
            g6.h hVarK7 = cVar.k(objK2);
            float f11 = this.f30649v0;
            g6.b bVarL = cVar.l();
            bVarL.f20020d.g(hVarK6, -1.0f);
            bVarL.f20020d.g(hVarK7, f11);
            cVar.c(bVarL);
        }
    }

    @Override // n6.g
    public final boolean d() {
        return true;
    }

    @Override // n6.g
    public final void h(g gVar, HashMap map) {
        super.h(gVar, map);
        l lVar = (l) gVar;
        this.f30649v0 = lVar.f30649v0;
        this.f30650w0 = lVar.f30650w0;
        this.f30651x0 = lVar.f30651x0;
        X(lVar.f30653z0);
    }

    @Override // n6.g
    public final d k(c cVar) {
        int i11 = k.f30648a[cVar.ordinal()];
        if (i11 == 1 || i11 == 2) {
            if (this.f30653z0 == 1) {
                return this.f30652y0;
            }
            return null;
        }
        if ((i11 == 3 || i11 == 4) && this.f30653z0 == 0) {
            return this.f30652y0;
        }
        return null;
    }
}
