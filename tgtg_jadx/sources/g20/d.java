package g20;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f18281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f18282b;

    public d(e eVar, b bVar) {
        this.f18282b = eVar;
        this.f18281a = bVar;
    }

    public final void onBackCancelled() {
        if (this.f18282b.f18280a != null) {
            this.f18281a.d();
        }
    }

    public final void onBackInvoked() {
        this.f18281a.c();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.f18282b.f18280a != null) {
            this.f18281a.b(new androidx.activity.b(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.f18282b.f18280a != null) {
            this.f18281a.a(new androidx.activity.b(backEvent));
        }
    }
}
