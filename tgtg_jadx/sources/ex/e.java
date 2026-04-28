package ex;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f16519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16520b;

    public e(View view, String str) {
        view.getClass();
        this.f16519a = new WeakReference(view);
        this.f16520b = str;
    }

    public final View a() {
        WeakReference weakReference = this.f16519a;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }
}
