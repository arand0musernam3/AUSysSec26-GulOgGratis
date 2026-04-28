package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f2 f3139a = new f2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h2 f3140b;

    static {
        h2 h2Var = null;
        try {
            h2Var = (h2) qa.m.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f3140b = h2Var;
    }

    public static final void a(Fragment fragment, Fragment fragment2, boolean z11, q1.e eVar) {
        fragment.getClass();
        fragment2.getClass();
        if ((z11 ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList(eVar.f35782c);
            Iterator it = ((androidx.datastore.preferences.protobuf.f1) eVar.entrySet()).iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(eVar.f35782c);
            Iterator it2 = ((androidx.datastore.preferences.protobuf.f1) eVar.entrySet()).iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
        }
    }

    public static final String b(q1.e eVar, String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : (androidx.datastore.preferences.protobuf.f1) eVar.entrySet()) {
            if (Intrinsics.areEqual(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) CollectionsKt.firstOrNull(arrayList);
    }

    public static final void c(int i11, ArrayList arrayList) {
        arrayList.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i11);
        }
    }
}
