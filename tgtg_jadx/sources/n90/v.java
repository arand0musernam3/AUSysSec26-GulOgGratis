package n90;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SerialDescriptor f30785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30786c;

    public v(Object obj, boolean z11, SerialDescriptor serialDescriptor) {
        obj.getClass();
        this.f30784a = z11;
        this.f30785b = serialDescriptor;
        this.f30786c = obj.toString();
        if (serialDescriptor == null || serialDescriptor.isInline()) {
            return;
        }
        i4.a.f("Failed requirement.");
        throw null;
    }

    @Override // n90.g0
    public final String b() {
        return this.f30786c;
    }

    @Override // n90.g0
    public final boolean d() {
        return this.f30784a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return this.f30784a == vVar.f30784a && Intrinsics.areEqual(this.f30786c, vVar.f30786c);
    }

    public final int hashCode() {
        return this.f30786c.hashCode() + (Boolean.hashCode(this.f30784a) * 31);
    }

    @Override // n90.g0
    public final String toString() {
        boolean z11 = this.f30784a;
        String str = this.f30786c;
        if (!z11) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        o90.a0.a(str, sb2);
        return sb2.toString();
    }
}
