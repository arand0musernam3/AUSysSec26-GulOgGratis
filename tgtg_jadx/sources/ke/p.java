package ke;

import android.graphics.PointF;
import he.k0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends ub.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ we.b f26336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ub.a f26337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oe.c f26338f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(we.b bVar, ub.a aVar, oe.c cVar) {
        super(11);
        this.f26336d = bVar;
        this.f26337e = aVar;
        this.f26338f = cVar;
    }

    @Override // ub.a
    public final Object w(we.b bVar) {
        float f11 = bVar.f43402a;
        float f12 = bVar.f43403b;
        String str = ((oe.c) bVar.f43404c).f32452a;
        String str2 = ((oe.c) bVar.f43405d).f32452a;
        float f13 = bVar.f43406e;
        float f14 = bVar.f43407f;
        float f15 = bVar.f43408g;
        we.b bVar2 = this.f26336d;
        bVar2.f43402a = f11;
        bVar2.f43403b = f12;
        bVar2.f43404c = str;
        bVar2.f43405d = str2;
        bVar2.f43406e = f13;
        bVar2.f43407f = f14;
        bVar2.f43408g = f15;
        String str3 = (String) ((k0) this.f26337e.f40982c);
        oe.c cVar = (oe.c) (bVar.f43407f == 1.0f ? bVar.f43405d : bVar.f43404c);
        String str4 = cVar.f32453b;
        float f16 = cVar.f32454c;
        oe.b bVar3 = cVar.f32455d;
        int i11 = cVar.f32456e;
        float f17 = cVar.f32457f;
        float f18 = cVar.f32458g;
        int i12 = cVar.f32459h;
        int i13 = cVar.f32460i;
        float f19 = cVar.f32461j;
        boolean z11 = cVar.f32462k;
        PointF pointF = cVar.l;
        PointF pointF2 = cVar.f32463m;
        oe.c cVar2 = this.f26338f;
        cVar2.f32452a = str3;
        cVar2.f32453b = str4;
        cVar2.f32454c = f16;
        cVar2.f32455d = bVar3;
        cVar2.f32456e = i11;
        cVar2.f32457f = f17;
        cVar2.f32458g = f18;
        cVar2.f32459h = i12;
        cVar2.f32460i = i13;
        cVar2.f32461j = f19;
        cVar2.f32462k = z11;
        cVar2.l = pointF;
        cVar2.f32463m = pointF2;
        return cVar2;
    }
}
