package qe;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f36957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f36958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pe.a f36959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pe.a f36960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pe.a f36961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pe.a f36962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f36963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f36964h;

    public d(String str, f fVar, Path.FillType fillType, pe.a aVar, pe.a aVar2, pe.a aVar3, pe.a aVar4, boolean z11) {
        this.f36957a = fVar;
        this.f36958b = fillType;
        this.f36959c = aVar;
        this.f36960d = aVar2;
        this.f36961e = aVar3;
        this.f36962f = aVar4;
        this.f36963g = str;
        this.f36964h = z11;
    }

    @Override // qe.b
    public final je.c a(he.z zVar, he.k kVar, re.b bVar) {
        return new je.h(zVar, kVar, bVar, this);
    }
}
