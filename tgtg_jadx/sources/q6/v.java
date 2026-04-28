package q6;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import o00.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n6.h f36323a = new n6.h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n6.h f36324b = new n6.h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.constraintlayout.widget.q f36325c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.constraintlayout.widget.q f36326d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f36329g;

    public v(MotionLayout motionLayout) {
        this.f36329g = motionLayout;
    }

    public static void c(n6.h hVar, n6.h hVar2) {
        ArrayList<n6.g> arrayList = hVar.f30619v0;
        HashMap map = new HashMap();
        map.put(hVar, hVar2);
        hVar2.f30619v0.clear();
        hVar2.h(hVar, map);
        for (n6.g gVar : arrayList) {
            n6.g aVar = gVar instanceof n6.a ? new n6.a() : gVar instanceof n6.l ? new n6.l() : gVar instanceof n6.j ? new n6.j() : gVar instanceof n6.o ? new n6.o() : gVar instanceof n6.m ? new n6.m() : new n6.g();
            hVar2.W(aVar);
            map.put(gVar, aVar);
        }
        for (n6.g gVar2 : arrayList) {
            ((n6.g) map.get(gVar2)).h(gVar2, map);
        }
    }

    public static n6.g d(n6.h hVar, View view) {
        if (hVar.f30591i0 == view) {
            return hVar;
        }
        ArrayList arrayList = hVar.f30619v0;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            n6.g gVar = (n6.g) arrayList.get(i11);
            if (gVar.f30591i0 == view) {
                return gVar;
            }
        }
        return null;
    }

    public final void a() {
        int i11;
        HashMap map;
        SparseArray sparseArray;
        int[] iArr;
        int i12;
        Rect rect;
        Rect rect2;
        MotionLayout motionLayout = this.f36329g;
        int childCount = motionLayout.getChildCount();
        HashMap map2 = motionLayout.f2278k;
        map2.clear();
        SparseArray sparseArray2 = new SparseArray();
        int[] iArr2 = new int[childCount];
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = motionLayout.getChildAt(i13);
            p pVar = new p(childAt);
            int id2 = childAt.getId();
            iArr2[i13] = id2;
            sparseArray2.put(id2, pVar);
            map2.put(childAt, pVar);
        }
        int i14 = 0;
        while (i14 < childCount) {
            View childAt2 = motionLayout.getChildAt(i14);
            p pVar2 = (p) map2.get(childAt2);
            if (pVar2 == null) {
                i11 = childCount;
                map = map2;
                sparseArray = sparseArray2;
                iArr = iArr2;
                i12 = i14;
            } else {
                Rect rect3 = pVar2.f36276a;
                a0 a0Var = pVar2.f36281f;
                if (this.f36325c != null) {
                    n6.g gVarD = d(this.f36323a, childAt2);
                    if (gVarD != null) {
                        Rect rectJ = MotionLayout.j(motionLayout, gVarD);
                        map = map2;
                        androidx.constraintlayout.widget.q qVar = this.f36325c;
                        iArr = iArr2;
                        int width = motionLayout.getWidth();
                        i12 = i14;
                        int height = motionLayout.getHeight();
                        sparseArray = sparseArray2;
                        int i15 = qVar.f2491d;
                        if (i15 != 0) {
                            p.f(rectJ, rect3, i15, width, height);
                        }
                        a0Var.f36064c = 0.0f;
                        a0Var.f36065d = 0.0f;
                        pVar2.e(a0Var);
                        i11 = childCount;
                        rect = rect3;
                        a0Var.e(rectJ.left, rectJ.top, rectJ.width(), rectJ.height());
                        androidx.constraintlayout.widget.l lVarI = qVar.i(pVar2.f36278c);
                        a0Var.a(lVarI);
                        androidx.constraintlayout.widget.n nVar = lVarI.f2406d;
                        pVar2.l = nVar.f2460g;
                        pVar2.f36283h.d(rectJ, qVar, i15, pVar2.f36278c);
                        pVar2.C = lVarI.f2408f.f2480i;
                        pVar2.E = nVar.f2463j;
                        pVar2.F = nVar.f2462i;
                        Context context = pVar2.f36277b.getContext();
                        int i16 = nVar.l;
                        pVar2.G = i16 != -2 ? i16 != -1 ? i16 != 0 ? i16 != 1 ? i16 != 2 ? i16 != 4 ? i16 != 5 ? null : new OvershootInterpolator() : new BounceInterpolator() : new DecelerateInterpolator() : new AccelerateInterpolator() : new AccelerateDecelerateInterpolator() : new o(i6.e.d(nVar.f2464k), 0) : AnimationUtils.loadInterpolator(context, nVar.f2465m);
                    } else {
                        i11 = childCount;
                        map = map2;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        i12 = i14;
                        rect = rect3;
                        if (motionLayout.f2297u != 0) {
                            Log.e("MotionLayout", x0.u() + "no widget for  " + x0.w(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                } else {
                    i11 = childCount;
                    map = map2;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                    i12 = i14;
                    rect = rect3;
                }
                if (this.f36326d != null) {
                    n6.g gVarD2 = d(this.f36324b, childAt2);
                    if (gVarD2 != null) {
                        Rect rectJ2 = MotionLayout.j(motionLayout, gVarD2);
                        androidx.constraintlayout.widget.q qVar2 = this.f36326d;
                        int width2 = motionLayout.getWidth();
                        int height2 = motionLayout.getHeight();
                        a0 a0Var2 = pVar2.f36282g;
                        int i17 = qVar2.f2491d;
                        if (i17 != 0) {
                            Rect rect4 = rect;
                            p.f(rectJ2, rect4, i17, width2, height2);
                            rect2 = rect4;
                        } else {
                            rect2 = rectJ2;
                        }
                        a0Var2.f36064c = 1.0f;
                        a0Var2.f36065d = 1.0f;
                        pVar2.e(a0Var2);
                        a0Var2.e(rect2.left, rect2.top, rect2.width(), rect2.height());
                        a0Var2.a(qVar2.i(pVar2.f36278c));
                        pVar2.f36284i.d(rect2, qVar2, i17, pVar2.f36278c);
                    } else if (motionLayout.f2297u != 0) {
                        Log.e("MotionLayout", x0.u() + "no widget for  " + x0.w(childAt2) + " (" + childAt2.getClass().getName() + ")");
                    }
                }
            }
            i14 = i12 + 1;
            map2 = map;
            iArr2 = iArr;
            sparseArray2 = sparseArray;
            childCount = i11;
        }
        SparseArray sparseArray3 = sparseArray2;
        int[] iArr3 = iArr2;
        int i18 = childCount;
        int i19 = 0;
        while (i19 < i18) {
            SparseArray sparseArray4 = sparseArray3;
            p pVar3 = (p) sparseArray4.get(iArr3[i19]);
            int i21 = pVar3.f36281f.f36072k;
            if (i21 != -1) {
                p pVar4 = (p) sparseArray4.get(i21);
                pVar3.f36281f.g(pVar4, pVar4.f36281f);
                pVar3.f36282g.g(pVar4, pVar4.f36282g);
            }
            i19++;
            sparseArray3 = sparseArray4;
        }
    }

    public final void b(int i11, int i12) {
        MotionLayout motionLayout = this.f36329g;
        int optimizationLevel = motionLayout.getOptimizationLevel();
        if (motionLayout.f2267f == motionLayout.getStartState()) {
            n6.h hVar = this.f36324b;
            androidx.constraintlayout.widget.q qVar = this.f36326d;
            motionLayout.resolveSystem(hVar, optimizationLevel, (qVar == null || qVar.f2491d == 0) ? i11 : i12, (qVar == null || qVar.f2491d == 0) ? i12 : i11);
            androidx.constraintlayout.widget.q qVar2 = this.f36325c;
            if (qVar2 != null) {
                n6.h hVar2 = this.f36323a;
                int i13 = qVar2.f2491d;
                int i14 = i13 == 0 ? i11 : i12;
                if (i13 == 0) {
                    i11 = i12;
                }
                motionLayout.resolveSystem(hVar2, optimizationLevel, i14, i11);
                return;
            }
            return;
        }
        androidx.constraintlayout.widget.q qVar3 = this.f36325c;
        if (qVar3 != null) {
            n6.h hVar3 = this.f36323a;
            int i15 = qVar3.f2491d;
            motionLayout.resolveSystem(hVar3, optimizationLevel, i15 == 0 ? i11 : i12, i15 == 0 ? i12 : i11);
        }
        n6.h hVar4 = this.f36324b;
        androidx.constraintlayout.widget.q qVar4 = this.f36326d;
        int i16 = (qVar4 == null || qVar4.f2491d == 0) ? i11 : i12;
        if (qVar4 == null || qVar4.f2491d == 0) {
            i11 = i12;
        }
        motionLayout.resolveSystem(hVar4, optimizationLevel, i16, i11);
    }

    public final void e(androidx.constraintlayout.widget.q qVar, androidx.constraintlayout.widget.q qVar2) {
        this.f36325c = qVar;
        this.f36326d = qVar2;
        this.f36323a = new n6.h();
        this.f36324b = new n6.h();
        n6.h hVar = this.f36323a;
        MotionLayout motionLayout = this.f36329g;
        o6.c cVar = ((ConstraintLayout) motionLayout).mLayoutWidget.f30623z0;
        hVar.f30623z0 = cVar;
        hVar.f30621x0.f809g = cVar;
        n6.h hVar2 = this.f36324b;
        o6.c cVar2 = ((ConstraintLayout) motionLayout).mLayoutWidget.f30623z0;
        hVar2.f30623z0 = cVar2;
        hVar2.f30621x0.f809g = cVar2;
        this.f36323a.f30619v0.clear();
        this.f36324b.f30619v0.clear();
        c(((ConstraintLayout) motionLayout).mLayoutWidget, this.f36323a);
        c(((ConstraintLayout) motionLayout).mLayoutWidget, this.f36324b);
        if (motionLayout.f2285o > 0.5d) {
            if (qVar != null) {
                g(this.f36323a, qVar);
            }
            g(this.f36324b, qVar2);
        } else {
            g(this.f36324b, qVar2);
            if (qVar != null) {
                g(this.f36323a, qVar);
            }
        }
        this.f36323a.A0 = motionLayout.isRtl();
        n6.h hVar3 = this.f36323a;
        hVar3.f30620w0.G(hVar3);
        this.f36324b.A0 = motionLayout.isRtl();
        n6.h hVar4 = this.f36324b;
        hVar4.f30620w0.G(hVar4);
        ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.width == -2) {
                n6.h hVar5 = this.f36323a;
                n6.f fVar = n6.f.WRAP_CONTENT;
                hVar5.P(fVar);
                this.f36324b.P(fVar);
            }
            if (layoutParams.height == -2) {
                n6.h hVar6 = this.f36323a;
                n6.f fVar2 = n6.f.WRAP_CONTENT;
                hVar6.R(fVar2);
                this.f36324b.R(fVar2);
            }
        }
    }

    public final void f() {
        n6.h hVar;
        boolean z11;
        MotionLayout motionLayout = this.f36329g;
        int i11 = motionLayout.f2271h;
        int i12 = motionLayout.f2274i;
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        motionLayout.t0 = mode;
        motionLayout.f2268f1 = mode2;
        b(i11, i12);
        int i13 = 0;
        if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
            b(i11, i12);
            motionLayout.T = this.f36323a.s();
            motionLayout.V = this.f36323a.m();
            motionLayout.W = this.f36324b.s();
            int iM = this.f36324b.m();
            motionLayout.f2272h0 = iM;
            motionLayout.Q = (motionLayout.T == motionLayout.W && motionLayout.V == iM) ? false : true;
        }
        int i14 = motionLayout.T;
        int i15 = motionLayout.V;
        int i16 = motionLayout.t0;
        if (i16 == Integer.MIN_VALUE || i16 == 0) {
            i14 = (int) ((motionLayout.f2270g1 * (motionLayout.W - i14)) + i14);
        }
        int i17 = motionLayout.f2268f1;
        if (i17 == Integer.MIN_VALUE || i17 == 0) {
            i15 = (int) ((motionLayout.f2270g1 * (motionLayout.f2272h0 - i15)) + i15);
        }
        n6.h hVar2 = this.f36323a;
        if (hVar2.J0 || this.f36324b.J0) {
            hVar = hVar2;
            z11 = true;
        } else {
            hVar = hVar2;
            z11 = false;
        }
        motionLayout.resolveMeasuredDimension(i11, i12, i14, i15, z11, hVar.K0 || this.f36324b.K0);
        HashMap map = motionLayout.f2278k;
        int childCount = motionLayout.getChildCount();
        motionLayout.f2286o1.a();
        motionLayout.f2293s = true;
        SparseArray sparseArray = new SparseArray();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = motionLayout.getChildAt(i18);
            sparseArray.put(childAt.getId(), (p) map.get(childAt));
        }
        int width = motionLayout.getWidth();
        int height = motionLayout.getHeight();
        c0 c0Var = motionLayout.f2262a.f36119c;
        int i19 = c0Var != null ? c0Var.f36100p : -1;
        if (i19 != -1) {
            for (int i21 = 0; i21 < childCount; i21++) {
                p pVar = (p) map.get(motionLayout.getChildAt(i21));
                if (pVar != null) {
                    pVar.B = i19;
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[map.size()];
        int i22 = 0;
        for (int i23 = 0; i23 < childCount; i23++) {
            p pVar2 = (p) map.get(motionLayout.getChildAt(i23));
            int i24 = pVar2.f36281f.f36072k;
            if (i24 != -1) {
                sparseBooleanArray.put(i24, true);
                iArr[i22] = pVar2.f36281f.f36072k;
                i22++;
            }
        }
        for (int i25 = 0; i25 < i22; i25++) {
            p pVar3 = (p) map.get(motionLayout.findViewById(iArr[i25]));
            if (pVar3 != null) {
                motionLayout.f2262a.e(pVar3);
                pVar3.g(width, height, motionLayout.getNanoTime());
            }
        }
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt2 = motionLayout.getChildAt(i26);
            p pVar4 = (p) map.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && pVar4 != null) {
                motionLayout.f2262a.e(pVar4);
                pVar4.g(width, height, motionLayout.getNanoTime());
            }
        }
        c0 c0Var2 = motionLayout.f2262a.f36119c;
        float f11 = c0Var2 != null ? c0Var2.f36094i : 0.0f;
        if (f11 != 0.0f) {
            boolean z12 = ((double) f11) < 0.0d;
            float fAbs = Math.abs(f11);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i27 = 0; i27 < childCount; i27++) {
                p pVar5 = (p) map.get(motionLayout.getChildAt(i27));
                if (!Float.isNaN(pVar5.l)) {
                    for (int i28 = 0; i28 < childCount; i28++) {
                        p pVar6 = (p) map.get(motionLayout.getChildAt(i28));
                        if (!Float.isNaN(pVar6.l)) {
                            fMin = Math.min(fMin, pVar6.l);
                            fMax = Math.max(fMax, pVar6.l);
                        }
                    }
                    while (i13 < childCount) {
                        p pVar7 = (p) map.get(motionLayout.getChildAt(i13));
                        if (!Float.isNaN(pVar7.l)) {
                            pVar7.f36288n = 1.0f / (1.0f - fAbs);
                            float f12 = pVar7.l;
                            if (z12) {
                                pVar7.f36287m = fAbs - (((fMax - f12) / (fMax - fMin)) * fAbs);
                            } else {
                                pVar7.f36287m = fAbs - (((f12 - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i13++;
                    }
                    return;
                }
                a0 a0Var = pVar5.f36282g;
                float f13 = a0Var.f36066e;
                float f14 = a0Var.f36067f;
                float f15 = z12 ? f14 - f13 : f14 + f13;
                fMin2 = Math.min(fMin2, f15);
                fMax2 = Math.max(fMax2, f15);
            }
            while (i13 < childCount) {
                p pVar8 = (p) map.get(motionLayout.getChildAt(i13));
                a0 a0Var2 = pVar8.f36282g;
                float f16 = a0Var2.f36066e;
                float f17 = a0Var2.f36067f;
                float f18 = z12 ? f17 - f16 : f17 + f16;
                pVar8.f36288n = 1.0f / (1.0f - fAbs);
                pVar8.f36287m = fAbs - (((f18 - fMin2) * fAbs) / (fMax2 - fMin2));
                i13++;
            }
        }
    }

    public final void g(n6.h hVar, androidx.constraintlayout.widget.q qVar) {
        androidx.constraintlayout.widget.l lVar;
        androidx.constraintlayout.widget.l lVar2;
        SparseArray<n6.g> sparseArray = new SparseArray<>();
        r.a aVar = new r.a();
        sparseArray.clear();
        sparseArray.put(0, hVar);
        MotionLayout motionLayout = this.f36329g;
        sparseArray.put(motionLayout.getId(), hVar);
        if (qVar != null && qVar.f2491d != 0) {
            n6.h hVar2 = this.f36324b;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
            boolean z11 = MotionLayout.f2261u1;
            motionLayout.resolveSystem(hVar2, optimizationLevel, iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        for (n6.g gVar : hVar.f30619v0) {
            gVar.f30595k0 = true;
            sparseArray.put(((View) gVar.f30591i0).getId(), gVar);
        }
        for (n6.g gVar2 : hVar.f30619v0) {
            View view = (View) gVar2.f30591i0;
            int id2 = view.getId();
            HashMap map = qVar.f2494g;
            if (map.containsKey(Integer.valueOf(id2)) && (lVar2 = (androidx.constraintlayout.widget.l) map.get(Integer.valueOf(id2))) != null) {
                lVar2.a(aVar);
            }
            gVar2.T(qVar.i(view.getId()).f2407e.f2416c);
            gVar2.O(qVar.i(view.getId()).f2407e.f2418d);
            if (view instanceof androidx.constraintlayout.widget.c) {
                androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) view;
                int id3 = cVar.getId();
                HashMap map2 = qVar.f2494g;
                if (map2.containsKey(Integer.valueOf(id3)) && (lVar = (androidx.constraintlayout.widget.l) map2.get(Integer.valueOf(id3))) != null && (gVar2 instanceof n6.m)) {
                    cVar.j(lVar, (n6.m) gVar2, aVar, sparseArray);
                }
                if (view instanceof Barrier) {
                    ((Barrier) view).l();
                }
            }
            aVar.resolveLayoutDirection(motionLayout.getLayoutDirection());
            boolean z12 = MotionLayout.f2261u1;
            motionLayout.applyConstraintsFromLayoutParams(false, view, gVar2, aVar, sparseArray);
            if (qVar.i(view.getId()).f2405c.f2468c == 1) {
                gVar2.f30593j0 = view.getVisibility();
            } else {
                gVar2.f30593j0 = qVar.i(view.getId()).f2405c.f2467b;
            }
        }
        for (n6.g gVar3 : hVar.f30619v0) {
            if (gVar3 instanceof n6.p) {
                androidx.constraintlayout.widget.c cVar2 = (androidx.constraintlayout.widget.c) gVar3.f30591i0;
                n6.m mVar = (n6.m) gVar3;
                cVar2.getClass();
                mVar.f30655w0 = 0;
                Arrays.fill(mVar.f30654v0, (Object) null);
                for (int i11 = 0; i11 < cVar2.f2360b; i11++) {
                    mVar.W(sparseArray.get(cVar2.f2359a[i11]));
                }
                n6.p pVar = (n6.p) mVar;
                for (int i12 = 0; i12 < pVar.f30655w0; i12++) {
                    n6.g gVar4 = pVar.f30654v0[i12];
                    if (gVar4 != null) {
                        gVar4.H = true;
                    }
                }
            }
        }
    }
}
