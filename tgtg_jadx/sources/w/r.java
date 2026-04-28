package w;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s0.i1;
import s0.j1;
import s0.k2;
import s0.l1;
import s0.o2;
import s0.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f42776a = new r();

    public void a(o2 o2Var, i0.w wVar) {
        o2Var.getClass();
        s0.r0 r0Var = (s0.r0) o2Var.i(o2.K0, null);
        l1 l1Var = l1.f38382c;
        l1Var.getClass();
        s0.g gVar = s0.r0.f38435f;
        HashSet hashSet = new HashSet();
        i1 i1VarH = i1.h();
        ArrayList arrayList = new ArrayList();
        j1 j1VarA = j1.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        l1 l1VarE = l1.e(i1VarH);
        ArrayList arrayList3 = new ArrayList(arrayList);
        k2 k2Var = k2.f38372b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = j1VarA.f38373a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        int i11 = -1;
        new s0.r0(arrayList2, l1VarE, -1, arrayList3, new k2(arrayMap));
        if (r0Var != null) {
            i11 = r0Var.f38440c;
            wVar.b(r0Var.f38441d);
            l1Var = r0Var.f38439b;
            ((j1) wVar.f22749f).f38373a.putAll((Map) r0Var.f38442e.f38373a);
            List listUnmodifiableList = Collections.unmodifiableList(r0Var.f38438a);
            listUnmodifiableList.getClass();
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                ((HashSet) wVar.f22746c).add((x0) it.next());
            }
        }
        wVar.f22747d = i1.s(l1Var);
        new b0.b(o2Var);
        Object objI = o2Var.i(b0.b.f5055d, Integer.valueOf(i11));
        objI.getClass();
        wVar.f22745b = ((Number) objI).intValue();
        CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) o2Var.i(b0.b.f5058g, null);
        if (captureCallback != null) {
            wVar.c(new q(captureCallback));
        }
        a50.c cVar = new a50.c(12);
        o2Var.j(new a50.d(11, cVar, o2Var));
        wVar.e(new lz.i(l1.e((i1) cVar.f822b)));
    }
}
