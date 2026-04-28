package zk;

import i90.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m90.c1;
import org.jetbrains.annotations.NotNull;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j[] f47962b = {l.a(m.PUBLICATION, new zendesk.ui.android.conversation.composer.b(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f47963a;

    public /* synthetic */ f(int i11, List list) {
        if (1 == (i11 & 1)) {
            this.f47963a = list;
        } else {
            c1.j(i11, 1, d.f47961a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.f47963a, ((f) obj).f47963a);
    }

    public final int hashCode() {
        return this.f47963a.hashCode();
    }

    public final String toString() {
        return e0.f.m("UserPointOfInterestRequest(userPointsOfInterest=", ")", this.f47963a);
    }

    public f(ArrayList arrayList) {
        this.f47963a = arrayList;
    }
}
