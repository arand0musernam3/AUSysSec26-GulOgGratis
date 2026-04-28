package o4;

import e0.f;
import h4.e;
import i4.v0;
import kotlin.jvm.internal.Intrinsics;
import r8.k;
import z5.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v0 f31944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f31945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f31946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f31947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f31948e;

    public a(v0 v0Var, long j9, m mVar, float f11, d dVar) {
        this.f31944a = v0Var;
        this.f31945b = j9;
        this.f31946c = mVar;
        this.f31947d = f11;
        this.f31948e = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f31944a, aVar.f31944a) && e.a(this.f31945b, aVar.f31945b) && this.f31946c == aVar.f31946c && Float.compare(this.f31947d, aVar.f31947d) == 0 && Intrinsics.areEqual(this.f31948e, aVar.f31948e);
    }

    public final int hashCode() {
        int iA = k.a((this.f31946c.hashCode() + f.b(this.f31944a.hashCode() * 31, 31, this.f31945b)) * 31, this.f31947d, 31);
        d dVar = this.f31948e;
        return iA + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "ShadowKey(shape=" + this.f31944a + ", size=" + ((Object) e.f(this.f31945b)) + ", layoutDirection=" + this.f31946c + ", density=" + this.f31947d + ", shadow=" + this.f31948e + ')';
    }
}
