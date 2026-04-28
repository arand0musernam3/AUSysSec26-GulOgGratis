package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f3732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f3733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f3734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e2 f3737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3738h;

    public f2(RecyclerView recyclerView) {
        this.f3738h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f3731a = arrayList;
        this.f3732b = null;
        this.f3733c = new ArrayList();
        this.f3734d = Collections.unmodifiableList(arrayList);
        this.f3735e = 2;
        this.f3736f = 2;
    }

    public final void a(r2 r2Var, boolean z11) {
        RecyclerView.m(r2Var);
        View view = r2Var.itemView;
        RecyclerView recyclerView = this.f3738h;
        t2 t2Var = recyclerView.f3613u1;
        if (t2Var != null) {
            s2 s2Var = t2Var.f3926b;
            ViewCompat.b0(view, s2Var != null ? (h7.b) s2Var.f3919b.remove(view) : null);
        }
        if (z11) {
            ArrayList arrayList = recyclerView.f3600o;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                org.bouncycastle.jce.provider.a.c();
                return;
            }
            l1 l1Var = recyclerView.f3596m;
            if (l1Var != null) {
                l1Var.onViewRecycled(r2Var);
            }
            if (recyclerView.f3599n1 != null) {
                recyclerView.f3584g.D(r2Var);
            }
            if (RecyclerView.J1) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + r2Var);
            }
        }
        r2Var.mBindingAdapter = null;
        r2Var.mOwnerRecyclerView = null;
        e2 e2VarC = c();
        e2VarC.getClass();
        int itemViewType = r2Var.getItemViewType();
        ArrayList arrayList2 = e2VarC.a(itemViewType).f3685a;
        if (((d2) e2VarC.f3717a.get(itemViewType)).f3686b <= arrayList2.size()) {
            o00.h0.q(r2Var.itemView);
        } else if (RecyclerView.I1 && arrayList2.contains(r2Var)) {
            i4.a.f("this scrap item already exists");
        } else {
            r2Var.resetInternal();
            arrayList2.add(r2Var);
        }
    }

    public final int b(int i11) {
        RecyclerView recyclerView = this.f3738h;
        n2 n2Var = recyclerView.f3599n1;
        if (i11 >= 0 && i11 < n2Var.b()) {
            return !n2Var.f3832g ? i11 : recyclerView.f3581e.f(i11, 0);
        }
        StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "invalid position ", ". State item count is ");
        sbK.append(n2Var.b());
        sbK.append(recyclerView.D());
        throw new IndexOutOfBoundsException(sbK.toString());
    }

    public final e2 c() {
        if (this.f3737g == null) {
            this.f3737g = new e2();
            e();
        }
        return this.f3737g;
    }

    public final View d(int i11) {
        return l(i11, LongCompanionObject.MAX_VALUE).itemView;
    }

    public final void e() {
        RecyclerView recyclerView;
        l1 l1Var;
        e2 e2Var = this.f3737g;
        if (e2Var == null || (l1Var = (recyclerView = this.f3738h).f3596m) == null || !recyclerView.f3608s) {
            return;
        }
        e2Var.f3719c.add(l1Var);
    }

    public final void f(l1 l1Var, boolean z11) {
        e2 e2Var = this.f3737g;
        if (e2Var != null) {
            SparseArray sparseArray = e2Var.f3717a;
            Set set = e2Var.f3719c;
            set.remove(l1Var);
            if (set.size() != 0 || z11) {
                return;
            }
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                ArrayList arrayList = ((d2) sparseArray.get(sparseArray.keyAt(i11))).f3685a;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    o00.h0.q(((r2) arrayList.get(i12)).itemView);
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.f3733c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.N1) {
            f0 f0Var = this.f3738h.f3597m1;
            int[] iArr = f0Var.f3726c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            f0Var.f3727d = 0;
        }
    }

    public final void h(int i11) {
        if (RecyclerView.J1) {
            Log.d("RecyclerView", "Recycling cached view at index " + i11);
        }
        ArrayList arrayList = this.f3733c;
        r2 r2Var = (r2) arrayList.get(i11);
        if (RecyclerView.J1) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + r2Var);
        }
        a(r2Var, true);
        arrayList.remove(i11);
    }

    public final void i(View view) {
        r2 r2VarO = RecyclerView.O(view);
        boolean zIsTmpDetached = r2VarO.isTmpDetached();
        RecyclerView recyclerView = this.f3738h;
        if (zIsTmpDetached) {
            recyclerView.removeDetachedView(view, false);
        }
        if (r2VarO.isScrap()) {
            r2VarO.unScrap();
        } else if (r2VarO.wasReturnedFromScrap()) {
            r2VarO.clearReturnedFromScrapFlag();
        }
        j(r2VarO);
        if (recyclerView.M == null || r2VarO.isRecyclable()) {
            return;
        }
        recyclerView.M.d(r2VarO);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c8, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(androidx.recyclerview.widget.r2 r12) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f2.j(androidx.recyclerview.widget.r2):void");
    }

    public final void k(View view) {
        s1 s1Var;
        r2 r2VarO = RecyclerView.O(view);
        boolean zHasAnyOfTheFlags = r2VarO.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.f3738h;
        if (!zHasAnyOfTheFlags && r2VarO.isUpdated() && (s1Var = recyclerView.M) != null) {
            r rVar = (r) s1Var;
            if (r2VarO.getUnmodifiedPayloads().isEmpty() && rVar.f3888g && !r2VarO.isInvalid()) {
                if (this.f3732b == null) {
                    this.f3732b = new ArrayList();
                }
                r2VarO.setScrapContainer(this, true);
                this.f3732b.add(r2VarO);
                return;
            }
        }
        if (r2VarO.isInvalid() && !r2VarO.isRemoved() && !recyclerView.f3596m.hasStableIds()) {
            i4.a.f("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.D()));
        } else {
            r2VarO.setScrapContainer(this, false);
            this.f3731a.add(r2VarO);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0525 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARN: Type inference failed for: r7v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.r2 l(int r29, long r30) {
        /*
            Method dump skipped, instruction units count: 1359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f2.l(int, long):androidx.recyclerview.widget.r2");
    }

    public final void m(r2 r2Var) {
        if (r2Var.mInChangeScrap) {
            this.f3732b.remove(r2Var);
        } else {
            this.f3731a.remove(r2Var);
        }
        r2Var.mScrapContainer = null;
        r2Var.mInChangeScrap = false;
        r2Var.clearReturnedFromScrapFlag();
    }

    public final void n() {
        y1 y1Var = this.f3738h.f3598n;
        this.f3736f = this.f3735e + (y1Var != null ? y1Var.mPrefetchMaxCountObserved : 0);
        ArrayList arrayList = this.f3733c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f3736f; size--) {
            h(size);
        }
    }
}
