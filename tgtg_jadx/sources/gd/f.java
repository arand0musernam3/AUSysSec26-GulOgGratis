package gd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n4.b f20369a;

    public f(n4.b bVar) {
        this.f20369a = bVar;
    }

    @Override // gd.h
    public final n4.b a() {
        return this.f20369a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.f20369a, ((f) obj).f20369a);
    }

    public final int hashCode() {
        n4.b bVar = this.f20369a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.f20369a + ")";
    }
}
