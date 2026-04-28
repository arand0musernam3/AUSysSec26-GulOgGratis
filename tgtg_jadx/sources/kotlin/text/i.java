package kotlin.text;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final h f26601b = new h(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f26602c = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26603a = true;

    public i() {
        if (c0.a("")) {
            return;
        }
        c0.a("");
    }

    public final void a(String str, StringBuilder sb2) {
        j4.s.A(sb2, str, "prefix = \"", "", "\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("suffix = \"");
        sb2.append("");
        sb2.append("\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("removeLeadingZeros = ");
        sb2.append(false);
        sb2.append(',');
        sb2.append('\n');
        sb2.append(str);
        sb2.append("minLength = ");
        sb2.append(1);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NumberHexFormat(\n");
        a("    ", sb2);
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
