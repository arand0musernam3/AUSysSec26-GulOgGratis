package t20;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f39698a;

    public k(l lVar) {
        this.f39698a = lVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        l lVar = this.f39698a;
        j jVar = lVar.f39719v;
        if (lVar.f39716s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = lVar.f39716s;
        if (editText != null) {
            editText.removeTextChangedListener(jVar);
            if (lVar.f39716s.getOnFocusChangeListener() == lVar.a().e()) {
                lVar.f39716s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        lVar.f39716s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(jVar);
        }
        lVar.a().l(lVar.f39716s);
        lVar.i(lVar.a());
    }
}
