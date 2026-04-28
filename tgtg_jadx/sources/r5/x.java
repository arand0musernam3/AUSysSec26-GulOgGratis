package r5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37713b;

    public x(int i11, int i12) {
        this.f37712a = i11;
        this.f37713b = i12;
    }

    @Override // r5.g
    public final void a(i iVar) {
        int iC = n80.p.c(this.f37712a, 0, ((mv.b0) iVar.f37681f).p());
        int iC2 = n80.p.c(this.f37713b, 0, ((mv.b0) iVar.f37681f).p());
        if (iC < iC2) {
            iVar.f(iC, iC2);
        } else {
            iVar.f(iC2, iC);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f37712a == xVar.f37712a && this.f37713b == xVar.f37713b;
    }

    public final int hashCode() {
        return (this.f37712a * 31) + this.f37713b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetSelectionCommand(start=");
        sb2.append(this.f37712a);
        sb2.append(", end=");
        return r8.k.o(sb2, this.f37713b, ')');
    }
}
