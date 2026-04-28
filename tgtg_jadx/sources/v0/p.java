package v0;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import m0.m1;
import s0.o2;
import s0.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static final boolean a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m1 m1Var = (m1) it.next();
            if (m1Var != null && c(m1Var)) {
                return true;
            }
        }
        return false;
    }

    public static final u0.b b(ArrayList arrayList, Function1 function1) {
        u0.a aVar = u0.b.Companion;
        Iterator it = arrayList.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            int iT = ((o2) function1.invoke((m1) it.next())).t();
            if (iT != 0) {
                if (i12 != iT && i12 != 0) {
                    wd.a.I("UseCaseUtil", r8.k.g(i12, iT, "Unexpected configurations: Overwriting current previewStabilizationMode(", ") with useCasePreviewStabilization(", ")!"));
                }
                i12 = iT;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int iO = ((o2) function1.invoke((m1) it2.next())).o();
            if (iO != 0) {
                if (i11 != iO && i11 != 0) {
                    wd.a.I("UseCaseUtil", r8.k.g(i11, iO, "Unexpected configurations: Overwriting current videoStabilizationMode(", ") with useCaseVideoStabilization(", ")!"));
                }
                i11 = iO;
            }
        }
        aVar.getClass();
        return (i12 == 1 || i11 == 1) ? u0.b.OFF : i12 == 2 ? u0.b.PREVIEW : i11 == 2 ? u0.b.ON : u0.b.UNSPECIFIED;
    }

    public static final boolean c(m1 m1Var) {
        m1Var.getClass();
        if (m1Var.f28560i.g(o2.U0)) {
            return m1Var.f28560i.n() == q2.VIDEO_CAPTURE;
        }
        wd.a.r("UseCaseUtil", m1Var + " UseCase does not have capture type.");
        return false;
    }
}
