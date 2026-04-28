package t;

import android.content.DialogInterface;
import androidx.lifecycle.o0;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f39312b;

    public u(v vVar, int i11) {
        this.f39311a = i11;
        switch (i11) {
            case 1:
                this.f39312b = new WeakReference(vVar);
                break;
            default:
                this.f39312b = new WeakReference(vVar);
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        switch (this.f39311a) {
            case 0:
                WeakReference weakReference = this.f39312b;
                if (weakReference.get() != null) {
                    v vVar = (v) weakReference.get();
                    if (vVar.f39333v == null) {
                        vVar.f39333v = new o0();
                    }
                    v.d(vVar.f39333v, Boolean.TRUE);
                }
                break;
            default:
                WeakReference weakReference2 = this.f39312b;
                if (weakReference2.get() != null) {
                    ((v) weakReference2.get()).c(true);
                }
                break;
        }
    }
}
