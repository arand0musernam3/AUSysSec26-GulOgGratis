package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import e0.k1;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1740d;

    public /* synthetic */ l(mg.g gVar, mg.a aVar, int i11) {
        this.f1737a = 3;
        this.f1738b = gVar;
        this.f1740d = aVar;
        this.f1739c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1737a) {
            case 0:
                m mVar = (m) this.f1738b;
                Object obj = ((fd.j) this.f1740d).f17568b;
                String str = (String) mVar.f1754a.get(Integer.valueOf(this.f1739c));
                if (str != null) {
                    h.c cVar = (h.c) mVar.f1758e.get(str);
                    if ((cVar != null ? cVar.f20941a : null) != null) {
                        ActivityResultCallback activityResultCallback = cVar.f20941a;
                        activityResultCallback.getClass();
                        if (mVar.f1757d.remove(str)) {
                            activityResultCallback.a(obj);
                        }
                    } else {
                        mVar.f1760g.remove(str);
                        mVar.f1759f.put(str, obj);
                    }
                    break;
                }
                break;
            case 1:
                ((m) this.f1738b).a(this.f1739c, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f1740d));
                break;
            case 2:
                ((s0.p) this.f1738b).d(b0.j.c((k1) this.f1740d), this.f1739c);
                break;
            case 3:
                mg.g gVar = (mg.g) this.f1738b;
                mg.a aVar = (mg.a) this.f1740d;
                View view = gVar.f29951a.f35073y.f986f;
                view.getClass();
                ConstraintLayout constraintLayout = (ConstraintLayout) gVar.f29951a.f35069u.f29922b;
                constraintLayout.getClass();
                gVar.e(view, constraintLayout, aVar, true, mg.j.ViewStateFeedback, this.f1739c);
                break;
            case 4:
                ((w9.c) ((df.g) this.f1738b).f14896d).g(this.f1739c, this.f1740d);
                break;
            default:
                MessageLogView.scrollToBottom$lambda$12$lambda$11((LinearLayoutManager) this.f1738b, this.f1739c, (MessageLogView) this.f1740d);
                break;
        }
    }

    public /* synthetic */ l(Object obj, int i11, Object obj2, int i12) {
        this.f1737a = i12;
        this.f1738b = obj;
        this.f1739c = i11;
        this.f1740d = obj2;
    }

    public /* synthetic */ l(s0.p pVar, b0.j jVar, k1 k1Var, int i11) {
        this.f1737a = 2;
        this.f1738b = pVar;
        this.f1740d = k1Var;
        this.f1739c = i11;
    }
}
