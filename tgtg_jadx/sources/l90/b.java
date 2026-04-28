package l90;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import m90.g1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public interface b {
    void B(SerialDescriptor serialDescriptor, int i11, long j9);

    default boolean C(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return true;
    }

    void b(SerialDescriptor serialDescriptor);

    void d(g1 g1Var, int i11, byte b8);

    void e(g1 g1Var, int i11, char c3);

    void i(SerialDescriptor serialDescriptor, int i11, KSerializer kSerializer, Object obj);

    void l(g1 g1Var, int i11, short s7);

    void m(int i11, int i12, SerialDescriptor serialDescriptor);

    void p(SerialDescriptor serialDescriptor, int i11, boolean z11);

    void q(SerialDescriptor serialDescriptor, int i11, String str);

    void r(SerialDescriptor serialDescriptor, int i11, KSerializer kSerializer, Object obj);

    Encoder s(g1 g1Var, int i11);

    void y(g1 g1Var, int i11, float f11);

    void z(SerialDescriptor serialDescriptor, int i11, double d3);
}
