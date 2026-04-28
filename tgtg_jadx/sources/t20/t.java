package t20;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f39772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f39773c;

    public t(TextInputLayout textInputLayout, EditText editText) {
        this.f39773c = textInputLayout;
        this.f39772b = editText;
        this.f39771a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f39773c;
        textInputLayout.w(!textInputLayout.H1, false);
        if (textInputLayout.l) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.f12675t) {
            textInputLayout.x(editable);
        }
        EditText editText = this.f39772b;
        int lineCount = editText.getLineCount();
        int i11 = this.f39771a;
        if (lineCount != i11) {
            if (lineCount < i11) {
                int minimumHeight = editText.getMinimumHeight();
                int i12 = textInputLayout.A1;
                if (minimumHeight != i12) {
                    editText.setMinimumHeight(i12);
                }
            }
            this.f39771a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
