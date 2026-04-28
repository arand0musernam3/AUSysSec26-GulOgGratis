package qp;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j[] f37229b = {l.a(m.PUBLICATION, new q60.a(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37230a;

    public /* synthetic */ i(int i11, List list) {
        if ((i11 & 1) == 0) {
            this.f37230a = new ArrayList();
        } else {
            this.f37230a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.areEqual(this.f37230a, ((i) obj).f37230a);
    }

    public final int hashCode() {
        return this.f37230a.hashCode();
    }

    public final String toString() {
        return e0.f.m("StationsResponse(stations=", ")", this.f37230a);
    }
}
