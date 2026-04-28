package pd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f34664a;

    public a(r rVar) {
        this.f34664a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f34664a, ((a) obj).f34664a);
        }
        return false;
    }

    public final int hashCode() {
        r rVar = this.f34664a;
        if (rVar != null) {
            return rVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ReadResult(request=null, response=" + this.f34664a + ")";
    }
}
