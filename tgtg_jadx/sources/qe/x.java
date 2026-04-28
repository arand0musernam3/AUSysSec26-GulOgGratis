package qe;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pe.b f37021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f37022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pe.a f37023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pe.a f37024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pe.b f37025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f37026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f37027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f37028i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f37029j;

    public x(String str, pe.b bVar, ArrayList arrayList, pe.a aVar, pe.a aVar2, pe.b bVar2, v vVar, w wVar, float f11, boolean z11) {
        this.f37020a = str;
        this.f37021b = bVar;
        this.f37022c = arrayList;
        this.f37023d = aVar;
        this.f37024e = aVar2;
        this.f37025f = bVar2;
        this.f37026g = vVar;
        this.f37027h = wVar;
        this.f37028i = f11;
        this.f37029j = z11;
    }

    @Override // qe.b
    public final je.c a(he.z zVar, he.k kVar, re.b bVar) {
        return new je.u(zVar, bVar, this);
    }
}
