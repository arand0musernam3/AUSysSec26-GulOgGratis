package androidx.lifecycle.viewmodel;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import y8.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "", "<init>", "()V", "y8/b", "y8/a", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CreationExtras {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f3543a = new LinkedHashMap();

    public abstract Object a(b bVar);

    public final boolean equals(Object obj) {
        if (obj instanceof CreationExtras) {
            return Intrinsics.areEqual(this.f3543a, ((CreationExtras) obj).f3543a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3543a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f3543a + ')';
    }
}
