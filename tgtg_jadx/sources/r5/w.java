package r5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5.h f37710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37711b;

    public w(String str, int i11) {
        this.f37710a = new m5.h(str);
        this.f37711b = i11;
    }

    @Override // r5.g
    public final void a(i iVar) {
        int i11 = iVar.f37679d;
        m5.h hVar = this.f37710a;
        if (i11 != -1) {
            int i12 = iVar.f37680e;
            String str = hVar.f29538b;
            String str2 = hVar.f29538b;
            iVar.d(i11, i12, str);
            if (str2.length() > 0) {
                iVar.e(i11, str2.length() + i11);
            }
        } else {
            int i13 = iVar.f37677b;
            int i14 = iVar.f37678c;
            String str3 = hVar.f29538b;
            String str4 = hVar.f29538b;
            iVar.d(i13, i14, str3);
            if (str4.length() > 0) {
                iVar.e(i13, str4.length() + i13);
            }
        }
        int i15 = iVar.f37677b;
        int i16 = iVar.f37678c;
        int i17 = i15 == i16 ? i16 : -1;
        int i18 = this.f37711b;
        int iC = n80.p.c(i18 > 0 ? (i17 + i18) - 1 : (i17 + i18) - hVar.f29538b.length(), 0, ((mv.b0) iVar.f37681f).p());
        iVar.f(iC, iC);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.areEqual(this.f37710a.f29538b, wVar.f37710a.f29538b) && this.f37711b == wVar.f37711b;
    }

    public final int hashCode() {
        return (this.f37710a.f29538b.hashCode() * 31) + this.f37711b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text='");
        sb2.append(this.f37710a.f29538b);
        sb2.append("', newCursorPosition=");
        return r8.k.o(sb2, this.f37711b, ')');
    }
}
