package id;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e90.i f23816a;

    public v(e90.i iVar) {
        this.f23816a = iVar;
    }

    @Override // id.k
    public final l a(kd.k kVar, td.o oVar) {
        ImageDecoder.Source sourceZ;
        Bitmap.Config configA = td.k.a(oVar);
        if ((configA == Bitmap.Config.ARGB_8888 || configA == Bitmap.Config.HARDWARE) && (sourceZ = b6.a.z(kVar.f26292a, oVar)) != null) {
            return new y(sourceZ, kVar.f26292a, oVar, this.f23816a);
        }
        return null;
    }
}
