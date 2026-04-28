package b5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends v0 {
    @Override // z4.t0
    public final z4.m1 D(long j9) {
        p0(j9);
        s1 s1Var = this.f6007p;
        o3.e eVarA = s1Var.f5966p.A();
        Object[] objArr = eVarA.f31830a;
        int i11 = eVarA.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            z0 z0Var = ((m0) objArr[i12]).H.f5943q;
            z0Var.getClass();
            z0Var.f6023j = j0.NotUsed;
        }
        m0 m0Var = s1Var.f5966p;
        v0.S0(this, m0Var.f5887x.c(this, m0Var.l(), j9));
        return this;
    }

    @Override // b5.v0
    public final void T0() {
        z0 z0Var = this.f6007p.f5966p.H.f5943q;
        z0Var.getClass();
        z0Var.F0();
    }

    @Override // z4.t
    public final int V(int i11) {
        w2.z zVarV = this.f6007p.f5966p.v();
        z4.u0 u0VarR = zVarV.r();
        m0 m0Var = (m0) zVarV.f43083b;
        return u0VarR.e(m0Var.G.f5858d, m0Var.l(), i11);
    }

    @Override // z4.t
    public final int b(int i11) {
        w2.z zVarV = this.f6007p.f5966p.v();
        z4.u0 u0VarR = zVarV.r();
        m0 m0Var = (m0) zVarV.f43083b;
        return u0VarR.d(m0Var.G.f5858d, m0Var.l(), i11);
    }

    @Override // b5.u0
    public final int v0(z4.a aVar) {
        z0 z0Var = this.f6007p.f5966p.H.f5943q;
        z0Var.getClass();
        n0 n0Var = z0Var.f6031s;
        if (!z0Var.f6024k) {
            q0 q0Var = z0Var.f6019f;
            if (q0Var.f5931d == h0.LookaheadMeasuring) {
                n0Var.f5898f = true;
                if (n0Var.f5894b) {
                    q0Var.f5933f = true;
                    q0Var.f5934g = true;
                }
            } else {
                n0Var.f5899g = true;
            }
        }
        w wVar = z0Var.j().Z;
        if (wVar != null) {
            wVar.f5997k = true;
        }
        z0Var.N();
        w wVar2 = z0Var.j().Z;
        if (wVar2 != null) {
            wVar2.f5997k = false;
        }
        Integer num = (Integer) n0Var.f5901i.get(aVar);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f6012u.g(iIntValue, aVar);
        return iIntValue;
    }

    @Override // z4.t
    public final int w(int i11) {
        w2.z zVarV = this.f6007p.f5966p.v();
        z4.u0 u0VarR = zVarV.r();
        m0 m0Var = (m0) zVarV.f43083b;
        return u0VarR.b(m0Var.G.f5858d, m0Var.l(), i11);
    }

    @Override // z4.t
    public final int y(int i11) {
        w2.z zVarV = this.f6007p.f5966p.v();
        z4.u0 u0VarR = zVarV.r();
        m0 m0Var = (m0) zVarV.f43083b;
        return u0VarR.a(m0Var.G.f5858d, m0Var.l(), i11);
    }
}
