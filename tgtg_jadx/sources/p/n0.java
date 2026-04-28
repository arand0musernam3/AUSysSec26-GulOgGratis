package p;

import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i11, int i12, int i13, int i14) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i11, i12, i13, i14);
    }

    public static void c(TextView textView, int[] iArr, int i11) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i11);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
