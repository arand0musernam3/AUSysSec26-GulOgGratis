package fv;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.widget.Magnifier;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.collections.x;
import kotlin.text.Regex;
import mv.m0;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import pd.g;
import q90.a0;
import q90.n0;
import q90.y;
import q90.z;
import r8.k;
import u00.d;
import v1.q1;
import zendesk.messaging.android.internal.AttachmentFileResolver;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class b implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17968a;

    public static void b(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.getClass();
        imageInfo.getClass();
        source.getClass();
        imageDecoder.setMutableRequired(false);
    }

    @Override // v1.q1
    public void a(long j9, long j11, float f11) {
        ((Magnifier) this.f17968a).show(Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)));
    }

    public Bitmap c(Uri uri) throws IOException {
        int i11 = Build.VERSION.SDK_INT;
        Context context = (Context) this.f17968a;
        if (i11 >= 28) {
            ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(context.getContentResolver(), uri);
            sourceCreateSource.getClass();
            return ImageDecoder.decodeBitmap(sourceCreateSource, new a());
        }
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
            inputStreamOpenInputStream.close();
            return bitmapDecodeStream;
        } finally {
        }
    }

    public void d() {
        ((Magnifier) this.f17968a).dismiss();
    }

    public long e() {
        return (((long) ((Magnifier) this.f17968a).getHeight()) & 4294967295L) | (((long) ((Magnifier) this.f17968a).getWidth()) << 32);
    }

    /* JADX WARN: Finally extract failed */
    public a0 f(boolean z11, Uri uri) {
        Bitmap bitmapC;
        Bitmap bitmapCreateScaledBitmap;
        z zVarA = null;
        try {
            bitmapC = c(uri);
        } catch (Exception e5) {
            sa0.a.f38953a.e(e5, org.bouncycastle.jcajce.provider.asymmetric.a.b(uri, "Failed to decode bitmap from uri: "), new Object[0]);
            bitmapC = null;
        }
        if (bitmapC != null) {
            if (z11) {
                int width = bitmapC.getWidth();
                int height = bitmapC.getHeight();
                int iMax = Math.max(width, height);
                if (iMax <= 2048) {
                    bitmapCreateScaledBitmap = bitmapC;
                    sa0.a.f38953a.a("Recipe image resized from %dx%d to %dx%d", Integer.valueOf(bitmapC.getWidth()), Integer.valueOf(bitmapC.getHeight()), Integer.valueOf(bitmapCreateScaledBitmap.getWidth()), Integer.valueOf(bitmapCreateScaledBitmap.getHeight()));
                    bitmapC = bitmapCreateScaledBitmap;
                } else {
                    float f11 = NewHope.SENDB_BYTES / iMax;
                    int i11 = (int) (width * f11);
                    int i12 = (int) (height * f11);
                    m0 m0Var = sa0.a.f38953a;
                    StringBuilder sbR = k.r(width, height, "Resizing image from ", "x", " to ");
                    sbR.append(i11);
                    sbR.append("x");
                    sbR.append(i12);
                    m0Var.a(sbR.toString(), new Object[0]);
                    try {
                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapC, i11, i12, true);
                        bitmapCreateScaledBitmap.getClass();
                    } catch (Exception e11) {
                        sa0.a.f38953a.e(e11, "Failed to resize bitmap, returning original", new Object[0]);
                        bitmapCreateScaledBitmap = bitmapC;
                    }
                    sa0.a.f38953a.a("Recipe image resized from %dx%d to %dx%d", Integer.valueOf(bitmapC.getWidth()), Integer.valueOf(bitmapC.getHeight()), Integer.valueOf(bitmapCreateScaledBitmap.getWidth()), Integer.valueOf(bitmapCreateScaledBitmap.getHeight()));
                    bitmapC = bitmapCreateScaledBitmap;
                }
            }
            try {
                File fileCreateTempFile = File.createTempFile("upload_" + System.currentTimeMillis(), AttachmentFileResolver.TEMP_FILE_SUFFIX, ((Context) this.f17968a).getCacheDir());
                try {
                    fileCreateTempFile.getClass();
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    try {
                        if (bitmapC.compress(Bitmap.CompressFormat.JPEG, 85, fileOutputStream)) {
                            fileOutputStream.close();
                            long length = fileCreateTempFile.length();
                            if (length <= 0) {
                                sa0.a.f38953a.i(org.bouncycastle.jcajce.provider.asymmetric.a.b(uri, "JPEG result is empty for uri: "), new Object[0]);
                                return null;
                            }
                            if (length > 15728640) {
                                sa0.a.f38953a.i("JPEG result exceeds max size: " + length + " > 15728640 for uri: " + uri, new Object[0]);
                                return null;
                            }
                            Regex regex = z.f36633e;
                            try {
                                zVarA = y.a("image/jpeg");
                            } catch (IllegalArgumentException unused) {
                            }
                            q90.m0 m0Var2 = n0.Companion;
                            FileInputStream fileInputStream = new FileInputStream(fileCreateTempFile);
                            try {
                                long length2 = fileCreateTempFile.length();
                                if (length2 > 2147483647L) {
                                    throw new OutOfMemoryError("File " + fileCreateTempFile + " is too big (" + length2 + " bytes) to fit in memory.");
                                }
                                int i13 = (int) length2;
                                byte[] bArrCopyOf = new byte[i13];
                                int i14 = i13;
                                int i15 = 0;
                                while (i14 > 0) {
                                    int i16 = fileInputStream.read(bArrCopyOf, i15, i14);
                                    if (i16 < 0) {
                                        break;
                                    }
                                    i14 -= i16;
                                    i15 += i16;
                                }
                                if (i14 > 0) {
                                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i15);
                                } else {
                                    int i17 = fileInputStream.read();
                                    if (i17 != -1) {
                                        e80.a aVar = new e80.a(8193);
                                        aVar.write(i17);
                                        g.o(fileInputStream, aVar);
                                        int size = aVar.size() + i13;
                                        if (size < 0) {
                                            throw new OutOfMemoryError("File " + fileCreateTempFile + " is too big to fit in memory.");
                                        }
                                        byte[] bArrA = aVar.a();
                                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                                        x.e(i13, bArrA, 0, bArrCopyOf, aVar.size());
                                    }
                                }
                                fileInputStream.close();
                                return w.b.B("files", fileCreateTempFile.getName(), q90.m0.c(m0Var2, bArrCopyOf, zVarA, 0, 6));
                            } finally {
                            }
                        } else {
                            sa0.a.f38953a.i("Bitmap compress returned false for uri: " + uri, new Object[0]);
                            fileOutputStream.close();
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            d.p(fileOutputStream, th2);
                            throw th3;
                        }
                    }
                } catch (Exception e12) {
                    sa0.a.f38953a.e(e12, org.bouncycastle.jcajce.provider.asymmetric.a.b(uri, "Failed to write JPEG for uri: "), new Object[0]);
                    return null;
                }
                sa0.a.f38953a.e(e12, org.bouncycastle.jcajce.provider.asymmetric.a.b(uri, "Failed to write JPEG for uri: "), new Object[0]);
                return null;
            } catch (Exception e13) {
                sa0.a.f38953a.e(e13, "Failed to create temp file for JPEG", new Object[0]);
                return null;
            }
        }
        return null;
    }

    public void g() {
        ((Magnifier) this.f17968a).update();
    }
}
