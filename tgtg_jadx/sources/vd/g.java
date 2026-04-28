package vd;

import android.graphics.Canvas;
import fd.l;
import y9.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t5.a f42237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f42238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f42240d;

    public g(t5.a aVar, h hVar, int i11, int i12) {
        this.f42237a = aVar;
        this.f42238b = hVar;
        this.f42239c = i11;
        this.f42240d = i12;
    }

    @Override // fd.l
    public final boolean a() {
        return true;
    }

    @Override // fd.l
    public final int b() {
        return this.f42239c;
    }

    @Override // fd.l
    public final void c(Canvas canvas) {
        this.f42237a.F(canvas, this.f42238b);
    }

    @Override // fd.l
    public final int getHeight() {
        return this.f42240d;
    }

    @Override // fd.l
    public final long getSize() {
        return 2048L;
    }
}
