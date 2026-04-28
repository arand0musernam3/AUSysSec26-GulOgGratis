package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.models.response.m f9785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.models.response.m f9786b;

    public d(com.braze.models.response.m mVar, com.braze.models.response.m mVar2) {
        mVar.getClass();
        mVar2.getClass();
        this.f9785a = mVar;
        this.f9786b = mVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f9785a, dVar.f9785a) && Intrinsics.areEqual(this.f9786b, dVar.f9786b);
    }

    public final int hashCode() {
        return this.f9786b.hashCode() + (this.f9785a.hashCode() * 31);
    }

    public final String toString() {
        return "ConfigChangeEvent(oldConfig=" + this.f9785a + ", newConfig=" + this.f9786b + ")";
    }
}
