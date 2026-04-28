package td;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fd.l f39954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f39955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f39956c;

    public d(fd.l lVar, i iVar, Throwable th2) {
        this.f39954a = lVar;
        this.f39955b = iVar;
        this.f39956c = th2;
    }

    @Override // td.l
    public final i e() {
        return this.f39955b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f39954a, dVar.f39954a) && Intrinsics.areEqual(this.f39955b, dVar.f39955b) && Intrinsics.areEqual(this.f39956c, dVar.f39956c);
    }

    public final int hashCode() {
        fd.l lVar = this.f39954a;
        return this.f39956c.hashCode() + ((this.f39955b.hashCode() + ((lVar == null ? 0 : lVar.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.f39954a + ", request=" + this.f39955b + ", throwable=" + this.f39956c + ")";
    }
}
