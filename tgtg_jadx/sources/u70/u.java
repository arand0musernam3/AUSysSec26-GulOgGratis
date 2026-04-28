package u70;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f40859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f40860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f40861c;

    public u(Object obj, Object obj2, Object obj3) {
        this.f40859a = obj;
        this.f40860b = obj2;
        this.f40861c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.areEqual(this.f40859a, uVar.f40859a) && Intrinsics.areEqual(this.f40860b, uVar.f40860b) && Intrinsics.areEqual(this.f40861c, uVar.f40861c);
    }

    public final int hashCode() {
        Object obj = this.f40859a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f40860b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f40861c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f40859a + ", " + this.f40860b + ", " + this.f40861c + ')';
    }
}
