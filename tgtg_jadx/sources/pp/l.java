package pp;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u70.j[] f35602b = {u70.l.a(m.PUBLICATION, new p9.a(12))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f35603a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.areEqual(this.f35603a, ((l) obj).f35603a);
    }

    public final int hashCode() {
        return this.f35603a.hashCode();
    }

    public final String toString() {
        return e0.f.m("StationsRequest(lineIds=", ")", this.f35603a);
    }
}
