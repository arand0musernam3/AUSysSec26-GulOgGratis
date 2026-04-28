package h20;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import e20.z;
import o.d0;
import o.x;
import qa.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p10.b f21343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21345c;

    @Override // o.x
    public final void b(boolean z11) {
        j jVar;
        qa.a aVar;
        if (this.f21344b) {
            return;
        }
        p10.b bVar = this.f21343a;
        if (z11) {
            bVar.a();
            return;
        }
        j jVar2 = bVar.M;
        if (jVar2 == null || bVar.f21321g == null) {
            return;
        }
        bVar.L.f21344b = true;
        jVar2.b();
        bVar.L.f21344b = false;
        if (bVar.f21321g != null && (jVar = bVar.M) != null && jVar.f21309b.size() == bVar.f21321g.length) {
            for (int i11 = 0; i11 < bVar.f21321g.length; i11++) {
                if (!(bVar.M.a(i11) instanceof a) || (bVar.f21321g[i11] instanceof d)) {
                    boolean z12 = bVar.M.a(i11).hasSubMenu() && !(bVar.f21321g[i11] instanceof o);
                    boolean z13 = (bVar.M.a(i11).hasSubMenu() || (bVar.f21321g[i11] instanceof h)) ? false : true;
                    if ((bVar.M.a(i11) instanceof a) || (!z12 && !z13)) {
                    }
                }
            }
            int i12 = bVar.f21322h;
            int size = bVar.M.f21309b.size();
            for (int i13 = 0; i13 < size; i13++) {
                MenuItem menuItemA = bVar.M.a(i13);
                if (menuItemA.isChecked()) {
                    bVar.setCheckedItem(menuItemA);
                    bVar.f21322h = menuItemA.getItemId();
                    bVar.f21324i = i13;
                }
            }
            if (i12 != bVar.f21322h && (aVar = bVar.f21315a) != null) {
                c0.a(bVar, aVar);
            }
            int i14 = bVar.f21319e;
            boolean z14 = i14 != -1 ? i14 == 0 : bVar.getCurrentVisibleContentItemCount() > 3;
            for (int i15 = 0; i15 < size; i15++) {
                bVar.L.f21344b = true;
                bVar.f21321g[i15].setExpanded(bVar.T);
                k kVar = bVar.f21321g[i15];
                if (kVar instanceof h) {
                    h hVar = (h) kVar;
                    hVar.setLabelVisibilityMode(bVar.f21319e);
                    hVar.setItemIconGravity(bVar.f21320f);
                    hVar.setItemGravity(bVar.H);
                    hVar.setShifting(z14);
                }
                if (bVar.M.a(i15) instanceof o.n) {
                    bVar.f21321g[i15].a((o.n) bVar.M.a(i15));
                }
                bVar.L.f21344b = false;
            }
            return;
        }
        bVar.a();
    }

    @Override // o.x
    public final void c(Context context, o.l lVar) {
        this.f21343a.b(lVar);
    }

    @Override // o.x
    public final boolean d() {
        return false;
    }

    @Override // o.x
    public final boolean e(d0 d0Var) {
        return false;
    }

    @Override // o.x
    public final void f(Parcelable parcelable) {
        if (parcelable instanceof m) {
            p10.b bVar = this.f21343a;
            m mVar = (m) parcelable;
            int i11 = mVar.f21341a;
            int size = bVar.M.f21309b.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    break;
                }
                MenuItem menuItemA = bVar.M.a(i12);
                if (i11 == menuItemA.getItemId()) {
                    bVar.f21322h = i11;
                    bVar.f21324i = i12;
                    bVar.setCheckedItem(menuItemA);
                    break;
                }
                i12++;
            }
            Context context = this.f21343a.getContext();
            z zVar = mVar.f21342b;
            SparseArray sparseArray = new SparseArray(zVar.size());
            for (int i13 = 0; i13 < zVar.size(); i13++) {
                int iKeyAt = zVar.keyAt(i13);
                m10.b bVar2 = (m10.b) zVar.valueAt(i13);
                sparseArray.put(iKeyAt, bVar2 != null ? new m10.a(context, bVar2) : null);
            }
            p10.b bVar3 = this.f21343a;
            SparseArray sparseArray2 = bVar3.f21336v;
            for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                int iKeyAt2 = sparseArray.keyAt(i14);
                if (sparseArray2.indexOfKey(iKeyAt2) < 0) {
                    sparseArray2.append(iKeyAt2, (m10.a) sparseArray.get(iKeyAt2));
                }
            }
            k[] kVarArr = bVar3.f21321g;
            if (kVarArr != null) {
                for (k kVar : kVarArr) {
                    if (kVar instanceof h) {
                        h hVar = (h) kVar;
                        m10.a aVar = (m10.a) sparseArray2.get(hVar.getId());
                        if (aVar != null) {
                            hVar.setBadge(aVar);
                        }
                    }
                }
            }
        }
    }

    @Override // o.x
    public final int getId() {
        return this.f21345c;
    }

    @Override // o.x
    public final boolean i(o.n nVar) {
        return false;
    }

    @Override // o.x
    public final Parcelable k() {
        m mVar = new m();
        mVar.f21341a = this.f21343a.getSelectedItemId();
        SparseArray<m10.a> badgeDrawables = this.f21343a.getBadgeDrawables();
        z zVar = new z();
        for (int i11 = 0; i11 < badgeDrawables.size(); i11++) {
            int iKeyAt = badgeDrawables.keyAt(i11);
            m10.a aVarValueAt = badgeDrawables.valueAt(i11);
            zVar.put(iKeyAt, aVarValueAt != null ? aVarValueAt.f28713e.f28746a : null);
        }
        mVar.f21342b = zVar;
        return mVar;
    }

    @Override // o.x
    public final boolean l(o.n nVar) {
        return false;
    }

    @Override // o.x
    public final void h(o.l lVar, boolean z11) {
    }
}
