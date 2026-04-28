package androidx.camera.core.internal.compat.quirk;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m0.j0;
import m0.m1;
import m0.s0;
import s0.n1;
import s0.o2;
import s0.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f2221a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    public static boolean b(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() == 3) {
            Iterator it = linkedHashSet.iterator();
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            while (it.hasNext()) {
                m1 m1Var = (m1) it.next();
                if (m1Var instanceof s0) {
                    z11 = true;
                } else if (m1Var instanceof j0) {
                    z13 = true;
                } else if (m1Var.f28560i.g(o2.U0)) {
                    z12 = m1Var.f28560i.n() == q2.VIDEO_CAPTURE;
                }
            }
            if (z11 && z12 && z13) {
                return true;
            }
        }
        return false;
    }
}
