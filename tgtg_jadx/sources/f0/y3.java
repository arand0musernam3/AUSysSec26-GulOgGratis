package f0;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0.d[] f17005a = {new h0.d(120000000000L), new h0.d(300000000000L)};

    public static final v70.i a(Map map, i0.g0 g0Var) {
        v70.i iVar = new v70.i();
        for (e0.e0 e0Var : g0Var.f22658g) {
            Surface surface = (Surface) map.get(new e0.p1(e0Var.f15329a));
            if (surface != null) {
                Iterator it = e0Var.f15330b.iterator();
                while (it.hasNext()) {
                    iVar.put(new e0.x0(((i0.e0) it.next()).f22625a), surface);
                }
            }
        }
        return iVar.b();
    }

    public static final b3 b(e0.n nVar, i0.g0 g0Var, Map map) {
        LinkedHashMap linkedHashMap;
        r rVar;
        k0.e eVar;
        e0.e0 e0VarA;
        nVar.getClass();
        String str = nVar.f15369a;
        map.getClass();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        v70.i iVar = g0Var.f22656e;
        LinkedHashMap linkedHashMap5 = g0Var.f22655d;
        Iterator it = ((v70.j) iVar.entrySet()).iterator();
        do {
            int i11 = 1;
            if (!it.hasNext()) {
                for (e0.e0 e0Var : g0Var.f22658g) {
                    ArrayList<i0.e0> arrayList2 = e0Var.f15330b;
                    int i12 = e0Var.f15329a;
                    if (arrayList2.size() == i11) {
                        Surface surface = (Surface) map.get(new e0.p1(i12));
                        if (surface != null) {
                            linkedHashMap3.put(new e0.x0(((i0.e0) CollectionsKt.h0(arrayList2)).f22625a), surface);
                        }
                    } else {
                        for (i0.e0 e0Var2 : arrayList2) {
                            Object obj = linkedHashMap5.get(e0Var2);
                            if (obj == null) {
                                com.braze.h2.b("Required value was null.");
                                return null;
                            }
                            OutputConfiguration outputConfiguration = (OutputConfiguration) linkedHashMap4.get((i0.d0) obj);
                            Surface surface2 = outputConfiguration != null ? outputConfiguration.getSurface() : (Surface) map.get(new e0.p1(i12));
                            if (surface2 != null) {
                                linkedHashMap3.put(new e0.x0(e0Var2.f22625a), surface2);
                                i11 = 1;
                            }
                        }
                    }
                }
                Iterator it2 = g0Var.f22654c.iterator();
                r rVar2 = null;
                while (it2.hasNext()) {
                    i0.d0 d0Var = (i0.d0) it2.next();
                    ArrayList arrayList3 = d0Var.l;
                    ArrayList arrayList4 = d0Var.l;
                    List list = d0Var.f22621k;
                    e0.e1 e1Var = d0Var.f22616f;
                    Integer num = d0Var.f22615e;
                    Iterator it3 = it2;
                    String str2 = d0Var.f22614d;
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        List list2 = list;
                        e0.e1 e1Var2 = e1Var;
                        Surface surface3 = (Surface) map.get(new e0.p1(((e0.e0) it4.next()).f15329a));
                        if (surface3 != null) {
                            arrayList5.add(surface3);
                        }
                        e1Var = e1Var2;
                        list = list2;
                    }
                    List list3 = list;
                    e0.e1 e1Var3 = e1Var;
                    OutputConfiguration outputConfiguration2 = (OutputConfiguration) linkedHashMap4.get(d0Var);
                    LinkedHashMap linkedHashMap6 = linkedHashMap4;
                    if (outputConfiguration2 == null) {
                        if (e1Var3 != null) {
                            linkedHashMap = linkedHashMap3;
                            rVar = rVar2;
                            if (arrayList5.size() != arrayList3.size()) {
                                Size size = d0Var.f22612b;
                                e1Var3.getClass();
                                r rVarA = h2.a(null, null, e1Var3, d0Var.f22617g, d0Var.f22618h, d0Var.f22619i, list3, size, arrayList4.size() > 1, num != null ? num.intValue() : -1, !Intrinsics.areEqual(str2, str) ? str2 : null, 2);
                                if (rVarA == null) {
                                    Log.w("CXCP", "Failed to create AndroidOutputConfiguration for " + d0Var);
                                } else {
                                    arrayList.add(rVarA);
                                    Iterator it5 = arrayList3.iterator();
                                    while (it5.hasNext()) {
                                        linkedHashMap2.put(new e0.p1(((e0.e0) it5.next()).f15329a), rVarA);
                                    }
                                }
                            }
                        } else {
                            linkedHashMap = linkedHashMap3;
                            rVar = rVar2;
                        }
                        if (arrayList5.size() != arrayList3.size()) {
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj2 : arrayList3) {
                                if (!map.containsKey(new e0.p1(((e0.e0) obj2).f15329a))) {
                                    arrayList6.add(obj2);
                                }
                            }
                            e40.a.j("Surfaces are not yet available for ", d0Var, "! Missing surfaces for ", arrayList6, 33);
                            return null;
                        }
                        r rVarA2 = h2.a((Surface) CollectionsKt.O(arrayList5), null, null, d0Var.f22617g, d0Var.f22618h, d0Var.f22619i, list3, d0Var.f22612b, arrayList4.size() > 1, num != null ? num.intValue() : -1, !Intrinsics.areEqual(str2, str) ? str2 : null, 6);
                        if (rVarA2 == null) {
                            Log.w("CXCP", "Failed to create AndroidOutputConfiguration for " + d0Var);
                        } else {
                            for (Surface surface4 : CollectionsKt.J(1, arrayList5)) {
                                surface4.getClass();
                                rVarA2.f16863a.addSurface(surface4);
                            }
                            e0.d0 d0Var2 = nVar.f15373e;
                            if (d0Var2 != null) {
                                e0.e0 e0Var3 = (e0.e0) g0Var.f22653b.get(d0Var2);
                                if (e0Var3 == null) {
                                    com.braze.h2.b("Postview Stream in StreamGraph cannot be null for reprocessing request");
                                    return null;
                                }
                                if (rVar == null && arrayList3.contains(e0Var3)) {
                                    rVar2 = rVarA2;
                                    it2 = it3;
                                    linkedHashMap4 = linkedHashMap6;
                                    linkedHashMap3 = linkedHashMap;
                                } else {
                                    arrayList.add(rVarA2);
                                }
                            } else {
                                arrayList.add(rVarA2);
                            }
                            it2 = it3;
                            linkedHashMap4 = linkedHashMap6;
                            linkedHashMap3 = linkedHashMap;
                            rVar2 = rVar;
                        }
                    } else {
                        if (arrayList5.size() != arrayList3.size()) {
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj3 : arrayList3) {
                                if (!map.containsKey(new e0.p1(((e0.e0) obj3).f15329a))) {
                                    arrayList7.add(obj3);
                                }
                            }
                            e40.a.j("Surfaces are not yet available for ", d0Var, "! Missing surfaces for ", arrayList7, 33);
                            return null;
                        }
                        arrayList.add(new r(outputConfiguration2));
                        linkedHashMap = linkedHashMap3;
                        rVar = rVar2;
                    }
                    it2 = it3;
                    linkedHashMap4 = linkedHashMap6;
                    linkedHashMap3 = linkedHashMap;
                    rVar2 = rVar;
                }
                return new b3(arrayList, linkedHashMap2, rVar2, linkedHashMap3);
            }
            Map.Entry entry = (Map.Entry) it.next();
            int i13 = ((e0.p1) entry.getKey()).f15397a;
            eVar = (k0.e) entry.getValue();
            e0VarA = g0Var.a(i13);
            if (e0VarA == null) {
                com.braze.h2.b("Required value was null.");
                return null;
            }
        } while (e0VarA.f15330b.size() == 1);
        if (Build.VERSION.SDK_INT < 31) {
            i4.a.f("Cannot configure multiple outputs pre-S!");
            return null;
        }
        Object objT = eVar.t(Reflection.getOrCreateKotlinClass(k0.c.class));
        if (objT == null) {
            com.braze.h2.b("Required value was null.");
            return null;
        }
        throw null;
    }
}
