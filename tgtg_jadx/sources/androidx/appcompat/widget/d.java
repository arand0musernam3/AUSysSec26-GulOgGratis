package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements View.OnKeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f2152a;

    public d(SearchView searchView) {
        this.f2152a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
        SearchView searchView = this.f2152a;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f2058p;
        if (searchView.f2053h1 != null) {
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i11 == 66) {
                    view.cancelLongPress();
                    searchView.getContext().startActivity(searchView.j(null, "android.intent.action.SEARCH", null, searchAutoComplete.getText().toString()));
                    return true;
                }
            } else if (searchView.f2053h1 != null && searchView.O != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i11 == 66 || i11 == 84 || i11 == 61) {
                    searchView.n(searchAutoComplete.getListSelection());
                    return true;
                }
                if (i11 == 21 || i11 == 22) {
                    searchAutoComplete.setSelection(i11 == 21 ? 0 : searchAutoComplete.length());
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.a();
                    return true;
                }
                if (i11 == 19) {
                    searchAutoComplete.getListSelection();
                    return false;
                }
            }
        }
        return false;
    }
}
