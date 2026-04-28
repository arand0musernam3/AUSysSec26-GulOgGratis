package d40;

import com.braze.models.inappmessage.InAppMessageBase;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements m40.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f14337a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m40.b f14338b = m40.b.a("batteryLevel");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m40.b f14339c = m40.b.a("batteryVelocity");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m40.b f14340d = m40.b.a("proximityOn");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m40.b f14341e = m40.b.a(InAppMessageBase.ORIENTATION);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m40.b f14342f = m40.b.a("ramUsed");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m40.b f14343g = m40.b.a("diskUsed");

    @Override // m40.a
    public final void a(Object obj, Object obj2) {
        m40.d dVar = (m40.d) obj2;
        b1 b1Var = (b1) ((e2) obj);
        dVar.a(f14338b, b1Var.f14094a);
        dVar.c(f14339c, b1Var.f14095b);
        dVar.e(f14340d, b1Var.f14096c);
        dVar.c(f14341e, b1Var.f14097d);
        dVar.b(f14342f, b1Var.f14098e);
        dVar.b(f14343g, b1Var.f14099f);
    }
}
