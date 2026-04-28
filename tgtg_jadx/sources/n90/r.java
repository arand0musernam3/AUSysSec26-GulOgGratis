package n90;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u70.t f30783a;

    public r(Function0 function0) {
        this.f30783a = u70.l.b(function0);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return b().a();
    }

    public final SerialDescriptor b() {
        return (SerialDescriptor) this.f30783a.getValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        return b().d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return b().e();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i11) {
        return b().f(i11);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i11) {
        return b().g(i11);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final p30.b getKind() {
        return b().getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i11) {
        return b().h(i11);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i11) {
        return b().i(i11);
    }
}
