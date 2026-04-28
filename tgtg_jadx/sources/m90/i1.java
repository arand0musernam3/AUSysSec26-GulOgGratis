package m90;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class i1 implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k90.d f29811b;

    public i1(String str, k90.d dVar) {
        str.getClass();
        dVar.getClass();
        this.f29810a = str;
        this.f29811b = dVar;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.f29810a;
    }

    public final void b() {
        throw new IllegalStateException(r8.k.p(new StringBuilder("Primitive descriptor "), this.f29810a, " does not have elements"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        b();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return Intrinsics.areEqual(this.f29810a, i1Var.f29810a) && Intrinsics.areEqual(this.f29811b, i1Var.f29811b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i11) {
        b();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i11) {
        b();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final p30.b getKind() {
        return this.f29811b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i11) {
        b();
        throw null;
    }

    public final int hashCode() {
        return (this.f29811b.hashCode() * 31) + this.f29810a.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i11) {
        b();
        throw null;
    }

    public final String toString() {
        return w2.l1.f(new StringBuilder("PrimitiveDescriptor("), this.f29810a, ')');
    }
}
