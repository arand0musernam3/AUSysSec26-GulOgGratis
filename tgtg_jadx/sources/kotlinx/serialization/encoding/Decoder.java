package kotlinx.serialization.encoding;

import i2.x;
import i90.b;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public interface Decoder {
    byte A();

    short B();

    float C();

    double D();

    x a();

    a c(SerialDescriptor serialDescriptor);

    boolean g();

    default Object h(b bVar) {
        bVar.getClass();
        return bVar.deserialize(this);
    }

    char i();

    int j(SerialDescriptor serialDescriptor);

    int p();

    String r();

    long s();

    boolean v();

    Decoder x(SerialDescriptor serialDescriptor);
}
