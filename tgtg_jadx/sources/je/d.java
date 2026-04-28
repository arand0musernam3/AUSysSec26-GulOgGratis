package je;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.constraintlayout.widget.z;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements e, n, ke.a, oe.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f25005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f25006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ve.j f25007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f25008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f25009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f25010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f25011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f25012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f25013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final he.z f25014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f25015k;
    public final ke.r l;

    public d(he.z zVar, re.b bVar, String str, boolean z11, ArrayList arrayList, pe.d dVar) {
        this.f25005a = new z();
        this.f25006b = new RectF();
        this.f25007c = new ve.j();
        this.f25008d = new Matrix();
        this.f25009e = new Path();
        this.f25010f = new RectF();
        this.f25011g = str;
        this.f25014j = zVar;
        this.f25012h = z11;
        this.f25013i = arrayList;
        if (dVar != null) {
            ke.r rVar = new ke.r(dVar);
            this.l = rVar;
            rVar.a(bVar);
            rVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof j) {
                arrayList2.add((j) cVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList2.get(size2)).f(arrayList.listIterator(arrayList.size()));
        }
    }

    @Override // ke.a
    public final void a() {
        this.f25014j.invalidateSelf();
    }

    @Override // je.e
    public final void b(Canvas canvas, Matrix matrix, int i11, ve.a aVar) {
        if (this.f25012h) {
            return;
        }
        Matrix matrix2 = this.f25008d;
        matrix2.set(matrix);
        ke.r rVar = this.l;
        if (rVar != null) {
            matrix2.preConcat(rVar.e());
            i11 = (int) (((((rVar.f26355p == null ? 100 : ((Integer) r1.f()).intValue()) / 100.0f) * i11) / 255.0f) * 255.0f);
        }
        he.z zVar = this.f25014j;
        boolean z11 = (zVar.f21999t && i() && i11 != 255) || (aVar != null && zVar.f22000u && i());
        int i12 = z11 ? 255 : i11;
        ve.j jVar = this.f25007c;
        if (z11) {
            RectF rectF = this.f25006b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            e(rectF, matrix, true);
            z zVar2 = this.f25005a;
            zVar2.f2542b = i11;
            if (aVar != null) {
                if (Color.alpha(aVar.f42244d) > 0) {
                    zVar2.f2543c = aVar;
                } else {
                    zVar2.f2543c = null;
                }
                aVar = null;
            } else {
                zVar2.f2543c = null;
            }
            canvas = jVar.e(canvas, rectF, zVar2);
        } else if (aVar != null) {
            ve.a aVar2 = new ve.a(aVar);
            aVar2.b(i12);
            aVar = aVar2;
        }
        ArrayList arrayList = this.f25013i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof e) {
                ((e) obj).b(canvas, matrix2, i12, aVar);
            }
        }
        if (z11) {
            jVar.c();
        }
    }

    @Override // je.c
    public final void c(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.f25013i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            c cVar = (c) arrayList.get(size2);
            cVar.c(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(cVar);
        }
    }

    @Override // oe.g
    public final void d(oe.f fVar, int i11, ArrayList arrayList, oe.f fVar2) {
        String str = this.f25011g;
        if (!fVar.c(i11, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            oe.f fVar3 = new oe.f(fVar2);
            fVar3.f32474a.add(str);
            if (fVar.a(i11, str)) {
                oe.f fVar4 = new oe.f(fVar3);
                fVar4.f32475b = this;
                arrayList.add(fVar4);
            }
            fVar2 = fVar3;
        }
        if (!fVar.d(i11, str)) {
            return;
        }
        int iB = fVar.b(i11, str) + i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = this.f25013i;
            if (i12 >= arrayList2.size()) {
                return;
            }
            c cVar = (c) arrayList2.get(i12);
            if (cVar instanceof oe.g) {
                ((oe.g) cVar).d(fVar, iB, arrayList, fVar2);
            }
            i12++;
        }
    }

    @Override // je.e
    public final void e(RectF rectF, Matrix matrix, boolean z11) {
        Matrix matrix2 = this.f25008d;
        matrix2.set(matrix);
        ke.r rVar = this.l;
        if (rVar != null) {
            matrix2.preConcat(rVar.e());
        }
        RectF rectF2 = this.f25010f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.f25013i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof e) {
                ((e) cVar).e(rectF2, matrix2, z11);
                rectF.union(rectF2);
            }
        }
    }

    public final List f() {
        if (this.f25015k == null) {
            this.f25015k = new ArrayList();
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f25013i;
                if (i11 >= arrayList.size()) {
                    break;
                }
                c cVar = (c) arrayList.get(i11);
                if (cVar instanceof n) {
                    this.f25015k.add((n) cVar);
                }
                i11++;
            }
        }
        return this.f25015k;
    }

    @Override // je.n
    public final Path g() {
        Matrix matrix = this.f25008d;
        matrix.reset();
        ke.r rVar = this.l;
        if (rVar != null) {
            matrix.set(rVar.e());
        }
        Path path = this.f25009e;
        path.reset();
        if (!this.f25012h) {
            ArrayList arrayList = this.f25013i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) arrayList.get(size);
                if (cVar instanceof n) {
                    path.addPath(((n) cVar).g(), matrix);
                }
            }
        }
        return path;
    }

    @Override // je.c
    public final String getName() {
        throw null;
    }

    @Override // oe.g
    public final void h(Object obj, ub.a aVar) {
        ke.r rVar = this.l;
        if (rVar != null) {
            rVar.c(obj, aVar);
        }
    }

    public final boolean i() {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f25013i;
            if (i11 >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i11) instanceof e) && (i12 = i12 + 1) >= 2) {
                return true;
            }
            i11++;
        }
    }

    public d(he.z zVar, re.b bVar, qe.s sVar, he.k kVar) {
        pe.d dVar;
        String str = sVar.f37011a;
        boolean z11 = sVar.f37013c;
        List list = sVar.f37012b;
        ArrayList arrayList = new ArrayList(list.size());
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            c cVarA = ((qe.b) list.get(i12)).a(zVar, kVar, bVar);
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        while (true) {
            if (i11 >= list.size()) {
                dVar = null;
                break;
            }
            qe.b bVar2 = (qe.b) list.get(i11);
            if (bVar2 instanceof pe.d) {
                dVar = (pe.d) bVar2;
                break;
            }
            i11++;
        }
        this(zVar, bVar, str, z11, arrayList, dVar);
    }
}
