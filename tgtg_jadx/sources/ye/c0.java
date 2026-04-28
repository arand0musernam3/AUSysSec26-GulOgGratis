package ye;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f45880a = new HashSet();

    public final boolean a(String str) {
        return !this.f45880a.contains(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.areEqual(c0.class, obj.getClass())) {
            return Intrinsics.areEqual(((c0) obj).f45880a, this.f45880a);
        }
        return false;
    }
}
