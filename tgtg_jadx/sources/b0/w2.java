package b0;

import android.hardware.camera2.CaptureRequest;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w2 extends z70.i implements Function1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5478j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f5479k;
    public final /* synthetic */ boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x2 f5480m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(LinkedHashSet linkedHashSet, boolean z11, x2 x2Var, x70.c cVar) {
        super(1, cVar);
        this.f5479k = linkedHashSet;
        this.l = z11;
        this.f5480m = x2Var;
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        return new w2(this.f5479k, this.l, this.f5480m, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((w2) create((x70.c) obj)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        x2 x2Var = this.f5480m;
        LinkedHashMap linkedHashMap = x2Var.f5501k;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f5478j;
        int i12 = 1;
        if (i11 != 0) {
            if (i11 == 1) {
                ba0.g.M(obj);
                return obj;
            }
            com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ba0.g.M(obj);
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl: Building SessionConfig...");
        }
        w.l0 l0Var = new w.l0(this.f5479k, this.l);
        s0.z1 z1Var = ((s0.y1) l0Var.f42720e.getValue()).c() ? (s0.z1) l0Var.f42721f.getValue() : null;
        if (z1Var == null) {
            if (wd.a.B(3, "CXCP")) {
                Log.d("CXCP", "Using default SessionConfig");
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashSet hashSet = new HashSet();
            s0.i1 i1VarH = s0.i1.h();
            ArrayList arrayList = new ArrayList();
            ArrayMap arrayMap = s0.j1.a().f38373a;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList(linkedHashSet);
            ArrayList arrayList6 = new ArrayList(arrayList2);
            ArrayList arrayList7 = new ArrayList(arrayList3);
            ArrayList arrayList8 = new ArrayList(arrayList4);
            ArrayList arrayList9 = new ArrayList(hashSet);
            s0.l1 l1VarE = s0.l1.e(i1VarH);
            ArrayList arrayList10 = new ArrayList(arrayList);
            s0.k2 k2Var = s0.k2.f38372b;
            ArrayMap arrayMap2 = new ArrayMap();
            for (String str : arrayMap.keySet()) {
                arrayMap2.put(str, arrayMap.get(str));
                arrayList5 = arrayList5;
            }
            i12 = 1;
            z1Var = new s0.z1(arrayList5, arrayList6, arrayList7, arrayList8, new s0.r0(arrayList9, l1VarE, 1, arrayList10, new s0.k2(arrayMap2)), null, null, 0, null);
        }
        s0.r0 r0Var = z1Var.f38494g;
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl: SessionConfig built. Updating state...");
        }
        n2 n2Var = n2.SESSION_CONFIG;
        v80.q qVar = x2.l;
        j3 j3Var = x2Var.f5495e.f5269e;
        boolean z11 = false;
        a aVar2 = new a(0);
        if (!Intrinsics.areEqual(r0Var.a(), s0.n.f38401h)) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            key.getClass();
            aVar2.f5038b.v(y9.w.m(key), r0Var.a());
        }
        aVar2.c(r0Var.f38439b);
        s0.k2 k2Var2 = r0Var.f38442e;
        k2Var2.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayMap arrayMap3 = k2Var2.f38373a;
        Set<String> setKeySet = arrayMap3.keySet();
        setKeySet.getClass();
        for (String str2 : setKeySet) {
            boolean z12 = z11;
            Object obj2 = arrayMap3.get(str2);
            obj2.getClass();
            linkedHashMap2.put(str2, obj2);
            z11 = z12;
        }
        boolean z13 = z11;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
        j3Var.getClass();
        List list = r0Var.f38441d;
        list.getClass();
        j jVar = new j();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jVar.a((s0.p) it.next(), j3Var);
        }
        e0.h1[] h1VarArr = new e0.h1[1];
        h1VarArr[z13 ? 1 : 0] = jVar;
        linkedHashMap.put(n2Var, new q2(aVar2, linkedHashMap3, kotlin.collections.h1.d(h1VarArr), new e0.m1(r0Var.f38440c)));
        a0.j jVar2 = x2Var.f5493c;
        List listUnmodifiableList = Collections.unmodifiableList(r0Var.f38438a);
        listUnmodifiableList.getClass();
        LinkedHashSet linkedHashSetB = jVar2.b(listUnmodifiableList);
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl: State update processing.");
        }
        q2 q2VarN = x2.n(linkedHashMap);
        this.f5478j = i12;
        Object objP = x2Var.p(q2VarN, linkedHashSetB, this);
        return objP == aVar ? aVar : objP;
    }
}
