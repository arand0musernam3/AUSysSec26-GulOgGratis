package i1;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import m0.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22772a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f22773b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f22774c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f22775d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w.e f22776e;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0047 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:4:0x0003, B:6:0x001f, B:10:0x0024, B:12:0x0030, B:13:0x0032, B:15:0x0035, B:45:0x0089, B:46:0x008c, B:48:0x009c, B:49:0x009f, B:52:0x00a2, B:53:0x00a7, B:20:0x003b, B:21:0x003c, B:22:0x003d, B:23:0x0041, B:25:0x0047, B:27:0x005e, B:29:0x0068, B:30:0x006a, B:37:0x0076, B:39:0x007a, B:40:0x007e, B:41:0x0085, B:44:0x0088, B:31:0x006b, B:35:0x0073, B:34:0x0071, B:14:0x0033), top: B:56:0x0003, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(i1.b r6, df.g r7, w.e r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f22772a
            monitor-enter(r0)
            java.lang.Object r1 = r7.f14899g     // Catch: java.lang.Throwable -> L21
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L21
            r1 = r1 ^ 1
            pd.g.j(r1)     // Catch: java.lang.Throwable -> L21
            r5.f22776e = r8     // Catch: java.lang.Throwable -> L21
            androidx.lifecycle.LifecycleOwner r8 = r6.r()     // Catch: java.lang.Throwable -> L21
            r5.e(r8)     // Catch: java.lang.Throwable -> L21
            i1.f r1 = r5.c(r8)     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r6 = move-exception
            goto La8
        L24:
            java.util.HashMap r2 = r5.f22774c     // Catch: java.lang.Throwable -> L21
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L21
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> L21
            w.e r2 = r5.f22776e     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L3d
            java.lang.Object r3 = r2.f42668b     // Catch: java.lang.Throwable -> L21
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L21
            int r2 = r2.f42672f     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            r3 = 2
            if (r2 == r3) goto L89
            goto L3d
        L3a:
            r6 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            throw r6     // Catch: java.lang.Throwable -> L21
        L3d:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L21
        L41:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L89
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L21
            i1.a r2 = (i1.a) r2     // Catch: java.lang.Throwable -> L21
            java.util.HashMap r3 = r5.f22773b     // Catch: java.lang.Throwable -> L21
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L21
            i1.b r2 = (i1.b) r2     // Catch: java.lang.Throwable -> L21
            r2.getClass()     // Catch: java.lang.Throwable -> L21
            boolean r3 = r2.equals(r6)     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L41
            java.util.List r3 = r2.s()     // Catch: java.lang.Throwable -> L21
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L41
            java.lang.Object r3 = r2.f22756a     // Catch: java.lang.Throwable -> L21
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L21
            df.g r4 = r2.f22760e     // Catch: java.lang.Throwable -> L86
            if (r4 != 0) goto L71
            r4 = 0
            goto L73
        L71:
            boolean r4 = r4.f14894b     // Catch: java.lang.Throwable -> L86
        L73:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L86
            if (r4 != 0) goto L7e
            boolean r3 = r7.f14894b     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L7e
            r2.u()     // Catch: java.lang.Throwable -> L21
            goto L41
        L7e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L21
            java.lang.String r7 = "Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L21
            throw r6     // Catch: java.lang.Throwable -> L21
        L86:
            r6 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L86
            throw r6     // Catch: java.lang.Throwable -> L21
        L89:
            r6.c(r7)     // Catch: java.lang.Throwable -> L21 androidx.camera.core.internal.CameraUseCaseAdapter$CameraException -> La1
            androidx.lifecycle.Lifecycle r6 = r8.getLifecycle()     // Catch: java.lang.Throwable -> L21
            androidx.lifecycle.Lifecycle$State r6 = r6.b()     // Catch: java.lang.Throwable -> L21
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch: java.lang.Throwable -> L21
            boolean r6 = r6.a(r7)     // Catch: java.lang.Throwable -> L21
            if (r6 == 0) goto L9f
            r5.g(r8)     // Catch: java.lang.Throwable -> L21
        L9f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        La1:
            r6 = move-exception
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L21
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L21
            throw r7     // Catch: java.lang.Throwable -> L21
        La8:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.g.a(i1.b, df.g, w.e):void");
    }

    public final b b(LifecycleOwner lifecycleOwner, y0.d dVar, x0 x0Var) {
        synchronized (this.f22772a) {
            try {
                pd.g.i("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", this.f22773b.get(new a(System.identityHashCode(lifecycleOwner), dVar.f44543d)) == null);
                b bVar = new b(lifecycleOwner, dVar, x0Var);
                if (((ArrayList) dVar.y()).isEmpty()) {
                    bVar.t();
                }
                if (lifecycleOwner.getLifecycle().b() == Lifecycle.State.DESTROYED) {
                    return bVar;
                }
                f(bVar);
                return bVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final f c(LifecycleOwner lifecycleOwner) {
        synchronized (this.f22772a) {
            try {
                for (f fVar : this.f22774c.keySet()) {
                    if (lifecycleOwner.equals(fVar.f22771b)) {
                        return fVar;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean d(LifecycleOwner lifecycleOwner) {
        synchronized (this.f22772a) {
            try {
                f fVarC = c(lifecycleOwner);
                if (fVarC == null) {
                    return false;
                }
                Iterator it = ((Set) this.f22774c.get(fVarC)).iterator();
                while (it.hasNext()) {
                    b bVar = (b) this.f22773b.get((a) it.next());
                    bVar.getClass();
                    if (!bVar.s().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(LifecycleOwner lifecycleOwner) {
        HashMap map;
        s0.d dVar;
        f fVarC = c(lifecycleOwner);
        if (fVarC == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        Set set = (Set) this.f22774c.get(fVarC);
        Objects.requireNonNull(set);
        Iterator it = set.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.f22773b;
            if (!zHasNext) {
                break;
            }
            a aVar = (a) it.next();
            b bVar = (b) map.get(aVar);
            if (bVar != null) {
                y0.d dVar2 = bVar.f22758c;
                if (dVar2.f44540a.f38310a.k() || ((dVar = dVar2.f44541b) != null && dVar.f38310a.k())) {
                    hashSet.add(aVar);
                }
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        wd.a.I("LifecycleCameraRepository", "Removing " + hashSet.size() + " stale LifecycleCamera(s).");
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            b bVar2 = (b) map.get((a) it2.next());
            Objects.requireNonNull(bVar2);
            k(bVar2);
        }
    }

    public final void f(b bVar) {
        synchronized (this.f22772a) {
            try {
                LifecycleOwner lifecycleOwnerR = bVar.r();
                a aVar = new a(System.identityHashCode(lifecycleOwnerR), bVar.f22758c.f44543d);
                f fVarC = c(lifecycleOwnerR);
                Set hashSet = fVarC != null ? (Set) this.f22774c.get(fVarC) : new HashSet();
                hashSet.add(aVar);
                this.f22773b.put(aVar, bVar);
                if (fVarC == null) {
                    f fVar = new f(lifecycleOwnerR, this);
                    this.f22774c.put(fVar, hashSet);
                    lifecycleOwnerR.getLifecycle().a(fVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003a A[Catch: all -> 0x000b, TryCatch #1 {all -> 0x000b, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x000d, B:12:0x0015, B:28:0x0047, B:29:0x004a, B:13:0x001b, B:15:0x001f, B:16:0x0021, B:18:0x0024, B:23:0x002a, B:24:0x002b, B:25:0x002c, B:27:0x003a, B:17:0x0022), top: B:35:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(androidx.lifecycle.LifecycleOwner r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f22772a
            monitor-enter(r0)
            boolean r1 = r3.d(r4)     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r4 = move-exception
            goto L4c
        Ld:
            java.util.ArrayDeque r1 = r3.f22775d     // Catch: java.lang.Throwable -> Lb
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L1b
            java.util.ArrayDeque r1 = r3.f22775d     // Catch: java.lang.Throwable -> Lb
            r1.push(r4)     // Catch: java.lang.Throwable -> Lb
            goto L47
        L1b:
            w.e r1 = r3.f22776e     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L2c
            java.lang.Object r2 = r1.f42668b     // Catch: java.lang.Throwable -> Lb
            monitor-enter(r2)     // Catch: java.lang.Throwable -> Lb
            int r1 = r1.f42672f     // Catch: java.lang.Throwable -> L29
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            r2 = 2
            if (r1 == r2) goto L47
            goto L2c
        L29:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r4     // Catch: java.lang.Throwable -> Lb
        L2c:
            java.util.ArrayDeque r1 = r3.f22775d     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r1 = r1.peek()     // Catch: java.lang.Throwable -> Lb
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1     // Catch: java.lang.Throwable -> Lb
            boolean r2 = r4.equals(r1)     // Catch: java.lang.Throwable -> Lb
            if (r2 != 0) goto L47
            r3.i(r1)     // Catch: java.lang.Throwable -> Lb
            java.util.ArrayDeque r1 = r3.f22775d     // Catch: java.lang.Throwable -> Lb
            r1.remove(r4)     // Catch: java.lang.Throwable -> Lb
            java.util.ArrayDeque r1 = r3.f22775d     // Catch: java.lang.Throwable -> Lb
            r1.push(r4)     // Catch: java.lang.Throwable -> Lb
        L47:
            r3.m(r4)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.g.g(androidx.lifecycle.LifecycleOwner):void");
    }

    public final void h(LifecycleOwner lifecycleOwner) {
        synchronized (this.f22772a) {
            try {
                this.f22775d.remove(lifecycleOwner);
                i(lifecycleOwner);
                if (!this.f22775d.isEmpty()) {
                    m((LifecycleOwner) this.f22775d.peek());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(LifecycleOwner lifecycleOwner) {
        synchronized (this.f22772a) {
            try {
                f fVarC = c(lifecycleOwner);
                if (fVarC == null) {
                    return;
                }
                Iterator it = ((Set) this.f22774c.get(fVarC)).iterator();
                while (it.hasNext()) {
                    b bVar = (b) this.f22773b.get((a) it.next());
                    bVar.getClass();
                    bVar.t();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j(HashSet hashSet) {
        Set setKeySet = hashSet;
        synchronized (this.f22772a) {
            if (hashSet == null) {
                try {
                    setKeySet = this.f22773b.keySet();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                b bVar = (b) this.f22773b.get((a) it.next());
                if (bVar != null) {
                    bVar.u();
                    h(bVar.r());
                }
            }
        }
    }

    public final void k(b bVar) {
        synchronized (this.f22772a) {
            try {
                LifecycleOwner lifecycleOwnerR = bVar.r();
                a aVar = new a(System.identityHashCode(lifecycleOwnerR), bVar.f22758c.f44543d);
                this.f22773b.remove(aVar);
                HashSet hashSet = new HashSet();
                for (f fVar : this.f22774c.keySet()) {
                    if (lifecycleOwnerR.equals(fVar.f22771b)) {
                        Set set = (Set) this.f22774c.get(fVar);
                        set.remove(aVar);
                        if (set.isEmpty()) {
                            hashSet.add(fVar.f22771b);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    l((LifecycleOwner) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(LifecycleOwner lifecycleOwner) {
        synchronized (this.f22772a) {
            try {
                f fVarC = c(lifecycleOwner);
                if (fVarC == null) {
                    return;
                }
                h(lifecycleOwner);
                Iterator it = ((Set) this.f22774c.get(fVarC)).iterator();
                while (it.hasNext()) {
                    this.f22773b.remove((a) it.next());
                }
                this.f22774c.remove(fVarC);
                fVarC.f22771b.getLifecycle().d(fVarC);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(LifecycleOwner lifecycleOwner) {
        synchronized (this.f22772a) {
            try {
                Iterator it = ((Set) this.f22774c.get(c(lifecycleOwner))).iterator();
                while (it.hasNext()) {
                    b bVar = (b) this.f22773b.get((a) it.next());
                    bVar.getClass();
                    if (!bVar.s().isEmpty()) {
                        bVar.v();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
