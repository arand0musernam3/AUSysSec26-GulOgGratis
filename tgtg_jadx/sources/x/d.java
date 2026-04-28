package x;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Set;
import kotlin.collections.g1;
import kotlin.jvm.internal.Intrinsics;
import ky.o;
import m0.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f43601a = new o(new d(), 29);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f43602b = g1.b(c0.f28478d);

    @Override // x.b
    public final Set a() {
        return f43602b;
    }

    @Override // x.b
    public final DynamicRangeProfiles b() {
        return null;
    }

    @Override // x.b
    public final Set c(c0 c0Var) {
        c0Var.getClass();
        pd.g.i("DynamicRange is not supported: " + c0Var, Intrinsics.areEqual(c0.f28478d, c0Var));
        return f43602b;
    }
}
