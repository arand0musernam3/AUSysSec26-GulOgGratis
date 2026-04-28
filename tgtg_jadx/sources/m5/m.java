package m5;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f29591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f29592c;

    public m(String str, r0 r0Var, p pVar) {
        this.f29590a = str;
        this.f29591b = r0Var;
        this.f29592c = pVar;
    }

    @Override // m5.o
    public final p a() {
        return this.f29592c;
    }

    @Override // m5.o
    public final r0 b() {
        return this.f29591b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.f29590a, mVar.f29590a) && Intrinsics.areEqual(this.f29591b, mVar.f29591b) && Intrinsics.areEqual(this.f29592c, mVar.f29592c);
    }

    public final int hashCode() {
        int iHashCode = this.f29590a.hashCode() * 31;
        r0 r0Var = this.f29591b;
        int iHashCode2 = (iHashCode + (r0Var != null ? r0Var.hashCode() : 0)) * 31;
        p pVar = this.f29592c;
        return iHashCode2 + (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        return l1.f(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f29590a, ')');
    }
}
