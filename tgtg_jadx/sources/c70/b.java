package c70;

import android.animation.Animator;
import androidx.core.util.Consumer;
import c1.q;
import oa.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7797a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7799c;

    public b(q qVar, Consumer consumer, int i11) {
        qVar = (i11 & 1) != 0 ? null : qVar;
        consumer = (i11 & 2) != 0 ? null : consumer;
        this.f7798b = qVar;
        this.f7799c = consumer;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f7797a) {
            case 0:
                animator.getClass();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7797a) {
            case 0:
                animator.getClass();
                Consumer consumer = (Consumer) this.f7799c;
                if (consumer != null) {
                    consumer.accept(animator);
                }
                this.f7799c = null;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f7797a) {
            case 0:
                animator.getClass();
                break;
            default:
                c cVar = (c) this.f7799c;
                oa.b bVar = (oa.b) this.f7798b;
                cVar.a(1.0f, bVar, true);
                bVar.f32234k = bVar.f32228e;
                bVar.l = bVar.f32229f;
                bVar.f32235m = bVar.f32230g;
                bVar.a((bVar.f32233j + 1) % bVar.f32232i.length);
                if (!cVar.f32252f) {
                    cVar.f32251e += 1.0f;
                } else {
                    cVar.f32252f = false;
                    animator.cancel();
                    animator.setDuration(1332L);
                    animator.start();
                    if (bVar.f32236n) {
                        bVar.f32236n = false;
                    }
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f7797a) {
            case 0:
                animator.getClass();
                Consumer consumer = (Consumer) this.f7798b;
                if (consumer != null) {
                    consumer.accept(animator);
                }
                break;
            default:
                ((c) this.f7799c).f32251e = 0.0f;
                break;
        }
    }

    public b(c cVar, oa.b bVar) {
        this.f7799c = cVar;
        this.f7798b = bVar;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }
}
