package androidx.camera.camera2.compat.quirk;

import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.y;
import l50.a;
import r8.k;
import s0.c2;
import s0.d2;
import s0.e2;
import s0.g2;
import s0.i2;
import s0.n1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;", "Ls0/n1;", "a/a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExtraSupportedSurfaceCombinationsQuirk implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d2 f2184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d2 f2185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f2186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f2187d;

    static {
        d2 d2Var = new d2();
        c2 c2Var = i2.f38344e;
        g2 g2Var = g2.YUV;
        e2 e2Var = e2.VGA;
        c2 c2Var2 = i2.f38344e;
        d2Var.a(a.n(g2Var, e2Var, c2Var2));
        g2 g2Var2 = g2.PRIV;
        e2 e2Var2 = e2.PREVIEW;
        d2Var.a(a.n(g2Var2, e2Var2, c2Var2));
        e2 e2Var3 = e2.MAXIMUM;
        d2Var.a(a.n(g2Var, e2Var3, c2Var2));
        f2184a = d2Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(a.n(g2Var, e2Var, c2Var2));
        arrayList.add(a.n(g2Var, e2Var2, c2Var2));
        arrayList.add(a.n(g2Var, e2Var3, c2Var2));
        d2 d2Var2 = new d2();
        k.B(d2Var2, a.n(g2Var2, e2Var2, c2Var2), g2Var2, e2Var, c2Var2);
        d2Var2.a(a.n(g2Var, e2Var3, c2Var2));
        f2185b = d2Var2;
        f2186c = y.W(new String[]{"PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"});
        f2187d = y.W(new String[]{"SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"});
    }
}
