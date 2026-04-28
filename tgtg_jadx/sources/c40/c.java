package c40;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f7060c;

    public c(String str, long j9, Map map) {
        map.getClass();
        this.f7058a = str;
        this.f7059b = j9;
        this.f7060c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f7058a, cVar.f7058a) && this.f7059b == cVar.f7059b && Intrinsics.areEqual(this.f7060c, cVar.f7060c);
    }

    public final int hashCode() {
        return this.f7060c.hashCode() + e0.f.b(this.f7058a.hashCode() * 31, 31, this.f7059b);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f7058a + ", timestamp=" + this.f7059b + ", additionalCustomKeys=" + this.f7060c + ')';
    }
}
