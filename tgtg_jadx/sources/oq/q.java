package oq;

import com.app.tgtg.model.local.GenericErrors;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GenericErrors f32950a;

    public q(GenericErrors genericErrors) {
        genericErrors.getClass();
        this.f32950a = genericErrors;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.areEqual(this.f32950a, ((q) obj).f32950a);
    }

    public final int hashCode() {
        return this.f32950a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f32950a + ")";
    }
}
