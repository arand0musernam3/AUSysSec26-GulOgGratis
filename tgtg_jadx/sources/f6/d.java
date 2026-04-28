package f6;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f17384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f17385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f17386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f17387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f17388g;

    public d(Object obj) {
        this.f17382a = obj;
        new LinkedHashMap();
        this.f17383b = obj;
        this.f17384c = new h(obj, -2, this);
        this.f17385d = new g(obj, 0, this);
        this.f17386e = new h(obj, -1, this);
        this.f17387f = new g(obj, 1, this);
        this.f17388g = new f(obj, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return Intrinsics.areEqual(this.f17383b, ((d) obj).f17383b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17383b.hashCode();
    }
}
