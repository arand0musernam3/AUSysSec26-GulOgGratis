package r5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37709b;

    public v(int i11, int i12) {
        this.f37708a = i11;
        this.f37709b = i12;
    }

    @Override // r5.g
    public final void a(i iVar) {
        boolean z11 = iVar.f37679d != -1;
        mv.b0 b0Var = (mv.b0) iVar.f37681f;
        if (z11) {
            iVar.f37679d = -1;
            iVar.f37680e = -1;
        }
        int iC = n80.p.c(this.f37708a, 0, b0Var.p());
        int iC2 = n80.p.c(this.f37709b, 0, b0Var.p());
        if (iC != iC2) {
            if (iC < iC2) {
                iVar.e(iC, iC2);
            } else {
                iVar.e(iC2, iC);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f37708a == vVar.f37708a && this.f37709b == vVar.f37709b;
    }

    public final int hashCode() {
        return (this.f37708a * 31) + this.f37709b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.f37708a);
        sb2.append(", end=");
        return r8.k.o(sb2, this.f37709b, ')');
    }
}
