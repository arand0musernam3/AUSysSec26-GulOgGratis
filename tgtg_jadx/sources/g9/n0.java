package g9;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends q0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Class f20175r;

    public n0(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.f20175r = cls;
        } else {
            wy.o.g(cls, " does not implement Parcelable or Serializable.");
            throw null;
        }
    }

    @Override // g9.q0
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        return bundle.get(str);
    }

    @Override // g9.q0
    public final String b() {
        return this.f20175r.getName();
    }

    @Override // g9.q0
    public final Object d(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // g9.q0
    public final void e(Bundle bundle, String str, Object obj) {
        str.getClass();
        this.f20175r.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(n0.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.f20175r, ((n0) obj).f20175r);
    }

    public final int hashCode() {
        return this.f20175r.hashCode();
    }
}
