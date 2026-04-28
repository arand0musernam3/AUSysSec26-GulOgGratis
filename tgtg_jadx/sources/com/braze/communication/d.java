package com.braze.communication;

import java.util.Map;
import kotlin.collections.o0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f9593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f9594c;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(int i11, Map map, int i12) {
        if ((i12 & 2) != 0) {
            map = o0.f26530a;
            map.getClass();
        }
        this(i11, map, (JSONObject) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f9592a == dVar.f9592a && Intrinsics.areEqual(this.f9593b, dVar.f9593b) && Intrinsics.areEqual(this.f9594c, dVar.f9594c);
    }

    public final int hashCode() {
        int iF = a0.f(this.f9593b, Integer.hashCode(this.f9592a) * 31, 31);
        JSONObject jSONObject = this.f9594c;
        return iF + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public final String toString() {
        return "HttpConnectorResult(responseCode=" + this.f9592a + ", responseHeaders=" + this.f9593b + ", jsonResponse=" + this.f9594c + ")";
    }

    public d(int i11, Map map, JSONObject jSONObject) {
        map.getClass();
        this.f9592a = i11;
        this.f9593b = map;
        this.f9594c = jSONObject;
    }
}
