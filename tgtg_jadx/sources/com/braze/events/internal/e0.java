package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.models.k f9799b;

    public e0(String str, com.braze.models.k kVar) {
        str.getClass();
        kVar.getClass();
        this.f9798a = str;
        this.f9799b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.areEqual(this.f9798a, e0Var.f9798a) && Intrinsics.areEqual(this.f9799b, e0Var.f9799b);
    }

    public final int hashCode() {
        return this.f9799b.hashCode() + (this.f9798a.hashCode() * 31);
    }

    public final String toString() {
        return "TriggerEligiblePushClickEvent(campaignId=" + this.f9798a + ", pushClickEvent=" + this.f9799b + ")";
    }
}
