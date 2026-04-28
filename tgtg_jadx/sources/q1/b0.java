package q1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb.l f35716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ky.p f35717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35720f;

    public b0(int i11) {
        this.f35715a = i11;
        if (i11 <= 0) {
            i4.a.f("maxSize <= 0");
            throw null;
        }
        this.f35716b = new jb.l(2);
        this.f35717c = new ky.p(13);
    }

    public Object a(Object obj) {
        obj.getClass();
        return null;
    }

    public void b(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
    }

    public final Object c(Object obj) {
        Object objPut;
        obj.getClass();
        synchronized (this.f35717c) {
            jb.l lVar = this.f35716b;
            lVar.getClass();
            Object obj2 = lVar.f24902a.get(obj);
            if (obj2 != null) {
                this.f35719e++;
                return obj2;
            }
            this.f35720f++;
            Object objA = a(obj);
            if (objA == null) {
                return null;
            }
            synchronized (this.f35717c) {
                try {
                    jb.l lVar2 = this.f35716b;
                    lVar2.getClass();
                    objPut = lVar2.f24902a.put(obj, objA);
                    if (objPut != null) {
                        jb.l lVar3 = this.f35716b;
                        lVar3.getClass();
                        lVar3.f24902a.put(obj, objPut);
                    } else {
                        this.f35718d += f(obj, objA);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (objPut != null) {
                b(obj, objA, objPut);
                return objPut;
            }
            h(this.f35715a);
            return objA;
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        obj2.getClass();
        synchronized (this.f35717c) {
            this.f35718d += f(obj, obj2);
            jb.l lVar = this.f35716b;
            lVar.getClass();
            objPut = lVar.f24902a.put(obj, obj2);
            if (objPut != null) {
                this.f35718d -= f(obj, objPut);
            }
        }
        if (objPut != null) {
            b(obj, objPut, obj2);
        }
        h(this.f35715a);
        return objPut;
    }

    public final Object e(Object obj) {
        Object objRemove;
        obj.getClass();
        synchronized (this.f35717c) {
            jb.l lVar = this.f35716b;
            lVar.getClass();
            objRemove = lVar.f24902a.remove(obj);
            if (objRemove != null) {
                this.f35718d -= f(obj, objRemove);
            }
        }
        if (objRemove != null) {
            b(obj, objRemove, null);
        }
        return objRemove;
    }

    public final int f(Object obj, Object obj2) {
        int iG = g(obj, obj2);
        if (iG >= 0) {
            return iG;
        }
        throw new IllegalStateException("Negative size: " + obj + '=' + obj2);
    }

    public int g(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r6) {
        /*
            r5 = this;
        L0:
            ky.p r0 = r5.f35717c
            monitor-enter(r0)
            int r1 = r5.f35718d     // Catch: java.lang.Throwable -> L16
            if (r1 < 0) goto L64
            jb.l r1 = r5.f35716b     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f24902a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            int r1 = r5.f35718d     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L64
            goto L18
        L16:
            r6 = move-exception
            goto L6c
        L18:
            int r1 = r5.f35718d     // Catch: java.lang.Throwable -> L16
            if (r1 <= r6) goto L62
            jb.l r1 = r5.f35716b     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f24902a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L27
            goto L62
        L27:
            jb.l r1 = r5.f35716b     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f24902a     // Catch: java.lang.Throwable -> L16
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L16
            r1.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = kotlin.collections.CollectionsKt.P(r1)     // Catch: java.lang.Throwable -> L16
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L3e
            monitor-exit(r0)
            return
        L3e:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L16
            jb.l r3 = r5.f35716b     // Catch: java.lang.Throwable -> L16
            r3.getClass()     // Catch: java.lang.Throwable -> L16
            r2.getClass()     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r3 = r3.f24902a     // Catch: java.lang.Throwable -> L16
            r3.remove(r2)     // Catch: java.lang.Throwable -> L16
            int r3 = r5.f35718d     // Catch: java.lang.Throwable -> L16
            int r4 = r5.f(r2, r1)     // Catch: java.lang.Throwable -> L16
            int r3 = r3 - r4
            r5.f35718d = r3     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            r0 = 0
            r5.b(r2, r1, r0)
            goto L0
        L62:
            monitor-exit(r0)
            return
        L64:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L16
            throw r1     // Catch: java.lang.Throwable -> L16
        L6c:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.b0.h(int):void");
    }

    public final String toString() {
        String str;
        synchronized (this.f35717c) {
            try {
                int i11 = this.f35719e;
                int i12 = this.f35720f + i11;
                str = "LruCache[maxSize=" + this.f35715a + ",hits=" + this.f35719e + ",misses=" + this.f35720f + ",hitRate=" + (i12 != 0 ? (i11 * 100) / i12 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
