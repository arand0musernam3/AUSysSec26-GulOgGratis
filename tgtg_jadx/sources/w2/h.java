package w2;

import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntConsumer f42909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42910c;

    public /* synthetic */ h(IntConsumer intConsumer, int i11, int i12) {
        this.f42908a = i12;
        this.f42909b = intConsumer;
        this.f42910c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42908a) {
            case 0:
                this.f42909b.accept(this.f42910c);
                break;
            default:
                this.f42909b.accept(this.f42910c);
                break;
        }
    }
}
