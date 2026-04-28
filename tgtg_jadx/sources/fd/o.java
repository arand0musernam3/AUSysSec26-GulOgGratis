package fd;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import ia0.a0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import v80.b2;
import v80.j0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f17574a = new j(Boolean.TRUE, 0);

    public static z a(String str) {
        String str2 = a0.f23602b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("file");
        sb2.append(':');
        if (str != null) {
            sb2.append(str);
        }
        return new z(sb2.toString(), str2, "file", null, str);
    }

    public static final Drawable b(l lVar, Resources resources) {
        return lVar instanceof f ? ((f) lVar).f17563a : lVar instanceof a ? new BitmapDrawable(resources, ((a) lVar).f17546a) : new m(lVar, 0);
    }

    public static final l c(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new a(((BitmapDrawable) drawable).getBitmap()) : new f(drawable);
    }

    public static final td.c d(td.i iVar, j0 j0Var) {
        xd.b bVar = iVar.f39998c;
        if (!(bVar instanceof xd.a)) {
            return new t10.c(j0Var);
        }
        td.t tVarH = lx.u.H(((xd.a) bVar).f44235b);
        synchronized (tVarH) {
            td.r rVar = tVarH.f40053a;
            if (rVar != null) {
                Bitmap.Config[] configArr = ae.q.f1262a;
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper()) && tVarH.f40056d) {
                    tVarH.f40056d = false;
                    rVar.f40047a = j0Var;
                    return rVar;
                }
            }
            b2 b2Var = tVarH.f40054b;
            if (b2Var != null) {
                b2Var.a(null);
            }
            tVarH.f40054b = null;
            td.r rVar2 = new td.r();
            rVar2.f40047a = j0Var;
            tVarH.f40053a = rVar2;
            return rVar2;
        }
    }

    public static final Object e(td.i iVar, j jVar) {
        Object obj = iVar.f40013s.f17570a.get(jVar);
        if (obj != null) {
            return obj;
        }
        Object obj2 = iVar.f40015u.f39986n.f17570a.get(jVar);
        return obj2 == null ? jVar.f17568b : obj2;
    }

    public static final Object f(td.o oVar, j jVar) {
        Object obj = oVar.f40039j.f17570a.get(jVar);
        return obj == null ? jVar.f17568b : obj;
    }

    public static final String g(z zVar) {
        List listH = h(zVar);
        String str = zVar.f17605b;
        if (listH.isEmpty()) {
            return null;
        }
        String str2 = zVar.f17608e;
        str2.getClass();
        if (!kotlin.text.y.p(str2, str, false)) {
            str = "";
        }
        return CollectionsKt.U(listH, zVar.f17605b, str, null, null, 60);
    }

    public static final List h(z zVar) {
        String str = zVar.f17608e;
        if (str == null) {
            return n0.f26529a;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = -1;
        while (i11 < str.length()) {
            int i12 = i11 + 1;
            int iF = StringsKt.F(str, '/', i12, false, 4);
            if (iF == -1) {
                iF = str.length();
            }
            String strSubstring = str.substring(i12, iF);
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i11 = iF;
        }
        return arrayList;
    }

    public static final String i(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= iMax) {
                if (i11 == i12) {
                    return str;
                }
                if (i11 >= length) {
                    kotlin.collections.c cVar = kotlin.collections.f.f26505a;
                    int length2 = bArr.length;
                    cVar.getClass();
                    kotlin.collections.c.a(0, i12, length2);
                    return new String(bArr, 0, i12, Charsets.UTF_8);
                }
            } else if (str.charAt(i11) == '%') {
                int i13 = i11 + 3;
                try {
                    bArr[i12] = (byte) Integer.parseInt(str.substring(i11 + 1, i13), CharsKt.checkRadix(16));
                    i12++;
                    i11 = i13;
                } catch (NumberFormatException unused) {
                    bArr[i12] = (byte) str.charAt(i11);
                    i12++;
                    i11++;
                }
            }
            bArr[i12] = (byte) str.charAt(i11);
            i12++;
            i11++;
        }
    }

    public static Bitmap j(l lVar) {
        int iB = lVar.b();
        int height = lVar.getHeight();
        boolean z11 = lVar instanceof a;
        Bitmap.Config config = z11 ? ((a) lVar).f17546a.getConfig() : null;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (z11) {
            Bitmap bitmap = ((a) lVar).f17546a;
            if (bitmap.getWidth() == iB && bitmap.getHeight() == height && bitmap.getConfig() == config) {
                return bitmap;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iB, height, config);
        lVar.c(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static z k(String str) {
        String strSubstring;
        String strSubstring2;
        String str2 = a0.f23602b;
        String strN = !Intrinsics.areEqual(str2, ExpiryDateInput.SEPARATOR) ? kotlin.text.y.n(str, str2, ExpiryDateInput.SEPARATOR, false) : str;
        boolean z11 = true;
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        while (i11 < strN.length()) {
            char cCharAt = strN.charAt(i11);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i14 == -1 && i12 == -1) {
                            i14 = i11 + 1;
                        }
                    } else if (z11 && i14 == -1 && i12 == -1) {
                        int i17 = i11 + 2;
                        if (i17 < str.length() && str.charAt(i11 + 1) == '/' && str.charAt(i17) == '/') {
                            i15 = i11 + 3;
                            z11 = false;
                            i16 = i11;
                            i11 = i17;
                        } else if (Intrinsics.areEqual(strN, str)) {
                            i13 = i11 + 1;
                            i16 = i11;
                            i11 = i13;
                            i15 = i11;
                        }
                    }
                } else if (i13 == -1 && i14 == -1 && i12 == -1) {
                    i13 = i15 == -1 ? 0 : i11;
                    z11 = false;
                }
            } else if (i12 == -1) {
                i12 = i11 + 1;
            }
            i11++;
        }
        int iMin = Math.min(i12 == -1 ? Integer.MAX_VALUE : i12 - 1, strN.length());
        int iMin2 = Math.min(i14 == -1 ? Integer.MAX_VALUE : i14 - 1, iMin);
        if (i15 != -1) {
            strSubstring2 = strN.substring(0, i16);
            strSubstring = strN.substring(i15, Math.min(i13 != -1 ? i13 : Integer.MAX_VALUE, iMin2));
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        String strSubstring3 = i13 != -1 ? strN.substring(i13, iMin2) : null;
        String strSubstring4 = i14 != -1 ? strN.substring(i14, iMin) : null;
        String strSubstring5 = i12 != -1 ? strN.substring(i12, strN.length()) : null;
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String str3 = strSubstring4;
        String strI = strSubstring2 != null ? i(strSubstring2, bArr) : null;
        String strI2 = strSubstring != null ? i(strSubstring, bArr) : null;
        String strI3 = strSubstring3 != null ? i(strSubstring3, bArr) : null;
        if (str3 != null) {
            i(str3, bArr);
        }
        if (strSubstring5 != null) {
            i(strSubstring5, bArr);
        }
        return new z(strN, str2, strI, strI2, strI3);
    }
}
