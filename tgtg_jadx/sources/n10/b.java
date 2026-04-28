package n10;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import jb.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f30278e;

    @Override // jb.u
    public final int D(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i11;
        switch (this.f30278e) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i11 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i11 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i11 = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i11;
    }

    @Override // jb.u
    public final int G() {
        switch (this.f30278e) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override // jb.u
    public final ViewPropertyAnimator H(int i11, View view) {
        switch (this.f30278e) {
            case 0:
                return view.animate().translationY(i11);
            case 1:
                return view.animate().translationX(-i11);
            default:
                return view.animate().translationX(i11);
        }
    }
}
