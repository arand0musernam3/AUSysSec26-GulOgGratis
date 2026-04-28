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
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j[] f37222b = {l.a(m.PUBLICATION, new q60.a(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37223a;

    public /* synthetic */ c(int i11, List list) {
        if ((i11 & 1) == 0) {
            this.f37223a = new ArrayList();
        } else {
            this.f37223a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.f37223a, ((c) obj).f37223a);
    }

    public final int hashCode() {
        return this.f37223a.hashCode();
    }

    public final String toString() {
        return e0.f.m("LinesResponse(lines=", ")", this.f37223a);
    }
}
