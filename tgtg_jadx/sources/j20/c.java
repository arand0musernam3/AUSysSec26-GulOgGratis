package j20;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import jb.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f24452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextPaint f24453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u f24454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f24455h;

    public c(d dVar, Context context, TextPaint textPaint, u uVar) {
        this.f24455h = dVar;
        this.f24452e = context;
        this.f24453f = textPaint;
        this.f24454g = uVar;
    }

    @Override // jb.u
    public final void J(int i11) {
        this.f24454g.J(i11);
    }

    @Override // jb.u
    public final void K(Typeface typeface, boolean z11) {
        this.f24455h.f(this.f24452e, this.f24453f, typeface);
        this.f24454g.K(typeface, z11);
    }
}
