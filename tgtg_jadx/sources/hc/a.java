package hc;

import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21833a;

    public a(String str) {
        this.f21833a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f21833a, ((a) obj).f21833a) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        String str = this.f21833a;
        return (str == null ? 0 : str.hashCode()) * 961;
    }

    public final String toString() {
        return a0.p("OnFileAction(scopeId=", this.f21833a, ", accountReferenceId=null, referenceId=null)");
    }
}
