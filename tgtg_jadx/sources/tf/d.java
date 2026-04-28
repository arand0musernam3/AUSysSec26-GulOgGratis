package tf;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f40119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40120b;

    public d(Map map, long j9) {
        this.f40119a = map;
        this.f40120b = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f40119a, dVar.f40119a) && this.f40120b == dVar.f40120b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40120b) + (this.f40119a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfigData(config=");
        sb2.append(this.f40119a);
        sb2.append(", timestamp=");
        return a0.r(sb2, this.f40120b, ')');
    }
}
