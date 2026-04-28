package com.braze.models;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements IPutIntoJson {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f10215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10216b;

    public q(UUID uuid) {
        uuid.getClass();
        this.f10215a = uuid;
        String string = uuid.toString();
        string.getClass();
        this.f10216b = string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.areEqual(this.f10215a, ((q) obj).f10215a);
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final Object getPropertiesJSONObject() {
        return this.f10216b;
    }

    public final int hashCode() {
        return this.f10215a.hashCode();
    }

    public final String toString() {
        return this.f10216b;
    }
}
