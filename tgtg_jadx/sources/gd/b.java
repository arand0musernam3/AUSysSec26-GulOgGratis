package gd;

import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f20362a = new b();

    public final boolean a(Object obj, Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj instanceof td.i) || !(obj2 instanceof td.i)) {
            return Intrinsics.areEqual(obj, obj2);
        }
        td.i iVar = (td.i) obj;
        td.i iVar2 = (td.i) obj2;
        return Intrinsics.areEqual(iVar.f39996a, iVar2.f39996a) && Intrinsics.areEqual(iVar.f39997b, iVar2.f39997b) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(iVar.f40000e, iVar2.f40000e) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(iVar.f40010p, iVar2.f40010p) && iVar.f40011q == iVar2.f40011q && iVar.f40012r == iVar2.f40012r;
    }

    public final int b(Object obj) {
        if (!(obj instanceof td.i)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        td.i iVar = (td.i) obj;
        return iVar.f40012r.hashCode() + ((iVar.f40011q.hashCode() + ((iVar.f40010p.hashCode() + a0.f(iVar.f40000e, (iVar.f39997b.hashCode() + (iVar.f39996a.hashCode() * 31)) * 961, 961)) * 31)) * 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }
}
