package n10;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.firebase.messaging.a0;
import ky.o;
import q20.e;
import q20.g;
import z7.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30280b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f30281c;

    public c(SwipeDismissBehavior swipeDismissBehavior) {
        this.f30281c = swipeDismissBehavior;
    }

    @Override // z7.d
    public final int clampViewPositionHorizontal(View view, int i11, int i12) {
        int width;
        int width2;
        boolean z11 = view.getLayoutDirection() == 1;
        int i13 = this.f30281c.f12279e;
        if (i13 == 0) {
            width = this.f30279a;
            if (z11) {
                width -= view.getWidth();
                width2 = this.f30279a;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i14 = this.f30279a;
            if (i13 != 1) {
                width = i14 - view.getWidth();
                width2 = view.getWidth() + this.f30279a;
            } else if (z11) {
                width2 = view.getWidth() + i14;
                width = i14;
            } else {
                width = i14 - view.getWidth();
                width2 = this.f30279a;
            }
        }
        return Math.min(Math.max(width, i11), width2);
    }

    @Override // z7.d
    public final int clampViewPositionVertical(View view, int i11, int i12) {
        return view.getTop();
    }

    @Override // z7.d
    public final int getViewHorizontalDragRange(View view) {
        return view.getWidth();
    }

    @Override // z7.d
    public final void onViewCaptured(View view, int i11) {
        this.f30280b = i11;
        this.f30279a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f30281c;
            swipeDismissBehavior.f12278d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f12278d = false;
        }
    }

    @Override // z7.d
    public final void onViewDragStateChanged(int i11) {
        o oVar = this.f30281c.f12276b;
        if (oVar != null) {
            e eVar = ((g) oVar.f26718b).f35948t;
            if (i11 == 0) {
                a0.K().U(eVar);
            } else if (i11 == 1 || i11 == 2) {
                a0.K().S(eVar);
            }
        }
    }

    @Override // z7.d
    public final void onViewPositionChanged(View view, int i11, int i12, int i13, int i14) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f30281c;
        float f11 = width * swipeDismissBehavior.f12280f;
        float width2 = view.getWidth() * swipeDismissBehavior.f12281g;
        float fAbs = Math.abs(i11 - this.f30279a);
        if (fAbs <= f11) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f11) / (width2 - f11))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    @Override // z7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewReleased(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f30280b = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f30281c
            r4 = 1
            if (r1 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L18
            r5 = r4
            goto L19
        L18:
            r5 = r2
        L19:
            int r6 = r3.f12279e
            r7 = 2
            if (r6 != r7) goto L1f
            goto L50
        L1f:
            if (r6 != 0) goto L2b
            if (r5 == 0) goto L28
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L28:
            if (r1 <= 0) goto L65
            goto L50
        L2b:
            if (r6 != r4) goto L65
            if (r5 == 0) goto L32
            if (r1 <= 0) goto L65
            goto L50
        L32:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L37:
            int r1 = r9.getLeft()
            int r5 = r8.f30279a
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L65
        L50:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5f
            int r10 = r9.getLeft()
            int r0 = r8.f30279a
            if (r10 >= r0) goto L5d
            goto L5f
        L5d:
            int r0 = r0 + r11
            goto L63
        L5f:
            int r10 = r8.f30279a
            int r0 = r10 - r11
        L63:
            r2 = r4
            goto L67
        L65:
            int r0 = r8.f30279a
        L67:
            z7.e r10 = r3.f12275a
            int r11 = r9.getTop()
            boolean r10 = r10.q(r0, r11)
            if (r10 == 0) goto L7c
            androidx.lifecycle.k1 r10 = new androidx.lifecycle.k1
            r10.<init>(r3, r9, r2)
            r9.postOnAnimation(r10)
            return
        L7c:
            if (r2 == 0) goto L85
            ky.o r10 = r3.f12276b
            if (r10 == 0) goto L85
            r10.x(r9)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n10.c.onViewReleased(android.view.View, float, float):void");
    }

    @Override // z7.d
    public final boolean tryCaptureView(View view, int i11) {
        int i12 = this.f30280b;
        return (i12 == -1 || i12 == i11) && this.f30281c.w(view);
    }
}
