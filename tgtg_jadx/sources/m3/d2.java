package m3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f29262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f29263f;

    public d2(i iVar, int i11) {
        this.f29262e = iVar;
        this.f29263f = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return Intrinsics.areEqual(d2Var.f29262e, this.f29262e) && d2Var.f29263f == this.f29263f;
    }

    public final int hashCode() {
        return this.f29262e.hashCode() + (this.f29263f * 31);
    }
}
