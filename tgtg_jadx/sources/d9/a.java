package d9;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import cy.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import w2.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14753a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14754b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Looper looper) {
        super(looper);
        this.f14754b = cVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        z[] zVarArr;
        switch (this.f14753a) {
            case 0:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                c cVar = (c) this.f14754b;
                while (true) {
                    synchronized (cVar.f14762b) {
                        try {
                            size = cVar.f14764d.size();
                            if (size <= 0) {
                                return;
                            }
                            zVarArr = new z[size];
                            cVar.f14764d.toArray(zVarArr);
                            cVar.f14764d.clear();
                        } finally {
                        }
                    }
                    for (int i11 = 0; i11 < size; i11++) {
                        z zVar = zVarArr[i11];
                        int size2 = ((ArrayList) zVar.f43084c).size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            b bVar = (b) ((ArrayList) zVar.f43084c).get(i12);
                            if (!bVar.f14758d) {
                                bVar.f14756b.onReceive(cVar.f14761a, (Intent) zVar.f43083b);
                            }
                        }
                    }
                }
                break;
            case 1:
                int i13 = message.what;
                if (i13 == -3 || i13 == -2 || i13 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f14754b).get(), message.what);
                    return;
                } else {
                    if (i13 != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            default:
                if (yx.a.f46339a.contains(this)) {
                    return;
                }
                try {
                    message.getClass();
                    m mVar = (m) this.f14754b;
                    if (message.what == mVar.f13543g) {
                        Bundle data = message.getData();
                        if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                            mVar.a(null);
                        } else {
                            mVar.a(data);
                        }
                        try {
                            mVar.f13537a.unbindService(mVar);
                            return;
                        } catch (IllegalArgumentException unused) {
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    yx.a.a(this, th2);
                    return;
                }
        }
    }

    public /* synthetic */ a() {
    }

    public a(m mVar) {
        this.f14754b = mVar;
    }
}
