package xe;

import java.util.Map;
import kotlin.collections.o0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f44242c;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(String str, String str2, int i11) {
        str = (i11 & 1) != 0 ? null : str;
        str2 = (i11 & 2) != 0 ? null : str2;
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        this(str, str2, o0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f44240a, bVar.f44240a) && Intrinsics.areEqual(this.f44241b, bVar.f44241b) && Intrinsics.areEqual(this.f44242c, bVar.f44242c);
    }

    public final int hashCode() {
        String str = this.f44240a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f44241b;
        return this.f44242c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Identity(userId=" + ((Object) this.f44240a) + ", deviceId=" + ((Object) this.f44241b) + ", userProperties=" + this.f44242c + ')';
    }

    public b(String str, String str2, Map map) {
        map.getClass();
        this.f44240a = str;
        this.f44241b = str2;
        this.f44242c = map;
    }
}
