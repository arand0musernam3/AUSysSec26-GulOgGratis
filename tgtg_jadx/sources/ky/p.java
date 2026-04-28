package ky;

import a3.i3;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Typeface;
import android.media.ImageReader;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.o0;
import com.app.tgtg.R;
import com.app.tgtg.model.local.AppConstants;
import com.braze.h2;
import com.google.android.gms.internal.measurement.j3;
import e20.k0;
import e20.l0;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import lx.u;
import m0.b1;
import m0.n0;
import mv.a0;
import q5.r;
import q5.t;
import q5.y;
import s0.z1;
import y00.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class p implements l50.b, n50.d, o0.b, k0, y, t50.b, w9.c, w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p f26719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static p f26720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ p f26721d = new p(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26722a;

    public /* synthetic */ p(int i11) {
        this.f26722a = i11;
    }

    public static q50.b l(byte[][] bArr, int i11) {
        int i12 = i11 * 2;
        int length = bArr[0].length + i12;
        int length2 = bArr.length + i12;
        q50.b bVar = new q50.b(length, length2);
        int[] iArr = bVar.f36060d;
        int length3 = iArr.length;
        for (int i13 = 0; i13 < length3; i13++) {
            iArr[i13] = 0;
        }
        int i14 = (length2 - i11) - 1;
        int i15 = 0;
        while (i15 < bArr.length) {
            byte[] bArr2 = bArr[i15];
            for (int i16 = 0; i16 < bArr[0].length; i16++) {
                if (bArr2[i16] == 1) {
                    bVar.b(i16 + i11, i14);
                }
            }
            i15++;
            i14--;
        }
        return bVar;
    }

    public static Typeface m(String str, r rVar, int i11) {
        if (i11 == 0 && Intrinsics.areEqual(rVar, r.f36043h) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iD = u.D(rVar, i11);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iD) : Typeface.create(str, iD);
    }

    public static void o(o0 o0Var) {
        o0Var.getClass();
        if (o0Var.isTaskRoot()) {
            new a0().c(o0Var);
            return;
        }
        o0Var.setResult(-1, new Intent().putExtra("REFRESH", true));
        o0Var.finish();
        o0Var.overridePendingTransition(R.anim.stay, R.anim.slide_out_from_top_to_bottom);
    }

    public static Path q(float f11, float f12, float f13, float f14) {
        Path path = new Path();
        path.moveTo(f11, f12);
        path.lineTo(f13, f14);
        return path;
    }

    public static void r(o0 o0Var) {
        o0Var.getClass();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + o0Var.getPackageName()));
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setFlags(268435456);
        o0Var.startActivityForResult(intent, AppConstants.RESULT_CODE_ORDER_CANCELLED);
    }

    public static byte[][] t(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            int length = (bArr.length - i11) - 1;
            for (int i12 = 0; i12 < bArr[0].length; i12++) {
                bArr2[i12][length] = bArr[i11][i12];
            }
        }
        return bArr2;
    }

    public static void u(t50.c cVar, StringBuilder sb2) {
        int iD = w.a0.D(sb2.charAt(1), 40, sb2.charAt(0) * 1600, sb2.charAt(2), 1);
        cVar.f39801c.append(new String(new char[]{(char) (iD / 256), (char) (iD % 256)}));
        sb2.delete(0, 3);
    }

    public static final boolean v() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // y00.w
    public Object a() {
        return new Boolean(((Boolean) j3.f11507b.get()).booleanValue());
    }

    @Override // q5.y
    public Typeface b(r rVar, int i11) {
        return m(null, rVar, i11);
    }

    @Override // q5.y
    public Typeface c(t tVar, r rVar, int i11) {
        String strConcat = tVar.f36051f;
        int i12 = rVar.f36049a / 100;
        if (i12 >= 0 && i12 < 2) {
            strConcat = strConcat.concat("-thin");
        } else if (2 <= i12 && i12 < 4) {
            strConcat = strConcat.concat("-light");
        } else if (i12 != 4) {
            if (i12 == 5) {
                strConcat = strConcat.concat("-medium");
            } else if ((6 > i12 || i12 >= 8) && 8 <= i12 && i12 < 11) {
                strConcat = strConcat.concat("-black");
            }
        }
        Typeface typeface = null;
        if (strConcat.length() != 0) {
            Typeface typefaceM = m(strConcat, rVar, i11);
            if (!Intrinsics.areEqual(typefaceM, Typeface.create(Typeface.DEFAULT, u.D(rVar, i11))) && !Intrinsics.areEqual(typefaceM, m(null, rVar, i11))) {
                typeface = typefaceM;
            }
        }
        return typeface == null ? m(tVar.f36051f, rVar, i11) : typeface;
    }

    @Override // l50.b
    public Object d(h50.f fVar) {
        return Integer.valueOf(fVar.J);
    }

    @Override // e20.k0
    public WindowInsetsCompat e(View view, WindowInsetsCompat windowInsetsCompat, l0 l0Var) {
        l0Var.f15683d = windowInsetsCompat.i() + l0Var.f15683d;
        boolean z11 = view.getLayoutDirection() == 1;
        int iJ = windowInsetsCompat.j();
        int iK = windowInsetsCompat.k();
        int i11 = l0Var.f15680a + (z11 ? iK : iJ);
        l0Var.f15680a = i11;
        int i12 = l0Var.f15682c;
        if (!z11) {
            iJ = iK;
        }
        int i13 = i12 + iJ;
        l0Var.f15682c = i13;
        view.setPaddingRelative(i11, l0Var.f15681b, i13, l0Var.f15683d);
        return windowInsetsCompat;
    }

    @Override // w9.c
    public void f() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // w9.c
    public void g(int i11, Object obj) {
        String str;
        switch (i11) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i11 == 6 || i11 == 7 || i11 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // o0.b
    public boolean h(z1 z1Var) {
        return false;
    }

    public Object i(Object obj) throws Throwable {
        UnsupportedOperationException unsupportedOperationException;
        Throwable th2;
        Bitmap bitmapCreateBitmap;
        c1.b bVar = (c1.b) obj;
        int i11 = bVar.f6840c;
        Object obj2 = bVar.f6838a;
        int i12 = bVar.f6843f;
        ld.k kVar = null;
        try {
            try {
                if (i11 == 35) {
                    n0 n0Var = (n0) obj2;
                    boolean z11 = i12 % 180 != 0;
                    ld.k kVar2 = new ld.k(new i3(ImageReader.newInstance(z11 ? n0Var.getHeight() : n0Var.b(), z11 ? n0Var.b() : n0Var.getHeight(), 1, 2)));
                    try {
                        b1 b1VarC = ImageProcessingUtil.c(n0Var, kVar2, ByteBuffer.allocateDirect(n0Var.b() * n0Var.getHeight() * 4), i12);
                        n0Var.close();
                        if (b1VarC == null) {
                            throw new ImageCaptureException(0, "Can't covert YUV to RGB", null);
                        }
                        bitmapCreateBitmap = zz.f.n(b1VarC);
                        b1VarC.close();
                        kVar = kVar2;
                    } catch (UnsupportedOperationException e5) {
                        unsupportedOperationException = e5;
                        throw new ImageCaptureException(0, "Can't convert " + (i11 == 35 ? "YUV" : "JPEG") + " to bitmap", unsupportedOperationException);
                    } catch (Throwable th3) {
                        th2 = th3;
                        kVar = kVar2;
                        if (kVar == null) {
                            throw th2;
                        }
                        kVar.close();
                        throw th2;
                    }
                } else {
                    if (i11 != 256 && i11 != 4101) {
                        throw new IllegalArgumentException("Invalid postview image format : " + i11);
                    }
                    n0 n0Var2 = (n0) obj2;
                    Bitmap bitmapN = zz.f.n(n0Var2);
                    n0Var2.close();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i12);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapN, 0, 0, bitmapN.getWidth(), bitmapN.getHeight(), matrix, true);
                }
                if (kVar != null) {
                    kVar.close();
                }
                return bitmapCreateBitmap;
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (UnsupportedOperationException e11) {
            unsupportedOperationException = e11;
        }
    }

    @Override // t50.b
    public void j(t50.c cVar) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!cVar.b()) {
                break;
            }
            char cA = cVar.a();
            cVar.f39802d++;
            int iN = n(cA, sb2);
            int length = cVar.f39801c.length() + ((sb2.length() / 3) << 1);
            cVar.c(length);
            int i11 = cVar.f39804f.f39812b - length;
            if (!cVar.b()) {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && (i11 < 2 || i11 > 2)) {
                    int length2 = sb2.length();
                    sb2.delete(length2 - iN, length2);
                    cVar.f39802d--;
                    iN = n(cVar.a(), sb3);
                    cVar.f39804f = null;
                }
                while (sb2.length() % 3 == 1 && ((iN <= 3 && i11 != 1) || iN > 3)) {
                    int length3 = sb2.length();
                    sb2.delete(length3 - iN, length3);
                    cVar.f39802d--;
                    iN = n(cVar.a(), sb3);
                    cVar.f39804f = null;
                }
            } else if (sb2.length() % 3 == 0) {
                if (ex.i.C(cVar.f39802d, p(), cVar.f39799a) != p()) {
                    cVar.f39803e = 0;
                    break;
                }
            }
        }
        s(cVar, sb2);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x01eb A[SYNTHETIC] */
    @Override // n50.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q50.b k(java.lang.String r33, n50.a r34, java.util.EnumMap r35) throws com.google.zxing.WriterException {
        /*
            Method dump skipped, instruction units count: 2538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ky.p.k(java.lang.String, n50.a, java.util.EnumMap):q50.b");
    }

    public int n(char c3, StringBuilder sb2) {
        if (c3 == ' ') {
            sb2.append((char) 3);
            return 1;
        }
        if (c3 >= '0' && c3 <= '9') {
            sb2.append((char) (c3 - ','));
            return 1;
        }
        if (c3 >= 'A' && c3 <= 'Z') {
            sb2.append((char) (c3 - '3'));
            return 1;
        }
        if (c3 < ' ') {
            sb2.append((char) 0);
            sb2.append(c3);
            return 2;
        }
        if (c3 >= '!' && c3 <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c3 - '!'));
            return 2;
        }
        if (c3 >= ':' && c3 <= '@') {
            sb2.append((char) 1);
            sb2.append((char) (c3 - '+'));
            return 2;
        }
        if (c3 >= '[' && c3 <= '_') {
            sb2.append((char) 1);
            sb2.append((char) (c3 - 'E'));
            return 2;
        }
        if (c3 < '`' || c3 > 127) {
            sb2.append("\u0001\u001e");
            return n((char) (c3 - 128), sb2) + 2;
        }
        sb2.append((char) 2);
        sb2.append((char) (c3 - '`'));
        return 2;
    }

    public int p() {
        return 1;
    }

    public void s(t50.c cVar, StringBuilder sb2) {
        int length = (sb2.length() / 3) << 1;
        int length2 = sb2.length() % 3;
        int length3 = cVar.f39801c.length() + length;
        cVar.c(length3);
        int i11 = cVar.f39804f.f39812b - length3;
        if (length2 == 2) {
            sb2.append((char) 0);
            while (sb2.length() >= 3) {
                u(cVar, sb2);
            }
            if (cVar.b()) {
                cVar.d((char) 254);
            }
        } else if (i11 == 1 && length2 == 1) {
            while (sb2.length() >= 3) {
                u(cVar, sb2);
            }
            if (cVar.b()) {
                cVar.d((char) 254);
            }
            cVar.f39802d--;
        } else {
            if (length2 != 0) {
                h2.b("Unexpected case. Please report!");
                return;
            }
            while (sb2.length() >= 3) {
                u(cVar, sb2);
            }
            if (i11 > 0 || cVar.b()) {
                cVar.d((char) 254);
            }
        }
        cVar.f39803e = 0;
    }

    public String toString() {
        switch (this.f26722a) {
            case 3:
                return "Metadata{mIsReversedHorizontal=false, mIsReversedVertical=false, mLocation=null}";
            default:
                return super.toString();
        }
    }
}
