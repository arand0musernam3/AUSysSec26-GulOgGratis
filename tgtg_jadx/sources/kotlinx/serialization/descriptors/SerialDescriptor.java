package kotlinx.serialization.descriptors;

import java.util.List;
import kotlin.collections.n0;
import p30.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public interface SerialDescriptor {
    String a();

    default boolean c() {
        return false;
    }

    int d(String str);

    int e();

    String f(int i11);

    List g(int i11);

    default List getAnnotations() {
        return n0.f26529a;
    }

    b getKind();

    SerialDescriptor h(int i11);

    boolean i(int i11);

    default boolean isInline() {
        return false;
    }
}
