package y00;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f44675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f44677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1 f44678e;

    public d1(e1 e1Var, String str, long j9) {
        Objects.requireNonNull(e1Var);
        this.f44678e = e1Var;
        com.google.android.gms.common.internal.i0.e(str);
        this.f44674a = str;
        this.f44675b = j9;
    }

    public final long a() {
        if (!this.f44676c) {
            this.f44676c = true;
            this.f44677d = this.f44678e.t().getLong(this.f44674a, this.f44675b);
        }
        return this.f44677d;
    }

    public final void b(long j9) {
        SharedPreferences.Editor editorEdit = this.f44678e.t().edit();
        editorEdit.putLong(this.f44674a, j9);
        editorEdit.apply();
        this.f44677d = j9;
    }
}
