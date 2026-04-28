package f6;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z4.e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f17400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f17401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17402c;

    public j(d dVar, Function1 function1) {
        this.f17400a = dVar;
        this.f17401b = function1;
        this.f17402c = dVar.f17383b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f17400a.f17383b, jVar.f17400a.f17383b) && this.f17401b == jVar.f17401b;
    }

    public final int hashCode() {
        return this.f17401b.hashCode() + (this.f17400a.f17383b.hashCode() * 31);
    }

    @Override // z4.e0
    public final Object o() {
        return this.f17402c;
    }
}
