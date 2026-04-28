package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yc implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ yc f12060b = new yc(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ yc f12061c = new yc(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12062a;

    public /* synthetic */ yc(int i11) {
        this.f12062a = i11;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f12062a) {
            case 0:
                return;
            default:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
        }
    }

    private final /* synthetic */ void a() {
    }
}
