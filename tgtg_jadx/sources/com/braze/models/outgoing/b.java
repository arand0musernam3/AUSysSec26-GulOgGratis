package com.braze.models.outgoing;

import com.braze.models.IPutIntoJson;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements IPutIntoJson {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10175a;

    public b(String str) {
        str.getClass();
        this.f10175a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(this.f10175a, ((b) obj).f10175a);
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final Object getPropertiesJSONObject() {
        return this.f10175a;
    }

    public final int hashCode() {
        return this.f10175a.hashCode();
    }

    public final String toString() {
        return this.f10175a;
    }
}
