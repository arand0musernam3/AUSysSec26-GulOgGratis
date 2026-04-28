package n8;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f30687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l20.c f30688b;

    public b(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        l20.c cVar = new l20.c(5);
        super(inputConnection, false);
        this.f30687a = textView;
        this.f30688b = cVar;
        if (l8.j.d()) {
            l8.j.a().i(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i11, int i12) {
        Editable editableText = this.f30687a.getEditableText();
        this.f30688b.getClass();
        return l20.c.s(this, editableText, i11, i12, false) || super.deleteSurroundingText(i11, i12);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i11, int i12) {
        Editable editableText = this.f30687a.getEditableText();
        this.f30688b.getClass();
        return l20.c.s(this, editableText, i11, i12, true) || super.deleteSurroundingTextInCodePoints(i11, i12);
    }
}
