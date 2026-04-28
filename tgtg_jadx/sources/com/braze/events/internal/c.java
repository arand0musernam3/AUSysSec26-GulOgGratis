package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.requests.a f9783a;

    public c(com.braze.requests.a aVar) {
        aVar.getClass();
        this.f9783a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.f9783a, ((c) obj).f9783a);
    }

    public final int hashCode() {
        return this.f9783a.hashCode();
    }

    public final String toString() {
        return "BannersRequestSuccessEvent(request=" + this.f9783a + ")";
    }
}
