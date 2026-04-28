package v1;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z5.c f41766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f41767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d2.z1 f41768d;

    public j(Context context, z5.c cVar, long j9, d2.z1 z1Var) {
        this.f41765a = context;
        this.f41766b = cVar;
        this.f41767c = j9;
        this.f41768d = z1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f41765a, jVar.f41765a) && Intrinsics.areEqual(this.f41766b, jVar.f41766b) && i4.v.c(this.f41767c, jVar.f41767c) && Intrinsics.areEqual(this.f41768d, jVar.f41768d);
    }

    public final int hashCode() {
        int iHashCode = (this.f41766b.hashCode() + (this.f41765a.hashCode() * 31)) * 31;
        int i11 = i4.v.f23316i;
        u70.b0 b0Var = u70.c0.f40833b;
        return this.f41768d.hashCode() + e0.f.b(iHashCode, 31, this.f41767c);
    }
}
