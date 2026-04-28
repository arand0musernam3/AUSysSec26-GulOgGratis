package androidx.lifecycle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f3419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f3420b;

    public c1() {
        this.f3419a = new LinkedHashMap();
        kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
        o0Var.getClass();
        this.f3420b = new n1(o0Var);
    }

    public final Object a(String str) {
        Object value;
        str.getClass();
        n1 n1Var = this.f3420b;
        n1Var.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) n1Var.f3499a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) n1Var.f3502d;
        try {
            y80.f1 f1Var = (y80.f1) linkedHashMap2.get(str);
            if (f1Var != null && (value = ((a2) f1Var).getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) n1Var.f3501c).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public final b1 b(String str, Object obj, boolean z11) {
        b1 b1Var;
        n1 n1Var = this.f3420b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) n1Var.f3502d;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) n1Var.f3499a;
        if (linkedHashMap.containsKey(str)) {
            i4.a.i(w.a0.p("StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key '", str, "', but not both."));
            return null;
        }
        LinkedHashMap linkedHashMap3 = this.f3419a;
        Object b1Var2 = linkedHashMap3.get(str);
        if (b1Var2 == null) {
            if (linkedHashMap2.containsKey(str)) {
                b1Var = new b1(this, str, linkedHashMap2.get(str));
            } else if (z11) {
                linkedHashMap2.put(str, obj);
                b1Var2 = new b1(this, str, obj);
                linkedHashMap3.put(str, b1Var2);
            } else {
                str.getClass();
                b1Var = new b1();
                b1Var.l = str;
                b1Var.f3416m = this;
            }
            b1Var2 = b1Var;
            linkedHashMap3.put(str, b1Var2);
        }
        return (b1) b1Var2;
    }

    public final void c(String str) {
        n1 n1Var = this.f3420b;
        n1Var.getClass();
        ((LinkedHashMap) n1Var.f3499a).remove(str);
        ((LinkedHashMap) n1Var.f3501c).remove(str);
        ((LinkedHashMap) n1Var.f3502d).remove(str);
        b1 b1Var = (b1) this.f3419a.remove(str);
        if (b1Var != null) {
            b1Var.f3416m = null;
        }
    }

    public final void d(Object obj, String str) {
        str.getClass();
        if (obj != null) {
            ArrayList arrayList = x8.a.f44031a;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Class) it.next()).isInstance(obj)) {
                    }
                }
            }
            e40.a.h("Can't put value with type ", obj.getClass(), " into saved state");
            return;
        }
        ArrayList arrayList2 = x8.a.f44031a;
        Object obj2 = this.f3419a.get(str);
        o0 o0Var = obj2 instanceof o0 ? (o0) obj2 : null;
        if (o0Var != null) {
            o0Var.k(obj);
        }
        this.f3420b.z(obj, str);
    }

    public c1(v70.i iVar) {
        iVar.getClass();
        this.f3419a = new LinkedHashMap();
        this.f3420b = new n1(iVar);
    }
}
