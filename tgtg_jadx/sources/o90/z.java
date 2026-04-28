package o90;

import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m90.b2;
import m90.e2;
import m90.v1;
import m90.y1;
import u70.c0;
import u70.g0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f32221a;

    static {
        u70.z.f40865b.getClass();
        c0.f40833b.getClass();
        u70.w.f40862b.getClass();
        g0.f40838b.getClass();
        f32221a = kotlin.collections.y.W(new SerialDescriptor[]{y1.f29890b, b2.f29760b, v1.f29871b, e2.f29791b});
    }

    public static final boolean a(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return serialDescriptor.isInline() && f32221a.contains(serialDescriptor);
    }
}
