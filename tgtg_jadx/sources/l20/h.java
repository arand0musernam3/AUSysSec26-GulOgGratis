package l20;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.search.SearchView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26805a;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f26805a) {
            case 0:
                int i11 = SearchView.E;
                break;
            case 1:
                view.getParent().requestDisallowInterceptTouchEvent(true);
                break;
            case 2:
                if (!view.hasFocus()) {
                    view.requestFocus();
                }
                break;
            case 3:
                break;
            case 4:
                view.performClick();
                view.setVisibility(8);
                break;
            default:
                view.performClick();
                break;
        }
        return false;
    }
}
