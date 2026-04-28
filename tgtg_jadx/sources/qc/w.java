package qc;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f36935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f36936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f36937c;

    public w(Ref.ObjectRef objectRef, a0 a0Var, Ref.BooleanRef booleanRef) {
        this.f36935a = objectRef;
        this.f36936b = a0Var;
        this.f36937c = booleanRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        this.f36935a.element = imageDecoder;
        Size size = imageInfo.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        zc.n nVar = this.f36936b.f36882b;
        ad.h hVar = nVar.f47493d;
        ad.g gVar = nVar.f47494e;
        ad.h hVar2 = ad.h.f1226c;
        int iY = Intrinsics.areEqual(hVar, hVar2) ? width : b0.z.y(hVar.f1227a, gVar);
        zc.n nVar2 = this.f36936b.f36882b;
        ad.h hVar3 = nVar2.f47493d;
        int iY2 = Intrinsics.areEqual(hVar3, hVar2) ? height : b0.z.y(hVar3.f1228b, nVar2.f47494e);
        if (width > 0 && height > 0 && (width != iY || height != iY2)) {
            double dL = y9.w.l(width, height, iY, iY2, this.f36936b.f36882b.f47494e);
            boolean z11 = dL < 1.0d;
            this.f36937c.element = z11;
            if (z11 || !this.f36936b.f36882b.f47495f) {
                imageDecoder.setTargetSize(j80.c.a(((double) width) * dL), j80.c.a(dL * ((double) height)));
            }
        }
        zc.n nVar3 = this.f36936b.f36882b;
        imageDecoder.setAllocator(nVar3.f47491b == Bitmap.Config.HARDWARE ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!nVar3.f47496g ? 1 : 0);
        ColorSpace colorSpace = nVar3.f47492c;
        if (colorSpace != null) {
            imageDecoder.setTargetColorSpace(colorSpace);
        }
        imageDecoder.setUnpremultipliedRequired(!nVar3.f47497h);
        if (nVar3.l.b("coil#animated_transformation") == null) {
            imageDecoder.setPostProcessor(null);
        } else {
            org.bouncycastle.jce.provider.a.c();
        }
    }
}
