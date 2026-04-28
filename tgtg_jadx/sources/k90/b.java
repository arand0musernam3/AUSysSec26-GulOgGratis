package k90;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f26209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KClass f26210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26211c;

    public b(e eVar, KClass kClass) {
        kClass.getClass();
        this.f26209a = eVar;
        this.f26210b = kClass;
        this.f26211c = eVar.f26222a + '<' + kClass.getSimpleName() + '>';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.f26211c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        return this.f26209a.d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return this.f26209a.f26224c;
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && Intrinsics.areEqual(this.f26209a, bVar.f26209a) && Intrinsics.areEqual(bVar.f26210b, this.f26210b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i11) {
        return this.f26209a.f26227f[i11];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i11) {
        return this.f26209a.f26229h[i11];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f26209a.f26225d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final p30.b getKind() {
        return this.f26209a.f26223b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i11) {
        return this.f26209a.f26228g[i11];
    }

    public final int hashCode() {
        return this.f26211c.hashCode() + (this.f26210b.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i11) {
        return this.f26209a.f26230i[i11];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f26210b + ", original: " + this.f26209a + ')';
    }
}
