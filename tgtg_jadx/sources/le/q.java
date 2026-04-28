package le;

import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27749a;

    public /* synthetic */ q(String str) {
        this.f27749a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return Intrinsics.areEqual(this.f27749a, ((q) obj).f27749a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27749a.hashCode();
    }

    public final String toString() {
        return a0.p("Asset(assetName=", this.f27749a, ")");
    }
}
