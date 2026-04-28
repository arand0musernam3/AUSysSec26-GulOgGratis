package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements h7.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3791a;

    public /* synthetic */ j1(RecyclerView recyclerView) {
        this.f3791a = recyclerView;
    }

    @Override // h7.i
    public boolean a(float f11) {
        int i11;
        int i12;
        RecyclerView recyclerView = this.f3791a;
        if (recyclerView.f3598n.canScrollVertically()) {
            i12 = (int) f11;
            i11 = 0;
        } else if (recyclerView.f3598n.getIsScrollEnabled()) {
            i11 = (int) f11;
            i12 = 0;
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (i11 == 0 && i12 == 0) {
            return false;
        }
        recyclerView.r0();
        return recyclerView.K(i11, i12, 0, Integer.MAX_VALUE);
    }

    @Override // h7.i
    public float b() {
        float f11;
        RecyclerView recyclerView = this.f3791a;
        if (recyclerView.f3598n.canScrollVertically()) {
            f11 = recyclerView.f3590i1;
        } else {
            if (!recyclerView.f3598n.getIsScrollEnabled()) {
                return 0.0f;
            }
            f11 = recyclerView.f3588h1;
        }
        return -f11;
    }

    @Override // h7.i
    public void c() {
        this.f3791a.r0();
    }

    public void d(a aVar) {
        int i11 = aVar.f3650a;
        RecyclerView recyclerView = this.f3791a;
        if (i11 == 1) {
            recyclerView.f3598n.onItemsAdded(recyclerView, aVar.f3651b, aVar.f3653d);
            return;
        }
        if (i11 == 2) {
            recyclerView.f3598n.onItemsRemoved(recyclerView, aVar.f3651b, aVar.f3653d);
        } else if (i11 == 4) {
            recyclerView.f3598n.onItemsUpdated(recyclerView, aVar.f3651b, aVar.f3653d, aVar.f3652c);
        } else {
            if (i11 != 8) {
                return;
            }
            recyclerView.f3598n.onItemsMoved(recyclerView, aVar.f3651b, aVar.f3653d, 1);
        }
    }

    public r2 e(int i11) {
        RecyclerView recyclerView = this.f3791a;
        int iH = recyclerView.f3582f.h();
        int i12 = 0;
        r2 r2Var = null;
        while (true) {
            if (i12 >= iH) {
                break;
            }
            r2 r2VarO = RecyclerView.O(recyclerView.f3582f.g(i12));
            if (r2VarO != null && !r2VarO.isRemoved() && r2VarO.mPosition == i11) {
                if (!recyclerView.f3582f.f3795c.contains(r2VarO.itemView)) {
                    r2Var = r2VarO;
                    break;
                }
                r2Var = r2VarO;
            }
            i12++;
        }
        if (r2Var != null) {
            if (!recyclerView.f3582f.f3795c.contains(r2Var.itemView)) {
                return r2Var;
            }
            if (RecyclerView.J1) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public void f(int i11, int i12, Object obj) {
        int i13;
        int i14;
        RecyclerView recyclerView = this.f3791a;
        int iH = recyclerView.f3582f.h();
        int i15 = i12 + i11;
        for (int i16 = 0; i16 < iH; i16++) {
            View viewG = recyclerView.f3582f.g(i16);
            r2 r2VarO = RecyclerView.O(viewG);
            if (r2VarO != null && !r2VarO.shouldIgnore() && (i14 = r2VarO.mPosition) >= i11 && i14 < i15) {
                r2VarO.addFlags(2);
                r2VarO.addChangePayload(obj);
                ((RecyclerView.a) viewG.getLayoutParams()).f3626c = true;
            }
        }
        f2 f2Var = recyclerView.f3579c;
        ArrayList arrayList = f2Var.f3733c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            r2 r2Var = (r2) arrayList.get(size);
            if (r2Var != null && (i13 = r2Var.mPosition) >= i11 && i13 < i15) {
                r2Var.addFlags(2);
                f2Var.h(size);
            }
        }
        recyclerView.f3607r1 = true;
    }

    public void g(int i11, int i12) {
        RecyclerView recyclerView = this.f3791a;
        int iH = recyclerView.f3582f.h();
        for (int i13 = 0; i13 < iH; i13++) {
            r2 r2VarO = RecyclerView.O(recyclerView.f3582f.g(i13));
            if (r2VarO != null && !r2VarO.shouldIgnore() && r2VarO.mPosition >= i11) {
                if (RecyclerView.J1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i13 + " holder " + r2VarO + " now at position " + (r2VarO.mPosition + i12));
                }
                r2VarO.offsetPosition(i12, false);
                recyclerView.f3599n1.f3831f = true;
            }
        }
        ArrayList arrayList = recyclerView.f3579c.f3733c;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            r2 r2Var = (r2) arrayList.get(i14);
            if (r2Var != null && r2Var.mPosition >= i11) {
                if (RecyclerView.J1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i14 + " holder " + r2Var + " now at position " + (r2Var.mPosition + i12));
                }
                r2Var.offsetPosition(i12, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f3605q1 = true;
    }

    public void h(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        RecyclerView recyclerView = this.f3791a;
        int iH = recyclerView.f3582f.h();
        if (i11 < i12) {
            i14 = i11;
            i13 = i12;
            i15 = -1;
        } else {
            i13 = i11;
            i14 = i12;
            i15 = 1;
        }
        boolean z11 = false;
        for (int i22 = 0; i22 < iH; i22++) {
            r2 r2VarO = RecyclerView.O(recyclerView.f3582f.g(i22));
            if (r2VarO != null && (i21 = r2VarO.mPosition) >= i14 && i21 <= i13) {
                if (RecyclerView.J1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i22 + " holder " + r2VarO);
                }
                if (r2VarO.mPosition == i11) {
                    r2VarO.offsetPosition(i12 - i11, false);
                } else {
                    r2VarO.offsetPosition(i15, false);
                }
                recyclerView.f3599n1.f3831f = true;
            }
        }
        ArrayList arrayList = recyclerView.f3579c.f3733c;
        if (i11 < i12) {
            i17 = i11;
            i16 = i12;
            i18 = -1;
        } else {
            i16 = i11;
            i17 = i12;
            i18 = 1;
        }
        int size = arrayList.size();
        int i23 = 0;
        while (i23 < size) {
            r2 r2Var = (r2) arrayList.get(i23);
            if (r2Var != null && (i19 = r2Var.mPosition) >= i17 && i19 <= i16) {
                if (i19 == i11) {
                    r2Var.offsetPosition(i12 - i11, z11);
                } else {
                    r2Var.offsetPosition(i18, z11);
                }
                if (RecyclerView.J1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i23 + " holder " + r2Var);
                }
            }
            i23++;
            z11 = false;
        }
        recyclerView.requestLayout();
        recyclerView.f3605q1 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(androidx.recyclerview.widget.r2 r9, androidx.recyclerview.widget.r1 r10, androidx.recyclerview.widget.r1 r11) {
        /*
            r8 = this;
            r0 = 0
            r9.setIsRecyclable(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r8.f3791a
            androidx.recyclerview.widget.s1 r1 = r0.M
            r2 = r1
            androidx.recyclerview.widget.r r2 = (androidx.recyclerview.widget.r) r2
            if (r10 == 0) goto L1d
            r2.getClass()
            int r4 = r10.f3900a
            int r6 = r11.f3900a
            if (r4 != r6) goto L1f
            int r1 = r10.f3901b
            int r3 = r11.f3901b
            if (r1 == r3) goto L1d
            goto L1f
        L1d:
            r3 = r9
            goto L29
        L1f:
            int r5 = r10.f3901b
            int r7 = r11.f3901b
            r3 = r9
            boolean r9 = r2.g(r3, r4, r5, r6, r7)
            goto L38
        L29:
            r2.l(r3)
            android.view.View r9 = r3.itemView
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r2.f3890i
            r9.add(r3)
            r9 = 1
        L38:
            if (r9 == 0) goto L3d
            r0.Y()
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.j1.i(androidx.recyclerview.widget.r2, androidx.recyclerview.widget.r1, androidx.recyclerview.widget.r1):void");
    }

    public void j(r2 r2Var, r1 r1Var, r1 r1Var2) {
        boolean zG;
        RecyclerView recyclerView = this.f3791a;
        recyclerView.f3579c.m(r2Var);
        recyclerView.h(r2Var);
        r2Var.setIsRecyclable(false);
        r rVar = (r) recyclerView.M;
        rVar.getClass();
        int i11 = r1Var.f3900a;
        int i12 = r1Var.f3901b;
        View view = r2Var.itemView;
        int left = r1Var2 == null ? view.getLeft() : r1Var2.f3900a;
        int top = r1Var2 == null ? view.getTop() : r1Var2.f3901b;
        if (r2Var.isRemoved() || (i11 == left && i12 == top)) {
            rVar.l(r2Var);
            rVar.f3889h.add(r2Var);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = rVar.g(r2Var, i11, i12, left, top);
        }
        if (zG) {
            recyclerView.Y();
        }
    }

    public void k(int i11) {
        RecyclerView recyclerView = this.f3791a;
        View childAt = recyclerView.getChildAt(i11);
        if (childAt != null) {
            recyclerView.s(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i11);
    }
}
