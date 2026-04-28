package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.triggers.events.d f9801a;

    public f0(com.braze.triggers.events.d dVar) {
        dVar.getClass();
        this.f9801a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Intrinsics.areEqual(this.f9801a, ((f0) obj).f9801a);
    }

    public final int hashCode() {
        return this.f9801a.hashCode();
    }

    public final String toString() {
        return "TriggerEventEvent(triggerEvent=" + this.f9801a + ")";
    }
}
