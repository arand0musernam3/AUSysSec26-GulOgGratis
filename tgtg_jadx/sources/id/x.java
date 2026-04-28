package id;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f23820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f23821b;

    public x(y yVar, Ref.BooleanRef booleanRef) {
        this.f23820a = yVar;
        this.f23821b = booleanRef;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size = imageInfo.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        td.o oVar = this.f23820a.f23824c;
        ud.h hVar = oVar.f40031b;
        ud.g gVar = oVar.f40032c;
        fd.j jVar = td.j.f40017b;
        long jU = m0.c.U(width, height, hVar, gVar, (ud.h) fd.o.f(oVar, jVar));
        int i11 = (int) (jU >> 32);
        int i12 = (int) (jU & 4294967295L);
        if (width > 0 && height > 0 && (width != i11 || height != i12)) {
            td.o oVar2 = this.f23820a.f23824c;
            double dV = m0.c.V(width, height, i11, i12, oVar2.f40032c, (ud.h) fd.o.f(oVar2, jVar));
            boolean z11 = dV < 1.0d;
            this.f23821b.element = z11;
            if (z11 || this.f23820a.f23824c.f40033d == ud.d.EXACT) {
                imageDecoder.setTargetSize(j80.c.a(((double) width) * dV), j80.c.a(dV * ((double) height)));
            }
        }
        imageDecoder.setOnPartialImageListener(new u());
        td.o oVar3 = this.f23820a.f23824c;
        imageDecoder.setAllocator(td.k.a(oVar3) == Bitmap.Config.HARDWARE ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!((Boolean) fd.o.f(oVar3, td.k.f40026g)).booleanValue() ? 1 : 0);
        fd.j jVar2 = td.k.f40022c;
        if (((ColorSpace) fd.o.f(oVar3, jVar2)) != null) {
            imageDecoder.setTargetColorSpace((ColorSpace) fd.o.f(oVar3, jVar2));
        }
        imageDecoder.setUnpremultipliedRequired(!((Boolean) fd.o.f(oVar3, td.k.f40023d)).booleanValue());
    }
}
