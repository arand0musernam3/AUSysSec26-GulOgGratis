package g9;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class p0 extends q0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Class f20194r;

    public p0(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            wy.o.g(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            wy.o.g(cls, " is an Enum. You should use EnumType instead.");
            throw null;
        }
        this.f20194r = cls;
    }

    @Override // g9.q0
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        return (Serializable) bundle.get(str);
    }

    @Override // g9.q0
    public String b() {
        return this.f20194r.getName();
    }

    @Override // g9.q0
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        str.getClass();
        serializable.getClass();
        this.f20194r.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        return Intrinsics.areEqual(this.f20194r, ((p0) obj).f20194r);
    }

    @Override // g9.q0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Serializable d(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f20194r.hashCode();
    }

    public p0(Class cls, int i11) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f20194r = cls;
        } else {
            wy.o.g(cls, " does not implement Serializable.");
            throw null;
        }
    }
}
