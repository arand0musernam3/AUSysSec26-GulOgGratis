package l90;

import i2.x;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import m90.g1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public interface a {
    x a();

    void b(SerialDescriptor serialDescriptor);

    char d(g1 g1Var, int i11);

    short e(g1 g1Var, int i11);

    byte f(g1 g1Var, int i11);

    long k(SerialDescriptor serialDescriptor, int i11);

    float l(g1 g1Var, int i11);

    Object m(SerialDescriptor serialDescriptor, int i11, i90.b bVar, Object obj);

    Object n(SerialDescriptor serialDescriptor, int i11, i90.b bVar, Object obj);

    int q(SerialDescriptor serialDescriptor, int i11);

    boolean t(SerialDescriptor serialDescriptor, int i11);

    String u(SerialDescriptor serialDescriptor, int i11);

    int w(SerialDescriptor serialDescriptor);

    double y(SerialDescriptor serialDescriptor, int i11);

    Decoder z(g1 g1Var, int i11);
}
