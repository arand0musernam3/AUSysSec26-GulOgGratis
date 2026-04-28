package com.braze.models;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f10133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10134b;

    public b(LinkedHashSet linkedHashSet) {
        linkedHashSet.getClass();
        this.f10133a = linkedHashSet;
        this.f10134b = linkedHashSet.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(this.f10133a, ((b) obj).f10133a);
    }

    public final int hashCode() {
        return this.f10133a.hashCode();
    }

    @Override // com.braze.models.m
    public final boolean isEmpty() {
        return this.f10134b;
    }

    public final String toString() {
        return "BrazeEventContainer(eventsList=" + this.f10133a + ")";
    }
}
