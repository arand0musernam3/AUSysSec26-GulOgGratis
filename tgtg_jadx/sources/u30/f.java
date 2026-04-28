package u30;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.firebase.messaging.m f40679h = new com.google.firebase.messaging.m(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f40684e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qb.e f40686g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f40680a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f40681b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f40682c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f40683d = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f40685f = new AtomicReference();

    public f(v30.k kVar, ArrayList arrayList, ArrayList arrayList2, qb.e eVar) {
        j jVar = new j(kVar);
        this.f40684e = jVar;
        this.f40686g = eVar;
        ArrayList<b> arrayList3 = new ArrayList();
        arrayList3.add(b.c(jVar, j.class, q40.c.class, q40.b.class));
        arrayList3.add(b.c(this, f.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((t40.b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f40686g.C(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e5) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e5);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((b) it4.next()).f40671b.toArray();
                int length = array.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        Object obj = array[i11];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f40683d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f40683d.add(obj.toString());
                        }
                        i11++;
                    }
                }
            }
            if (this.f40680a.isEmpty()) {
                a.a.A(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f40680a.keySet());
                arrayList6.addAll(arrayList3);
                a.a.A(arrayList6);
            }
            for (b bVar2 : arrayList3) {
                this.f40680a.put(bVar2, new k(new p30.c(2, this, bVar2)));
            }
            arrayList5.addAll(j(arrayList3));
            arrayList5.addAll(k());
            i();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) this.f40685f.get();
        if (bool != null) {
            h(this.f40680a, bool.booleanValue());
        }
    }

    @Override // u30.c
    public final m a(o oVar) {
        t40.b bVarG = g(oVar);
        return bVarG == null ? new m(m.f40703c, m.f40704d) : bVarG instanceof m ? (m) bVarG : new m(null, bVarG);
    }

    @Override // u30.c
    public final synchronized t40.b d(o oVar) {
        l lVar = (l) this.f40682c.get(oVar);
        if (lVar != null) {
            return lVar;
        }
        return f40679h;
    }

    @Override // u30.c
    public final synchronized t40.b g(o oVar) {
        android.support.v4.media.session.a.k(oVar, "Null interface requested.");
        return (t40.b) this.f40681b.get(oVar);
    }

    public final void h(HashMap map, boolean z11) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            b bVar = (b) entry.getKey();
            t40.b bVar2 = (t40.b) entry.getValue();
            int i11 = bVar.f40673d;
            if (i11 == 1 || (i11 == 2 && z11)) {
                bVar2.get();
            }
        }
        j jVar = this.f40684e;
        synchronized (jVar) {
            try {
                arrayDeque = jVar.f40696b;
                if (arrayDeque != null) {
                    jVar.f40696b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw e0.f.e(it);
            }
        }
    }

    public final void i() {
        HashMap map = this.f40681b;
        HashMap map2 = this.f40682c;
        for (b bVar : this.f40680a.keySet()) {
            for (i iVar : bVar.f40672c) {
                boolean z11 = iVar.f40693b == 2;
                o oVar = iVar.f40692a;
                if (z11 && !map2.containsKey(oVar)) {
                    Set set = Collections.EMPTY_SET;
                    l lVar = new l();
                    lVar.f40702b = null;
                    lVar.f40701a = Collections.newSetFromMap(new ConcurrentHashMap());
                    lVar.f40701a.addAll(set);
                    map2.put(oVar, lVar);
                } else if (map.containsKey(oVar)) {
                    continue;
                } else {
                    int i11 = iVar.f40693b;
                    if (i11 == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + bVar + ": " + oVar);
                    }
                    if (i11 != 2) {
                        map.put(oVar, new m(m.f40703c, m.f40704d));
                    }
                }
            }
        }
    }

    public final ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f40674e == 0) {
                t40.b bVar2 = (t40.b) this.f40680a.get(bVar);
                for (o oVar : bVar.f40671b) {
                    HashMap map = this.f40681b;
                    if (map.containsKey(oVar)) {
                        arrayList2.add(new mr.h(22, (m) ((t40.b) map.get(oVar)), bVar2));
                    } else {
                        map.put(oVar, bVar2);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList k() {
        HashMap map = this.f40682c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.f40680a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f40674e != 0) {
                t40.b bVar2 = (t40.b) entry.getValue();
                for (o oVar : bVar.f40671b) {
                    if (!map2.containsKey(oVar)) {
                        map2.put(oVar, new HashSet());
                    }
                    ((Set) map2.get(oVar)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                l lVar = (l) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new mr.h(23, lVar, (t40.b) it.next()));
                }
            } else {
                o oVar2 = (o) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                l lVar2 = new l();
                lVar2.f40702b = null;
                lVar2.f40701a = Collections.newSetFromMap(new ConcurrentHashMap());
                lVar2.f40701a.addAll(set);
                map.put(oVar2, lVar2);
            }
        }
        return arrayList;
    }
}
