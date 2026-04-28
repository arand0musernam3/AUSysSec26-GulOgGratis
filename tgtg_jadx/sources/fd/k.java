package fd;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f17569b = new k(android.support.v4.media.session.a.M(new LinkedHashMap()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f17570a;

    public k(Map map) {
        this.f17570a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.areEqual(this.f17570a, ((k) obj).f17570a);
    }

    public final int hashCode() {
        return this.f17570a.hashCode();
    }

    public final String toString() {
        return "Extras(data=" + this.f17570a + ")";
    }
}
