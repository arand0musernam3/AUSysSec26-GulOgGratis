package g9;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends q0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Class f20172r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Class cls) {
        super(true);
        cls.getClass();
        if (!Parcelable.class.isAssignableFrom(cls)) {
            wy.o.g(cls, " does not implement Parcelable.");
            throw null;
        }
        try {
            this.f20172r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e5) {
            org.bouncycastle.jce.provider.a.m(e5);
            throw null;
        }
    }

    @Override // g9.q0
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        return (Parcelable[]) bundle.get(str);
    }

    @Override // g9.q0
    public final String b() {
        return this.f20172r.getName();
    }

    @Override // g9.q0
    public final Object d(String str) {
        str.getClass();
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // g9.q0
    public final void e(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        str.getClass();
        this.f20172r.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(m0.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.f20172r, ((m0) obj).f20172r);
    }

    @Override // g9.q0
    public final boolean g(Object obj, Object obj2) {
        return kotlin.collections.v.b((Parcelable[]) obj, (Parcelable[]) obj2);
    }

    public final int hashCode() {
        return this.f20172r.hashCode();
    }
}
