package jf;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f25130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f25131b;

    public a(WeakReference weakReference, b bVar) {
        bVar.getClass();
        this.f25130a = weakReference;
        this.f25131b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f25130a, aVar.f25130a) && this.f25131b == aVar.f25131b;
    }

    public final int hashCode() {
        return this.f25131b.hashCode() + (this.f25130a.hashCode() * 31);
    }

    public final String toString() {
        return "ActivityCallbackEvent(activity=" + this.f25130a + ", type=" + this.f25131b + ')';
    }
}
