package m00;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends qz.h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f28656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d10.g f28657i;

    public e(Boolean bool, d10.g gVar) {
        this.f28656h = bool;
        this.f28657i = gVar;
    }

    @Override // qz.h
    public final void U(Status status) {
        na0.a.w0(status, this.f28656h, this.f28657i);
    }
}
