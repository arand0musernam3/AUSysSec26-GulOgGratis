package l20;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.search.SearchView;
import e20.k0;
import e20.l0;
import h7.h2;
import h7.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements k0, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f26804a;

    public /* synthetic */ g(SearchView searchView) {
        this.f26804a = searchView;
    }

    @Override // e20.k0
    public WindowInsetsCompat e(View view, WindowInsetsCompat windowInsetsCompat, l0 l0Var) {
        MaterialToolbar materialToolbar = this.f26804a.f12561g;
        boolean z11 = materialToolbar.getLayoutDirection() == 1;
        int i11 = z11 ? l0Var.f15682c : l0Var.f15680a;
        int i12 = z11 ? l0Var.f15680a : l0Var.f15682c;
        x6.d dVarE = windowInsetsCompat.e(h2.h() | h2.b());
        materialToolbar.setPadding(i11 + dVarE.f43873a, l0Var.f15681b, i12 + dVarE.f43875c, l0Var.f15683d);
        return windowInsetsCompat;
    }

    @Override // h7.w
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        SearchView.e(this.f26804a, windowInsetsCompat);
        return windowInsetsCompat;
    }
}
