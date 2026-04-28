package m90;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n0 implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f29830a;

    public n0(SerialDescriptor serialDescriptor) {
        this.f29830a = serialDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        i4.a.f(r8.k.l(str, " is not a valid list index"));
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Intrinsics.areEqual(this.f29830a, n0Var.f29830a) && Intrinsics.areEqual(a(), n0Var.a());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i11) {
        return String.valueOf(i11);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i11) {
        if (i11 >= 0) {
            return kotlin.collections.n0.f26529a;
        }
        e40.a.m(org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "Illegal index ", ", "), a(), " expects only non-negative indices");
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final p30.b getKind() {
        return k90.j.f26241k;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i11) {
        if (i11 >= 0) {
            return this.f29830a;
        }
        e40.a.m(org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "Illegal index ", ", "), a(), " expects only non-negative indices");
        return null;
    }

    public final int hashCode() {
        return a().hashCode() + (this.f29830a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i11) {
        if (i11 >= 0) {
            return false;
        }
        e40.a.m(org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "Illegal index ", ", "), a(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return a() + '(' + this.f29830a + ')';
    }
}
