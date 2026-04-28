package m90;

import com.braze.h2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SerialDescriptor f29777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SerialDescriptor f29778c;

    public e0(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.f29776a = str;
        this.f29777b = serialDescriptor;
        this.f29778c = serialDescriptor2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.f29776a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        i4.a.f(r8.k.l(str, " is not a valid map index"));
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.areEqual(this.f29776a, e0Var.f29776a) && Intrinsics.areEqual(this.f29777b, e0Var.f29777b) && Intrinsics.areEqual(this.f29778c, e0Var.f29778c);
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
        i4.a.i(r8.k.p(org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "Illegal index ", ", "), this.f29776a, " expects only non-negative indices"));
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final p30.b getKind() {
        return k90.j.l;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i11) {
        if (i11 < 0) {
            i4.a.i(r8.k.p(org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "Illegal index ", ", "), this.f29776a, " expects only non-negative indices"));
            return null;
        }
        int i12 = i11 % 2;
        if (i12 == 0) {
            return this.f29777b;
        }
        if (i12 == 1) {
            return this.f29778c;
        }
        h2.b("Unreached");
        return null;
    }

    public final int hashCode() {
        return this.f29778c.hashCode() + ((this.f29777b.hashCode() + (this.f29776a.hashCode() * 31)) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i11) {
        if (i11 >= 0) {
            return false;
        }
        i4.a.i(r8.k.p(org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "Illegal index ", ", "), this.f29776a, " expects only non-negative indices"));
        return false;
    }

    public final String toString() {
        return this.f29776a + '(' + this.f29777b + ", " + this.f29778c + ')';
    }
}
