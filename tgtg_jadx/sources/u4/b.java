package u4;

import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyEvent f40734a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return Intrinsics.areEqual(this.f40734a, ((b) obj).f40734a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40734a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f40734a + ')';
    }
}
