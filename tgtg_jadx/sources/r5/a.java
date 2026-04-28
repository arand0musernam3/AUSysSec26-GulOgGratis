package r5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5.h f37626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37627b;

    public a(String str, int i11) {
        this(new m5.h(str), i11);
    }

    @Override // r5.g
    public final void a(i iVar) {
        int i11 = iVar.f37679d;
        m5.h hVar = this.f37626a;
        if (i11 != -1) {
            iVar.d(i11, iVar.f37680e, hVar.f29538b);
        } else {
            iVar.d(iVar.f37677b, iVar.f37678c, hVar.f29538b);
        }
        int i12 = iVar.f37677b;
        int i13 = iVar.f37678c;
        int i14 = i12 == i13 ? i13 : -1;
        int i15 = this.f37627b;
        int iC = n80.p.c(i15 > 0 ? (i14 + i15) - 1 : (i14 + i15) - hVar.f29538b.length(), 0, ((mv.b0) iVar.f37681f).p());
        iVar.f(iC, iC);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f37626a.f29538b, aVar.f37626a.f29538b) && this.f37627b == aVar.f37627b;
    }

    public final int hashCode() {
        return (this.f37626a.f29538b.hashCode() * 31) + this.f37627b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommitTextCommand(text='");
        sb2.append(this.f37626a.f29538b);
        sb2.append("', newCursorPosition=");
        return r8.k.o(sb2, this.f37627b, ')');
    }

    public a(m5.h hVar, int i11) {
        this.f37626a = hVar;
        this.f37627b = i11;
    }
}
