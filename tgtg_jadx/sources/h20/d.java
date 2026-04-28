package h20;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends FrameLayout implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21263c;

    @Override // o.y
    public final void a(o.n nVar) {
        b();
    }

    public final void b() {
        setVisibility((!this.f21263c || (!this.f21261a && this.f21262b)) ? 8 : 0);
    }

    @Override // o.y
    public o.n getItemData() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
    }

    public void setDividersEnabled(boolean z11) {
        this.f21263c = z11;
        b();
    }

    @Override // h20.k
    public void setExpanded(boolean z11) {
        this.f21261a = z11;
        b();
    }

    @Override // h20.k
    public void setOnlyShowWhenExpanded(boolean z11) {
        this.f21262b = z11;
        b();
    }

    public void setCheckable(boolean z11) {
    }

    public void setChecked(boolean z11) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public void setShortcut(boolean z11, char c3) {
    }
}
