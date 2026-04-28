package c0;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import com.braze.h2;
import e0.v;
import f0.t0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import ky.o;
import m0.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f6790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f6792c;

    public b(v vVar) {
        vVar.getClass();
        this.f6790a = vVar;
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key.getClass();
        int[] iArr = (int[]) ((t0) vVar).c(key);
        this.f6791b = iArr != null ? y.t(iArr, 18) : false;
        this.f6792c = a70.a.c(vVar);
    }

    public static boolean a(c0 c0Var, c0 c0Var2) {
        boolean zB = c0Var2.b();
        int i11 = c0Var2.f28484a;
        if (!zB) {
            qc.y.j("Fully specified range ", c0Var2, " not actually fully specified.");
            return false;
        }
        int i12 = c0Var.f28484a;
        if (i12 == 2 && i11 == 1) {
            return false;
        }
        if (i12 != 2 && i12 != 0 && i12 != i11) {
            return false;
        }
        int i13 = c0Var.f28485b;
        return i13 == 0 || i13 == c0Var2.f28485b;
    }

    public static boolean b(c0 c0Var, c0 c0Var2, LinkedHashSet linkedHashSet) {
        if (linkedHashSet.contains(c0Var2)) {
            return a(c0Var, c0Var2);
        }
        if (!wd.a.B(3, "CXCP")) {
            return false;
        }
        Log.d("CXCP", "DynamicRangeResolver: Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + c0Var + "\nCandidate dynamic range:\n  " + c0Var2);
        return false;
    }

    public static c0 c(c0 c0Var, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        if (c0Var.f28484a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            c0 c0Var2 = (c0) it.next();
            int i11 = c0Var2.f28484a;
            if (!c0Var2.b()) {
                h2.b("Fully specified DynamicRange must have fully defined encoding.");
                return null;
            }
            if (i11 != 1 && b(c0Var, c0Var2, linkedHashSet2)) {
                return c0Var2;
            }
        }
        return null;
    }

    public static void e(LinkedHashSet linkedHashSet, c0 c0Var, o oVar) {
        pd.g.n("Cannot update already-empty constraints.", !linkedHashSet.isEmpty());
        oVar.getClass();
        c0Var.getClass();
        Set setC = ((x.b) oVar.f26718b).c(c0Var);
        Set set = setC;
        if (set.isEmpty()) {
            return;
        }
        Set setV0 = CollectionsKt.v0(linkedHashSet);
        linkedHashSet.retainAll(set);
        if (linkedHashSet.isEmpty()) {
            e40.a.l("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  ", c0Var, "\nConstraints:\n  ", setC, "\nExisting constraints:\n  ", setV0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedHashMap d(java.util.ArrayList r20, java.util.List r21, java.util.List r22) {
        /*
            Method dump skipped, instruction units count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.b.d(java.util.ArrayList, java.util.List, java.util.List):java.util.LinkedHashMap");
    }
}
