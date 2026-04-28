package hd;

import b4.s;
import b5.h1;
import b5.o;
import c5.l3;
import c5.o2;
import fd.t;
import gd.k;
import i4.c0;
import i4.w;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.i;
import z4.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lhd/b;", "Lb5/h1;", "Lhd/c;", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class b extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f21840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f21841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gd.b f21842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f21843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function1 f21844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b4.f f21845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f21846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f21847i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w f21848j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f21849k;
    public final k l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f21850m;

    public b(i iVar, t tVar, gd.b bVar, Function1 function1, Function1 function12, b4.f fVar, m mVar, float f11, w wVar, boolean z11, k kVar, String str) {
        this.f21840b = iVar;
        this.f21841c = tVar;
        this.f21842d = bVar;
        this.f21843e = function1;
        this.f21844f = function12;
        this.f21845g = fVar;
        this.f21846h = mVar;
        this.f21847i = f11;
        this.f21848j = wVar;
        this.f21849k = z11;
        this.l = kVar;
        this.f21850m = str;
    }

    @Override // b5.h1
    public final s create() {
        gd.b bVar = this.f21842d;
        t tVar = this.f21841c;
        i iVar = this.f21840b;
        gd.c cVar = new gd.c(tVar, iVar, bVar);
        gd.i iVar2 = new gd.i(cVar);
        iVar2.f20379m = this.f21843e;
        iVar2.f20380n = this.f21844f;
        iVar2.f20381o = this.f21846h;
        iVar2.f20382p = 1;
        iVar2.f20383q = this.l;
        iVar2.n(cVar);
        ud.i iVar3 = iVar.f40010p;
        return new c(iVar2, this.f21845g, this.f21846h, this.f21847i, this.f21848j, this.f21849k, this.f21850m, iVar3 instanceof gd.m ? (gd.m) iVar3 : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f21840b, bVar.f21840b) && Intrinsics.areEqual(this.f21841c, bVar.f21841c) && Intrinsics.areEqual(this.f21842d, bVar.f21842d) && Intrinsics.areEqual(this.f21843e, bVar.f21843e) && Intrinsics.areEqual(this.f21844f, bVar.f21844f) && Intrinsics.areEqual(this.f21845g, bVar.f21845g) && Intrinsics.areEqual(this.f21846h, bVar.f21846h) && Float.compare(this.f21847i, bVar.f21847i) == 0 && Intrinsics.areEqual(this.f21848j, bVar.f21848j) && this.f21849k == bVar.f21849k && Intrinsics.areEqual(this.l, bVar.l) && Intrinsics.areEqual(this.f21850m, bVar.f21850m);
    }

    public final int hashCode() {
        int iD = r8.k.d((this.f21842d.hashCode() + ((this.f21841c.hashCode() + (this.f21840b.hashCode() * 31)) * 31)) * 31, 31, this.f21843e);
        Function1 function1 = this.f21844f;
        int iA = r8.k.a((this.f21846h.hashCode() + ((this.f21845g.hashCode() + r8.k.b(1, (iD + (function1 == null ? 0 : function1.hashCode())) * 31, 31)) * 31)) * 31, this.f21847i, 31);
        w wVar = this.f21848j;
        int iE = r8.k.e((iA + (wVar == null ? 0 : wVar.hashCode())) * 31, 31, this.f21849k);
        k kVar = this.l;
        int iHashCode = (iE + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str = this.f21850m;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "content";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(this.f21840b, "request");
        l3Var.b(this.f21841c, "imageLoader");
        l3Var.b(this.f21842d, "modelEqualityDelegate");
        l3Var.b(this.f21843e, "transform");
        l3Var.b(this.f21844f, "onState");
        l3Var.b(new c0(), "filterQuality");
        l3Var.b(this.f21845g, "alignment");
        l3Var.b(this.f21846h, "contentScale");
        l3Var.b(Float.valueOf(this.f21847i), "alpha");
        l3Var.b(this.f21848j, "colorFilter");
        l3Var.b(Boolean.valueOf(this.f21849k), "clipToBounds");
        l3Var.b(this.l, "previewHandler");
        l3Var.b(this.f21850m, "contentDescription");
    }

    public final String toString() {
        String strA = c0.a(1);
        StringBuilder sb2 = new StringBuilder("ContentPainterElement(request=");
        sb2.append(this.f21840b);
        sb2.append(", imageLoader=");
        sb2.append(this.f21841c);
        sb2.append(", modelEqualityDelegate=");
        sb2.append(this.f21842d);
        sb2.append(", transform=");
        sb2.append(this.f21843e);
        sb2.append(", onState=");
        sb2.append(this.f21844f);
        sb2.append(", filterQuality=");
        sb2.append(strA);
        sb2.append(", alignment=");
        sb2.append(this.f21845g);
        sb2.append(", contentScale=");
        sb2.append(this.f21846h);
        sb2.append(", alpha=");
        sb2.append(this.f21847i);
        sb2.append(", colorFilter=");
        sb2.append(this.f21848j);
        sb2.append(", clipToBounds=");
        sb2.append(this.f21849k);
        sb2.append(", previewHandler=");
        sb2.append(this.l);
        sb2.append(", contentDescription=");
        return r8.k.p(sb2, this.f21850m, ")");
    }

    @Override // b5.h1
    public final void update(s sVar) {
        c cVar = (c) sVar;
        long jH = cVar.f21858v.h();
        gd.m mVar = cVar.f21857u;
        gd.b bVar = this.f21842d;
        t tVar = this.f21841c;
        i iVar = this.f21840b;
        gd.c cVar2 = new gd.c(tVar, iVar, bVar);
        gd.i iVar2 = cVar.f21858v;
        iVar2.f20379m = this.f21843e;
        iVar2.f20380n = this.f21844f;
        m mVar2 = this.f21846h;
        iVar2.f20381o = mVar2;
        iVar2.f20382p = 1;
        iVar2.f20383q = this.l;
        iVar2.n(cVar2);
        boolean zA = h4.e.a(jH, iVar2.h());
        cVar.f21851o = this.f21845g;
        ud.i iVar3 = iVar.f40010p;
        cVar.f21857u = iVar3 instanceof gd.m ? (gd.m) iVar3 : null;
        cVar.f21852p = mVar2;
        cVar.f21853q = this.f21847i;
        cVar.f21854r = this.f21848j;
        cVar.f21855s = this.f21849k;
        String str = cVar.f21856t;
        String str2 = this.f21850m;
        if (!Intrinsics.areEqual(str, str2)) {
            cVar.f21856t = str2;
            b5.m.g(cVar).G();
        }
        boolean zAreEqual = Intrinsics.areEqual(mVar, cVar.f21857u);
        if (!zA || !zAreEqual) {
            b5.m.g(cVar).F();
        }
        o.h(cVar);
    }
}
