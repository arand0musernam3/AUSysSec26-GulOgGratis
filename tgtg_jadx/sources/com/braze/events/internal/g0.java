package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.triggers.events.b f9803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.triggers.actions.a f9804b;

    public g0(com.braze.triggers.events.b bVar, com.braze.triggers.actions.a aVar) {
        bVar.getClass();
        aVar.getClass();
        this.f9803a = bVar;
        this.f9804b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.areEqual(this.f9803a, g0Var.f9803a) && Intrinsics.areEqual(this.f9804b, g0Var.f9804b);
    }

    public final int hashCode() {
        return this.f9804b.hashCode() + (this.f9803a.hashCode() * 31);
    }

    public final String toString() {
        return "TriggeredActionRetryEvent(originalTriggerEvent=" + this.f9803a + ", failedTriggeredAction=" + this.f9804b + ")";
    }
}
