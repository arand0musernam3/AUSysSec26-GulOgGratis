package d2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.k1 f13954b;

    public v2(f1 f1Var, String str) {
        this.f13953a = str;
        this.f13954b = m3.i.w(f1Var);
    }

    @Override // d2.y2
    public final int a(z5.c cVar, z5.m mVar) {
        return e().f13780a;
    }

    @Override // d2.y2
    public final int b(z5.c cVar, z5.m mVar) {
        return e().f13782c;
    }

    @Override // d2.y2
    public final int c(z5.c cVar) {
        return e().f13783d;
    }

    @Override // d2.y2
    public final int d(z5.c cVar) {
        return e().f13781b;
    }

    public final f1 e() {
        return (f1) this.f13954b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v2) {
            return Intrinsics.areEqual(e(), ((v2) obj).e());
        }
        return false;
    }

    public final void f(f1 f1Var) {
        this.f13954b.setValue(f1Var);
    }

    public final int hashCode() {
        return this.f13953a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13953a);
        sb2.append("(left=");
        sb2.append(e().f13780a);
        sb2.append(", top=");
        sb2.append(e().f13781b);
        sb2.append(", right=");
        sb2.append(e().f13782c);
        sb2.append(", bottom=");
        return r8.k.o(sb2, e().f13783d, ')');
    }
}
