package r5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37668b;

    public e(int i11, int i12) {
        this.f37667a = i11;
        this.f37668b = i12;
        if (i11 >= 0 && i12 >= 0) {
            return;
        }
        s5.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i11 + " and " + i12 + " respectively.");
    }

    @Override // r5.g
    public final void a(i iVar) {
        int i11 = iVar.f37678c;
        mv.b0 b0Var = (mv.b0) iVar.f37681f;
        int i12 = this.f37668b;
        int iP = i11 + i12;
        if (((i11 ^ iP) & (i12 ^ iP)) < 0) {
            iP = b0Var.p();
        }
        iVar.a(iVar.f37678c, Math.min(iP, b0Var.p()));
        int i13 = iVar.f37677b;
        int i14 = this.f37667a;
        int i15 = i13 - i14;
        if (((i13 ^ i15) & (i14 ^ i13)) < 0) {
            i15 = 0;
        }
        iVar.a(Math.max(0, i15), iVar.f37677b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f37667a == eVar.f37667a && this.f37668b == eVar.f37668b;
    }

    public final int hashCode() {
        return (this.f37667a * 31) + this.f37668b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.f37667a);
        sb2.append(", lengthAfterCursor=");
        return r8.k.o(sb2, this.f37668b, ')');
    }
}
