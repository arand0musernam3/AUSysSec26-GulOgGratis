package kd;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f26281a;

    public c(Bitmap bitmap) {
        this.f26281a = bitmap;
    }

    @Override // kd.i
    public final Object a(ld.e eVar) {
        return new j(new fd.a(this.f26281a), false, id.h.MEMORY);
    }
}
