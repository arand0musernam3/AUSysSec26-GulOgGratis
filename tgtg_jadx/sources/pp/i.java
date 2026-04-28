package pp;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u70.j[] f35599b = {u70.l.a(m.PUBLICATION, new p9.a(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f35600a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.areEqual(this.f35600a, ((i) obj).f35600a);
    }

    public final int hashCode() {
        return this.f35600a.hashCode();
    }

    public final String toString() {
        return e0.f.m("PinnedStationsRequest(placeIds=", ")", this.f35600a);
    }
}
