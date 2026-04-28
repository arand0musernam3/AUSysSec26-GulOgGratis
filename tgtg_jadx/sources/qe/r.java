package qe;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f37006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pe.a f37008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pe.a f37009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f37010f;

    public r(String str, boolean z11, Path.FillType fillType, pe.a aVar, pe.a aVar2, boolean z12) {
        this.f37007c = str;
        this.f37005a = z11;
        this.f37006b = fillType;
        this.f37008d = aVar;
        this.f37009e = aVar2;
        this.f37010f = z12;
    }

    @Override // qe.b
    public final je.c a(he.z zVar, he.k kVar, re.b bVar) {
        return new je.g(zVar, bVar, this);
    }

    public final String toString() {
        return r8.k.q(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f37005a, '}');
    }
}
