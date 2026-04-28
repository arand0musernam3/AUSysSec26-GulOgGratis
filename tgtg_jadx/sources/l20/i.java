package l20;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.search.SearchView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26807b;

    public /* synthetic */ i(Object obj, int i11) {
        this.f26806a = i11;
        this.f26807b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i11 = this.f26806a;
        Object obj = this.f26807b;
        switch (i11) {
            case 0:
                SearchView searchView = (SearchView) obj;
                int i12 = SearchView.E;
                if (searchView.h()) {
                    searchView.f();
                }
                break;
            default:
                t20.i iVar = (t20.i) obj;
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis() - iVar.f39692o;
                    if (jUptimeMillis < 0 || jUptimeMillis > 300) {
                        iVar.f39690m = false;
                    }
                    iVar.t();
                    iVar.f39690m = true;
                    iVar.f39692o = SystemClock.uptimeMillis();
                }
                break;
        }
        return false;
    }
}
