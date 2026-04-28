package c5;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f4 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7238a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7239b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(p.s2 s2Var) {
        super(new Handler());
        this.f7239b = s2Var;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f7238a) {
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z11) {
        Cursor cursor;
        switch (this.f7238a) {
            case 1:
                p.s2 s2Var = (p.s2) this.f7239b;
                if (s2Var.f43271b && (cursor = s2Var.f43272c) != null && !cursor.isClosed()) {
                    s2Var.f43270a = s2Var.f43272c.requery();
                    break;
                }
                break;
            default:
                super.onChange(z11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(x80.i iVar, Handler handler) {
        super(handler);
        this.f7239b = iVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z11, Uri uri) {
        switch (this.f7238a) {
            case 0:
                ((x80.i) this.f7239b).h(Unit.f26487a);
                break;
            default:
                super.onChange(z11, uri);
                break;
        }
    }
}
