package p;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f33913a;

    public i2(SearchView searchView) {
        this.f33913a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z11) {
        SearchView searchView = this.f33913a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.K;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z11);
        }
    }
}
