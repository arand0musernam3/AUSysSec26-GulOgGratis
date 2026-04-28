package p;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f33980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb.b f33981b;

    public q(TextView textView) {
        this.f33980a = textView;
        jb.b bVar = new jb.b();
        bVar.f24851a = new n8.g(textView);
        this.f33981b = bVar;
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((w.b) this.f33981b.f24851a).J(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i11) {
        TypedArray typedArrayObtainStyledAttributes = this.f33980a.getContext().obtainStyledAttributes(attributeSet, j.a.f24261i, i11, 0);
        try {
            boolean z11 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z11);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void c(boolean z11) {
        ((w.b) this.f33981b.f24851a).Z(z11);
    }

    public final void d(boolean z11) {
        ((w.b) this.f33981b.f24851a).c0(z11);
    }
}
