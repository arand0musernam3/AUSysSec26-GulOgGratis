package kotlinx.serialization.encoding;

import i2.x;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public interface Encoder {
    void A(long j9);

    void D(String str);

    x a();

    b c(SerialDescriptor serialDescriptor);

    void f();

    void g(double d3);

    void h(short s7);

    void j(byte b8);

    void k(boolean z11);

    void n(float f11);

    void o(char c3);

    void t(SerialDescriptor serialDescriptor, int i11);

    void u(int i11);

    Encoder v(SerialDescriptor serialDescriptor);

    default void w(KSerializer kSerializer, Object obj) {
        kSerializer.getClass();
        kSerializer.serialize(this, obj);
    }

    default b x(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return c(serialDescriptor);
    }
}
