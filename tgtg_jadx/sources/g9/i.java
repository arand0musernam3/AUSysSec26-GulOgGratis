package g9;

import android.content.SharedPreferences;
import y00.e1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f20136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f20137e;

    public i(e1 e1Var, String str, boolean z11) {
        this.f20137e = e1Var;
        com.google.android.gms.common.internal.i0.e(str);
        this.f20136d = str;
        this.f20133a = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g9.j a() {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.i.a():g9.j");
    }

    public boolean b() {
        if (!this.f20134b) {
            this.f20134b = true;
            e1 e1Var = (e1) this.f20137e;
            this.f20135c = e1Var.t().getBoolean((String) this.f20136d, this.f20133a);
        }
        return this.f20135c;
    }

    public void c(boolean z11) {
        SharedPreferences.Editor editorEdit = ((e1) this.f20137e).t().edit();
        editorEdit.putBoolean((String) this.f20136d, z11);
        editorEdit.apply();
        this.f20135c = z11;
    }
}
