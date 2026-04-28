package ax;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f4891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f4892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f4893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HashSet f4894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HashSet f4895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ HashSet f4896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f4897g;

    public /* synthetic */ e(h hVar, b bVar, AtomicBoolean atomicBoolean, HashSet hashSet, HashSet hashSet2, HashSet hashSet3, j jVar) {
        this.f4891a = hVar;
        this.f4892b = bVar;
        this.f4893c = atomicBoolean;
        this.f4894d = hashSet;
        this.f4895e = hashSet2;
        this.f4896f = hashSet3;
        this.f4897g = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z11;
        long j9;
        Date date;
        r40.d dVar;
        Date date2;
        b bVar = this.f4892b;
        AtomicBoolean atomicBoolean = this.f4893c;
        AtomicBoolean atomicBoolean2 = this.f4897g.f4933d;
        h hVar = this.f4891a;
        String str = (String) hVar.f4910a;
        int i11 = hVar.f4911b;
        Long l = (Long) hVar.f4913d;
        String str2 = (String) hVar.f4914e;
        try {
            r40.d dVar2 = j.f4928f;
            if (dVar2.s().f4932c != null) {
                try {
                    b bVar2 = dVar2.s().f4932c;
                    if ((bVar2 != null ? bVar2.f4879i : null) == bVar.f4879i) {
                        if (!atomicBoolean.get() && str == null && i11 == 0) {
                            atomicBoolean2.set(false);
                            return;
                        }
                        Date date3 = bVar.f4871a;
                        if (hVar.f4911b != 0) {
                            date = new Date(((long) hVar.f4911b) * 1000);
                            j9 = 1000;
                        } else {
                            if (hVar.f4912c != 0) {
                                j9 = 1000;
                                date3 = new Date((((long) hVar.f4912c) * 1000) + new Date().getTime());
                            } else {
                                j9 = 1000;
                            }
                            date = date3;
                        }
                        if (str == null) {
                            str = bVar.f4875e;
                        }
                        String str3 = str;
                        String str4 = bVar.f4878h;
                        String str5 = bVar.f4879i;
                        Collection collection = atomicBoolean.get() ? this.f4894d : bVar.f4872b;
                        Collection collection2 = atomicBoolean.get() ? this.f4895e : bVar.f4873c;
                        Collection collection3 = atomicBoolean.get() ? this.f4896f : bVar.f4874d;
                        k kVar = bVar.f4876f;
                        Date date4 = new Date();
                        if (l != null) {
                            dVar = dVar2;
                            date2 = new Date(l.longValue() * j9);
                        } else {
                            dVar = dVar2;
                            date2 = bVar.f4880j;
                        }
                        Date date5 = date2;
                        if (str2 == null) {
                            str2 = bVar.f4881k;
                        }
                        dVar.s().c(new b(str3, str4, str5, collection, collection2, collection3, kVar, date, date4, date5, str2), true);
                        atomicBoolean2.set(false);
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z11 = false;
                    atomicBoolean2.set(z11);
                    throw th;
                }
            }
            atomicBoolean2.set(false);
        } catch (Throwable th3) {
            th = th3;
            z11 = false;
        }
    }
}
