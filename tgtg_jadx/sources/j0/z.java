package j0;

import e0.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f24338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f24341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f24342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f24343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f24344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f24345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f24346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f24347j;

    public z(a0 a0Var) {
        a0Var.getClass();
        this.f24338a = a0Var;
        this.f24339b = new Object();
        this.f24341d = 1L;
        this.f24342e = Long.MIN_VALUE;
        this.f24343f = Long.MIN_VALUE;
        this.f24344g = Long.MIN_VALUE;
        this.f24345h = Long.MIN_VALUE;
        this.f24346i = new ArrayList();
        this.f24347j = new LinkedHashMap();
    }

    public final void a(long j9) {
        synchronized (this.f24339b) {
            try {
                if (this.f24340c) {
                    return;
                }
                this.f24344g = j9;
                Iterator it = this.f24346i.iterator();
                y yVar = null;
                boolean z11 = false;
                Object obj = null;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((y) next).f24332b == j9) {
                            if (z11) {
                                break;
                            }
                            obj = next;
                            z11 = true;
                        }
                    } else if (!z11) {
                    }
                }
                obj = null;
                y yVar2 = (y) obj;
                if (yVar2 != null) {
                    this.f24345h = yVar2.f24335e;
                    this.f24346i.remove(yVar2);
                    yVar = yVar2;
                }
                if (yVar != null) {
                    yVar.a(-1L, new y0(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f24339b) {
            if (this.f24340c) {
                return;
            }
            this.f24340c = true;
            ArrayList arrayListT0 = CollectionsKt.t0(this.f24347j.values());
            this.f24347j.clear();
            ArrayList<y> arrayListT02 = CollectionsKt.t0(this.f24346i);
            this.f24346i.clear();
            Iterator it = arrayListT0.iterator();
            while (it.hasNext()) {
                Object obj = ((b0) it.next()).f24285a;
            }
            for (y yVar : arrayListT02) {
                yVar.getClass();
                yVar.a(-1L, new y0(11));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r11, java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.z.e(long, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(long r19, long r21, long r23, j0.x r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.z.g(long, long, long, j0.x):void");
    }

    public final ArrayList p(long j9, long j11, boolean z11) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f24346i;
        for (Object obj : arrayList2) {
            y yVar = (y) obj;
            if (yVar.f24331a == z11 && yVar.f24334d < j9 && yVar.f24335e < j11) {
                arrayList.add(obj);
            }
        }
        arrayList2.removeAll(arrayList);
        return arrayList;
    }
}
