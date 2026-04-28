package qp;

import com.app.tgtg.model.remote.user.response.ItemsListPaging;
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
@i90.h
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j[] f37225c = {l.a(m.PUBLICATION, new q60.a(17)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ItemsListPaging f37227b;

    public /* synthetic */ f(int i11, List list, ItemsListPaging itemsListPaging) {
        if (2 != (i11 & 2)) {
            c1.j(i11, 2, d.f37224a.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.f37226a = new ArrayList();
        } else {
            this.f37226a = list;
        }
        this.f37227b = itemsListPaging;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f37226a, fVar.f37226a) && Intrinsics.areEqual(this.f37227b, fVar.f37227b);
    }

    public final int hashCode() {
        return this.f37227b.hashCode() + (this.f37226a.hashCode() * 31);
    }

    public final String toString() {
        return "MetroSearchResponse(results=" + this.f37226a + ", paging=" + this.f37227b + ")";
    }
}
