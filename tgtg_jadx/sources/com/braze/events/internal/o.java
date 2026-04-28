package com.braze.events.internal;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.enums.e f9817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.enums.e f9818b;

    public o(com.braze.enums.e eVar, com.braze.enums.e eVar2) {
        eVar.getClass();
        eVar2.getClass();
        this.f9817a = eVar;
        this.f9818b = eVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f9817a == oVar.f9817a && this.f9818b == oVar.f9818b;
    }

    public final int hashCode() {
        return this.f9818b.hashCode() + (this.f9817a.hashCode() * 31);
    }

    public final String toString() {
        return "NetworkLevelChangeEvent(oldNetworkLevel=" + this.f9817a + ", newNetworkLevel=" + this.f9818b + ")";
    }
}
