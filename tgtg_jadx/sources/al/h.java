package al;

import com.app.tgtg.R;
import m5.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h Email;
    public static final h Facebook;
    public static final h Google;
    public static final h Other;

    @Nullable
    private final Integer backgroundColorRes;

    @Nullable
    private final Integer iconRes;
    private final long textColor;
    private final int textRes;

    @NotNull
    private final u0 textStyle;

    static {
        u0 u0Var = lv.v.f28281u;
        h hVar = new h("Google", 0, R.string.landing_google_button, u0Var, Integer.valueOf(R.drawable.ic_google_logo), Integer.valueOf(R.color.neutral_10), lv.s.f28217b);
        Google = hVar;
        Integer numValueOf = Integer.valueOf(R.drawable.ic_facebook_logo);
        Integer numValueOf2 = Integer.valueOf(R.color.facebook_button_background);
        long j9 = lv.s.J;
        h hVar2 = new h("Facebook", 1, R.string.landing_facebook_button, u0Var, numValueOf, numValueOf2, j9);
        Facebook = hVar2;
        h hVar3 = new h("Email", 2, R.string.landing_email_option_button, u0Var, Integer.valueOf(R.drawable.ic_envelope), Integer.valueOf(R.color.primary_40), j9);
        Email = hVar3;
        h hVar4 = new h("Other", 3, R.string.landing_other_option_button, u0Var, null, null, lv.s.F);
        Other = hVar4;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4};
        $VALUES = hVarArr;
        $ENTRIES = new a80.b(hVarArr);
    }

    public h(String str, int i11, int i12, u0 u0Var, Integer num, Integer num2, long j9) {
        this.textRes = i12;
        this.textStyle = u0Var;
        this.iconRes = num;
        this.backgroundColorRes = num2;
        this.textColor = j9;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final Integer a() {
        return this.backgroundColorRes;
    }

    public final Integer c() {
        return this.iconRes;
    }

    public final long d() {
        return this.textColor;
    }

    public final int e() {
        return this.textRes;
    }

    public final u0 f() {
        return this.textStyle;
    }
}
