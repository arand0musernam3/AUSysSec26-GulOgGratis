package ul;

import i90.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41386a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.f41386a, ((c) obj).f41386a);
    }

    public final int hashCode() {
        return this.f41386a.hashCode();
    }

    public final String toString() {
        return a0.p("LoginCharityInterestedRequest(userEmail=", this.f41386a, ")");
    }
}
