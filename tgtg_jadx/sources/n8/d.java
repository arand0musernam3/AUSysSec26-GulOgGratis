package n8;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f30691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f30692b;

    public d(TextView textView) {
        this.f30691a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
        TextView textView = this.f30691a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iC = l8.j.a().c();
        if (iC != 0) {
            if (iC == 1) {
                if ((i14 == 0 && i13 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i11 != 0 || i12 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i11, i12);
                }
                return l8.j.a().g(0, charSequence.length(), 0, charSequence);
            }
            if (iC != 3) {
                return charSequence;
            }
        }
        l8.j jVarA = l8.j.a();
        if (this.f30692b == null) {
            this.f30692b = new c(textView, this);
        }
        jVarA.h(this.f30692b);
        return charSequence;
    }
}
