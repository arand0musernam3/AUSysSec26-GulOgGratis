package m90;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class l1 implements SerialDescriptor, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f29823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f29825c;

    public l1(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        this.f29823a = serialDescriptor;
        this.f29824b = serialDescriptor.a() + '?';
        this.f29825c = c1.b(serialDescriptor);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.f29824b;
    }

    @Override // m90.l
    public final Set b() {
        return this.f29825c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        return this.f29823a.d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return this.f29823a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l1) {
            return Intrinsics.areEqual(this.f29823a, ((l1) obj).f29823a);
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i11) {
        return this.f29823a.f(i11);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i11) {
        return this.f29823a.g(i11);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f29823a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final p30.b getKind() {
        return this.f29823a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i11) {
        return this.f29823a.h(i11);
    }

    public final int hashCode() {
        return this.f29823a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i11) {
        return this.f29823a.i(i11);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.f29823a.isInline();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f29823a);
        sb2.append('?');
        return sb2.toString();
    }
}
