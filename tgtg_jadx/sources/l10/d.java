package l10;

import a60.s;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class d extends s6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f26780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26781b = 0;

    public d() {
    }

    @Override // s6.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i11) {
        x(coordinatorLayout, view, i11);
        if (this.f26780a == null) {
            this.f26780a = new s(view);
        }
        s sVar = this.f26780a;
        View view2 = (View) sVar.f912d;
        sVar.f909a = view2.getTop();
        sVar.f910b = view2.getLeft();
        this.f26780a.b();
        int i12 = this.f26781b;
        if (i12 == 0) {
            return true;
        }
        s sVar2 = this.f26780a;
        if (sVar2.f911c != i12) {
            sVar2.f911c = i12;
            sVar2.b();
        }
        this.f26781b = 0;
        return true;
    }

    public final int w() {
        s sVar = this.f26780a;
        if (sVar != null) {
            return sVar.f911c;
        }
        return 0;
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, int i11) {
        coordinatorLayout.r(i11, view);
    }

    public d(Context context, AttributeSet attributeSet) {
    }
}
