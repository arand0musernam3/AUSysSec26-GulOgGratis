package mv;

import java.text.NumberFormat;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f30194a = new LinkedHashMap();

    public static String a(Double d3, int i11, String str) {
        str.getClass();
        if (d3 == null) {
            return "";
        }
        h0 h0Var = new h0(str, i11);
        LinkedHashMap linkedHashMap = f30194a;
        Object obj = linkedHashMap.get(h0Var);
        Object obj2 = obj;
        if (obj == null) {
            NumberFormat numberFormat = NumberFormat.getInstance(Locale.forLanguageTag(str));
            numberFormat.setMaximumFractionDigits(i11);
            numberFormat.setMinimumFractionDigits(i11);
            linkedHashMap.put(h0Var, numberFormat);
            obj2 = numberFormat;
        }
        String str2 = ((NumberFormat) obj2).format(d3.doubleValue());
        str2.getClass();
        return str2;
    }

    public static String b(Double d3, int i11, int i12) {
        String languageTag;
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        try {
            b bVar = b.f30149d;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instance");
                bVar = null;
            }
            languageTag = bVar.a();
        } catch (Exception unused) {
            languageTag = Locale.getDefault().toLanguageTag();
            languageTag.getClass();
        }
        return a(d3, i11, languageTag);
    }
}
