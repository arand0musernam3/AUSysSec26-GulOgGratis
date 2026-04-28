package p;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends w6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f33941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f33942i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WeakReference f33943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p0 f33944k;

    public l0(p0 p0Var, int i11, int i12, WeakReference weakReference) {
        this.f33944k = p0Var;
        this.f33941h = i11;
        this.f33942i = i12;
        this.f33943j = weakReference;
    }

    @Override // w6.a
    public final void j(Typeface typeface) {
        int i11;
        if (Build.VERSION.SDK_INT >= 28 && (i11 = this.f33941h) != -1) {
            typeface = o0.a(typeface, i11, (this.f33942i & 2) != 0);
        }
        p0 p0Var = this.f33944k;
        if (p0Var.f33978m) {
            p0Var.l = typeface;
            TextView textView = (TextView) this.f33943j.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i12 = p0Var.f33976j;
                if (zIsAttachedToWindow) {
                    textView.post(new androidx.recyclerview.widget.k0(textView, typeface, i12));
                } else {
                    textView.setTypeface(typeface, i12);
                }
            }
        }
    }

    @Override // w6.a
    public final void i(int i11) {
    }
}
