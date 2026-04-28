package od;

import android.graphics.Bitmap;
import fd.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import xc.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f32447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32448b;

    public h(int i11) {
        switch (i11) {
            case 1:
                this.f32447a = new LinkedHashMap();
                break;
            default:
                this.f32447a = new LinkedHashMap();
                break;
        }
    }

    public void a() {
        this.f32448b = 0;
        Iterator it = this.f32447a.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                xc.g gVar = (xc.g) CollectionsKt.firstOrNull(arrayList);
                if ((gVar != null ? (Bitmap) gVar.f44231b.get() : null) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    int i13 = i12 - i11;
                    if (((xc.g) arrayList.get(i13)).f44231b.get() == null) {
                        arrayList.remove(i13);
                        i11++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    @Override // xc.i
    public synchronized xc.c b(xc.b bVar) {
        try {
            ArrayList arrayList = (ArrayList) this.f32447a.get(bVar);
            xc.c cVar = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                xc.g gVar = (xc.g) arrayList.get(i11);
                Bitmap bitmap = (Bitmap) gVar.f44231b.get();
                xc.c cVar2 = bitmap != null ? new xc.c(bitmap, gVar.f44232c) : null;
                if (cVar2 != null) {
                    cVar = cVar2;
                    break;
                }
                i11++;
            }
            int i12 = this.f32448b;
            this.f32448b = i12 + 1;
            if (i12 >= 10) {
                a();
            }
            return cVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // xc.i
    public synchronized void c(int i11) {
        if (i11 >= 10 && i11 != 20) {
            a();
        }
    }

    public void d() {
        int i11 = this.f32448b;
        this.f32448b = i11 + 1;
        if (i11 >= 10) {
            this.f32448b = 0;
            Iterator it = this.f32447a.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    g gVar = (g) CollectionsKt.firstOrNull(arrayList);
                    if ((gVar != null ? (l) gVar.f32444a.get() : null) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i12 = 0;
                    for (int i13 = 0; i13 < size; i13++) {
                        int i14 = i13 - i12;
                        if (((g) arrayList.get(i14)).f32444a.get() == null) {
                            arrayList.remove(i14);
                            i12++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    @Override // xc.i
    public synchronized void e(xc.b bVar, Bitmap bitmap, Map map, int i11) {
        try {
            LinkedHashMap linkedHashMap = this.f32447a;
            Object arrayList = linkedHashMap.get(bVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(bVar, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            xc.g gVar = new xc.g(iIdentityHashCode, new WeakReference(bitmap), map, i11);
            int size = arrayList2.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    arrayList2.add(gVar);
                    break;
                }
                xc.g gVar2 = (xc.g) arrayList2.get(i12);
                if (i11 < gVar2.f44233d) {
                    i12++;
                } else if (gVar2.f44230a == iIdentityHashCode && gVar2.f44231b.get() == bitmap) {
                    arrayList2.set(i12, gVar);
                } else {
                    arrayList2.add(i12, gVar);
                }
            }
            int i13 = this.f32448b;
            this.f32448b = i13 + 1;
            if (i13 >= 10) {
                a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void f(a aVar, l lVar, Map map, long j9) {
        LinkedHashMap linkedHashMap = this.f32447a;
        Object arrayList = linkedHashMap.get(aVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(aVar, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        g gVar = new g(new WeakReference(lVar), map, j9);
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                g gVar2 = (g) arrayList2.get(i11);
                if (j9 < gVar2.f32446c) {
                    i11++;
                } else if (gVar2.f32444a.get() == lVar) {
                    arrayList2.set(i11, gVar);
                } else {
                    arrayList2.add(i11, gVar);
                }
            }
        } else {
            arrayList2.add(gVar);
        }
        d();
    }
}
