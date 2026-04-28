package com.google.android.material.bottomsheet;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends z7.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s6.b f12346b;

    public /* synthetic */ b(s6.b bVar, int i11) {
        this.f12345a = i11;
        this.f12346b = bVar;
    }

    @Override // z7.d
    public final int clampViewPositionHorizontal(View view, int i11, int i12) {
        switch (this.f12345a) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f12346b;
                return xz.b.o(i11, sideSheetBehavior.f12580a.y(), sideSheetBehavior.f12580a.x());
        }
    }

    @Override // z7.d
    public final int clampViewPositionVertical(View view, int i11, int i12) {
        switch (this.f12345a) {
            case 0:
                return xz.b.o(i11, ((BottomSheetBehavior) this.f12346b).D(), getViewVerticalDragRange(view));
            default:
                return view.getTop();
        }
    }

    @Override // z7.d
    public int getViewHorizontalDragRange(View view) {
        switch (this.f12345a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f12346b;
                return sideSheetBehavior.l + sideSheetBehavior.f12593o;
            default:
                return super.getViewHorizontalDragRange(view);
        }
    }

    @Override // z7.d
    public int getViewVerticalDragRange(View view) {
        switch (this.f12345a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f12346b;
                return bottomSheetBehavior.I ? bottomSheetBehavior.Y : bottomSheetBehavior.G;
            default:
                return super.getViewVerticalDragRange(view);
        }
    }

    @Override // z7.d
    public final void onViewDragStateChanged(int i11) {
        switch (this.f12345a) {
            case 0:
                if (i11 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f12346b;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.K(1);
                    }
                }
                break;
            default:
                if (i11 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f12346b;
                    if (sideSheetBehavior.f12586g) {
                        sideSheetBehavior.x(1);
                    }
                }
                break;
        }
    }

    @Override // z7.d
    public final void onViewPositionChanged(View view, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f12345a) {
            case 0:
                ((BottomSheetBehavior) this.f12346b).z(i12);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f12346b;
                WeakReference weakReference = sideSheetBehavior.f12595q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f12580a.R(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f12600v;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f12580a.o(i11);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw e0.f.e(it);
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6  */
    @Override // z7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewReleased(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.b.onViewReleased(android.view.View, float, float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0048  */
    @Override // z7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean tryCaptureView(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.f12345a
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            s6.b r6 = r4.f12346b
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            int r0 = r6.f12587h
            r1 = 1
            if (r0 != r1) goto Lf
            goto L1a
        Lf:
            java.lang.ref.WeakReference r6 = r6.f12594p
            if (r6 == 0) goto L1a
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L1a
            goto L1b
        L1a:
            r1 = 0
        L1b:
            return r1
        L1c:
            s6.b r0 = r4.f12346b
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.N
            r2 = 1
            if (r1 != r2) goto L26
            goto L56
        L26:
            boolean r3 = r0.f12325j1
            if (r3 == 0) goto L2b
            goto L56
        L2b:
            r3 = 3
            if (r1 != r3) goto L48
            int r1 = r0.f12321h1
            if (r1 != r6) goto L48
            java.lang.ref.WeakReference r6 = r0.f12320h0
            if (r6 == 0) goto L3d
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L3e
        L3d:
            r6 = 0
        L3e:
            if (r6 == 0) goto L48
            r1 = -1
            boolean r6 = r6.canScrollVertically(r1)
            if (r6 == 0) goto L48
            goto L56
        L48:
            android.os.SystemClock.uptimeMillis()
            java.lang.ref.WeakReference r6 = r0.Z
            if (r6 == 0) goto L56
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L56
            goto L57
        L56:
            r2 = 0
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.b.tryCaptureView(android.view.View, int):boolean");
    }
}
