package gf;

import com.google.firebase.messaging.a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.x0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements qf.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qf.c f20406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f20407c;

    public c(int i11) {
        this.f20405a = i11;
        switch (i11) {
            case 1:
                this.f20406b = qf.c.Before;
                break;
            default:
                this.f20406b = qf.c.Before;
                break;
        }
    }

    @Override // qf.d
    public final void a(ye.b bVar) {
        ArrayList arrayList;
        wf.c cVar;
        int i11 = this.f20405a;
        bVar.getClass();
        switch (i11) {
            case 0:
                String str = bVar.f45852a.f45890e;
                Object obj = xe.a.f44236c;
                xe.a aVarB = ox.h.B(str);
                this.f20407c = aVarB;
                ub.a aVar = aVarB.f44239b;
                b bVar2 = new b(1);
                synchronized (aVar.f40981b) {
                    arrayList = new ArrayList();
                    ((ArrayBlockingQueue) aVar.f40982c).drainTo(arrayList);
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        org.bouncycastle.jce.provider.a.c();
                        return;
                    } else {
                        bVar2.invoke(null);
                        throw null;
                    }
                }
                return;
            default:
                Object obj2 = wf.c.f43418b;
                String str2 = bVar.f45852a.f45890e;
                str2.getClass();
                synchronized (wf.c.f43418b) {
                    try {
                        LinkedHashMap linkedHashMap = wf.c.f43419c;
                        Object cVar2 = linkedHashMap.get(str2);
                        if (cVar2 == null) {
                            cVar2 = new wf.c();
                            linkedHashMap.put(str2, cVar2);
                        }
                        cVar = (wf.c) cVar2;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f20407c = cVar.f43420a;
                return;
        }
    }

    @Override // qf.d
    public final pf.a b(pf.a aVar) {
        wf.b bVar;
        switch (this.f20405a) {
            case 0:
                LinkedHashMap linkedHashMap = aVar.N;
                if (linkedHashMap != null && !linkedHashMap.isEmpty() && !Intrinsics.areEqual(aVar.a(), "$exposure")) {
                    HashMap map = new HashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof Map) {
                            try {
                                map.put(str, (Map) value);
                            } catch (ClassCastException e5) {
                                e5.printStackTrace();
                            }
                        }
                    }
                    xe.a aVar2 = (xe.a) this.f20407c;
                    if (aVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("connector");
                        aVar2 = null;
                    }
                    a0 a0Var = aVar2.f44238a;
                    ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) a0Var.f12779b).readLock();
                    lock.lock();
                    try {
                        xe.b bVar2 = (xe.b) a0Var.f12780c;
                        lock.unlock();
                        String str2 = bVar2.f44240a;
                        String str3 = bVar2.f44241b;
                        LinkedHashMap linkedHashMapM = x0.m(bVar2.f44242c);
                        for (Map.Entry entry2 : map.entrySet()) {
                            String str4 = (String) entry2.getKey();
                            Map map2 = (Map) entry2.getValue();
                            int iHashCode = str4.hashCode();
                            if (iHashCode != 1186238) {
                                if (iHashCode != 146417720) {
                                    if (iHashCode == 1142092165 && str4.equals("$unset")) {
                                        Iterator it = map2.entrySet().iterator();
                                        while (it.hasNext()) {
                                            linkedHashMapM.remove(((Map.Entry) it.next()).getKey());
                                        }
                                    }
                                } else if (str4.equals("$clearAll")) {
                                    linkedHashMapM.clear();
                                }
                            } else if (str4.equals("$set")) {
                                linkedHashMapM.putAll(map2);
                            }
                        }
                        a0Var.X(new xe.b(str2, str3, linkedHashMapM));
                    } catch (Throwable th2) {
                        lock.unlock();
                        throw th2;
                    }
                }
                return aVar;
            default:
                if (aVar.N != null) {
                    ub.a aVar3 = (ub.a) this.f20407c;
                    if (aVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("eventBridge");
                        aVar3 = null;
                    }
                    wf.d dVar = wf.d.IDENTIFY;
                    String strA = aVar.a();
                    LinkedHashMap linkedHashMap2 = aVar.M;
                    Map mapK = linkedHashMap2 != null ? x0.k(linkedHashMap2) : null;
                    LinkedHashMap linkedHashMap3 = aVar.N;
                    Map mapK2 = linkedHashMap3 != null ? x0.k(linkedHashMap3) : null;
                    LinkedHashMap linkedHashMap4 = aVar.O;
                    Map mapK3 = linkedHashMap4 != null ? x0.k(linkedHashMap4) : null;
                    LinkedHashMap linkedHashMap5 = aVar.P;
                    wf.a aVar4 = new wf.a(strA, mapK, mapK2, mapK3, linkedHashMap5 != null ? x0.k(linkedHashMap5) : null);
                    aVar3.getClass();
                    dVar.getClass();
                    synchronized (aVar3.f40981b) {
                        try {
                            LinkedHashMap linkedHashMap6 = (LinkedHashMap) aVar3.f40982c;
                            Object bVar3 = linkedHashMap6.get(dVar);
                            if (bVar3 == null) {
                                bVar3 = new wf.b(dVar);
                                linkedHashMap6.put(dVar, bVar3);
                            }
                            bVar = (wf.b) bVar3;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    synchronized (bVar.f43416a) {
                        bVar.f43417b.offer(aVar4);
                    }
                }
                return aVar;
        }
    }

    @Override // qf.d
    public final qf.c getType() {
        switch (this.f20405a) {
        }
        return this.f20406b;
    }
}
