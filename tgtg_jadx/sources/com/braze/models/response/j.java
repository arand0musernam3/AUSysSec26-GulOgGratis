package com.braze.models.response;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10253b;

    public j(int i11, int i12) {
        this.f10252a = i11;
        this.f10253b = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f10252a == jVar.f10252a && this.f10253b == jVar.f10253b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10253b) + (Integer.hashCode(this.f10252a) * 31);
    }

    public final String toString() {
        return r8.k.g(this.f10252a, this.f10253b, "RateLimitEndpointConfig(capacity=", ", refillRate=", ")");
    }
}
