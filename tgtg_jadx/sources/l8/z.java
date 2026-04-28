package l8;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f27499a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spannable f27500b;

    public z(Spannable spannable) {
        this.f27500b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f27500b;
        if (!this.f27499a) {
            if ((Build.VERSION.SDK_INT < 28 ? new l20.c(2) : new y(2)).t(spannable)) {
                this.f27500b = new SpannableString(spannable);
            }
        }
        this.f27499a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i11) {
        return this.f27500b.charAt(i11);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f27500b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f27500b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f27500b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f27500b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f27500b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i11, int i12, Class cls) {
        return this.f27500b.getSpans(i11, i12, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f27500b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i11, int i12, Class cls) {
        return this.f27500b.nextSpanTransition(i11, i12, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f27500b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i11, int i12, int i13) {
        a();
        this.f27500b.setSpan(obj, i11, i12, i13);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i11, int i12) {
        return this.f27500b.subSequence(i11, i12);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f27500b.toString();
    }
}
