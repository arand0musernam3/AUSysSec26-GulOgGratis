package m9;

import android.os.Bundle;
import com.adyen.checkout.components.core.Address;
import g9.q0;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import wy.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends q0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Class f29729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Class f29730s;

    public b(Class cls) {
        super(true);
        this.f29729r = cls;
        if (!Serializable.class.isAssignableFrom(cls)) {
            o.g(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            this.f29730s = cls;
        } else {
            o.g(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // g9.q0
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof Serializable) {
            return (Serializable) obj;
        }
        return null;
    }

    @Override // g9.q0
    public final String b() {
        return this.f29730s.getName();
    }

    @Override // g9.q0
    public final Object d(String str) {
        str.getClass();
        Object obj = null;
        if (Intrinsics.areEqual(str, Address.ADDRESS_NULL_PLACEHOLDER)) {
            return null;
        }
        Class cls = this.f29730s;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            Object obj2 = enumConstants[i11];
            Enum r62 = (Enum) obj2;
            r62.getClass();
            if (y.k(r62.name(), str, true)) {
                obj = obj2;
                break;
            }
            i11++;
        }
        Enum r12 = (Enum) obj;
        if (r12 != null) {
            return r12;
        }
        StringBuilder sbS = e0.f.s("Enum value ", str, " not found for type ");
        sbS.append(cls.getName());
        sbS.append('.');
        throw new IllegalArgumentException(sbS.toString());
    }

    @Override // g9.q0
    public final void e(Bundle bundle, String str, Object obj) {
        str.getClass();
        bundle.putSerializable(str, (Serializable) this.f29729r.cast((Serializable) obj));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return Intrinsics.areEqual(this.f29729r, ((b) obj).f29729r);
    }

    public final int hashCode() {
        return this.f29729r.hashCode();
    }
}
