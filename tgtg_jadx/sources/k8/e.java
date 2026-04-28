package k8;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.Choreographer;
import java.util.ArrayList;
import q1.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f26136i = new ThreadLocal();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f26141e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f26144h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f26137a = new k1(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f26138b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lz.i f26139c = new lz.i(this, 28);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d1.e f26140d = new d1.e(this, 27);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f26142f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f26143g = 1.0f;

    public e(d dVar) {
        this.f26141e = dVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.animation.ValueAnimator$DurationScaleChangeListener, k8.a] */
    public final void a(i iVar) {
        ArrayList arrayList = this.f26138b;
        if (arrayList.size() == 0) {
            ((Choreographer) this.f26141e.f26134b).postFrameCallback(new c(0, this.f26140d));
            if (Build.VERSION.SDK_INT >= 33) {
                this.f26143g = ValueAnimator.getDurationScale();
                if (this.f26144h == null) {
                    this.f26144h = new b(this);
                }
                final b bVar = this.f26144h;
                if (bVar.f26129a == null) {
                    ?? r22 = new ValueAnimator.DurationScaleChangeListener() { // from class: k8.a
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f11) {
                            bVar.f26130b.f26143g = f11;
                        }
                    };
                    bVar.f26129a = r22;
                    ValueAnimator.registerDurationScaleChangeListener(r22);
                }
            }
        }
        if (arrayList.contains(iVar)) {
            return;
        }
        arrayList.add(iVar);
    }
}
