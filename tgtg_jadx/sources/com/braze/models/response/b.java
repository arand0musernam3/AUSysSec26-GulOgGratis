package com.braze.models.response;

import com.braze.requests.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f10222b;

    public b(String str, o oVar) {
        oVar.getClass();
        this.f10221a = str;
        this.f10222b = oVar;
    }

    @Override // com.braze.models.response.d
    public final String a() {
        return this.f10221a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f10221a, bVar.f10221a) && Intrinsics.areEqual(this.f10222b, bVar.f10222b);
    }

    public final int hashCode() {
        String str = this.f10221a;
        return this.f10222b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "BasicResponseError(errorMessage=" + this.f10221a + ", originalRequest=" + this.f10222b + ")";
    }
}
