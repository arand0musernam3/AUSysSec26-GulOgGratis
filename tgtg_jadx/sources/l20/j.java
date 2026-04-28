package l20;

import android.animation.AnimatorSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f26809b;

    public /* synthetic */ j(o oVar, int i11) {
        this.f26808a = i11;
        this.f26809b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26808a) {
            case 0:
                this.f26809b.l();
                break;
            case 1:
                o oVar = this.f26809b;
                AnimatorSet animatorSetD = oVar.d(true);
                animatorSetD.addListener(new n(oVar, 0));
                animatorSetD.start();
                break;
            default:
                o oVar2 = this.f26809b;
                oVar2.f26820c.setTranslationY(r1.getHeight());
                AnimatorSet animatorSetG = oVar2.g(true);
                animatorSetG.addListener(new n(oVar2, 2));
                animatorSetG.start();
                break;
        }
    }
}
