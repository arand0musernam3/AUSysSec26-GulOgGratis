package androidx.drawerlayout.widget;

import a8.f;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import z7.d;
import z7.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f3100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f3101c = new f(this, 5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f3102d;

    public a(DrawerLayout drawerLayout, int i11) {
        this.f3102d = drawerLayout;
        this.f3099a = i11;
    }

    @Override // z7.d
    public final int clampViewPositionHorizontal(View view, int i11, int i12) {
        DrawerLayout drawerLayout = this.f3102d;
        if (drawerLayout.a(3, view)) {
            return Math.max(-view.getWidth(), Math.min(i11, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i11, width));
    }

    @Override // z7.d
    public final int clampViewPositionVertical(View view, int i11, int i12) {
        return view.getTop();
    }

    @Override // z7.d
    public final int getViewHorizontalDragRange(View view) {
        if (DrawerLayout.j(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // z7.d
    public final void onEdgeDragStarted(int i11, int i12) {
        int i13 = i11 & 1;
        DrawerLayout drawerLayout = this.f3102d;
        View viewD = i13 == 1 ? drawerLayout.d(3) : drawerLayout.d(5);
        if (viewD == null || drawerLayout.f(viewD) != 0) {
            return;
        }
        this.f3100b.b(i12, viewD);
    }

    @Override // z7.d
    public final boolean onEdgeLock(int i11) {
        return false;
    }

    @Override // z7.d
    public final void onEdgeTouched(int i11, int i12) {
        this.f3102d.postDelayed(this.f3101c, 160L);
    }

    @Override // z7.d
    public final void onViewCaptured(View view, int i11) {
        ((DrawerLayout.a) view.getLayoutParams()).f3097c = false;
        int i12 = this.f3099a == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.f3102d;
        View viewD = drawerLayout.d(i12);
        if (viewD != null) {
            drawerLayout.b(viewD, true);
        }
    }

    @Override // z7.d
    public final void onViewDragStateChanged(int i11) {
        this.f3102d.o(i11, this.f3100b.f47342t);
    }

    @Override // z7.d
    public final void onViewPositionChanged(View view, int i11, int i12, int i13, int i14) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f3102d;
        float width2 = (drawerLayout.a(3, view) ? i11 + width : drawerLayout.getWidth() - i11) / width;
        drawerLayout.l(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // z7.d
    public final void onViewReleased(View view, float f11, float f12) {
        int i11;
        int[] iArr = DrawerLayout.E;
        float f13 = ((DrawerLayout.a) view.getLayoutParams()).f3096b;
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f3102d;
        if (drawerLayout.a(3, view)) {
            i11 = (f11 > 0.0f || (f11 == 0.0f && f13 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f11 < 0.0f || (f11 == 0.0f && f13 > 0.5f)) {
                width2 -= width;
            }
            i11 = width2;
        }
        this.f3100b.q(i11, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // z7.d
    public final boolean tryCaptureView(View view, int i11) {
        if (!DrawerLayout.j(view)) {
            return false;
        }
        int i12 = this.f3099a;
        DrawerLayout drawerLayout = this.f3102d;
        return drawerLayout.a(i12, view) && drawerLayout.f(view) == 0;
    }
}
