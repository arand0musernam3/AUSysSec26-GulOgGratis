package r5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37672b;

    public f(int i11, int i12) {
        this.f37671a = i11;
        this.f37672b = i12;
        if (i11 >= 0 && i12 >= 0) {
            return;
        }
        s5.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i11 + " and " + i12 + " respectively.");
    }

    @Override // r5.g
    public final void a(i iVar) {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 < this.f37671a) {
                int i14 = i13 + 1;
                int i15 = iVar.f37677b;
                if (i15 <= i14) {
                    i13 = i15;
                    break;
                } else {
                    i13 = (Character.isHighSurrogate(iVar.b((i15 - i14) + (-1))) && Character.isLowSurrogate(iVar.b(iVar.f37677b - i14))) ? i13 + 2 : i14;
                    i12++;
                }
            } else {
                break;
            }
        }
        int iP = 0;
        while (true) {
            if (i11 >= this.f37672b) {
                break;
            }
            int i16 = iP + 1;
            int i17 = iVar.f37678c;
            mv.b0 b0Var = (mv.b0) iVar.f37681f;
            if (i17 + i16 >= b0Var.p()) {
                iP = b0Var.p() - iVar.f37678c;
                break;
            } else {
                iP = (Character.isHighSurrogate(iVar.b((iVar.f37678c + i16) + (-1))) && Character.isLowSurrogate(iVar.b(iVar.f37678c + i16))) ? iP + 2 : i16;
                i11++;
            }
        }
        int i18 = iVar.f37678c;
        iVar.a(i18, iP + i18);
        int i19 = iVar.f37677b;
        iVar.a(i19 - i13, i19);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f37671a == fVar.f37671a && this.f37672b == fVar.f37672b;
    }

    public final int hashCode() {
        return (this.f37671a * 31) + this.f37672b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb2.append(this.f37671a);
        sb2.append(", lengthAfterCursor=");
        return r8.k.o(sb2, this.f37672b, ')');
    }
}
