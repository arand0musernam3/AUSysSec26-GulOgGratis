package vj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m90.c1;
import org.jetbrains.annotations.NotNull;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u70.j[] f42416b = {l.a(m.PUBLICATION, new uu.a(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42417a;

    public /* synthetic */ i(int i11, List list) {
        if (1 == (i11 & 1)) {
            this.f42417a = list;
        } else {
            c1.j(i11, 1, g.f42415a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.areEqual(this.f42417a, ((i) obj).f42417a);
    }

    public final int hashCode() {
        return this.f42417a.hashCode();
    }

    public final String toString() {
        return e0.f.m("FavoriteScheduledReminderRequest(days=", ")", this.f42417a);
    }

    public i(List list) {
        list.getClass();
        this.f42417a = list;
    }
}
