package r0;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.camera.core.ImageCaptureException;
import o00.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f37468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f37469c;

    public /* synthetic */ l(m mVar, d dVar, int i11) {
        this.f37467a = i11;
        this.f37468b = mVar;
        this.f37469c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.f37467a) {
            case 0:
                m mVar = this.f37468b;
                d dVar = this.f37469c;
                n nVar = dVar.f37446a;
                try {
                    c1.b bVar = (c1.b) mVar.f37474e.l(dVar);
                    int i11 = bVar.f6840c;
                    pd.g.i("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: " + i11, i11 == 35 || i11 == 256 || i11 == 4101);
                    w.b.U().execute(new mr.h(8, nVar, (Bitmap) mVar.l.i(bVar)));
                    return;
                } catch (Exception e5) {
                    dVar.f37447b.close();
                    wd.a.s("ProcessingNode", "process postview input packet failed.", e5);
                    return;
                }
            case 1:
                l lVar = new l(this.f37468b, this.f37469c, 2);
                Trace.beginSection(x0.G("CX:processInputPacket"));
                try {
                    lVar.run();
                    return;
                } finally {
                    Trace.endSection();
                }
            default:
                m mVar2 = this.f37468b;
                d dVar2 = this.f37469c;
                n nVar2 = dVar2.f37446a;
                try {
                    boolean z11 = true;
                    if (mVar2.f37473d.f37445d.size() <= 1) {
                        z11 = false;
                    }
                    if (dVar2.f37446a.f37485c == null) {
                        w.b.U().execute(new mr.h(9, nVar2, mVar2.a(dVar2)));
                    } else {
                        jd.f fVarB = mVar2.b(dVar2);
                        if (!z11 || nVar2.f37484b.a()) {
                            w.b.U().execute(new mr.h(10, nVar2, fVarB));
                        }
                    }
                    return;
                } catch (ImageCaptureException e11) {
                    w.b.U().execute(new mr.h(11, nVar2, e11));
                    return;
                } catch (OutOfMemoryError e12) {
                    w.b.U().execute(new mr.h(11, nVar2, new ImageCaptureException(0, "Processing failed due to low memory.", e12)));
                    return;
                } catch (RuntimeException e13) {
                    w.b.U().execute(new mr.h(11, nVar2, new ImageCaptureException(0, "Processing failed.", e13)));
                    return;
                }
        }
    }
}
