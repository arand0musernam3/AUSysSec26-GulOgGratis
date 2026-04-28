package c50;

import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f7649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f7650b;

    public w0(k1 k1Var, l1 l1Var) {
        k1Var.getClass();
        l1Var.getClass();
        this.f7649a = k1Var;
        this.f7650b = l1Var;
    }

    public final q0 a(q0 q0Var) {
        String str;
        this.f7650b.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        String string = uuidRandomUUID.toString();
        string.getClass();
        String lowerCase = kotlin.text.y.n(string, "-", "", false).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str2 = (q0Var == null || (str = q0Var.f7614b) == null) ? lowerCase : str;
        int i11 = q0Var != null ? q0Var.f7615c + 1 : 0;
        this.f7649a.getClass();
        return new q0(lowerCase, k1.a().f7591b, i11, str2);
    }
}
