package v5;

import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import i4.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.e0;
import t5.b;
import z5.c;
import z5.o;
import z5.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final float a(long j9, float f11, c cVar) {
        float fC;
        long jB = o.b(j9);
        if (p.a(jB, 4294967296L)) {
            if (cVar.X() <= 1.05d) {
                return cVar.z0(j9);
            }
            fC = o.c(j9) / o.c(cVar.I(f11));
        } else {
            if (!p.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = o.c(j9);
        }
        return fC * f11;
    }

    public static final void b(Spannable spannable, long j9, int i11, int i12) {
        if (j9 != 16) {
            spannable.setSpan(new ForegroundColorSpan(g0.C(j9)), i11, i12, 33);
        }
    }

    public static final void c(Spannable spannable, long j9, c cVar, int i11, int i12) {
        long jB = o.b(j9);
        if (p.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(j80.c.b(cVar.z0(j9)), false), i11, i12, 33);
        } else if (p.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(o.c(j9)), i11, i12, 33);
        }
    }

    public static final void d(Spannable spannable, t5.c cVar, int i11, int i12) {
        if (cVar != null) {
            ArrayList arrayList = new ArrayList(e0.o(cVar, 10));
            Iterator it = cVar.f39796a.iterator();
            while (it.hasNext()) {
                arrayList.add(((b) it.next()).f39794a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i11, i12, 33);
        }
    }
}
