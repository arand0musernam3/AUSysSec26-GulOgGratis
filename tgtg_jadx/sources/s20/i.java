package s20;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f38798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f38799b;

    public i(j jVar, View view) {
        this.f38799b = jVar;
        this.f38798a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        View view2 = this.f38798a;
        if (view2.getVisibility() == 0) {
            this.f38799b.c(view2);
        }
    }
}
