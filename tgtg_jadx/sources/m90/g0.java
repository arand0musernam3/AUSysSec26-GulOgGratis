package m90;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends e1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f29799m;

    public g0(String str, d0 d0Var) {
        super(str, d0Var, 1);
        this.f29799m = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, u70.j] */
    @Override // m90.e1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (Intrinsics.areEqual(this.f29779a, serialDescriptor.a())) {
                g0 g0Var = (g0) obj;
                if (g0Var.f29799m && Arrays.equals((SerialDescriptor[]) this.f29789k.getValue(), (SerialDescriptor[]) g0Var.f29789k.getValue())) {
                    int iE = serialDescriptor.e();
                    int i11 = this.f29781c;
                    if (i11 == iE) {
                        for (int i12 = 0; i12 < i11; i12++) {
                            if (Intrinsics.areEqual(h(i12).a(), serialDescriptor.h(i12).a()) && Intrinsics.areEqual(h(i12).getKind(), serialDescriptor.h(i12).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // m90.e1
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.f29799m;
    }
}
