package dn;

import android.view.animation.TranslateAnimation;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f14984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TranslateAnimation f14985c;

    public /* synthetic */ b(f fVar, TranslateAnimation translateAnimation, int i11) {
        this.f14983a = i11;
        this.f14984b = fVar;
        this.f14985c = translateAnimation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14983a) {
            case 0:
                this.f14984b.f14994a.f34818v.startAnimation(this.f14985c);
                break;
            case 1:
                this.f14984b.f14994a.f34819w.startAnimation(this.f14985c);
                break;
            case 2:
                this.f14984b.f14994a.f34819w.startAnimation(this.f14985c);
                break;
            default:
                this.f14984b.f14994a.f34818v.startAnimation(this.f14985c);
                break;
        }
    }
}
