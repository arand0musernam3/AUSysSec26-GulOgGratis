package n6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends p {
    @Override // n6.p
    public final void Z(int i11, int i12, int i13, int i14) {
        int iS = this.B0 + this.C0;
        int iM = this.f30657x0 + this.f30658y0;
        if (this.f30655w0 > 0) {
            iS += this.f30654v0[0].s();
            iM += this.f30654v0[0].m();
        }
        int iMax = Math.max(this.f30583e0, iS);
        int iMax2 = Math.max(this.f30585f0, iM);
        if (i11 != 1073741824) {
            i12 = i11 == Integer.MIN_VALUE ? Math.min(iMax, i12) : i11 == 0 ? iMax : 0;
        }
        if (i13 != 1073741824) {
            i14 = i13 == Integer.MIN_VALUE ? Math.min(iMax2, i14) : i13 == 0 ? iMax2 : 0;
        }
        this.E0 = i12;
        this.F0 = i14;
        T(i12);
        O(i14);
        this.D0 = this.f30655w0 > 0;
    }

    @Override // n6.g
    public final void c(g6.c cVar, boolean z11) {
        super.c(cVar, z11);
        if (this.f30655w0 > 0) {
            g gVar = this.f30654v0[0];
            gVar.F();
            gVar.f30589h0 = 0.5f;
            gVar.f30587g0 = 0.5f;
            c cVar2 = c.LEFT;
            gVar.f(cVar2, this, cVar2, 0);
            c cVar3 = c.RIGHT;
            gVar.f(cVar3, this, cVar3, 0);
            c cVar4 = c.TOP;
            gVar.f(cVar4, this, cVar4, 0);
            c cVar5 = c.BOTTOM;
            gVar.f(cVar5, this, cVar5, 0);
        }
    }
}
