package s00;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DecimalFormat f38513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DecimalFormat f38514b;

    static {
        Locale locale = Locale.ROOT;
        f38513a = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        f38514b = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
    }
}
