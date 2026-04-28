package f6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j6.f f17399a;

    public i() {
        new ArrayList();
        this.f17399a = new j6.f(new char[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return Intrinsics.areEqual(this.f17399a, ((i) obj).f17399a);
    }

    public final int hashCode() {
        return this.f17399a.hashCode();
    }
}
