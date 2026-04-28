package qb;

import ib.g0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g0 f36810b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.f36809a, mVar.f36809a) && this.f36810b == mVar.f36810b;
    }

    public final int hashCode() {
        return this.f36810b.hashCode() + (this.f36809a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f36809a + ", state=" + this.f36810b + ')';
    }
}
