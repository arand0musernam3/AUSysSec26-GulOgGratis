package p;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 extends l8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f34023a;

    public t2(SwitchCompat switchCompat) {
        this.f34023a = new WeakReference(switchCompat);
    }

    @Override // l8.h
    public final void a() {
        SwitchCompat switchCompat = (SwitchCompat) this.f34023a.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }

    @Override // l8.h
    public final void b() {
        SwitchCompat switchCompat = (SwitchCompat) this.f34023a.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }
}
