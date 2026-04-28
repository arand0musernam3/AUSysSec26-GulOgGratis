package com.braze.models.response;

import com.braze.requests.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f10229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.communication.d f10230b;

    public f(o oVar, com.braze.communication.d dVar) {
        oVar.getClass();
        dVar.getClass();
        this.f10229a = oVar;
        this.f10230b = dVar;
    }

    @Override // com.braze.models.response.d
    public final String a() {
        return "An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f10229a, fVar.f10229a) && Intrinsics.areEqual("An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.", "An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.") && Intrinsics.areEqual(this.f10230b, fVar.f10230b);
    }

    public final int hashCode() {
        return this.f10230b.hashCode() + (((this.f10229a.hashCode() * 31) - 525898564) * 31);
    }

    public final String toString() {
        return "NetworkCommunicationFailureResponseError(originalRequest=" + this.f10229a + ", errorMessage=An error occurred during request processing, resulting in no valid response being received. Check the error log for more details., connectionResult=" + this.f10230b + ")";
    }
}
