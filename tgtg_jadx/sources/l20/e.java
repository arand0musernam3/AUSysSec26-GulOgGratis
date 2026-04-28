package l20;

import android.view.View;
import com.google.android.material.search.SearchView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f26801b;

    public /* synthetic */ e(SearchView searchView, int i11) {
        this.f26800a = i11;
        this.f26801b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i11 = this.f26800a;
        SearchView searchView = this.f26801b;
        switch (i11) {
            case 0:
                searchView.f12565k.setText("");
                searchView.j();
                break;
            case 1:
                int i12 = SearchView.E;
                searchView.l();
                break;
            default:
                int i13 = SearchView.E;
                searchView.g();
                break;
        }
    }
}
