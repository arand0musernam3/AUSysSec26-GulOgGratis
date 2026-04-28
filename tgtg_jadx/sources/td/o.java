package td;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ud.h f40031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ud.g f40032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ud.d f40033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f40034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ia0.m f40035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f40036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f40037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f40038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fd.k f40039j;

    public o(Context context, ud.h hVar, ud.g gVar, ud.d dVar, String str, ia0.m mVar, b bVar, b bVar2, b bVar3, fd.k kVar) {
        this.f40030a = context;
        this.f40031b = hVar;
        this.f40032c = gVar;
        this.f40033d = dVar;
        this.f40034e = str;
        this.f40035f = mVar;
        this.f40036g = bVar;
        this.f40037h = bVar2;
        this.f40038i = bVar3;
        this.f40039j = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f40030a, oVar.f40030a) && Intrinsics.areEqual(this.f40031b, oVar.f40031b) && this.f40032c == oVar.f40032c && this.f40033d == oVar.f40033d && Intrinsics.areEqual(this.f40034e, oVar.f40034e) && Intrinsics.areEqual(this.f40035f, oVar.f40035f) && this.f40036g == oVar.f40036g && this.f40037h == oVar.f40037h && this.f40038i == oVar.f40038i && Intrinsics.areEqual(this.f40039j, oVar.f40039j);
    }

    public final int hashCode() {
        int iHashCode = (this.f40033d.hashCode() + ((this.f40032c.hashCode() + ((this.f40031b.hashCode() + (this.f40030a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.f40034e;
        return this.f40039j.f17570a.hashCode() + ((this.f40038i.hashCode() + ((this.f40037h.hashCode() + ((this.f40036g.hashCode() + ((this.f40035f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.f40030a + ", size=" + this.f40031b + ", scale=" + this.f40032c + ", precision=" + this.f40033d + ", diskCacheKey=" + this.f40034e + ", fileSystem=" + this.f40035f + ", memoryCachePolicy=" + this.f40036g + ", diskCachePolicy=" + this.f40037h + ", networkCachePolicy=" + this.f40038i + ", extras=" + this.f40039j + ")";
    }
}
