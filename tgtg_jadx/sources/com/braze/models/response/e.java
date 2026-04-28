package com.braze.models.response;

import com.braze.requests.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f10228b;

    public e(String str, o oVar) {
        oVar.getClass();
        this.f10227a = str;
        this.f10228b = oVar;
    }

    @Override // com.braze.models.response.d
    public final String a() {
        return this.f10227a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f10227a, eVar.f10227a) && Intrinsics.areEqual(this.f10228b, eVar.f10228b);
    }

    public final int hashCode() {
        String str = this.f10227a;
        return this.f10228b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "InvalidApiKeyError(errorMessage=" + this.f10227a + ", originalRequest=" + this.f10228b + ")";
    }
}
