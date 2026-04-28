package f6;

import c5.m2;
import c5.p2;
import kotlin.jvm.functions.Function1;
import z4.j1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends p2 implements j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f17403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f17404d;

    public k(d dVar, Function1 function1) {
        super(m2.f7291a);
        this.f17403c = dVar;
        this.f17404d = function1;
    }

    @Override // z4.j1
    public final Object b(z5.c cVar, Object obj) {
        return new j(this.f17403c, this.f17404d);
    }

    public final boolean equals(Object obj) {
        k kVar = obj instanceof k ? (k) obj : null;
        return this.f17404d == (kVar != null ? kVar.f17404d : null);
    }

    public final int hashCode() {
        return this.f17404d.hashCode();
    }
}
