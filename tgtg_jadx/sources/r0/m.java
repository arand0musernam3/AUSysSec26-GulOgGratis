package r0;

import a3.i3;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.DngCreator;
import android.media.ImageReader;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import c50.w;
import h7.i0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import m0.a1;
import m0.b0;
import m0.f0;
import m0.n0;
import s0.r1;
import s0.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f37470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraCharacteristics f37471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ky.o f37472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f37473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l50.a f37474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public jb.b f37475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l50.a f37476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l50.a f37477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l20.c f37478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l20.c f37479j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ky.p f37480k;
    public ky.p l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r1 f37481m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f37482n;

    public m(Executor executor, CameraCharacteristics cameraCharacteristics) {
        r1 r1Var = z0.a.f46383a;
        if (z0.a.f46383a.b(LowMemoryQuirk.class) != null) {
            this.f37470a = new w0.g(executor);
        } else {
            this.f37470a = executor;
        }
        this.f37471b = cameraCharacteristics;
        this.f37481m = r1Var;
        this.f37482n = r1Var.a(IncorrectJpegMetadataQuirk.class);
    }

    public final n0 a(d dVar) {
        wd.a.p("ProcessingNode", "processInMemoryCapture: request ID = " + dVar.f37446a.f37483a);
        n nVar = dVar.f37446a;
        c1.b bVar = (c1.b) this.f37474e.l(dVar);
        ArrayList arrayList = this.f37473d.f37445d;
        pd.g.j(!arrayList.isEmpty());
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        if ((bVar.f6840c == 35 || this.f37482n) && iIntValue == 256) {
            c1.b bVar2 = (c1.b) this.f37475f.a(new b(bVar, nVar.f37488f));
            this.f37480k.getClass();
            ld.k kVar = new ld.k(new i3(ImageReader.newInstance(bVar2.f6841d.getWidth(), bVar2.f6841d.getHeight(), 256, 2)));
            n0 n0VarA = ImageProcessingUtil.a(kVar, (byte[]) bVar2.f6838a);
            kVar.l();
            Objects.requireNonNull(n0VarA);
            v0.d dVar2 = bVar2.f6839b;
            Objects.requireNonNull(dVar2);
            Rect rect = bVar2.f6842e;
            int i11 = bVar2.f6843f;
            Matrix matrix = bVar2.f6844g;
            y yVar = bVar2.f6845h;
            f0 f0Var = (f0) n0VarA;
            Size size = new Size(f0Var.b(), f0Var.getHeight());
            f0Var.getFormat();
            bVar = new c1.b(n0VarA, dVar2, f0Var.getFormat(), size, rect, i11, matrix, yVar);
        }
        this.f37479j.getClass();
        n0 n0Var = (n0) bVar.f6838a;
        a1 a1Var = new a1(n0Var, bVar.f6841d, new m0.f(n0Var.Y().b(), n0Var.Y().getTimestamp(), bVar.f6843f, bVar.f6844g, n0Var.Y().c()));
        Rect rect2 = bVar.f6842e;
        if (rect2 != null) {
            Rect rect3 = new Rect(rect2);
            if (!rect3.intersect(0, 0, a1Var.f28464f, a1Var.f28465g)) {
                rect3.setEmpty();
            }
        }
        synchronized (a1Var.f28462d) {
        }
        if (arrayList.size() > 1) {
            nVar.f37484b.b(a1Var.getFormat());
        }
        return a1Var;
    }

    public final jd.f b(d dVar) throws Exception {
        wd.a.p("ProcessingNode", "processOnDiskCapture: request ID = " + dVar.f37446a.f37483a);
        ArrayList arrayList = this.f37473d.f37445d;
        pd.g.j(arrayList.isEmpty() ^ true);
        Integer num = (Integer) arrayList.get(0);
        int iIntValue = num.intValue();
        pd.g.i("On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: " + num, zz.f.w(iIntValue) || iIntValue == 32);
        n nVar = dVar.f37446a;
        b0 b0Var = nVar.f37485c;
        f fVar = nVar.f37484b;
        int i11 = nVar.f37488f;
        pd.g.i("OutputFileOptions cannot be empty", b0Var != null);
        c1.b bVar = (c1.b) this.f37474e.l(dVar);
        c1.b bVar2 = null;
        if (arrayList.size() > 1) {
            pd.g.i("The number of OutputFileOptions for simultaneous capture should be at least two", false);
            if (bVar.f6840c != 32) {
                throw null;
            }
            Objects.requireNonNull(b0Var);
            jd.f fVarC = c(bVar, b0Var);
            fVar.b(32);
            return fVarC;
        }
        if (iIntValue == 32) {
            Objects.requireNonNull(b0Var);
            return c(bVar, b0Var);
        }
        Objects.requireNonNull(b0Var);
        c1.b bVar3 = (c1.b) this.f37475f.a(new b(bVar, i11));
        if (v0.o.c(bVar3.f6842e, bVar3.f6841d)) {
            pd.g.n(null, zz.f.w(bVar3.f6840c));
            this.f37478i.getClass();
            Rect rect = bVar3.f6842e;
            byte[] bArr = (byte[]) bVar3.f6838a;
            try {
                Bitmap bitmapDecodeRegion = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
                v0.d dVar2 = bVar3.f6839b;
                Objects.requireNonNull(dVar2);
                Rect rect2 = new Rect(0, 0, bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight());
                int i12 = bVar3.f6843f;
                Matrix matrix = bVar3.f6844g;
                RectF rectF = v0.o.f41634a;
                Matrix matrix2 = new Matrix(matrix);
                matrix2.postTranslate(-rect.left, -rect.top);
                y yVar = bVar3.f6845h;
                Size size = new Size(bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight());
                if (yVar != null) {
                    this.f37476g.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmapDecodeRegion.compress(Bitmap.CompressFormat.JPEG, i11, byteArrayOutputStream);
                    bVar2 = new c1.b(byteArrayOutputStream.toByteArray(), dVar2, (Build.VERSION.SDK_INT < 34 || !i0.q(bitmapDecodeRegion)) ? 256 : 4101, size, rect2, i12, matrix2, yVar);
                } else {
                    w.l("Null cameraCaptureResult");
                }
                bVar3 = bVar2;
            } catch (IOException e5) {
                throw new ImageCaptureException(1, "Failed to decode JPEG.", e5);
            }
        }
        l50.a aVar = this.f37477h;
        Objects.requireNonNull(b0Var);
        aVar.getClass();
        File fileP = nx.d.p(b0Var);
        byte[] bArr2 = (byte[]) bVar3.f6838a;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileP);
            try {
                fileOutputStream.write(bArr2, 0, new lz.i(1).D(bArr2));
                fileOutputStream.close();
                v0.d dVar3 = bVar3.f6839b;
                Objects.requireNonNull(dVar3);
                int i13 = bVar3.f6843f;
                try {
                    c5.a1 a1Var = v0.d.f41591b;
                    v0.d dVar4 = new v0.d(new o8.h(fileP.toString()));
                    dVar3.a(dVar4);
                    if (dVar4.b() == 0 && i13 != 0) {
                        dVar4.c(i13);
                    }
                    dVar4.d();
                    return new jd.f(nx.d.D(fileP, b0Var), 8);
                } catch (IOException e11) {
                    throw new ImageCaptureException(1, "Failed to update Exif data", e11);
                }
            } finally {
            }
        } catch (IOException e12) {
            throw new ImageCaptureException(1, "Failed to write to temp file", e12);
        }
    }

    public final jd.f c(c1.b bVar, b0 b0Var) throws Exception {
        int i11 = 0;
        if (this.f37472c == null) {
            CameraCharacteristics cameraCharacteristics = this.f37471b;
            if (cameraCharacteristics == null) {
                throw new ImageCaptureException(0, "CameraCharacteristics is null, DngCreator cannot be created", null);
            }
            if (bVar.f6845h.i() == null) {
                throw new ImageCaptureException(0, "CameraCaptureResult is null, DngCreator cannot be created", null);
            }
            CaptureResult captureResultI = bVar.f6845h.i();
            Objects.requireNonNull(captureResultI);
            DngCreator dngCreator = new DngCreator(cameraCharacteristics, captureResultI);
            ky.o oVar = new ky.o(16, false);
            oVar.f26718b = dngCreator;
            this.f37472c = oVar;
        }
        ky.o oVar2 = this.f37472c;
        n0 n0Var = (n0) bVar.f6838a;
        int i12 = bVar.f6843f;
        Objects.requireNonNull(b0Var);
        if (n0Var == null) {
            w.l("Null imageProxy");
            return null;
        }
        oVar2.getClass();
        File fileP = nx.d.p(b0Var);
        DngCreator dngCreator2 = (DngCreator) oVar2.f26718b;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileP);
                if (i12 == 0) {
                    i11 = 1;
                } else if (i12 == 90) {
                    i11 = 6;
                } else if (i12 == 180) {
                    i11 = 3;
                } else if (i12 == 270) {
                    i11 = 8;
                }
                try {
                    dngCreator2.setOrientation(i11);
                    dngCreator2.writeImage(fileOutputStream, n0Var.f0());
                    fileOutputStream.close();
                    n0Var.close();
                    return new jd.f(nx.d.D(fileP, b0Var), 8);
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e5) {
                throw new ImageCaptureException(1, "Failed to write to temp file", e5);
            } catch (IllegalArgumentException e11) {
                throw new ImageCaptureException(1, "Image with an unsupported format was used", e11);
            } catch (IllegalStateException e12) {
                throw new ImageCaptureException(1, "Not enough metadata information has been set to write a well-formatted DNG file", e12);
            }
        } catch (Throwable th4) {
            n0Var.close();
            throw th4;
        }
    }
}
