package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f9780a;

    public a(JSONObject jSONObject) {
        jSONObject.getClass();
        this.f9780a = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f9780a, ((a) obj).f9780a);
    }

    public final int hashCode() {
        return this.f9780a.hashCode();
    }

    public final String toString() {
        return "BannersReceivedEvent(bannersData=" + this.f9780a + ")";
    }
}
