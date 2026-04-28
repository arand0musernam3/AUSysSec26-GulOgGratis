package u;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f40613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f40614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f40615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f40616d;

    public a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f40613a = num;
        this.f40614b = num2;
        this.f40615c = num3;
        this.f40616d = num4;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f40613a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f40614b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f40615c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f40616d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
