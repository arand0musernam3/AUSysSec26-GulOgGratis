package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements o6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f2369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f2376h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f2376h = constraintLayout;
        this.f2369a = constraintLayout2;
    }

    public static boolean c(int i11, int i12, int i13) {
        if (i11 == i12) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i13 == size;
        }
        return false;
    }

    @Override // o6.c
    public final void a() {
        ConstraintLayout constraintLayout = this.f2369a;
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            if (childAt instanceof t) {
                t tVar = (t) childAt;
                if (tVar.f2505b != null) {
                    ConstraintLayout.a aVar = (ConstraintLayout.a) tVar.getLayoutParams();
                    ConstraintLayout.a aVar2 = (ConstraintLayout.a) tVar.f2505b.getLayoutParams();
                    n6.g gVar = aVar2.f2338q0;
                    gVar.f30593j0 = 0;
                    n6.g gVar2 = aVar.f2338q0;
                    n6.f fVar = gVar2.V[0];
                    n6.f fVar2 = n6.f.FIXED;
                    if (fVar != fVar2) {
                        gVar2.T(gVar.s());
                    }
                    n6.g gVar3 = aVar.f2338q0;
                    if (gVar3.V[1] != fVar2) {
                        gVar3.O(aVar2.f2338q0.m());
                    }
                    aVar2.f2338q0.f30593j0 = 8;
                }
            }
        }
        int size = constraintLayout.mConstraintHelpers.size();
        if (size > 0) {
            for (int i12 = 0; i12 < size; i12++) {
                ((c) constraintLayout.mConstraintHelpers.get(i12)).getClass();
            }
        }
    }

    @Override // o6.c
    public final void b(n6.g gVar, o6.b bVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int iMax2;
        boolean z11;
        int baseline;
        int i11;
        int childMeasureSpec;
        if (gVar == null) {
            return;
        }
        n6.d dVar = gVar.M;
        n6.d dVar2 = gVar.K;
        if (gVar.f30593j0 == 8 && !gVar.G) {
            bVar.f31996e = 0;
            bVar.f31997f = 0;
            bVar.f31998g = 0;
            return;
        }
        if (gVar.W == null) {
            return;
        }
        ConstraintLayout constraintLayout = this.f2376h;
        ConstraintLayout.access$000(constraintLayout);
        n6.f fVar = bVar.f31992a;
        n6.f fVar2 = bVar.f31993b;
        int i12 = bVar.f31994c;
        int i13 = bVar.f31995d;
        int i14 = this.f2370b + this.f2371c;
        int i15 = this.f2372d;
        View view = (View) gVar.f30591i0;
        int[] iArr = d.f2367a;
        int i16 = iArr[fVar.ordinal()];
        if (i16 != 1) {
            if (i16 == 2) {
                childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2374f, i15, -2);
            } else if (i16 == 3) {
                int i17 = this.f2374f;
                int i18 = dVar2 != null ? dVar2.f30570g : 0;
                if (dVar != null) {
                    i18 += dVar.f30570g;
                }
                childMeasureSpec = ViewGroup.getChildMeasureSpec(i17, i15 + i18, -1);
            } else if (i16 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2374f, i15, -2);
                boolean z12 = gVar.f30609s == 1;
                int i19 = bVar.f32001j;
                if (i19 == 1 || i19 == 2) {
                    boolean z13 = view.getMeasuredHeight() == gVar.m();
                    if (bVar.f32001j == 2 || !z12 || ((z12 && z13) || (view instanceof t) || gVar.C())) {
                        childMeasureSpec = View.MeasureSpec.makeMeasureSpec(gVar.s(), 1073741824);
                    }
                }
            }
            iMakeMeasureSpec = childMeasureSpec;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        int i21 = iArr[fVar2.ordinal()];
        if (i21 == 1) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        } else if (i21 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2375g, i14, -2);
        } else if (i21 == 3) {
            int i22 = this.f2375g;
            int i23 = dVar2 != null ? gVar.L.f30570g : 0;
            if (dVar != null) {
                i23 += gVar.N.f30570g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i22, i14 + i23, -1);
        } else if (i21 != 4) {
            iMakeMeasureSpec2 = 0;
        } else {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2375g, i14, -2);
            boolean z14 = gVar.f30611t == 1;
            int i24 = bVar.f32001j;
            if (i24 == 1 || i24 == 2) {
                boolean z15 = view.getMeasuredWidth() == gVar.s();
                if (bVar.f32001j == 2 || !z14 || ((z14 && z15) || (view instanceof t) || gVar.D())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gVar.m(), 1073741824);
                }
            }
        }
        n6.h hVar = (n6.h) gVar.W;
        if (hVar != null && n6.n.c(constraintLayout.mOptimizationLevel, 256) && view.getMeasuredWidth() == gVar.s() && view.getMeasuredWidth() < hVar.s() && view.getMeasuredHeight() == gVar.m() && view.getMeasuredHeight() < hVar.m() && view.getBaseline() == gVar.f30581d0 && !gVar.B() && c(gVar.I, iMakeMeasureSpec, gVar.s()) && c(gVar.J, iMakeMeasureSpec2, gVar.m())) {
            bVar.f31996e = gVar.s();
            bVar.f31997f = gVar.m();
            bVar.f31998g = gVar.f30581d0;
            return;
        }
        n6.f fVar3 = n6.f.MATCH_CONSTRAINT;
        boolean z16 = fVar == fVar3;
        boolean z17 = fVar2 == fVar3;
        n6.f fVar4 = n6.f.MATCH_PARENT;
        boolean z18 = fVar2 == fVar4 || fVar2 == n6.f.FIXED;
        boolean z19 = fVar == fVar4 || fVar == n6.f.FIXED;
        boolean z21 = z16 && gVar.Z > 0.0f;
        boolean z22 = z17 && gVar.Z > 0.0f;
        if (view == null) {
            return;
        }
        ConstraintLayout.a aVar = (ConstraintLayout.a) view.getLayoutParams();
        int i25 = bVar.f32001j;
        if (i25 != 1 && i25 != 2 && z16 && gVar.f30609s == 0 && z17 && gVar.f30611t == 0) {
            i11 = -1;
            z11 = false;
            baseline = 0;
            iMax = 0;
            iMax2 = 0;
        } else {
            if ((view instanceof a0) && (gVar instanceof n6.p)) {
                ((a0) view).m((n6.p) gVar, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            gVar.I = iMakeMeasureSpec;
            gVar.J = iMakeMeasureSpec2;
            gVar.f30586g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i26 = gVar.f30614v;
            iMax = i26 > 0 ? Math.max(i26, measuredWidth) : measuredWidth;
            int i27 = gVar.f30615w;
            if (i27 > 0) {
                iMax = Math.min(i27, iMax);
            }
            int i28 = gVar.f30617y;
            iMax2 = i28 > 0 ? Math.max(i28, measuredHeight) : measuredHeight;
            int i29 = gVar.f30618z;
            if (i29 > 0) {
                iMax2 = Math.min(i29, iMax2);
            }
            int i31 = iMakeMeasureSpec2;
            if (!n6.n.c(constraintLayout.mOptimizationLevel, 1)) {
                if (z21 && z18) {
                    iMax = (int) ((iMax2 * gVar.Z) + 0.5f);
                } else if (z22 && z19) {
                    iMax2 = (int) ((iMax / gVar.Z) + 0.5f);
                }
            }
            if (measuredWidth == iMax && measuredHeight == iMax2) {
                baseline = baseline2;
                i11 = -1;
                z11 = false;
            } else {
                if (measuredWidth != iMax) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i31;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                gVar.I = iMakeMeasureSpec;
                gVar.J = iMakeMeasureSpec3;
                z11 = false;
                gVar.f30586g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredWidth2;
                iMax2 = measuredHeight2;
                i11 = -1;
            }
        }
        boolean z23 = baseline != i11 ? true : z11;
        bVar.f32000i = (iMax == bVar.f31994c && iMax2 == bVar.f31995d) ? z11 : true;
        if (aVar.f2311c0) {
            z23 = true;
        }
        if (z23 && baseline != -1 && gVar.f30581d0 != baseline) {
            bVar.f32000i = true;
        }
        bVar.f31996e = iMax;
        bVar.f31997f = iMax2;
        bVar.f31999h = z23;
        bVar.f31998g = baseline;
        ConstraintLayout.access$000(constraintLayout);
    }
}
