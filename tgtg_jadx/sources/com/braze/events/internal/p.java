package com.braze.events.internal;

import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9819a;

    public p(long j9) {
        this.f9819a = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f9819a == ((p) obj).f9819a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9819a);
    }

    public final String toString() {
        return l1.e("PushMaxRequestSuccessEvent(lastUpdateTime=", this.f9819a, ")");
    }
}
