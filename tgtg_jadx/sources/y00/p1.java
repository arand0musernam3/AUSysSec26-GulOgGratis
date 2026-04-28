package y00;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t4 f45064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1 f45065c;

    public /* synthetic */ p1(v1 v1Var, t4 t4Var, int i11) {
        this.f45063a = i11;
        this.f45064b = t4Var;
        this.f45065c = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f45063a) {
            case 0:
                v1 v1Var = this.f45065c;
                v1Var.f45249g.W();
                v1Var.f45249g.Z(this.f45064b);
                break;
            case 1:
                v1 v1Var2 = this.f45065c;
                v1Var2.f45249g.W();
                l4 l4Var = v1Var2.f45249g;
                if (l4Var.f44943y != null) {
                    ArrayList arrayList = new ArrayList();
                    l4Var.f44944z = arrayList;
                    arrayList.addAll(l4Var.f44943y);
                }
                m mVar = l4Var.f44922c;
                l4.U(mVar);
                n1 n1Var = (n1) mVar.f21216b;
                t4 t4Var = this.f45064b;
                String str = t4Var.f45170a;
                com.google.android.gms.common.internal.i0.h(str);
                com.google.android.gms.common.internal.i0.e(str);
                mVar.p();
                mVar.q();
                try {
                    SQLiteDatabase sQLiteDatabaseG0 = mVar.g0();
                    String[] strArr = {str};
                    int iDelete = sQLiteDatabaseG0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseG0.delete("events", "app_id=?", strArr) + sQLiteDatabaseG0.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseG0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseG0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseG0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseG0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseG0.delete("queue", "app_id=?", strArr) + sQLiteDatabaseG0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseG0.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseG0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseG0.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseG0.delete("upload_queue", "app_id=?", strArr);
                    if (n1Var.f44985d.A(null, g0.f44770c1)) {
                        iDelete += sQLiteDatabaseG0.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    int iDelete2 = iDelete + sQLiteDatabaseG0.delete("diagnostic_signals", "app_id=?", strArr);
                    if (iDelete2 > 0) {
                        w0 w0Var = n1Var.f44987f;
                        n1.m(w0Var);
                        w0Var.f45267o.c("Reset analytics data. app, records", str, Integer.valueOf(iDelete2));
                    }
                } catch (SQLiteException e5) {
                    w0 w0Var2 = n1Var.f44987f;
                    n1.m(w0Var2);
                    w0Var2.f45260g.c("Error resetting analytics data. appId, error", w0.x(str), e5);
                }
                if (t4Var.f45177h) {
                    l4Var.Z(t4Var);
                }
                break;
            default:
                l4 l4Var2 = this.f45065c.f45249g;
                l4Var2.W();
                l4Var2.o0(this.f45064b);
                break;
        }
    }
}
