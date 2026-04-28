package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3901b;

    public r1(int i11) {
        this.f3900a = 2;
        this.f3901b = i11;
    }

    public void a(r2 r2Var) {
        View view = r2Var.itemView;
        this.f3900a = view.getLeft();
        this.f3901b = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public /* synthetic */ r1(int i11, int i12) {
        this.f3900a = i11;
        this.f3901b = i12;
    }
}
