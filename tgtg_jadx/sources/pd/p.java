package pd;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.x0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f34705b = new p(x0.k(new LinkedHashMap()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f34706a;

    public p(Map map) {
        this.f34706a = map;
    }

    public final String a() {
        String lowerCase = "Content-Type".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        List list = (List) this.f34706a.get(lowerCase);
        if (list != null) {
            return (String) CollectionsKt.X(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.areEqual(this.f34706a, ((p) obj).f34706a);
    }

    public final int hashCode() {
        return this.f34706a.hashCode();
    }

    public final String toString() {
        return "NetworkHeaders(data=" + this.f34706a + ")";
    }
}
