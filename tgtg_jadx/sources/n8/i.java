package n8;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f30699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f30700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30701c = true;

    public i(EditText editText) {
        this.f30699a = editText;
    }

    public static void a(EditText editText, int i11) {
        int length;
        if (i11 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            l8.j jVarA = l8.j.a();
            if (editableText == null) {
                length = 0;
            } else {
                jVarA.getClass();
                length = editableText.length();
            }
            jVarA.g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) throws Throwable {
        EditText editText = this.f30699a;
        if (!editText.isInEditMode() && this.f30701c && l8.j.d() && i12 <= i13 && (charSequence instanceof Spannable)) {
            int iC = l8.j.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    l8.j.a().g(i11, i13 + i11, 0, (Spannable) charSequence);
                    return;
                } else if (iC != 3) {
                    return;
                }
            }
            l8.j jVarA = l8.j.a();
            if (this.f30700b == null) {
                this.f30700b = new h(editText);
            }
            jVarA.h(this.f30700b);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
