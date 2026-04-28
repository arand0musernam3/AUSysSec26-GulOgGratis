package s0;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f38422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f38423c;

    public o1(boolean z11, HashSet hashSet, HashSet hashSet2) {
        this.f38421a = z11;
        this.f38422b = hashSet == null ? Collections.EMPTY_SET : new HashSet(hashSet);
        this.f38423c = hashSet2 == null ? Collections.EMPTY_SET : new HashSet(hashSet2);
    }

    public final boolean a(Class cls, boolean z11) {
        if (this.f38422b.contains(cls)) {
            return true;
        }
        return !this.f38423c.contains(cls) && this.f38421a && z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o1)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        o1 o1Var = (o1) obj;
        return this.f38421a == o1Var.f38421a && Objects.equals(this.f38422b, o1Var.f38422b) && Objects.equals(this.f38423c, o1Var.f38423c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f38421a), this.f38422b, this.f38423c);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f38421a + ", forceEnabledQuirks=" + this.f38422b + ", forceDisabledQuirks=" + this.f38423c + '}';
    }
}
